package exam;

import java.util.Scanner;

public class Exam4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("점수입력 > ");
	
		int fir = sc.nextInt();
		int sec = sc.nextInt();
		int thi = sc.nextInt();
		int fort = sc.nextInt();
		
		if (fir < 60) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}			
		if (sec < 60) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}			
		if (thi < 60) {
			System.out.println("불합격");
		}else {
			System.out.println("합격");
		}			
		
		if (fort < 80) {
			System.out.println("재시험입니다");
		}else {
			System.out.println("졸업입니다");
		}				
	}
	
}
