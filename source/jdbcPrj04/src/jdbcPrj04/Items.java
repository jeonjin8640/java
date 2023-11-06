package jdbcPrj04;

import java.time.LocalDateTime;

public class Items {
	private int id;
	private String name;
	private int price;
	private int stock;
	private String date;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {

		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + ", stock=" + stock + ", date=" + date + "]";
	}
	
	
	
	
}
