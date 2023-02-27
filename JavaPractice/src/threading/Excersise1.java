package threading;

public class Excersise1 {

	public static void main(String[] args) {
		
		RunningThead myThread = new RunningThead();
		
		Thread newThread = new Thread(myThread);
		
		newThread.start();
		
		
	}

}
