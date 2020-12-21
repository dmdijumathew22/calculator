package sr.main.operations;

public class DivOperation {
	
	private float a, b;
	public DivOperation(int a, int b) {
		
		this.a =(float) a;
		this.b = (float)b;
	}
	public float quotient (){
		return a/b;
	}
}
