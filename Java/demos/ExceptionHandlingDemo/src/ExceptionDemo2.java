import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo2 {
 
	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);

		try {
			System.out.print("Enter age : ");
			int age = scanner.nextInt();
	
			if(age < 0) {
				throw new InvalidAgeException("age is not valid");
			}
			 
		}catch(InputMismatchException e) {
			System.out.println("invalid input...");
		}

		
		
	}
}
