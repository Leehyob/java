package interfacetPractice;

public class Minus extends Sum{
	int sum=0;
	
	@Override
	void sum(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			sum -= arr[i];
		}
			System.out.print(sum);
	}
}
