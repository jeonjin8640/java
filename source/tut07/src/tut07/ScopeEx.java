package tut07;

public class ScopeEx {
		
		//변수가 미치는 범위 {}
	public static void main(String[] args) {
		
		//변수 값은 바로 위 중괄호 영역에서만 값을 사용
		//단, for()문은 오른쪽 {} 안에서만 값을 사용할 수 있다.
		
		//값을 누적할 때 전역변수 형태로 또는 변수 앞에 static를 붙혀서
					//(바로 위 중괄호 밖으로 이동)
		
		// 1 ~ 10까지 더해서 총합을 출력하시오.
		//☆누적되는 값을 처리하려면 반복문 밖에 변수 선언하거나(전역)
		//static 메소드 사용해야
		int sum =0;
		
		for(int i = 1; i < 10; ++i) {
			sum = sum + i;
			
		}
		System.out.println(sum);
		
		System.out.println("---------------------");

		int i = 0;
		while( i < 10) {
			System.out.println(i);
			++i;
		}
		System.out.println(i);
		
	
		
	}

}
