package Session5;

public class Overloadingsample {
	
	int c;
	
	public void add(int a, int b) {
		
		c = a+b;
		System.out.println("the Value of integer c:"+c);
	}
	
	public void add(float a, int b) {
		
		float c = a+b;
		System.out.println("the value of float c:" +c);
	}
	
	public void add(float a, double b) {
		double c =a+b;
		System.out.println("the value of double c:"+c);
	}
	
	public static void main(String[] args) {
		Overloadingsample ole = new Overloadingsample();
		ole.add(25, 10);
		ole.add(32.5f, 10);
		ole.add(10.54f,12.25276);
	
		
		
		
	}
	

}
