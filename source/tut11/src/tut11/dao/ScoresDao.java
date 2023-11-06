package tut11.dao;

public class ScoresDao {
	
	public void nullCheck() {
		int[] scores = null; //타입 명시 필요
		
		if( scores == null ) {//이것만 작성시 무슨 타입인지 모르기 때문에
			System.out.println("|1.학생수| 메뉴에서 학생 수를 먼저 등록해 주세요.");
			return; 		//return으로 대체
		}
	}
	
}
