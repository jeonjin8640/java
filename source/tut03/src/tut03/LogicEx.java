package tut03;

public class LogicEx {

	public static void main(String[] args) {
		boolean val1 = true;
		boolean val2 = false;
		
		// && : 조건 모두 = AND = 이면서, 이고
		// 조건 1을 만족하면서 조건 2도 만족하는 결과를 출력하시오
		System.out.println( val1 && val2);
		
		// || : 조건 중 하나라도 = OR = 또는, 이거나
		// 조건 1을 만족하거나 조건 2도 만족하는 결과를 출력하시오
		System.out.println( val1 || val2);
		
		/*주민번호가 1 또는 3이면 남자
		주민번호가 2 또는 4이면 여자로 표시하시오.*/
		
		int jumin = 4; // 1남자, 3남자, 2여자, 4여자 //경우의 수 4
		
		if( (jumin % 4 == 1) || (jumin % 4 == 3) )
			System.out.println("Male");
		else
			System.out.println("Fmale");
	}

}
