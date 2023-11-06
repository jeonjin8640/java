package custPrj;

public class Customer {
	private int id;
	private String email;
	private String name;
	private int salays;
	private String regdate;
	
	public Customer() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalays() {
		return salays;
	}

	public void setSalays(int salays) {
		this.salays = salays;
	}

	public String getRegdate() {
		return regdate;
	}

	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", email=" + email + ", name=" + name + ", salays=" + salays + ", regdate="
				+ regdate + "]";
	}
	
	
	
	
}
