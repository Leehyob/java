package java01;



public class java02 {

	public static void main(String[] args) {
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i%3==0) {
				sum += i;
			}
			
		}

		System.out.println("3의 배수의 총합 : " + sum);
		
		int[] arr = {10,20,30};
		
		for(int i =0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		int[] arrNum = arr;
		for(int i=0; i<arr.length; i++)
			arrNum[i] -= 5;
		
		System.out.println();
		for(int n:arr)
			System.out.print(n + " ");
		
		System.out.println();
		
		String[] str = {"kor", "eng" ,"math","com","sci"};
		//for(String b : str)
		//	System.out.print(b + " ");
		for(int i=0; i<str.length; i++)
			System.out.print(str[i] + " ");
		
		System.out.println();

	
		
		String strVar1 = "홍길동";
		String strVar2 = "홍길동";
		
		if(strVar1.equals(strVar2)) 
			System.out.println("strVar1과 strVar2는 참조가 같음");
		else
			System.out.println("strVar1과 strVar2는 참조가 다름");
		
		String strVar3 = new String("홍길동");
		String strVar4 = new String ("홍길동");
		
		if(strVar3 == strVar4)
			System.out.println("strVar3와 strVar는 참조가 같음");
		else
			System.out.println("strVar3와 strVar는 참조가 다름");
		
		if(strVar3.equals(strVar4))
			System.out.println("strVar3와 strVar4는 문자열이 같음");
	
	}

}
