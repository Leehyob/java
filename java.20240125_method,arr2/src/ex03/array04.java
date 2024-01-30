package ex03;

public class array04 {

	public static void main(String[] args) {
		int rows = 2, columns=3;
		int[][] first = {{2,3,4}, {3,2,1}};
		int[][] second = {{1,2,3},{-4,-2,1}};
		
		int[][] sum = new int[rows][columns];
		
		for(int i=0; i<rows; i++) {
			for(int j=0; j<columns; j++) {
				sum[i][j] = first[i][j]+second[i][j];
			}
		}
		for(int i=0; i<rows; i++) {
			for (int j=0; j<columns; j++) {
				System.out.print(sum[i][j] + " ");
			}
		}

	}

}
