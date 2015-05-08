package hello;

import java.io.IOException;


public class Hello{	
	public static void main(String[] args) throws IOException{
		
		int i = 0, j = 0;

		for (i = 1; i <= 9; i++) {
			for (j = 2; j <= 5; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}

		System.out.println();

		for (i = 1; i <= 9; i++) {
			for (j = 6; j <= 9; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
		
	}
	
}