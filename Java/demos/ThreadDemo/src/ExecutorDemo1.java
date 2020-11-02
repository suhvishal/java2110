import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Runnable task = ()-> {
			System.out.println(Thread.currentThread().getName() + " Started... executing task");
			for(int i=1; i<=5; i++) {
				System.out.println("\n\t\t i : " + i);
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName() + " Ended..");
		
		};
		
		ExecutorService pool = Executors.newFixedThreadPool(5);

		pool.execute(task);
		pool.execute(task);
		pool.execute(task);


	}

}
