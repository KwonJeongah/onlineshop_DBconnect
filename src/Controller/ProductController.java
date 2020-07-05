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
		
		// dao���� list �޾ƿ���
		ArrayList<Product> products = productDao.productList();
		
		// ���� list ���
		if(products.size() == 0){
			MainController.AlertView("��ǰ�� �����ϴ�");
		} else {
			ProductListView productListView = new ProductListView();
			productListView.productList(products);	
		}
		
	}

	
	// ��ǰ����� ���� �����Է�
	public void requestInsertProductInfo(){		
		ManagementHandler newManagement = new ManagementHandler();
		newManagement.insertProduct();
	}

	
	// ��ǰ��� ��û
	public void requestInsertProduct(Product newProduct) {

		boolean success = productDao.insertProduct(newProduct);
		
		if(success){
			MainController.AlertView("���������� ��ǰ�� ��ϵǾ����ϴ�");
		} else {
			MainController.AlertView("�̹� ���� ��ǰ�� �����մϴ�");
		}
		
	}

	/*
	// ��ǰ������ ���� �����Է�
	public void requestUpdateProductInfo(){
	
		UpdateProductInfo updateProductInfo = new UpdateProductInfo();
		updateProductInfo.updateProductInfo();
		
	}
	
	
	// ��ǰ���� ��û
	public void requestUpdateProduct(int selectedProductNumber, Product updateProduct) {
		
		boolean success = productDao.updateProduct(selectedProductNumber, updateProduct);
		
		if(success){
			MainController.AlertView("���������� ��ǰ�� �����Ǿ����ϴ�");
		} else {
			MainController.AlertView("�����Ͻ� ��ȣ�� ���� ��ǰ��ȣ �Դϴ�");
		}
		
	}

	
	// ��ǰ������ ���� ��ȣ�Է�
	public void requestDeleteProductNumber(){
	
		DeleteProductNum deleteProductNumber = new DeleteProductNum();
		deleteProductNumber.deleteProductNumber();
		
	}
	
	
	// ��ǰ���� ��û
	public void requestDeleteProduct(int selectedProductNumber) {
		
		boolean success = productDao.deleteProduct(selectedProductNumber);
		
		if(success){
			MainController.AlertView("���������� ��ǰ�� �����Ǿ����ϴ�");
		} else {
			MainController.AlertView("��ǰ������ �����Ͽ����ϴ�");
		}
		
	}*/
}