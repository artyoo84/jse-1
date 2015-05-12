package cmm03.flow;

import java.util.Scanner;

public class No03_SwitchCaseDemo {
	
	private static Scanner scanner = new Scanner(System.in);
	
	private static int getValue(boolean retry){
		
		String msg = "평균 점수를 입력하세요.";
		if(retry)
			msg += " 다시 입력해주세요.";
		
		System.out.println(msg);
		int inputAvg = scanner.nextInt();
		
		if( !(inputAvg >= 0 & inputAvg <= 100))
			return getValue(true);
		
		return inputAvg;
	}
	
	
	
	
	
	private static void printValue(int avg){
		String result;
		char grade = 'A';
		
		
		switch(avg/10){
		
		case 10:
		case 9:
			grade = 'A';
			break;
			
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
			
		case 6:
			grade = 'D';
			break;
			
		case 5:
			grade = 'E';
			break;
		default:
			break;
	}
		
		
		if(avg == 70){
			result = "합격";
		}else if(avg >= 70){
			result = "합격";
		}else{
			result = "재시험";
		}
		
		System.out.println("귀하는 " + result + "이며, 학점은 " + grade + "입니다");
		
		
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		while(true){
			int avg = getValue(false);
			
			if((avg/10 >= 0 && avg/10 <= 100)){
				// 성공
				printValue(avg);
				break;
			}
		}
	
		
		
		// 평균점수에 따라서 비교 학점구하기
		/*
		
		if(avg >= 90)
			grade = 'A';
		else if(avg >= 80)
			grade = 'B';
		else if(avg >= 70)
			grade = 'C';
		else if(avg >= 60)
			grade = 'D';
		else
			grade = 'F';
		*/
		// 위 if else를 switch로 바꾸시오
		
	}
}
