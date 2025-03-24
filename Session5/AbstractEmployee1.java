package Session5;

public  class AbstractEmployee1 extends AbstractEmployee {

	
	@Override
	public void futuredesignation() {
		System.out.println("full stack devops");
		
	}
	
	public static void main(String[] args) {
		
		AbstractEmployee1 ae = new AbstractEmployee1();
		ae.name();
		ae.designation();
		ae.futuredesignation();
	}
	
	
	
	
}
