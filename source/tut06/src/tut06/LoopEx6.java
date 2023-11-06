package tut06;

import java.util.Scanner;

public class LoopEx6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money = 10000;
		int coffee = 3000;
		int stock = 10;
		
		boolean run = true;
		while(run) {
			System.out.println("========================================");
			System.out.println("스타벅스 커피 자동 판매기");
			System.out.println("========================================");
			System.out.println("1. 구매(P/p) | 2. 잔액(B/b) | 3. 종료(Q/q)");
			System.out.println("메뉴 선택 > ");
			String menu = sc.next();
			
			
			switch(menu) {
			case "P" :
			case "p" :
				
				if(money < coffee) {
					System.out.println("커피를 구매할 수 없습니다.");
				}else if(stock < 1){
					System.out.println("제고가 부족합니다.");
				}else {
					money = money - coffee;
					stock = stock -1;
					System.out.println("커피를 구매하였습니다.");
				}
				break;
				
			case "B" :
			case "b" :
			
				System.out.println("잔액 확인");
				System.out.println("잔액은 : "+money);
				System.out.println("재고는 : "+stock);
				break;
			case "Q" :
			case "q" :
					System.out.println("프로그램을 종료합니다.");
					System.exit(0);
					break;
			default:
					System.out.println("잘못 입력하였습니다.");
					continue;
				
				
					
				}	
	}
	}

}