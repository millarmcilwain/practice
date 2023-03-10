/**
 * 
 */
package p3mailmergerv3;

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
public class LetterWriter {

	private static final String FILE_NAME = "input.csv";

	/**
	 * main method to read a csv file
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		writeToFile(readFile(FILE_NAME));

	}

	/**
	 * does something
	 * 
	 * @param file
	 * @return
	 */
	public static ArrayList<String[]> readFile(String file) {

		ArrayList<String[]> studentData = new ArrayList<String[]>();

		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(file)));
			String readerInput = bufferedReader.readLine();
			readerInput = bufferedReader.readLine();

			while (readerInput != null) {
				String[] readerSplit = readerInput.split(",");
				studentData.add(readerSplit);
				readerInput = bufferedReader.readLine();
			}

		} catch (FileNotFoundException e) {
			System.out.println("No file at the specified destination! Please check your spelling.");
		} catch (IOException e) {

			e.printStackTrace();
		}

		return studentData;
	}

	/**
	 * does something
	 * 
	 * @param studentArray
	 */
	public static void readArrayList(ArrayList<String[]> studentArray) {

		for (String[] s : studentArray) {

			System.out.println(Arrays.toString(s));
		}
	}

	public static void writeToFile(ArrayList<String[]> studentArray) {

		for (String[] s : studentArray) {

			long differenceInMinutes = differenceInMinutes(s[2], s[3]);
			if (differenceInMinutes < 100) {
				File file = new File(s[0] + ".txt");

				if (!file.exists()) {

					try {
						file.createNewFile();
					} catch (IOException e) {

						e.printStackTrace();
					}
				}

				try {
					BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

					bufferedWriter.write(composeLetter(s[0], s[1], s[2], s[3], s[4], differenceInMinutes));
					bufferedWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public static String composeLetter(String name, String studentNumber, String logonTime, String logoffTime,
			String email, long duration) {

		return "Dear " + name + "," + "\nYou didn't last too long at the lecture today! (" + duration
				+ "mins. ) You need to stay for the full duration" + "\n" + "\nName: " + name + "\nStudent Number: "
				+ studentNumber + "\nLogon Time: " + logonTime + "\nLogoff Time: " + logoffTime + "\nEmail: " + email;

	}

	public static long differenceInMinutes(String logonString, String logoffString) {
		// Parse logon and logoff times into LocalTime objects
		LocalTime logonTime = LocalTime.parse(logonString);
		LocalTime logoffTime = LocalTime.parse(logoffString);

		// calculate the difference between the times
		Duration duration = Duration.between(logonTime, logoffTime);

		// get the difference in minutes
		long diffInMinutes = duration.toMinutes();

		return diffInMinutes;
	}

}
