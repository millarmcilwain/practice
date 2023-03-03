/**
 * 
 */
package p3scoreprocessor;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

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
		
		
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));
			
			do {
			teamsSplit=bufferedReader.readLine().split(" ");

			System.out.println(Arrays.toString(teamsSplit));
			}
			while (bufferedReader.readLine()!=null);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
