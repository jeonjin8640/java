package tut05;

import java.util.Scanner;

public class ContEx2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수입력 > ");
		//값을 입력 받을 수 있게 sc.next();
		//int jumsu = Integer.parseInt( sc.next() );
		
		int jumsu = sc.nextInt();
		
		String str = ""; // or String str = null; 
		if( jumsu >= 91 && jumsu <= 100 ) 
			str = "A등급";
			
		else if( jumsu >= 81 && jumsu <= 90 )
			str = "B등급";
			
		else if( jumsu >= 71 && jumsu <= 80 ) 
			str = "C등급";
			
		else 
			str = "F등급";
		
		System.out.println(str);
		
	}

}
