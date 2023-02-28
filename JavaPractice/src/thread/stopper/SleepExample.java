package thread.stopper;

import java.util.Random;

public class SleepExample {

	public SleepExample() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		System.out.println("Main in");
		
		try {
			System.out.println("about to sleep...");
			Thread.sleep(new Random().nextInt(2000));
			System.out.println("awake again!");
		} catch (InterruptedException e) {
			System.out.println("problem !");
		}
		
		System.out.println("Main out");
	}
	
	

}
