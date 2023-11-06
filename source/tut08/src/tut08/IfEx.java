package tut08;

public class IfEx {

	public static void main(String[] args) {
		//임의의 점수(정수) 생성 : 0 ~ 100
		//점수가 90보다 크면 A학점
		//80보다 크면 B학점
		
		int num; //변수를 선언 -> 메모리 생성 -> 값은 없는 상태 -> 초기화 작업 필요
		
		int[] arr; //
		
		int score = 90;
		if(score >= 90) {
			System.out.println("100점 보다는 적습니다.");
			System.out.println("A학점");
		}else{
			System.out.println("100점 보다는 적습니다.");
			System.out.println("B학점");
			
		}
		//한 줄일 때만 중괄호 생략 가능. 두 줄일때는 중괄활 포함
	}

}
