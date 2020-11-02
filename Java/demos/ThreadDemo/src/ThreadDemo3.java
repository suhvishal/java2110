
public class ThreadDemo3 {

	public static void main(String[] args) {
		 
		MyTask1 task = new MyTask1("t1");
		
		try {
			
			Thread.sleep(5000);
			
			task.t1.interrupt();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
