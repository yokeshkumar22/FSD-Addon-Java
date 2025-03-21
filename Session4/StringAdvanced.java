package Session4;

public class StringAdvanced {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder("Hello");
		
		//apend
		sb.append("world");
		System.out.println("After append: " +sb);
		
		//insert
		sb.insert(5, ",");
		System.out.println("Afetr insert:"+sb);
		
		//replace
		sb.replace(6, 11, "java");//Sourceindex;DestinationIndex;
		System.out.println("after replace :"+sb);//stringtoreplace
		
		//reverse
		sb.reverse();
		System.out.println("after reverse :"+sb);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
