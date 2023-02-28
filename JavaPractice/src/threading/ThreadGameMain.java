package threading;

import java.util.Scanner;

public class ThreadGameMain {

	public static void main(String[] args) {
		
		String control;
		Scanner sc = new Scanner(System.in);
		
		RunnableThreadGameThread runThread = new RunnableThreadGameThread();

		Thread myThread = new Thread(runThread);
		System.out.println("Game started - Press Enter when you think 30secs is up! ");
		myThread.start();
		
		sc.nextLine();
		
		if (myThread.isAlive()) {
			runThread.printTime();
		}
		
	}

}
