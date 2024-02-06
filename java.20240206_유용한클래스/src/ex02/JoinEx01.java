package ex02;

public class JoinEx01 {

	public static void main(String[] args) {
		
		String animals = "dog, cat, bear";
		
		String[] arr = animals.split(",");
		
		for(String a : arr) {
			System.out.print(a + "\n");
		}
		
		String str = String.join("-", arr);
		System.out.println(str);
		str = String.join("", arr);
		System.out.println(str);
	}

}
