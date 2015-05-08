package hello;

public class Test {
	public static void main(String[] args) {

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
