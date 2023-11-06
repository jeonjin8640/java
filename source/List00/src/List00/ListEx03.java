package List00;

import java.util.*;


//접근 제한자 : public > protected > default > private

class Item{
	private Long itemNum;
	private String itemname;
	private int itemPrice;
	private int itemStock;
	
	public Item(Long itemNum, String itemname, int itemPrice, int itemStock) {
		this.itemNum = itemNum;
		this.itemname = itemname;
		this.itemPrice = itemPrice;
		this.itemStock = itemStock;
	}
	
	public void itemDisp() {
		System.out.println("상품번호 : "+itemNum+", 상품명 : "+itemname+", 상품가격 : "+itemPrice+", 상품재고 : "+itemStock+"");
	}
	
}

class ItemDao{
	
	public List<Item> getItems() {
		List<Item> aList = new ArrayList<>();
		
		aList.add(new Item(1000001L, "노트북", 20000000, 10));   // arr[i] = new Item();
		aList.add(new Item(1000002L, "휴대폰", 2000000, 30));   
		aList.add(new Item(1000003L, "TV", 200000000, 20));
		
		return aList;
	}
	
}

public class ListEx03 {

	public static void main(String[] args) {
		//객체(Item) : 상품번호, 상품명, 가격, 재고
		ItemDao dao = new ItemDao();
		List<Item> list = new ArrayList<>();
		
		System.out.println("                -----for2 상품출력-----");
		for(Item item : dao.getItems()) {
			item.itemDisp();
		}
		
	}

}
