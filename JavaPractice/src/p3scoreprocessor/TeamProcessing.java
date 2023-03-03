/**
 * 
 */
package p3scoreprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Millar McIlwain
 *
 */
public class TeamProcessing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		readStoreTeams("results.txt");
	}
	
public static void readStoreTeams(String file) {
		
		String[] teamsSplit;
		Map<String, FootballTeam> teamsMap = new HashMap<String, FootballTeam>();
		
		
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));
			
			do {
			teamsSplit=bufferedReader.readLine().split(" ");
			teamsMap.put(teamsSplit[0], new FootballTeam(teamsSplit[0], Integer.parseInt(teamsSplit[1]), Integer.parseInt(teamsSplit[2])));
			teamsMap.put(teamsSplit[3], new FootballTeam(teamsSplit[3], Integer.parseInt(teamsSplit[2]), Integer.parseInt(teamsSplit[1])));
			
			for (String t : teamsMap.keySet()) {
				
				System.out.println(t.toString() +teamsMap.get(t));
			}
			
			
			System.out.println(Arrays.toString(teamsSplit));
			}
			while (bufferedReader.readLine()!=null);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
