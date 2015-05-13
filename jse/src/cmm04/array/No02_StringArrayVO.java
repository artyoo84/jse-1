package cmm04.array;

public class No02_StringArrayVO {
	
	String[] juso = new String[3];
	
	public No02_StringArrayVO(){
		juso[0] = "서울";
		juso[1] = "종로";
		juso[2] = "광화문";
	}
	
	public void execute(){
		
		for(int i = 0; i<juso.length; i++){
			System.out.print(juso[i] + " ");
		}
	}
}
