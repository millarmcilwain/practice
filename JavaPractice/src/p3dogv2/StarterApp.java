/**
 * 
 */
package p3dogv2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author Millar McIlwain
 *
 */
public class StarterApp {

	public static final String FILE_NAME = "DogData-2.csv";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("input");
		Scanner sc = new Scanner(System.in);
		int userInput = sc.nextInt();

		do {
			userMenu(userInput);
			userInput = sc.nextInt();
		} while (userInput != 5);
		sc.close();
	}

	public static void userMenu(int userInput) {

		switch (userInput) {

		case 1:
			printArrayListObjects(readFile(FILE_NAME));
			break;

		case 2:
			printArrayListObjects(compareDogHeight(readFile(FILE_NAME)));
			break;

		case 3:
			printArrayListObjects(compareDogWeight(readFile(FILE_NAME)));
			break;
			
		case 4: 
			
			Map<String, Integer> test = listByCountry(readFile(FILE_NAME));
			
			for (String key : test.keySet()) {
				System.out.println(key +" " +test.get(key));
			}
			

		}

	}

	public static ArrayList<Dog> readFile(String fileName) {
		ArrayList<Dog> dogArray = new ArrayList<Dog>();
		try {

			String lineInput;

			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(fileName)));

			lineInput = bufferedReader.readLine();
			lineInput = bufferedReader.readLine();

			while (lineInput != null) {
				String[] inputArray = lineInput.split(",");
				dogArray.add(
						new Dog(inputArray[0], Double.parseDouble(inputArray[1]), Double.parseDouble(inputArray[2]),
								Double.parseDouble(inputArray[3]), inputArray[4], inputArray[5].trim()));
				lineInput = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return dogArray;
	}

	public static void printArrayListObjects(ArrayList<Dog> inputData) {

		for (Dog d : inputData) {
			System.out.println(d);

		}
	}

	public static ArrayList<Dog> compareDogWeight(ArrayList<Dog> inputData) {

		Collections.sort(inputData, new CompareDogWeight());

		return inputData;
	}

	public static ArrayList<Dog> compareDogHeight(ArrayList<Dog> inputData) {
		Collections.sort(inputData, new CompareDogHeightSmallestFirst());

		return inputData;
	}
	
	public static Map<String, Integer> listByCountry(ArrayList<Dog> inputData) {
			
		Map<String, Integer> groupByCountry = new TreeMap<String, Integer>();
		

		for (Dog d : inputData) {

			
		 if (!groupByCountry.containsKey(d.getCountryOfOrigin())) {
			 groupByCountry.put(d.getCountryOfOrigin(), +1);
		 } else {
			 groupByCountry.put(d.getCountryOfOrigin(), groupByCountry.get(d.getCountryOfOrigin())+1);
		 }
		 

	}
		return groupByCountry;

}
}
