package Session5;

public class AccessPerson {
	
	public static void main(String[] args) {
		
		Person originalPerson = new Person("Yokesh",19);//OG
		//copied
		Person copiedPerson = new Person(originalPerson);//object dependency
		
		System.out.println("original Person:");
		originalPerson.displayInfo();
		
		System.out.println("copied Person:");
		copiedPerson.displayInfo();
		
		
		
		
		
	}
	

}
