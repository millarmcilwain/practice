/**
 * 
 */
package p3woof;

import java.util.Comparator;

/**
 * @author millarmcilwain
 *
 */
public class DogOrderByWeight implements Comparator<Dog> {

	@Override
	public int compare(Dog o1, Dog o2) {
		
		if (o1.getWeight()<o2.getWeight()){
		
		return -1;
		}
		else if (o1.getWeight()>o2.getWeight()) {
			return 1;
		} else {
			return 0;
		}
	}

}
