package view;

import java.util.ArrayList;
import shop.Product;

public class ProductListView {
	public void productList(ArrayList<Product> products) {
		
		System.out.println("상품카테고리\t상품번호\t상품명\t\t상품가격\t상품설명\t상품재고\t");
		for(int i=0; i<products.size(); i++){
			System.out.print(products.get(i).getProductCategory() + "\t");
			System.out.print(products.get(i).getProductNum() + "\t");
			System.out.print(products.get(i).getProductName() + "\t");
			System.out.print(products.get(i).getProductPrice() + "\t");
			System.out.print(products.get(i).getProductInfo() + "\t");
			System.out.print(products.get(i).getProductAmount() + "\t");
		}
		
	}	
}
