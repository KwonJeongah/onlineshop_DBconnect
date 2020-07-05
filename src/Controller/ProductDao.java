package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import Controller.MainController;
import shop.Product;

public class ProductDao {
	//상품 리스트 가져오기
	public ArrayList<Product> productList(){
		ArrayList<Product> products = new ArrayList<Product>();
		
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = MainController.getDbController().getConnection().createStatement();
			String sql = "select * from shop.product";
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				Product product = new Product();
				product.setProductCategory(rs.getString("cName"));
				product.setProductName(rs.getString("pName"));
				product.setProductInfo(rs.getString("pInfo"));
				product.setProductNum(rs.getInt("pNum"));
				product.setProductPrice(rs.getInt("pPrice"));
				product.setProductAmount(rs.getInt("pAmount"));
				
				products.add(product);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {

			if(stmt != null){try{stmt.close();} catch (SQLException e){e.printStackTrace();}}
			if(rs != null){try{rs.close();} catch (SQLException e){e.printStackTrace();}}
		}
		
		return products;
	}
		
	
	// 상품 등록
	public boolean insertProduct(Product newProduct) {
		boolean success = false;
		
		PreparedStatement pstmt =null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;

		
		try {
			
			String sql = "select * from shop.product where pNum = ?";
			pstmt = MainController.getDbController().getConnection().prepareStatement(sql);
			pstmt.setString(1, newProduct.getProductName());
			rs = pstmt.executeQuery();
			
			if(rs.next()){

				return success;

			} else {
				String cName = newProduct.getProductCategory();
				int pNum = newProduct.getProductNum();
				String pName = newProduct.getProductName();
				int pPrice = newProduct.getProductPrice();
				String pInfo = newProduct.getProductInfo();
				int pAmount = newProduct.getProductAmount();
				
				StringBuilder sb = new StringBuilder();
				
				sql = sb.append("insert into " + "shop.product" + " values(")
						.append("'"+cName +"',")
						.append(pNum + ",")
						.append("'"+pName+"',")
						.append(pPrice+",")
						.append("'"+pInfo+"',")
						.append(pAmount)
						.append(");")
						.toString();
				pstmt2 = MainController.getDbController().getConnection().prepareStatement(sql);
				
				pstmt2.executeUpdate();
				success = true;							
			}
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		} 
		return success;
	}

/*		
	public boolean updateProduct(int selectedNum, Product updateProduct) {

		boolean success = false;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		Product product = new Product();

		try {

			String sql = "select * from shop_master.PRODUCTLIST where productNumber = ?";
			pstmt = MainController.getDbController().getConnection().prepareStatement(sql);
			pstmt.setInt(1, selectedNum);
			rs = pstmt.executeQuery();

			if(rs.next()){

				product.setProductNum(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setProductPrice(rs.getInt(3));
				product.setProductInfo(rs.getString(4));			

				if(rs.wasNull()){
					return success;
				}
				
			}

			sql = "update shop_master.PRODUCTLIST set productName = ?, productPrice = ?, productInfo = ? where productNum = ?";
			pstmt2 = MainController.getDbController().getConnection().prepareStatement(sql);

			if(updateProduct.getProductName() != null){
				pstmt2.setString(1, updateProduct.getProductName());	
			} else {
				pstmt2.setString(1, product.getProductName());
			}

			if(updateProduct.getProductPrice() != 0){
				pstmt2.setInt(2, updateProduct.getProductPrice());
			} else {
				pstmt2.setInt(2, product.getProductPrice());
			}

			if(updateProduct.getProductInfo() != null){
				pstmt2.setString(3, updateProduct.getProductInfo());
			} else {
				pstmt2.setString(3, product.getProductInfo());
			}
			
			
			pstmt2.setInt(5, selectedNum);
			pstmt2.executeUpdate();
			success = true;
			
			
		} catch (SQLException e) {

			e.printStackTrace();

		} finally {
			
			if(pstmt2 != null){try{pstmt2.close();} catch (SQLException e){e.printStackTrace();}}
			if(rs != null){try{rs.close();} catch (SQLException e){e.printStackTrace();}}
			if(pstmt != null){try{pstmt.close();} catch (SQLException e){e.printStackTrace();}}
	
		}
		
		return success;

	}


	// 상품 삭제
	public boolean deleteProduct(int deleteProductNum) {

		boolean success = false;
		PreparedStatement pstmt = null;
		
		try {
			
			String sql = "delete shop_master.PRODUCTLIST where productNumber = ?";
			pstmt = MainController.getDbController().getConnection().prepareStatement(sql);
			pstmt.setInt(1, deleteProductNum);
			pstmt.executeUpdate();
			success = true;
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
			if(pstmt != null){try{pstmt.close();} catch (SQLException e){e.printStackTrace();}}
	
		}
	
		return success;

	}
*/
}