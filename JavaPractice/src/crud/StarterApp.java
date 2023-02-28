package crud;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class StarterApp {

	public static void main(String[] args) throws IOException {

		
		String line, countryName, countryRegion;
		Integer population =0;
		Integer area =0;
		Double density = 0.0;
		int pop2, area2;
		double density2;
		Map<Integer, Country> mySortedMap = new TreeMap<Integer, Country>();
		int mapKey=0;
		
		
		File file = new File("countries.csv");
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			line = bufferedReader.readLine();
			line = bufferedReader.readLine();
			while(line!=null) {
			String[] result = line.split(",");
			countryName=result[0];
			countryRegion=result[1];
			pop2 = population.parseInt(result[2]);
			area2 = area.parseInt(result[3]);
		
			mySortedMap.put(mapKey, new Country(countryName, countryRegion, pop2, area));
			line = bufferedReader.readLine();
			mapKey++;
			}
			// nearly finished, area from Country class is appearing as 0 for everything
			for (int loop =0; loop<mySortedMap.size(); loop++) {
				Country t = mySortedMap.get(loop);
				t.printAll();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	
		
		
	}
	
	

}
