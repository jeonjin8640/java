package tut01;

public class BooleanEx {

	public static void main(String[] args) {
		//컴퓨터는 0,1 => false(거짓) 0
		//			=> true(참) 0을 제외한 양수는 참
		
		//기본타입의 초기값 설정 (비어두면 안된다)
//		int i = 0;
//		double d = 0.0;
//		boolean b = false;
//		String str = "";
		
		boolean b = true;
		System.out.println(b);
		
		//참이면 통과, 아니면 재평가
		
		//equals() : String 값
		//그 외 같은 걸 비교할 때는 ==
//		if( b ) 
//			System.out.println("통과");
//			
//		else 
//			System.out.println("재평가");
		
						//조건 ? "참일 때" : "거짓일 때";
		String result = ( b ) ? "통과" : "재평가";
		System.out.println(result);
		
		//조건이 참이면 1 아니면 0을 출력하시오
		int result1 = (b) ? 1 : 0;
		System.out.println(result1);
		
		//조건이 참이면 1.0 거짓이면 0.0 출력하시오
		double result2 = (b) ? 1.0 : 0.0;
		System.out.println(result2);
		
		//조건이 참이면 true 거짓이면 false 출력하시오
		boolean result3 = true;
		System.out.println(result3);
	}

}
