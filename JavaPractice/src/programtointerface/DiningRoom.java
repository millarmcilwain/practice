/**
 * 
 */
package programtointerface;

import java.util.ArrayList;

/**
 * @author Millar McIlwain
 *
 */
public class DiningRoom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		
		ArrayList<Pest> test = new ArrayList<Pest>();
		ArrayList<Fly> test2 = new ArrayList<Fly>();
		
		
		Pest fly1 = new Fly();
		Pest fly2 = new Fly();
		Pest fly3 = new Fly();
		
		
		Pest phone1 = new Phone();
		Pest phone2 = new Phone();
		Pest phone3 = new Phone();
		
		
		test.add(fly1);
		test.add(fly2);
		test.add(fly3);
		test.add(phone1);
		test.add(phone2);
		test.add(phone3);

		
		for (Pest p : test) {
			
			p.doSomethingAnnoying();
			if (p instanceof Fly) {
				
				test2.add((Fly)p);
			}
		}
		
		for (Fly f : test2) {
			f.doSomethingAnnoying();
		}
	}

}
