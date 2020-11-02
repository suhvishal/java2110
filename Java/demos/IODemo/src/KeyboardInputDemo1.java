import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class KeyboardInputDemo1 {

	public static void main(String[] args) throws IOException {
		
		//Scanner scanner = new Scanner(System.in);
		
		
		DataInputStream dis = new DataInputStream(System.in);

		System.out.println("Enter some text...");
		String str = dis.readLine();
		
		
		
		System.out.println("entered text = " + str);
	}

}
