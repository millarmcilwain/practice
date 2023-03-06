/**
 * 
 */
package p3mailmerger;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Millar McIlwain
 *
 */
public class MainProcess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	writeLetter(readFile());
		
	}
	
	public static ArrayList<String[]> readFile() {
		

		ArrayList<String[]> readFile = new ArrayList<String[]>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("input.csv")));
			
			String lineRead=br.readLine();
			lineRead=br.readLine();

			
			while (lineRead!=null) {
				String[] splitData=lineRead.split(",");
				readFile.add(splitData);
				lineRead=br.readLine();
			}
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		
		return readFile;
	}
	
	
	public static void writeLetter(ArrayList<String[]> readFile) {
		
		for (String[] s : readFile) {
			
			LocalTime logonTime = LocalTime.parse(s[2]);
			LocalTime logoffTime = LocalTime.parse(s[3]);
			Duration duration = Duration.between(logonTime, logoffTime);
			long diffInMinutes = duration.toMinutes();
			String letterTemplate = "Dear " +s[0] +"," +"\n You didn't last too long at the lecture today!" +"(" +diffInMinutes +"mins.) You need to stay for the full duration!";
			
			if (diffInMinutes<100) {
				try {
					File file = new File(s[0]+ ".txt");
					
					if (!file.exists()) {
						file.createNewFile();
					}
					BufferedWriter bw = new BufferedWriter(new FileWriter(file));
					bw.write(letterTemplate);
					bw.close();
					System.out.println("Write complete");
					

				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		
	}
		
	
	

}
}
