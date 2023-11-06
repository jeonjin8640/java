package List02;

public class ShopEx {

	public static void main(String[] args) {
		
		//판매자로 회원가입 -> 판매자 승인 -> 싱품 등록(여러 개 -List)
		
		//홍길동만 쓸 수 있는 List 배열 공간을 만들어
		Seller seller = new Seller(10001, "홍길동");
		
		
		seller.addItem("삼성노트북", 1000000, 10);
		seller.addItem("무선마우스", 10000, 20);
		seller.showMemberInfo();
		
		Seller seller2 = new Seller(10002, "김철수");
		
		seller2.addItem("LG노트북", 100000, 10);
		seller2.showMemberInfo();
		
	}

}
