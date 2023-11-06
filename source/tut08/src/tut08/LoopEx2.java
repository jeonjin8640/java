package tut08;

public class LoopEx2 {

	public static void main(String[] args) {
		//값을 누적을 할 때 전역(변수를 중괄호 위로 이동), static
		//1 ~100 : 1,2,3,4,5,6 ...
		int sum = 0; //전역변수는 오류를 많이 일으킨다. 자주사용 금지
		for(int i = 1; i <100; ++i) {			//i += 2
			//int sum = 0;가 중괄호 안에 있어서 출력코드가 오류
			sum = sum + i; // sum +=i;
			
		}
		System.out.println(sum);
		
		
	}

}
