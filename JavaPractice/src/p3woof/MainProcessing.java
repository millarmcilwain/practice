/**
 * 
 */
package p3woof;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author millarmcilwain
 *
 */
public class MainProcessing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		;
		compareDogWeights(storeAndShow());
	}

	public static ArrayList<String> storeAndShow() {

			ArrayList<String> dogArray = new ArrayList<String>(); 
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File ("DogData-2.csv")));
			br.readLine();
			String line = br.readLine();
			
			while(line!=null) {
				dogArray.add(line);
				line = br.readLine();
			};
			for (String s : dogArray) {
				System.out.println(s);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return dogArray;
	}
	
	public static void compareDogWeights(ArrayList<String> dogArray) {
		
		ArrayList<Dog> dogObjects = new ArrayList<Dog>(); 
		
		for (String s : dogArray) {
			String[] lineSplit=s.split(",");
			dogObjects.add(new Dog(lineSplit[0], Double.parseDouble(lineSplit[1]), Double.parseDouble(lineSplit[2]), Double.parseDouble(lineSplit[3]), lineSplit[4], lineSplit[5]));
		}
		
		Collections.sort(dogObjects, new DogOrderByWeight());
		
		for (Dog d : dogObjects) {
			System.out.println(d.getBreed());
			System.out.println(d.getWeight());
		}

	}
	
	public static void countCountryOfOrigin(ArrayList<String> dogArray) {
		ArrayList<Dog> dogObjects = new ArrayList<Dog>(); 
		SortedMap <String, Integer> dogMap = new TreeMap<String, Integer>();
		
		
		for (String s : dogArray) {
			String[] lineSplit=s.split(",");
			dogObjects.add(new Dog(lineSplit[0], Double.parseDouble(lineSplit[1]), Double.parseDouble(lineSplit[2]), Double.parseDouble(lineSplit[3]), lineSplit[4], lineSplit[5]));
			if (!dogMap.containsKey(lineSplit[5])) {
			dogMap.put(lineSplit[5], +1);
			}
			else if (dogMap.containsKey(lineSplit[5])){
				dogMap.put(lineSplit[5], dogMap.get(lineSplit[5])+1);
				
			}
		}
		
		
	}

}
