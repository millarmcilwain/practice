package crud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class StarterApp {

	public static void main(String[] args) throws IOException {

		
		String line;
		
		File file = new File("countries.csv");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			line = bufferedReader.readLine();
			while(line!=null) {
				System.out.println(line);
				line = bufferedReader.readLine();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	
		
		
	}
	
	

}
