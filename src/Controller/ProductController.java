package Controller;

import java.util.ArrayList;

import Controller.MainController;
import Controller.ProductDao;
import shop.Product;
import management.ManagementHandler;
import view.ProductListView;

public class ProductController {
	private ProductDao productDao;
	
	public ProductController() {
		this.productDao = new ProductDao();
	}
	
	// method
	// request product list view
	public void requestProductlist(){
		
		// dao에서 list 받아오기
		ArrayList<Product> products = productDao.productList();
		
		// 받은 list 출력
		if(products.size() == 0){
			MainController.AlertView("상품이 없습니다");
		} else {
			ProductListView productListView = new ProductListView();
			productListView.productList(products);	
		}
		
	}

	
	// 상품등록을 위한 정보입력
	public void requestInsertProductInfo(){		
		ManagementHandler newManagement = new ManagementHandler();
		newManagement.insertProduct();
	}

	
	// 상품등록 요청
	public void requestInsertProduct(Product newProduct) {

		boolean success = productDao.insertProduct(newProduct);
		
		if(success){
			MainController.AlertView("성공적으로 상품이 등록되었습니다");
		} else {
			MainController.AlertView("이미 같은 상품이 존재합니다");
		}
		
	}

	/*
	// 상품수정을 위한 정보입력
	public void requestUpdateProductInfo(){
	
		UpdateProductInfo updateProductInfo = new UpdateProductInfo();
		updateProductInfo.updateProductInfo();
		
	}
	
	
	// 상품수정 요청
	public void requestUpdateProduct(int selectedProductNumber, Product updateProduct) {
		
		boolean success = productDao.updateProduct(selectedProductNumber, updateProduct);
		
		if(success){
			MainController.AlertView("성공적으로 상품이 수정되었습니다");
		} else {
			MainController.AlertView("선택하신 번호는 없는 상품번호 입니다");
		}
		
	}

	
	// 상품삭제를 위한 번호입력
	public void requestDeleteProductNumber(){
	
		DeleteProductNum deleteProductNumber = new DeleteProductNum();
		deleteProductNumber.deleteProductNumber();
		
	}
	
	
	// 상품삭제 요청
	public void requestDeleteProduct(int selectedProductNumber) {
		
		boolean success = productDao.deleteProduct(selectedProductNumber);
		
		if(success){
			MainController.AlertView("성공적으로 상품이 삭제되었습니다");
		} else {
			MainController.AlertView("상품삭제에 실패하였습니다");
		}
		
	}*/
}