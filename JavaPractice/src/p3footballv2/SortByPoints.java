/**
 * 
 */
package p3footballv2;

import java.util.Comparator;

/**
 * @author Millar McIlwain
 *
 */
public class SortByPoints implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {

		if (o1.getTotalPoints() > o2.getTotalPoints()) {
			return 1;
		} else if (o1.getTotalPoints() < o2.getTotalPoints()) {
			return -1;
		} else {
			return 0;
		}

	}
}
