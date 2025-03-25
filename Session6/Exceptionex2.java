package Session6;

public class Exceptionex2 {

	
public static void main(String[] args) {
	try {
		
		
		System.out.println("trying to divide 0");
		int res = 10/10;
		System.out.println("Result:"+res);
	}
	
	catch(Exception e) {
		
		System.out.println(e.getMessage());
		e.printStackTrace();
		
		
	}
	finally {
		System.out.println("finaalyy namadha");
	}
}	
	
	
	
}
