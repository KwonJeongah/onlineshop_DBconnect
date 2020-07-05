package Controller;

import Controller.ProductController;

public class MainController {
	// Connect Controllers
		private static DBController dbController;		
		private static ProductController productController;
		
		
		// constructor
		public MainController() {
		
			dbController = new DBController();
			productController = new ProductController();
			
		}
		
		// getter and setter
		public static DBController getDbController() {
			return dbController;
		}

		public ProductController getProductController() {
			return productController;
		}

		
		// method
		// ��¹� ���� �޼���
		public static void AlertView(String msg){
			System.out.println(msg);
			
		}
		
}