package ex02;

public class English implements Information{
	
	public void sayHi() {
		System.out.println("hi");
	}
	
	@Override
	public void feeling() {
		System.out.println("How are you today?");
		System.out.println("Pretty good");
	}

}
