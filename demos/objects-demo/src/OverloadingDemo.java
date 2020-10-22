
public class OverloadingDemo {
	
	
	public static void arithAdd(int a, int b) {
		System.out.println("Method 1");
		System.out.println(a+b);
	}

	private static float  arithAdd(int a, float b) {
		System.out.println("Method 2");
		System.out.println(a+b);
		return a+b;
	}
	
	public static void arithAdd(float b, int a) {
		System.out.println("Method 4");
		System.out.println(a+b);
	}
	
	protected static void arithAdd(int a, double b) {
		System.out.println("Method 3");
		System.out.println(a+b);
	}
	
	public static void arithAdd(int... args) {
		System.out.println("length of arguments = " + args.length);
	}
	
	
	public static void method1(Object o) {
		System.out.println("Object version...");
	}
	
	public static void method1(String s) {
		System.out.println("String version...");
	}
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arithAdd(10, 20);
		
		method1("Vishal");
	}

}
