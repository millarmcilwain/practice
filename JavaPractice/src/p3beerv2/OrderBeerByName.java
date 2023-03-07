/**
 * 
 */
package p3beerv2;

import java.util.Comparator;

/**
 * @author Millar McIlwain
 *
 */
public class OrderBeerByName implements Comparator<Beer> {

	@Override
	public int compare(Beer o1, Beer o2) {
		o1.getBeerName().compareTo(o2.getBeerName());
		return 0;
	}

}
