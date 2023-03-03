/**
 * 
 */
package p3scoreprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
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

		
		processTeams(readStoreTeams("results.txt"));
		
	}
	
	
/**
 * 
 * @param file
 * @return
 */
public static ArrayList<String[]> readStoreTeams(String file) {
		
		String[] teamsSplit;
		ArrayList<String[]> dataArray = new ArrayList<String[]>();
		

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));

			do {
			teamsSplit=bufferedReader.readLine().split(" ");
			dataArray.add(teamsSplit);

			}
			while (bufferedReader.readLine()!=null);
				

			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return dataArray;
	}



/**
 * 
 * @param dataArray
 */
public static void processTeams(ArrayList<String[]> dataArray) {
	
	String[] teamsSplit;
	Map<String, FootballTeam> teamsMap = new HashMap<String, FootballTeam>();
	ArrayList<String[]> dataArray1 = new ArrayList<String[]>();

		

		/**
		teamsMap.put(teamsSplit[0], new FootballTeam(teamsSplit[0], Integer.parseInt(teamsSplit[1]), Integer.parseInt(teamsSplit[2])));
		teamsMap.put(teamsSplit[3], new FootballTeam(teamsSplit[3], Integer.parseInt(teamsSplit[2]), Integer.parseInt(teamsSplit[1])));
		
		*/
		for (String t : teamsMap.keySet()) {
			
			System.out.println(t.toString() +teamsMap.get(t));
		}
		
	
	}

public static void countTeamStats(ArrayList<String[]> teamData) {
	
		FootballTeam team1 = new FootballTeam();
		FootballTeam team2 = new FootballTeam();
		
	
		for (String[] s : teamData) {
			team1.setTeamName(s[0]);
			team1.setGoalsFor(Integer.parseInt(s[1]));
			team1.setGoalsAgainst(Integer.parseInt(s[2]));
			team2.setTeamName(s[3]);
			team2.setGoalsFor(Integer.parseInt(s[2]));
			team2.setGoalsAgainst(Integer.parseInt(s[1]));
			if (Integer.parseInt(s[1])>Integer.parseInt(s[2])) {
				team1.setWins(1);
				team1.setPoints(3);
				team2.setLosses(1);
				team2.setPoints(0);
			} else if (Integer.parseInt(s[1])<Integer.parseInt(s[2])) {
				team2.setWins(1);
				team1.setPoints(0);
				team1.setLosses(1);
				team2.setPoints(3);
			} else {
				team1.setPoints(1);
				team1.setDraws(1);
				team2.setPoints(1);
				team2.setDraws(1);
			}
			
			//check if hashmap already contains key with that name, if not create new, if not add the scores the previous ones 
		}
	
	
}
}


