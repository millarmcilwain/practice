/**
 * 
 */
package patient;

import java.util.Comparator;

/**
 * comparator for wait time 
 * @author Millar McIlwain
 *
 */
public class CompareWaitTime implements Comparator<Patient> {

	@Override
	public int compare(Patient o1, Patient o2) {
		
		if (o1.getWaitTime()>o2.getWaitTime()) {
			return -1;
		} else if (o2.getWaitTime()>o1.getWaitTime()) {
			return 1;
		} else {
			return 0;
		}
	}

}
