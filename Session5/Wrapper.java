package Session5;

public class Wrapper {
private static char[] praseInt;

	//auto boxing
	public static void main(String[] args) {
		int a = Integer.valueOf(50);
		Integer intobj = 50;//Equivalent to Integer.Valueof(50);
		
		Character charobj = 'A';
		
		Double dobj = 25.6215;
		
		System.out.println(intobj);
		System.out.println(charobj);
		System.out.println(dobj);
		System.out.println(a);
		
		System.out.println("--------------------------------------");
		//converting wrapper class to primitive
		int value1 = intobj;
		char value2 = charobj;
		double value3 = dobj;
		
		System.out.println(value1);
		System.out.println(value2);
		System.out.println(value3);
		
		
		//using utility method
		int parseInt = Integer.parseInt("123");
		double praseDouble = Double.parseDouble("25.23639");
		boolean praseBoolean = Boolean.parseBoolean("true");
		
		System.out.println(parseInt);
		System.out.println(praseDouble);
		System.out.println(praseBoolean);
		
	}
	
	
	
}
