/**
 * 
 */
package patient;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author Millar McIlwain
 *
 */
public class Starter {

	private static final String NEW_FILE = "Patient.csv";

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int userInput;

		Scanner scanner = new Scanner(System.in);
		printMenuOptions();
		userInput = scanner.nextInt();
		do {
			menuSystem(userInput);
			printMenuOptions();
			userInput = scanner.nextInt();
		} while (userInput != 7);
		scanner.close();

	}

	public static void printMenuOptions() {
		System.out.println("Patient Record Operating Menu:");
		System.out.println("1. Show all patients waiting");
		System.out.println("2. Show patients with longest wait time");
		System.out.println("3. Show patients by triage");
		System.out.println("4. Create priority case list");
		System.out.println("5. Generate priority queue for patients under age 5");
		System.out.println("6. Quit the system");
		System.out.println("Select a menu option...");
	}

	public static void menuSystem(int userInput) {
		switch (userInput) {

		case 1:
			readCollection(readFile(NEW_FILE));
			break;

		case 2:
			readCollection(sortByWaitTime(readFile(NEW_FILE)));
			break;

		case 3:
			readCollection(sortByTriage(readFile(NEW_FILE)));
			break;

		case 4:
			writePriorityCases(readFile(NEW_FILE));
			break;

		case 5:
			removeFromQueue(priorityQueueUnderAgeFive(readFile(NEW_FILE)));

		default:
			System.out.println("please try that selection again");
		}

	}

	/**
	 * reads file
	 * 
	 * @param inputFile
	 */
	public static List<Patient> readFile(String inputFile) {

		List<Patient> inputData = new ArrayList<Patient>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(inputFile)));
			String lineInput = bufferedReader.readLine();
			lineInput = bufferedReader.readLine();

			while (lineInput != null) {
				String[] lineSplit = lineInput.split(",");
				String[] nameSplit = lineSplit[0].split(" ");
				inputData.add(new Patient(nameSplit[0], nameSplit[1], Integer.parseInt(lineSplit[1]), lineSplit[2],
						lineSplit[3], Boolean.parseBoolean(lineSplit[4])));
				lineInput = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {

		} catch (IOException e) {

		}

		return inputData;
	}

	/**
	 * read and print to console
	 * 
	 * @param inputDataToBeRead
	 */
	public static void readCollection(Collection<Patient> inputDataToBeRead) {

		for (Patient p : inputDataToBeRead) {
			System.out.println(p.toString());
		}
	}

	/**
	 * 
	 * @param inputDataToBeRead
	 * @return
	 */
	public static List<Patient> sortByWaitTime(List<Patient> inputDataToBeRead) {

		Collections.sort(inputDataToBeRead, new CompareWaitTime());

		return inputDataToBeRead;

	}

	/**
	 * sort via triage
	 * 
	 * @param inputDataToBeRead
	 * @return
	 */
	public static List<Patient> sortByTriage(List<Patient> inputDataToBeRead) {

		List<Patient> outputData = new ArrayList<Patient>();

		for (Patient p : inputDataToBeRead) {
			if (p.isTriage() == true) {
				outputData.add(p);
			}
		}

		return outputData;
	}

	/**
	 * 
	 * @param inputDataToBeRead
	 * @return
	 */
	public static void writePriorityCases(List<Patient> inputDataToBeRead) {

		File file = new File("PriorityCases.txt");

		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

		} catch (IOException e) {
			e.printStackTrace();
		}

		List<Patient> outputDataSevere = new ArrayList<Patient>();

		for (Patient p : inputDataToBeRead) {

			if (p.getSeverityLevel().equals("SEV")) {
				outputDataSevere.add(p);
			}

		}

		Collections.sort(outputDataSevere, new CompareWaitTime());

		List<Patient> outputDataModerate = new ArrayList<Patient>();

		for (Patient p : inputDataToBeRead) {

			if (p.getSeverityLevel().equals("MOD")) {
				outputDataModerate.add(p);
			}

		}

		Collections.sort(outputDataModerate, new CompareWaitTime());

		List<Patient> outputDataMild = new ArrayList<Patient>();

		for (Patient p : inputDataToBeRead) {

			if (p.getSeverityLevel().equals("MIL")) {
				outputDataMild.add(p);
			}
		}

		Collections.sort(outputDataMild, new CompareWaitTime());

		try {
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));

			for (Patient p : outputDataSevere) {
				bufferedWriter.write(p.toString() +"\n");
			}
			
			for (Patient p : outputDataModerate) {
				bufferedWriter.write(p.toString() +"\n");
			}
			
			for (Patient p : outputDataMild) {
				bufferedWriter.write(p.toString() +"\n");
			}

			bufferedWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	public static Queue<Patient> priorityQueueUnderAgeFive(List<Patient> inputDataToBeRead) {

		Queue<Patient> outputData = new PriorityQueue<Patient>(new CompareWaitTime());

		for (Patient p : inputDataToBeRead) {

			if (p.getAge() < 5) {
				outputData.offer(p);
			}

		}
		return outputData;
	}

	public static void removeFromQueue(Queue<Patient> inputData) {

		while (!inputData.isEmpty()) {
			System.out.println(inputData.peek());
			Patient p = inputData.peek();
			inputData.remove(p);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
