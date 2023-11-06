package lamda;

interface MaxNum {
	int getMaxNum(int num1, int num2);
}


public class LamdaEx5 {

	public static void main(String[] args) {
		// 두 개의 수중 큰 숫자를 출력하시오.
		// x > y -> return x
		// x < y -> return y
		/*
		MaxNum m = (x, y) -> {
			if( x > y ) {
				return x;
			}else {
				return y;
			}
		};
		System.out.println( m.getMaxNum(2, 4) );
		*/
		
		/*
		MaxNum m = (a, b) -> {
			return ( a > b ) ? a : b;
		};
		System.out.println( m.getMaxNum(2, 4));
		*/
		
		//한줄로 만들면... return 생략 가능
		MaxNum m = (a, b) -> ( a > b ) ? a : b;
		System.out.println( m.getMaxNum(2, 4));
	
	}

}
