package ex03;

public class String01 {

	public static void main(String[] args) {
		String str = "korea";
		String str1 = "";
		System.out.println(str.length());
		System.out.println(str.isEmpty());
		System.out.println(str1.isEmpty());
		System.out.println(str.substring(1));
		System.out.println(str.substring(0, 3));
		
		String str2 = "math";
		String str3 = str2.concat(str2);
		
		
		System.out.println(str.concat(str2));
		System.out.println(str2.concat(str));
		System.out.println(str3);
		
		
		String str4 = "AMERICAN dream";
		System.out.println(str4.toUpperCase());
		System.out.println(str4.toLowerCase());
		System.out.println(str4.indexOf("d"));
		String str5 = " meet";
		System.out.println(str5.trim());
		
	}

}
