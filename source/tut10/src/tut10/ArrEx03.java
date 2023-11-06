package tut10;


public class ArrEx03 {

	public static void main(String[] args) {
		//메소드를 이용하여 출력
		//정수에 5개 점수를 입력 후
		//합계
		//평균
		
		//int[] scores = new int[] {1, 2, 3, 4, 5};
		int[] scores = null;
		scores = new int[] {1, 2, 3, 4, 5};
		
		
		
		
		//보낼 때는 값(오른쪽), 받을 때는 타입(왼쪽)
		Cal1 c =  new Cal1();
		Display1 d = new Display1();
		
		
		d.title("컴퓨터 프로그램");
		//배열 10개의 합은 100입니다.
		//System.out.println(c.sum(scores));
		System.out.println("배열 "+scores.length+"개의 합은 "+c.sum(scores)+"입니다.");
		
		c.avg(scores);
		System.out.printf("배열 "+scores.length+"개의 평균은 %.2f 입니다.",c.avg(scores));
		System.out.println("");
		System.out.println(d.close("시스탬 종료"));
		
	}

}
