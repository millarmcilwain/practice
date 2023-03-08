/**
 * 
 */
package threadolympic;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author Millar McIlwain
 *
 */
public class MainRace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	Map<Double, String> racers = new TreeMap<Double, String>();
	int test =2;
	
	racers.put(9.81, "Bolt");
	racers.put(9.89, "Galtin");
	racers.put(9.91, "Degrasse");
	racers.put(11.99, "Simbine");
	racers.put(9.96, "Meite");
	racers.put(13.09, "Bromell");	

	
	
	for (Double raceTime : racers.keySet()) {
		Runner t = new Runner(racers.get(raceTime), (long) raceTime.longValue());
		Thread thread = new Thread(t);
		thread.start();

	}

}
}
