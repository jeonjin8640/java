package tut08;

import java.util.Scanner;

public class BalanceEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int balance = 100000;
		
		boolean run = true;
		while(run) {
			System.out.println("-----------------------");
			System.out.println("1.예금|2.출금|3.확인|4.종료");
			System.out.println("-----------------------");
			System.out.println("선택> ");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1 : 
					System.out.println("입금할 금액 :" );
					int money1 = sc.nextInt(); //balance += sc.nextInt();
					balance = balance + money1;//         "
					System.out.println("입금 되었습니다.");
				break;
				
			case 2 :
				int money2 = sc.nextInt();
				if (balance < money2 || balance < 0) {
					System.out.println("잔액이 부족합니다.");
				}else {
					System.out.println("출금할 금액 :" );
					System.out.println("현재 잔액 :" + balance);
					balance = balance - money2;
					System.out.println("출금 되었습니다.");
				}
				break;
				
			case 3: 
				System.out.println("잔고는 : "+balance);
				break;
				
			case 4 :
				System.out.println("프로그램 종료");
				System.exit(0);
				default:
					System.out.println("잘못 입력 하였습니다.");
			}
			System.out.println("");
		}
	}

}
