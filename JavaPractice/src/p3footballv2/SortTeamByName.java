/**
 * 
 */
package p3footballv2;

import java.util.Comparator;

/**
 * @author Millar McIlwain
 *
 */
public class SortTeamByName implements Comparator<Team> {

	@Override
	public int compare(Team o1, Team o2) {
		// TODO Auto-generated method stub
		return o1.getTeamName().compareTo(o2.getTeamName());
	}

}
