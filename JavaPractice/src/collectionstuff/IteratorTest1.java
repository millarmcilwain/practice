/**
 * 
 */
package collectionstuff;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 * @author Millar McIlwain
 *
 */
public class IteratorTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		List<String> test1 = new ArrayList<String>();
		
		test1.add("sdfgsdfg");
		test1.add("sdgsdgsdgs");
		test1.add("sddgsdg");
		test1.add("fshhrsbnb");
		test1.add("fsghsdfhfhdsh");
		test1.add("the end");
		
		ListIterator<String> i = test1.listIterator(0);
		
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
