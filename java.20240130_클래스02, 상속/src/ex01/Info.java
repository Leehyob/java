package ex01;

public class Info {

	private String nation = "대한민국";
	private String name;
	private String ssn;
	
	Info(String name, String ssn){
		this.name = name;
		this.ssn = ssn;
	}
	Info(){
		
	}
	
	void country(String nation) {
		this.nation = nation;
		System.out.print(nation);
	}
	void information() {
		System.out.println("nation : " + nation);
		System.out.println("name : " + name);
		System.out.println("ssn : " + ssn);
	}
	
}
