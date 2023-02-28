/**
 * 
 */
package threading;

/**
 * @author Millar McIlwain
 *
 */
public class RunnableThreadGameThread implements Runnable {

	int test=0;
	
	@Override
	public void run() {
		for (int loop = 0; loop<=30; loop++) {
			test=loop;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}
	
	public void printTime() {
		if (test==30) {
		System.out.println("Well done!");
		} else if (test<30) {
			System.out.println(test +"s" +"  You were too early!");
		} else if (test>30) {
			System.out.println(test +"s" +"  You were too late!");
		}
	}

}
