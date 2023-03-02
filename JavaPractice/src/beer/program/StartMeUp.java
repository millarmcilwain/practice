/**
 * 
 */
package beer.program;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @author millarmcilwain
 *
 */
public class StartMeUp {

	// path to the beer CSV file
	private static final String BEER_CSV_FILE = "beer_data.csv";

	// list of Beer objects
	private static List<Beer> beers;

	
	public static void main(String[] args) {
		beers = new ArrayList<>();
		readBeerDataFromCsv();
		displayMenu();
	}
	
	
	private static void readBeerDataFromCsv() {
            try {
                File file = new File(BEER_CSV_FILE);
                FileReader fr = new FileReader(file);
                BufferedReader reader = new BufferedReader(fr);
                String line;
                
                reader.readLine(); //skip the header
                line = reader.readLine();
                
                while (line != null) {
                    String[] fields = line.split(",");
                    String name = fields[0];
                    String country = fields[1];
                    String style = fields[2];
                    double alcoholPercentage = Double.parseDouble(fields[3]);
                    Beer beer = new Beer(name, style, country, alcoholPercentage);
                    beers.add(beer);
                    line = reader.readLine();
                }
                
                fr.close();

                
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
	
	
	public static void displayMenu() {
        Scanner scanner = new Scanner(System.in);
        String input; 
        do { 
            System.out.println("1. Show all beers");
            System.out.println("2. Order by name");
            System.out.println("3. Output to file all beers over 6% alcohol percentage");
            System.out.println("4. Quit");
            System.out.print("Select an option: ");
            input = scanner.nextLine();
            switch (input) {
            case "1":
                showAllBeers();
                break;
            case "2":
                orderByBeerName();
                break;
            case "3":
                outputStrongBeersToFile();
                break;
            case "4":
                System.out.println("Bye");
                break;
            default:
                System.out.println("Invalid option. Please select again.");
            }
        } while (!input.equals("4"));
        scanner.close();
    }
	
	
	/**     * Shows a list of all the beers in the beers list.     */    
	private static void showAllBeers() {
        for (Beer beer : beers) {
            System.out.println(beer);
        }
    }
	
	/**
     * Orders the beers list by beer name and displays the sorted list.
     */
    private static void orderByBeerName() {
        Collections.sort(beers, new CompareByBeerName());
        showAllBeers();
    }
    
 
    private static void outputStrongBeersToFile() {
    	
        try {
               
        	StringBuilder builder = new StringBuilder();
            builder.append("List of string beers");
            builder.append("____________________");
            builder.append("\n\n");
            
            File file = new File("strong_beers.txt");
            FileWriter fw;
            fw = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fw);
            
            for (Beer beer : beers) {
                if (beer.getPercent() > 6) {
                    builder.append("Name       : ");
                    builder.append(beer.getBeerName());
                    builder.append("\n");
                    builder.append("Percentage : ");
                    builder.append(beer.getPercent());
                    builder.append("\n");
                }
            }
            writer.write(builder.toString());
            System.out.println("Strong beers written");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    
    
	
	
	

}
}
