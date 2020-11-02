
//implementing runnable interface allows to represent a task/code that you want to execute inside a thread 


public class MyTask implements Runnable{

	@Override
	public void run() {

		System.out.println("Started... " + Thread.currentThread().getName());
		for(int i = 1; i <= 5; i++) {
			
			System.out.println("\n\t i = "  + i);
			
			try {
				Thread.sleep(4000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		System.out.println("Ended... " + Thread.currentThread().getName());

	}

}
