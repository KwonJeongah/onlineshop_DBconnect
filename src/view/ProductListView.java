package view;

import java.util.ArrayList;
import shop.Product;

public class ProductListView {
	public void productList(ArrayList<Product> products) {
		
		System.out.println("��ǰī�װ�\t��ǰ��ȣ\t��ǰ��\t\t��ǰ����\t��ǰ����\t��ǰ���\t");
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
