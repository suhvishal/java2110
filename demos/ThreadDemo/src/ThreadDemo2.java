
public class ThreadDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable task1 = new MyTask();
		
		Thread t1 = new Thread(task1, "T1");		
		
		System.out.println("T1 State = " + t1.getState());
	
		t1.start();
		
		System.out.println("T1 State " + t1.getState());
		
		
		for(int i=1; i<=3; i++) {
		
			System.out.println("T1 State " + t1.getState());
			
			try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
		System.out.println("T1 State " + t1.getState());
		
		

		
	}

}
