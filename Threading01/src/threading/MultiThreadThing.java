/**
 * 
 */
package threading;

import javax.management.RuntimeErrorException;

/**
 * @author Millar McIlwain
 *
 */
public class MultiThreadThing implements Runnable {
	
	private int threadNumber;
	public MultiThreadThing (int threadNumber) {
		this.threadNumber=threadNumber;
	}
	
	@Override
	public void run() {
		for (int i =1; i<=5; i++) {
			System.out.println(i+ "from thread" +threadNumber);
			if (threadNumber==3) {
				throw new RuntimeException();
			}
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
