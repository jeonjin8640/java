package tut05;

public class ContEx {

	public static void main(String[] args) {
		//if
		//비교연산자 > < => true, false
		int num1 = 3;
		int num2 = 5;
		
		// 사용자 Level 0(손님), 1(회원), 2(관리자)
		// 출력을 하는 프로그램
		int level = 2;
		
		if( level == 0) {
			System.out.println("Guest");
			System.out.println("웝사이트 메인 페이지로 이동합니다.");
		}else if( level == 1 ) {
			System.out.println("member");
			System.out.println("웝사이트 메인 페이지로 이동합니다.");
		}else {
			System.out.println("manager\n관리자 페이지로 이동합니다.");
		}
		
	
	}

}
