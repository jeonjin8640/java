package tut06;

public class LoopEx {

	public static void main(String[] args) {
//		//정수 0 ~ 4까지 출력하는 for를 완성하시오
//		for(int i = 0; i <= 4 ; i++) {
//			System.out.print(i + " ");
//		}
//		
//		System.out.println("");
//		
//		//0부터 100미만 하는 for
//		for(int i = 0; i < 100; i++) 
//			System.out.print(i);
//		
//		System.out.println("");
//		
//		//1부터 10이하 까지 출력하는 for
//		for( int i = 1; i <= 10; i++)
//			System.out.print(i);
		
		//0 ~ 10미만 출력하는 for
		for(int i = 0; i < 10; ++i	) {
			//for를 이용한 출력 01234567
			System.out.print(i + " ");
		
			
			
		}
		
		System.out.println("----------------------");
		//0 ~ 10미만 출력하는 while
	
		int i = 0;
		while(i < 10) {
			System.out.print( i + " ");
		++i;
		}
		
		System.out.println("------------------------");
		
		//10이하 부터 1까지 출력하는 for
		for(int j = 0; j > 0; j-- ) {
			System.out.println(j);
		}
	}

}
