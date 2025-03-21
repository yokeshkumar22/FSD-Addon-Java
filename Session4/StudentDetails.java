package Session4;

public class StudentDetails {

	 private String empname;
	 private int empid;
	 private String location;
	 
	 public StudentDetails(String empname, int empid, String location) {
	 
		 this.empname = empname;
		 this.empid = empid;
		 this.location = location;
		 
	 }
	 
	 public StudentDetails(String empname, String location) {
		 this (empname,0,location);
	 }
	 
	 public StudentDetails(String empname, int empid) {
		 
		 this(empname,empid,null);
	 }
	 
	 public void displayInfo() {
		 System.out.println("empname:" +this.empname);
		 System.out.println("empid:" +this.empid);
		 System.out.println("emp location:" +this.location);
		 
		 
	 }
	public static void main(String[] args) {
		
		StudentDetails cox = new StudentDetails("YOKXSH!!",1234,"CSLAB");
		StudentDetails cox1 = new StudentDetails("REX!","CSLAB");
		StudentDetails cox2= new StudentDetails("XYFHER!!",1234,"CSLAB");
		cox.displayInfo();
		cox1.displayInfo();
		cox2.displayInfo();
	}
	
	
	
}
