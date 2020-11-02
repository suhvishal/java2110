
//implementing runnable interface allows to represent a task/code that you want to execute inside a thread 


public class MyTask1 implements Runnable{
	
	public Thread t1;

	public MyTask1(String name) {

		t1 = new Thread(this, name);
		t1.start();

	}

	@Override
	public void run() {

		System.out.println("Started... " + Thread.currentThread().getName());
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("\n\t " + Thread.currentThread().getName() + " i = "  + i);
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				System.out.println("I m interruped by main...");
				break;
			}
		}
		
		System.out.println("Ended... " + Thread.currentThread().getName());

	}

}
