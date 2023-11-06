package tut08;

import java.util.Scanner;

public class SwitchRandEx {

	public static void main(String[] args) {
		//dice
		//Scanner
		//1 ~ 6
		//외에 값이 들어오면 잘못 입력된 값입니다. 출력
		//(int)(Math.random()* 마지막값 ) + 시작값;
		
		
		int dice = (int)(Math.random() * 6) + 1; 
		
		switch(dice) {
		case 1 : 
			System.out.println("선택한 주사위 값은 1 입니다.");
			break;
		case 2 :
			System.out.println("선택한 주사위 값은 2 입니다.");
			break;
		case 3 : 
			System.out.println("선택한 주사위 값은 3 입니다.");
			break;
		case 4 :
			System.out.println("선택한 주사위 값은 4 입니다.");
			break;
		case 5 : 
			System.out.println("선택한 주사위 값은 5 입니다.");
			break;
		case 6 :
			System.out.println("선택한 주사위 값은 6 입니다.");
			break;
			default :
				System.out.println("잘못 입력하였습니다.");
				break;
		}
		
		
	}

}
