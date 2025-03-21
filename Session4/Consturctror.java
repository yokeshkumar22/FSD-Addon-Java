package Session4;

public class Consturctror {
	
	public Consturctror() {
		System.out.println("default constructor");
		
	}
	
	public Consturctror(String name, String age) {
		System.out.println("Name :"+name);
		System.out.println("Age :"+age);
		System.out.println("Parameter constructor ");
		
		
	}
	
	public int sum(int a, int b){
		int res = a + b;
		return res;
		
	}
	public static void main(String[] args) {
		Consturctror cx = new Consturctror();
		Consturctror ce = new Consturctror( "VISVASHAM VISHNU", "20");
		System.out.println(ce.sum(5, 10));	
		}
	
		
		

	
	
	

}
