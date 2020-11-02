import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharacterBasedIODemo1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
//		File myfile = new File("abc.txt");
//		
//		FileInputStream fis = new FileInputStream(myfile);
//		
//		InputStreamReader isr = new InputStreamReader(fis);
//		
//		int data;
//		
//		while( (data = isr.read())!=-1 ) {
//			System.out.print((char)data);
//		}
//		
//		isr.close();
		
		
		File myfile = new File("abc.txt");
		
		
		FileReader fileReader;
		BufferedReader reader = null;
		
		try {
			fileReader = new FileReader(myfile);
			reader = new BufferedReader(fileReader);
			
			
			int data;
			
			while( (data = reader.read())!=-1 ) {
				System.out.print((char)data);
			}
			
			reader.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
