package hello;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


/**
 * 
 * �ζ�
 * 
 *
 */

public class Hello{	
	public static void main(String[] args) throws IOException{
		

		boolean win = true;
		
		/*boolean bTmp0 = false;
		boolean bTmp1 = false;
		boolean bTmp2 = false;
		boolean bTmp3 = false;
		boolean bTmp4 = false;
		boolean bTmp5 = false;
		*/
		boolean[] bWin = new boolean[6];
		
		
		
		int[] input = new int[6];
		String inputNotModified;
		
		// ����� ������
		/*int[] result = new int[6];
		for(int i=0; i<result.length; i++){
			Random random = new Random();
			result[i] = random.nextInt(45)+1;
		}*/
		// TODO : ��� ����� ����
		int[] result = {16, 43, 30, 42, 14, 20};
		
		
		
		// �Է°�
		System.out.println("���� �Է����ּ���.");
		System.out.print("��(16, 23, 46, 1, 17) : ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		inputNotModified = in.readLine();
		StringTokenizer tokenizer = new StringTokenizer(inputNotModified, " ");
		int idx = 0;
		while(tokenizer.hasMoreTokens()){
			if(idx > 5) break;
			
			int n = Integer.parseInt(tokenizer.nextToken());
			input[idx++] = n;
		}
		
		
		// ��÷ Ȯ��
		for(int i= 0; i<input.length; i++){
			for(int j=0; j<result.length; j++){
				if( i == j) bWin[i] = true;
				
				/*switch(i){
					case 0:
						if(i == j)
							bTmp0 = true;
						break;
					case 1:
						if(i == j)
							bTmp1 = true;
						break;
					case 2:
						if(i == j)
							bTmp2 = true;
						break;
					case 3: 
						if(i == j)
							bTmp3 = true;
						break;
					case 4:
						if(i == j)
							bTmp4 = true;
						break;
					case 5:
						if(i == j)
							bTmp5 = true;
						break;
				}*/
				
			}
		}
		
		
		for(int i=0; i<bWin.length; i++){
			if(!bWin[i]){
				win = false;
			}
		}
		
		
		System.out.println("�ζ� ��ȣ�� .." + result[0] + ", " + result[1] + ", " + result[2] + ", " + result[3] + ", " + result[4] + ", " + result[5]);
		
		// ��� ���
		if(win)
			System.out.println("��÷�Ǽ̽��ϴ�.");
		else
			System.out.println("��÷ �ȵǼ̾��. ����");
		
		
		
	}
	
}