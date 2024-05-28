package ex07;

interface Printable{
	void print();
}

class Papers{
	private String msg;
	
	public Papers(String msg) {
		this.msg = msg;
	}
	
	public Printable getPrinter() {
		
		//익명 클래스(이름이 없음)
		Printable tmp = new Printable() {
			@Override
			public void print() {
				System.out.println(msg);
			}	//바로 return 값으로 넣어줘도 상관 없음
		};
		
		return tmp;
	}
}

public class LocalInnerClass {

	
	
	public static void main(String[] args) {
		Papers p = new Papers("전송할 메시지");
		
		Printable pa = p.getPrinter();
		pa.print();
	}
	
}
