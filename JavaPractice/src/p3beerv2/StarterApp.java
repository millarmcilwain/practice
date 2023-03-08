/**
 * 
 */
package p3beerv2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author Millar McIlwain
 *
 */
public class StarterApp {

	private static final String SET_FILE = "beer_data.csv";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int userChoice;
		System.out.println("Please enter a selection");

		do {
			printMenuToConsole();
			userChoice = new Scanner(System.in).nextInt();
			menuSystem(userChoice);
		} while (userChoice != 4);
		System.out.println("Thank you for using the system");
	}

	
	public static void printMenuToConsole() {
		System.out.println("1. read and print");
		System.out.println("2. order by name");
	}
	
	
	public static void menuSystem(int input) {

		
		switch (input) {
		case 1:
			printArrayListToString(readSplitFileAndStoreInArrayList());
		break;
		
		case 2: printArrayListToString(orderByName(readSplitFileAndStoreInArrayList()));
		break;
		
		case 3: printArrayListToString(returnOverSixPercent(readSplitFileAndStoreInArrayList()));
	
		}

	}

	public static void printArrayListToString(ArrayList<Beer> arrayListToPrint) {

		for (Beer beer : arrayListToPrint) {
			System.out.println(beer.toString());
		}
	}

	public static ArrayList<Beer> readSplitFileAndStoreInArrayList() {

		ArrayList<Beer> fileStorage = new ArrayList<Beer>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(SET_FILE)));

			String readerInput = bufferedReader.readLine();
			readerInput = bufferedReader.readLine();

			while (readerInput != null) {
				String[] readerInputSplit = readerInput.split(",");
				fileStorage.add(new Beer(readerInputSplit[0], readerInputSplit[1], readerInputSplit[2],
						Double.parseDouble(readerInputSplit[3])));
				readerInput = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

		return fileStorage;

	}

	public static ArrayList<Beer> orderByName(ArrayList<Beer> inputData) {
			
		Collections.sort(inputData, new OrderBeerByName());
		
		return inputData;
		
	}
	
	public static ArrayList<Beer> returnOverSixPercent(ArrayList<Beer> inputData){
		
		ArrayList<Beer> filteredBeer = new ArrayList<Beer>();
		
		for (Beer beer : inputData) {
			
			if (beer.getAlcoholPercentage()>=6) {
				filteredBeer.add(beer);
			}
		}
		
		return filteredBeer;
		
		
	}

}
