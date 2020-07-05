package management;

import java.util.Calendar;
import java.util.Scanner;

import Controller.MainController;
import shop.Product;

public class ManagementHandler {
	private Calendar managementDate = Calendar.getInstance();
	private int managementType;	
	private Scanner keyboard;
	
	public ManagementHandler() {
		this.keyboard = new Scanner(System.in);
	}
	
	public Calendar getManagementDate() {
		return managementDate;
	}
	
	public int getManagementType() {
		return managementType;
	}
	
	public void setManagementType(int managementType) {
		this.managementType = managementType;
	}
	
	public ManagementHandler(Calendar managementDate, int managementType) {
		this.managementDate = managementDate;
		this.managementType = managementType;
	}
	
	public void insertProduct() {
		Product newProduct = new Product(); // CreateProduct()
		
		System.out.println("<상품등록>");
		System.out.println("등록할 상품의 정보를 입력하세요");
		
		System.out.println("상품 카테고리: ");
		String productCategory = keyboard.nextLine();
		
		System.out.println("상품 번호: ");
		int productNum = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("상품명: ");
		String productName = keyboard.nextLine();
		
		System.out.println("상품 가격: ");
		int productPrice = keyboard.nextInt();
	
		keyboard.nextLine();
		
		System.out.println("상품 정보: ");
		String productInfo = keyboard.nextLine();

		System.out.println("상품 재고: ");
		int productAmount = keyboard.nextInt();

		newProduct.setProduct(productCategory, productNum, productName, productPrice, productInfo, productAmount);
		
		MainController mainController = new MainController();
		mainController.getProductController().requestInsertProduct(newProduct);
	}	

}
