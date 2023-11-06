package tut10;

public class ArrEx01 {

	public static void main(String[] args) {
		//배열 + 반복문(for - 배열번호가 필요한 경우 사용, 향상된 for - 값만 출력시 사용)
		//배열번호(index)은 0
		//i, idx, index 변수이름이 보이면 배열 처리
		
		/*for(int i = 0; i < 배열명.length; ++i) {
			출력코드( 배열명[i] );
		}
		
		for(출력타입 별명 : 배열명) {
			출력코드(별명);
		 }
		*/
		
		//정수 3개를 저장하는 프로그램을 완성하시오.
		int[] value = new int[3]; //4byte * 3개의 빈 공간이 생성
		value[0] = 100; //초기화
		value[1] = 200; //초기화
		value[2] = 300; //초기화
		
		//배열 0 ~ 2번까지 출력하시오.
		//배열명[인덱스]
		//for
		
		//value[0]의 값은 0 입니다.
		//1번 값은 100입니다.
		//2번 값은 200입니다.
		//3번 값은 300입니다.
		for(int i = 0; i < 3; ++i) {
			//System.out.println( value[i] );
			//System.out.println("value["+i+"]의 값은 "+value[i]+" 입니다.");
			System.out.println(""+(i+1)+"번 값은 "+value[i]+"입니다.");
	  }
		
		//생성자 : 초기화
		//Member m = new Member(); //초기화 된 상태 /소괄호() 사용/
		
		
		System.out.println("-----------------------");
		//int[] num = {1, 2, 3, 4, 5};
		//초기값을 설정하면 배열 개수가 생성
		//학생 3명 점수를 초기값으로 설정 후
		//화면에 출력하시오
		//합계를 출력하시오
		//평균을 출력하시오
		
	int[] jumsu = {88, 77, 66, 89, 90, 97};
	
	//등록된 학생 수는 1000명 입니다.
	System.out.println("등록된 학생 수는 "+jumsu.length+"명 입니다.");
	
	
	for(int i = 0; i < jumsu.length; ++i) {
		System.out.print( jumsu[i] + " ");
	}
System.out.println("");
	//합계 : 누적(전역, static)
	int sum = 0;
	for( int i = 0; i < jumsu.length; ++i) {
		//System.out.println(""+(i+1)+"번 점수는 "+jumsu[i]+"입니다.");
		sum = sum + jumsu[i];
	}
	System.out.println("합계는 "+sum+"입니다.");
	
	// 합계 / jumsu.length
	System.out.println("평균은 "+(double)sum / jumsu.length+"입니다.");
	
	double result = (double)sum / jumsu.length;
	//출력 포맷 변경 소수점 2자리로 설정
	//평균은 84.50입니다.
	System.out.println( String.format("평균은 %.2f입니다.",result) );
	System.out.printf("평균은 %.2f입니다.",result);
	}
}
