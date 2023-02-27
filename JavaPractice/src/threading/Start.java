package threading;

public class Start {

	public static void main(String[] args) {

		MyRunnable myRunnable = new MyRunnable();
		
		Thread myThread = new Thread(myRunnable);
		
		myThread.start();
		
		System.out.println("Out main");
	}

}
