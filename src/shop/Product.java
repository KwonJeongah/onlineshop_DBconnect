package shop;

import shop.Product;

public class Product {
	private String productCategory;
	private int productNum;	
	private String productName;
	private int productPrice;
	private String productInfo; // 상품 설명
	private int productAmount;
	
	public Product() {
		
	}
	
	public void setProduct(String productCategory, int productNum, String productName, int productPrice, String productInfo, int productAmount) {
		this.productCategory = productCategory;
		this.productNum = productNum;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productInfo = productInfo;
		this.productAmount = productAmount;
	}
	
	public String getProductCategory() {
		return productCategory;
	}
	
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	
	public int getProductNum() {
		return productNum;
	}
	
	public void setProductNum(int productNum) {
		this.productNum = productNum;
	}
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	public int getProductPrice() {
		return productPrice;
	}
	
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	
	public String getProductInfo() {
		return productInfo;
	}
	
	public void setProductInfo(String productInfo) {
		this.productInfo = productInfo;
	}
	
	public int getProductAmount() {
		return productAmount;
	}
	
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	
	
}
