import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		long currenttime = System.nanoTime();
		
		try {
			
			fis = new FileInputStream(new File("myimage1.png"));
			bis = new BufferedInputStream(fis);
			
			
			fos = new FileOutputStream(new File("myimage2.png"));
			bos = new BufferedOutputStream(fos);
			
			int data;
			
			while((data = bis.read())!=-1  ) {
				bos.write(data);
			}
			
			long elapsedtime = (System.nanoTime() - currenttime) / 60;
			System.out.println("read/write operation completes in ..." + elapsedtime);
			
			bis.close();
			bos.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
