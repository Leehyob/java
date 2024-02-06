package projectVer1;


public class Admin extends Person{
	private	String id = "Admin";
	private String password = " Admin1234";
	
	public Admin(String name, String phone) {
		super(name, phone);
	}
	public Admin() {
		
	}
	
	public String getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	
	
}
