package List02;

import java.util.*;

public class Seller {
	private int memberID;
	private String memberName;
	List<Item> list = null;
	
	public Seller(int mamberID, String mamberName) {
		this.memberID = memberID;
		this.memberName = memberName;
		
		list = new ArrayList<Item>();
	}
	
	public void addItem(String itemName, int itemPrice, int itemStock) {
		Item item = new Item();
		item.setItemName(itemName);
		item.setItemPrice(itemPrice);
		item.setItemStock(itemStock);
		
		list.add(item);
	}
	
	public void showMemberInfo() {
		for(Item info : list) {
			System.out.println("판매자 아이디: "+memberID+" 판매자 이름: "+memberName+" 상품명: "+info.getItemName()+" 상품가격: "+info.getItemPrice()+" 재고: "+info.getItemStock()+" ");
		}
	}
}
