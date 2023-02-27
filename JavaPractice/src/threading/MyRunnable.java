package threading;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		
		int loop = 100000;
		do {
			System.out.println("Thread running");
		} while (loop<10000000);
		
	}

}
