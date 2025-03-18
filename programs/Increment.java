package programs;

public class Increment {

	public static void main(String[] args) {
		int a = 5;
		System.out.println("C:"+(a++ + --a + ++a));
	}
}
