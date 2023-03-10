/**
 * 
 */
package collectionstuff;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * @author Millar McIlwain
 *
 */
public class ListExcersise {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> list1 = new LinkedList<Integer>();
		Random random = new Random();
		List<Integer> list2 = new ArrayList<Integer>();
		
		
		
		for (int loop=0; loop<=10; loop++) {
			list1.add(random.nextInt(6));
			list2.add(random.nextInt(6));
		}
		
		removeDuplicates(list2, list1);
	
	
		


	}
	
	public static void removeDuplicates(Collection<Integer> originalList, Collection<Integer> listToRemove) {
		
		for (Integer removeItem : listToRemove){
			if (originalList.contains(removeItem)){
			originalList.remove(removeItem);
		};
	}
		
		for (Integer i : originalList) {
			System.out.println(i);
		}

}
}
