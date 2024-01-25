
public class ques04 {

	public static void main(String[] args) {
		int sum=0;
		int num =0;
		int i, j;
		int total;
			for( i=1; true; i++) {
				if(i%2==1) 
					sum +=i;	
				if(i%2==0) 
					num -=i;
				total = sum + num;
				if(total>=100) {
					break;
							
		}
		
			}
			System.out.println(total);
			System.out.println(i);
		
			

	}

}
