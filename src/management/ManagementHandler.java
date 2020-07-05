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
		
		System.out.println("<��ǰ���>");
		System.out.println("����� ��ǰ�� ������ �Է��ϼ���");
		
		System.out.println("��ǰ ī�װ�: ");
		String productCategory = keyboard.nextLine();
		
		System.out.println("��ǰ ��ȣ: ");
		int productNum = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.println("��ǰ��: ");
		String productName = keyboard.nextLine();
		
		System.out.println("��ǰ ����: ");
		int productPrice = keyboard.nextInt();
	
		keyboard.nextLine();
		
		System.out.println("��ǰ ����: ");
		String productInfo = keyboard.nextLine();

		System.out.println("��ǰ ���: ");
		int productAmount = keyboard.nextInt();

		newProduct.setProduct(productCategory, productNum, productName, productPrice, productInfo, productAmount);
		
		MainController mainController = new MainController();
		mainController.getProductController().requestInsertProduct(newProduct);
	}	

}
