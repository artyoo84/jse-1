package cmm04.array;

import java.util.Scanner;


public class No03_ForLoopArrayDemo {
	public static void main(String[] args) {
		
		No03_ForLoopArrayVO vo = new No03_ForLoopArrayVO();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력해주세요.");
		vo.setA(scanner.nextInt());
		System.out.print("숫자를 입력해주세요.");
		vo.setB(scanner.nextInt());
		System.out.print("숫자를 입력해주세요.");
		vo.setC(scanner.nextInt());
		System.out.print("숫자를 입력해주세요.");
		vo.setD(scanner.nextInt());
		System.out.print("숫자를 입력해주세요.");
		vo.setE(scanner.nextInt());
		
		vo.execute();
		
		scanner.close();
	}
}

