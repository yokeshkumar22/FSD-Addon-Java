package Session6;

public class Exceptionex3 {

	static void validateAge (int age) {
		
		if(age<18) {
			throw new IllegalArgumentException("Age must be 18 or above");
			
		}
		else {
			System.out.println("age valid");
		}
	}
	
	public static void main(String[] args) {
		try {
			validateAge(60);
			
		}
		catch(IllegalArgumentException e) {
			System.out.println("caugth:"+e.getMessage());
		}
	}

	
	
}
