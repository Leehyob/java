package interfacetPractice;

public class java05 {

	public static void main(String[] args) {
		int[] arr = new int[] {6,4,12,1,5};
		
		Sort sort = new High();
		sort.sort(arr);
		System.out.println("\n-------------------------");
		Sort sort2 = new Low();
		sort2.sort(arr);
		System.out.println("\n-------------------------");
		
		Sum sum = new Plus();
		sum.sum(arr);
		System.out.println("\n-------------------------");
		Sum sum2 = new Minus();
		sum2.sum(arr);
		
		
	}
	

		
		
		
	
	
	
}
