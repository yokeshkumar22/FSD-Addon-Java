package Session5;


public class Accessfoodmenu implements Vegitems, Nonvegitems{

	@Override
	public void fry() {
		System.out.println("chicken,kaada,mutton,rabbit");
	}

	@Override
	public void gravy() {
		
		System.out.println("fish gravy,egg gravy");
	}

	@Override
	public void breakfast() {
	System.out.println("idly,dosa,pongal");
	}

	@Override
	public void lunch() {
		System.out.println("biriyan,parrot,fried rice");
		
	}

	public static void main(String[] args) {
		
		Accessfoodmenu afm = new Accessfoodmenu();
		afm.breakfast();
		afm.gravy();
		afm.lunch();
		afm.fry();
		
	}
	
	
	
	
	
}
