package ex01;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {

		for(int j=2; j<=4; j++) {
			System.out.println("구구단"+ j + "단");
			for(int i=1; i<=9; i++)
				System.out.println(j + "*" + i + "=" + (i*j));
		}
	}

}
