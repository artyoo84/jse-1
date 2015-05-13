package cmm04.array;

public class No03_ForLoopArrayVO {

	private int a;
	private int b;
	private int c;
	private int d;
	private int e;
	
	
	public void execute(){
		
		int result = 0;
		result += getA();
		result += getB();
		result += getC();
		result += getD();
		result += getE();
		
		System.out.println("รัวี : " + result);
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public int getB() {
		return b;
	}


	public void setB(int b) {
		this.b = b;
	}


	public int getC() {
		return c;
	}


	public void setC(int c) {
		this.c = c;
	}


	public int getD() {
		return d;
	}


	public void setD(int d) {
		this.d = d;
	}


	public int getE() {
		return e;
	}


	public void setE(int e) {
		this.e = e;
	}
	
	
}
