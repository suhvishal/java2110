import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Choice : \n\t 1. TataCar \n\t 2. BMWCar ");
		
		int choice = scanner.nextInt();
		
		Car c = null;
		
		switch (choice) {
			case 1:
				//create tatacar object 
					c = new TataCar("Indigo");
				break;
				
			case 2:
				//create bmwcar object 
					c = new BMWCar("B1");
				break;


		default:
			break;
		}
		
		if(c!=null) {
			c.move();
		}
	}

}
