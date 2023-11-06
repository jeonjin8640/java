package inherEx01;

public class Android extends Phone{
	String company;
	
	public Android() {}
	
	public Android(String model, String color, String company) {
		super(model, color);
		this.company = company;
		
	}
	void disp() {
		System.out.println("Company Name : "+company+", Model : "+model+", Color : "+color);
	}
	
}
