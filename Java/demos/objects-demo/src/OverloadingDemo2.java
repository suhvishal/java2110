

class Animal{
	
}

class Monkey extends Animal{
	
}



public class OverloadingDemo2 {
	
	
	static void method1(Animal animal) {
		System.out.println("Animal Version");
	}
	
	static void method1(Monkey monkey) {
		System.out.println("Monkey version...");
	}

	public static void main(String[] args) {
		
//				Animal a = new Animal();
//				method1(a);
		
//				Monkey m  = new Monkey();
//				method1(m);
				
				Animal a = new Monkey();
				method1(a);
				
				System.out.println("Float : " + Float.MAX_VALUE);
				System.out.println("Long : " + Long.MAX_VALUE);
		
	}

}
