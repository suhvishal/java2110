
class MyThread extends Thread{

	@Override
	public void run() {
		
			System.out.println("Started mythread...." + getName());

			for(int j=0; j<=5; j++){
				System.out.println("inside mythread, j = " + j);
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			System.out.println("mythread ends...");
	}
	
}



public class ThreadDemo1 {

	public static void main(String[] args) {
		
		System.out.println("Started ... main method's thread = " + Thread.currentThread().getName());
		
		MyThread t1 = new MyThread();
		t1.start();
		
		for(int i=0; i<=5; i++){
			System.out.println("inside main, i = " + i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("main() ends...");

	}

}
