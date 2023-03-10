/**
 * 
 */
package programtointerface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Millar McIlwain
 *
 */
public class ListExcersises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		ArrayList<Fly> test1 = new ArrayList<Fly>();

		List<String> test2 = new LinkedList<String>();

		Fly fly3 = new Fly();
		fly3.setName("testtestetsttest");

		test1.add(fly3);

		ArrayList<ArrayList<Fly>> mega = new ArrayList<ArrayList<Fly>>();

		mega.add(test1);

		for (ArrayList<Fly> f : mega) {

			if (f.contains(fly3)) {

				System.out.println("yse");

			}

		}

		List<List> fire = new ArrayList<List>();

		fire.add(test1);
		fire.add(test2);

		for (List l : fire) {

			if (l instanceof ArrayList) {

				for (int loop = 0; loop < l.size(); loop++) {

					System.out.println(l.get(loop).toString());

				}
			}
		}

	}

}
