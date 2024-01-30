package ex01;

public class 로또 {

	public static void main(String[] args) {
		//1~45 숫자 중에서 랜덤하게 6개 추출
		
		int lotto =0;
		int[] arr = new int[6];
		boolean flag = false;
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<arr.length; i++) {
			flag = false;
			int first = (int)((Math.random()*45)+1);
			
			for(int k=0; k<i; k++) {
				if(first == arr[k]) {
					flag = true;
					break;
				}
					
			}
			if(flag) {
				i--;
				continue;
			}
			arr[i] = first;
			
			
			}
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + " ");
				}
			System.out.println("\n-------------------------------");
		}
	

	}

}
