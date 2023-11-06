package tut03;

public class ConOptEx {

	public static void main(String[] args) {
		//삼항연산자
		//정수 두 개를 비교하여 크면 1, 작으면 0을 출력하시오.
		//타입 변수 = (조건) ? "참일 때" : "거짓일 때";
		int num1 = 3;
		int num2 = 5;
		
		int result = (num1 > num2) ? 1 : 0;
		System.out.println(result);
		
		//임의의 정수를 생성 후 1이면 홀수, 0이면 짝수를 출력하시오.
		int num3 = 10;
//삼항연산자 사용		
		String result2 = (num3 % 2 == 1) ? "Odd" : "Even";
		System.out.println(result2);
		
//if 사용		
		if(num3 % 2 == 0)
			System.out.println("Even");
		
		else
			System.out.println("Odd");
//		
		String msg = "";
		
		if(num3 % 2 == 1) {
			msg = "홀수";
		}else {
			msg = "짝수";
		}
		
		System.out.println(msg);
		
		
	}

}
