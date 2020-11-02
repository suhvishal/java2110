import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;

public class QueueDemo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		BlockingQueue<Integer> queue = new ArrayBlockingQueue(5);
		
		queue.poll();
		

		
	}

}
