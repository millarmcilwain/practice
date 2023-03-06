/**
 * 
 */
package onehundredmetresprint;

/**
 * @author Millar McIlwain
 *
 */
public class Racer implements Runnable {

	public int number= 0;
	
	@Override
	public void run() {

		System.out.println("This is thread" +number);

	}

}
