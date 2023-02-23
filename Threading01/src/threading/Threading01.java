package threading;

public class Threading01 {

	public static void main(String[] args) {
			
	for (int i = 0; i < 5; i++) {
		MultiThreadThing myThing = new MultiThreadThing(i);
		Thread myThread = new Thread(myThing);
		myThread.start();

			myThread.isAlive();
	
	}

	}

}
