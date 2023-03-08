/**
 * 
 */
package p3dogv2;

import java.util.Comparator;

/**
 * @author Millar McIlwain
 *
 */
public class CompareDogHeightSmallestFirst implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		if (o1.getHeight()>o2.getHeight()) { 
			return 1;
			} else if (o1.getHeight()<o2.getHeight()) {
				return -1;
			} else {
				return 0;
			}

	}

	
	
}
