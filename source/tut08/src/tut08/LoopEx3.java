package tut08;

public class LoopEx3 {

	public static void main(String[] args) {
		//1 ~ 100까지 합을 구하시오
		//while
		//출력 예시 : 1 ~ 100까지 합은 ***입니다.
		
		int result = 0; //합계가 저장될 변수
		
		int k = 1;
		while( k <= 100) {
			result = result + k; //result += k;
			k++;
		}
		System.out.println("1 ~ 100까지의 합은 " +result+ "입니다.");
	}

}
