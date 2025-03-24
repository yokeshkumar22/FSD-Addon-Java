package Session5;

public class Accessbirdactions extends Bird implements Flyable{

	@Override
	public void fly() {
		System.out.println("Bird flys...");
		
	}

	public static void main(String[] args) {
		Accessbirdactions aba =new Accessbirdactions();
		aba.eat();
		aba.fly();
	}
	
	
	
}
