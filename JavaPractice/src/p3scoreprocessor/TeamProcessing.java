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

		
		// debug file reader some more 
		//readStoreTeams("results.txt");
		Map<String, FootballTeam> testMap = countTeamStats(readStoreTeams("results.txt"));
		
		for (FootballTeam f : testMap.values()) {
			System.out.println(f.getTeamName() +" " +f.getGoalsFor() +" " +f.getGoalsAgainst());
		}
		
	}
	
	
/**
 * 
 * @param file
 * @return
 */
public static ArrayList<String[]> readStoreTeams(String file) {
		
		String[] teamsSplit;
		ArrayList<String[]> dataArray = new ArrayList<String[]>();
		String readResultLine;
		

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));

			
			readResultLine = bufferedReader.readLine();


			while (readResultLine!=null) {
				teamsSplit=readResultLine.split(" ");
				dataArray.add(teamsSplit);
			};
			
				

			
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
			
			System.out.println(t.toString() +teamsMap.get(t) +" ");
		}
		
	
	}

public static Map<String, FootballTeam> countTeamStats(ArrayList<String[]> teamData) {
	
		

		Map<String, FootballTeam> teamMap = new HashMap<String, FootballTeam>();
		
	
		for (String[] s : teamData) {
			FootballTeam team1 = new FootballTeam();
			FootballTeam team2 = new FootballTeam();
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
			if (teamMap.containsKey(team1.getTeamName())) {
				teamMap.get(team1.getTeamName()).setWins(team1.getWins());
				teamMap.get(team1.getTeamName()).setLosses(team1.getLosses());
				teamMap.get(team1.getTeamName()).setDraws(team1.getDraws());
				teamMap.get(team1.getTeamName()).setPoints(team1.getPoints());
			} else if (!teamMap.containsKey(team1.getTeamName())) {
				teamMap.put(team1.getTeamName(), team1);
			}
			
			if (teamMap.containsKey(team2.getTeamName())) {
				teamMap.get(team2.getTeamName()).setWins(team2.getWins());
				teamMap.get(team2.getTeamName()).setLosses(team2.getLosses());
				teamMap.get(team2.getTeamName()).setDraws(team2.getDraws());
				teamMap.get(team2.getTeamName()).setPoints(team2.getPoints());
			} else if (!teamMap.containsKey(team2.getTeamName())) {
				teamMap.put(team2.getTeamName(), team2);
			}

			
			
		}
	
		return teamMap;
	
}
}


