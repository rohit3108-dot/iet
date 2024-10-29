package abc;

public class FunctionOver1 {

	public static int add(byte x, byte y) {
	System.out.println("addition of byte");
	return x+y;
	
	}
	public static long add(int x, int y) {
	System.out.println("addition of integer");
	return x+y;
	}
	
	public static long add(long x, long y) {
		System.out.println("addition of long");
		return x+y;
		
	}
	
	
	
	public static void main(String [] args) {
		System.out.println(add(((byte)10),((byte)20)));
		System.out.println(add(50,20));
		System.out.println(add(20,40));
	}
	


}
