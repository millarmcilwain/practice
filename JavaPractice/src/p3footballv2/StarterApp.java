/**
 * 
 */
package p3footballv2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Millar McIlwain
 *
 */
public class StarterApp {

	private static final String FILE_NAME="results.txt";
	
	/**
	 * main method with extra methods to read 
	 * @param args
	 */
	public static void main(String[] args) {
		
		SortedSet<Team> teamSet = sortToSet(readFileAndStoreInMap(FILE_NAME));
		
		/**
		for (Team t : teamSet) {
			System.out.println(t.toString());
		}
		*/
		
		
		ArrayList<Team> arraySet = sortByPoints(readFileAndStoreInMap(FILE_NAME));
		
		for (Team t : arraySet) {
			System.out.println(t.toString());
		}
		

	}
	
	public static Map<String, Team> readFileAndStoreInMap(String file) {
		
		Map<String, Team> teamMap = new HashMap<String, Team>();
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));
			String lineInput = bufferedReader.readLine();
			
			while (lineInput!=null) {
				String[] lineSplit = lineInput.split(" ");
				if (!teamMap.containsKey(lineSplit[0])) {
					teamMap.put(lineSplit[0], new Team(lineSplit[0], 1, Integer.parseInt(lineSplit[1]), Integer.parseInt(lineSplit[2])));
				}
			if(!teamMap.containsKey(lineSplit[3])) {
					teamMap.put(lineSplit[3], new Team(lineSplit[3], 1, Integer.parseInt(lineSplit[2]), Integer.parseInt(lineSplit[1])));
				}

			if  (teamMap.containsKey(lineSplit[3]) && teamMap.containsKey(lineSplit[0])){
					teamMap.get(lineSplit[0]).setGamesPlayed(1);
					teamMap.get(lineSplit[0]).setGoalsFor(Integer.parseInt(lineSplit[1]));
					teamMap.get(lineSplit[0]).setGoalsAgainst(Integer.parseInt(lineSplit[2]));
					
					teamMap.get(lineSplit[3]).setGamesPlayed(1);
					teamMap.get(lineSplit[3]).setGoalsFor(Integer.parseInt(lineSplit[2]));
					teamMap.get(lineSplit[3]).setGoalsAgainst(Integer.parseInt(lineSplit[1]));
				}
				
				if (Integer.parseInt(lineSplit[1])>Integer.parseInt(lineSplit[2])){
					teamMap.get(lineSplit[0]).setWin(1);
					teamMap.get(lineSplit[0]).setTotalPoints(3);
					teamMap.get(lineSplit[3]).setLoss(1);
				} else if (Integer.parseInt(lineSplit[1])<Integer.parseInt(lineSplit[2])) {
					teamMap.get(lineSplit[3]).setWin(1);
					teamMap.get(lineSplit[3]).setTotalPoints(3);
					teamMap.get(lineSplit[0]).setLoss(1);
				} else {
					teamMap.get(lineSplit[0]).setDraw(1);
					teamMap.get(lineSplit[0]).setTotalPoints(1);
					teamMap.get(lineSplit[3]).setDraw(1);
					teamMap.get(lineSplit[3]).setTotalPoints(1);
				}
				lineInput = bufferedReader.readLine();
			}
			
			
		} catch (FileNotFoundException e) {
			System.out.println("File cannot be found!");
		} catch (IOException e) {
		}
	
		return teamMap;
	}
	
	public static SortedSet<Team> sortToSet(Map<String,Team> inputData) {
		
		SortedSet<Team> teamSet= new TreeSet<Team>(new SortTeamByName());
		
		for (String s : inputData.keySet()) {
			teamSet.add(inputData.get(s));
		}
		
		
		return teamSet;
		
	}
	
	public static ArrayList<Team> sortByPoints(Map<String,Team> inputData){
		
		ArrayList<Team> outputData = new ArrayList<Team>();
		
		for (String s : inputData.keySet()) {
			outputData.add(inputData.get(s));
		}
		
		Collections.sort(outputData, new SortByPoints());
		
		return outputData;
		
		
		
	}
}
	
