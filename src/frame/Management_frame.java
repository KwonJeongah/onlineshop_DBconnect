package frame;
import java.util.Scanner;

import management.ManagementHandler;

public class Management_frame {
	private Scanner keyboard;
	
	public Management_frame() {
		this.keyboard = new Scanner(System.in);
	}
		
	public void startManagement() {		
		ManagementHandler newManagement = new ManagementHandler(); //CreateManagement
		
		System.out.println("���� �޴��� �������ּ���");
		System.out.println("1. ��ǰ  || 2. ī�װ� ");		
		int menu = keyboard.nextInt();		
		
		if(menu == 1) {
			System.out.println("���Ͻô� �޴��� �������ּ���");
			System.out.println("1. ��� || 2. ��ȸ || 3. ���� || 4. ����");
			int productMenu = keyboard.nextInt();
			
			if(productMenu == 1) {
				newManagement.insertProduct(); // CreateNewProduct
			}else {
				System.out.println("�޴��� �߸� �����ϼ̽��ϴ�.(��ϸ�)");
			}
			
		}else {
			System.out.println("�޴��� �߸� �����ϼ̽��ϴ�");
			
		}
	}
}
