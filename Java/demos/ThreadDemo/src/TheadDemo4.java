
public class TheadDemo4 {
	
	public static void main(String[] args) {
		
		System.out.println("Main started....");
		
		MyTask1 task1 = new MyTask1("t1");

		MyTask1 task2 = new MyTask1("t2");
		
		
		try {
			
			task1.t1.join();
			task2.t1.join();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("Main Ended....");

	}

}
