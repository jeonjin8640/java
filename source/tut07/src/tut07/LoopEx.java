package tut07;

public class LoopEx {

	public static void main(String[] args) {
		//for(초기값; 조건; 증감값) {
		// 출력코드
		// }
		
		//0부터 10출력하는 반복문을 완성하시오. for 사용
		for(int i = 0; i <= 10; ++i ) {
			System.out.print(i + " ");
		}
System.out.println("");
		//1부터 20까지 출력하는 for
		for(int i = 1; i <= 20; ++i) {
			System.out.print(i + " ");
		}
		
System.out.println("");
		//for -> while

		int i = 1;
		while( i <=20 ) {
			System.out.print(i + " ");
			++i;
		}
		
System.out.println("");		
		//0 ~ 10까지 출력하는 for
		//짝수만 출력하세요
		//건너뛸 때는 continue;
		for(int j = 0; j <= 10; ++j) {
			if(j % 2 == 1) 
				continue;
			System.out.print(j + " ");
	
		}
	}
}