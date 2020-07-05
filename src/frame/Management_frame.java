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
		
		System.out.println("관리 메뉴를 선택해주세요");
		System.out.println("1. 상품  || 2. 카테고리 ");		
		int menu = keyboard.nextInt();		
		
		if(menu == 1) {
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1. 등록 || 2. 조회 || 3. 수정 || 4. 삭제");
			int productMenu = keyboard.nextInt();
			
			if(productMenu == 1) {
				newManagement.insertProduct(); // CreateNewProduct
			}else {
				System.out.println("메뉴를 잘못 선택하셨습니다.(등록만)");
			}
			
		}else {
			System.out.println("메뉴를 잘못 선택하셨습니다");
			
		}
	}
}
