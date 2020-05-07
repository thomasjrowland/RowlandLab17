package Lab17Rowland;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CountriesApp {

//     _      ____   ____  _  __ _____   _               _              _ _   _     
//	  | |    / __ \ / __ \| |/ // ____| | |             | |            (_) | | |    
//	  | |   | |  | | |  | | ' /| (___   | |__   ___  ___| |_  __      ___| |_| |__  
//	  | |   | |  | | |  | |  <  \___ \  | '_ \ / _ \/ __| __| \ \ /\ / / | __| '_ \ 
//	  | |___| |__| | |__| | . \ ____) | | |_) |  __/\__ \ |_   \ V  V /| | |_| | | |
//	  |______\____/ \____/|_|\_\_____/  |_.__/ \___||___/\__|   \_/\_/ |_|\__|_| |_|
//	                             _        __  __          __   ________ _____  _    
//	                            | |      |  \/  |   /\    \ \ / /  ____|  __ \| |   
//	    ___ ___  _ __  ___  ___ | | ___  | \  / |  /  \    \ V /| |__  | |  | | |   
//	   / __/ _ \| '_ \/ __|/ _ \| |/ _ \ | |\/| | / /\ \    > < |  __| | |  | | |   
//	  | (_| (_) | | | \__ \ (_) | |  __/ | |  | |/ ____ \  / . \| |____| |__| |_|   
//	   \___\___/|_| |_|___/\___/|_|\___| |_|  |_/_/    \_\/_/ \_\______|_____/(_)   
//	                                                                                
	                                                                                
	
	private static Scanner scnr = new Scanner(System.in);
	
	private static Path countriesPath = Paths.get("src/countries.txt");

	public static void main(String[] args) {

		
		
		int menu = 0;
		
		System.out.println("      _____  ____   _    _  _   _  _______  _____   _____  ______   _____");
		System.out.println("     / ____|/ __ \\ | |  | || \\ | ||__   __||  __ \\ |_   _||  ____| / ____|");
		System.out.println("    | |    | |  | || |  | ||  \\| |   | |   | |__) |  | |  | |__   | (___  ");
		System.out.println("    | |    | |  | || |  | || . ` |   | |   |  _  /   | |  |  __|   \\___ \\ ");
		System.out.println("    | |____| |__| || |__| || |\\  |   | |   | | \\ \\  _| |_ | |____  ____) |");
		System.out.println("     \\_____|\\____/  \\____/ |_| \\_|   |_|   |_|  \\_\\|_____||______||_____/ ");
		System.out.println("                   / _|");
		System.out.println("             ___  | |_");
		System.out.println("     _    _ / _ \\ |  _|__          __ ____   _____   _       _____");
		System.out.println("    | |  | | (_) || |  \\ \\        / // __ \\ |  __ \\ | |     |  __ \\");
		System.out.println("    | |_ | |\\___/ |_|   \\ \\  /\\  / /| |  | || |__) || |     | |  | |");
		System.out.println("    | __|| '_ \\  / _ \\   \\ \\/  \\/ / | |  | ||  _  / | |     | |  | |");
		System.out.println("    | |_ | | | ||  __/    \\  /\\  /  | |__| || | \\ \\ | |____ | |__| |");
		System.out.println("     \\__||_| |_| \\___|     \\/  \\/    \\____/ |_|  \\_\\|______||_____/");
		
		
		do {
			System.out.println();
			System.out.println(" |     |    ___  _ ____ ___  _    ____ _   _    ____ _  _ ___ ____ _ ____ ____");    
			System.out.println(" |  -/ |    |  \\ | [__  |__] |    |__|  \\_/     |___ |\\ |  |  |__/ | |___ [__");     
			System.out.println(" |  /  |    |__/ | ___] |    |___ |  |   |      |___ | \\|  |  |  \\ | |___ ___]");    
			System.out.println(" |     |");    
			System.out.println(" |  _  |    ____ ___  ___     ____ _  _    ____ _  _ ___ ____ _   _");
			System.out.println(" |  _) |    |__| |  \\ |  \\    |__| |\\ |    |___ |\\ |  |  |__/  \\_/");
			System.out.println(" | /__ |    |  | |__/ |__/    |  | | \\|    |___ | \\|  |  |  \\   |");
			System.out.println(" |     |");
			System.out.println(" | _   |    ___  ____ _    ____ ___ ____    ____ _  _    ____ _  _ ___ ____ _   _");
			System.out.println(" |  _) |    |  \\ |___ |    |___  |  |___    |__| |\\ |    |___ |\\ |  |  |__/  \\_/");
			System.out.println(" | __) |    |__/ |___ |___ |___  |  |___    |  | | \\|    |___ | \\|  |  |  \\   |");
			System.out.println(" |     |");
			System.out.println(" |     |    ____ _  _ _ ___    ____ ___  ___  _    _ ____ ____ ___ _ ____ _  _");
			System.out.println(" | (_/ |    |___  \\/  |  |     |__| |__] |__] |    | |    |__|  |  | |  | |\\ |");
			System.out.println(" |  /  |    |___ _/\\_ |  |     |  | |    |    |___ | |___ |  |  |  | |__| | \\|");
			System.out.println(" |     |");
			
			System.out.println();
			menu = Validator.getInt(scnr, "Please select an option: ", 1, 4);
			
			switch (menu) {
				
			case 1:
				System.out.println();
				//print current state of contries.txt
				List<String> countryListFromTxt = readLinesOfFile(countriesPath);
		
				System.out.printf("%-15s%15s\n", "COUNTRY", "POPULATION");
				System.out.printf("%-15s%15s\n", "=======", "==========");
				
				for (String s : countryListFromTxt) {
					String[] entry = s.split(";");
					System.out.printf("%-15s%15s\n", entry[0], entry[1]);			
				}
				break;
			
			case 2:
				System.out.println();
				//write a new country entry
				Country newCountry = getNewCountry();
				String newCountryString = newCountry.toString();
				appendLineToFile(countriesPath, newCountryString);
				break;
				
			case 3:
				System.out.println();
				System.out.printf("%-15s%15s\n", "COUNTRY", "POPULATION");
				System.out.printf("%-15s%15s\n", "=======", "==========");
				List<String> countryListFromTxt1 = readLinesOfFile(countriesPath);
				
				for (String s : countryListFromTxt1) {
					String[] entry = s.split(";");
					System.out.printf("%-15s%15s\n", entry[0], entry[1]);			
				}
				System.out.println();
				String fileString = countriesPath.toString();
				String removeThis = Validator.getString(scnr, "What would you like to remove: ");
				removeLineFromFile(fileString, removeThis);
				break;
			
			case 4:
				break;
			
			}	
		
		} while (menu != 4);
		
		System.out.println("   _____    ____     ____    _____    ____   __     __  ______   _");
		System.out.println("  / ____|  / __ \\   / __ \\  |  __ \\  |  _ \\  \\ \\   / / |  ____| | |");
		System.out.println(" | |  __  | |  | | | |  | | | |  | | | |_) |  \\ \\_/ /  | |__    | |");
		System.out.println(" | | |_ | | |  | | | |  | | | |  | | |  _ <    \\   /   |  __|   | |");
		System.out.println(" | |__| | | |__| | | |__| | | |__| | | |_) |    | |    | |____  |_|");
		System.out.println("  \\_____|  \\____/   \\____/  |_____/  |____/     |_|    |______| (_)");
				
	}
	
	public static Country getNewCountry() {
		System.out.println();
		String name = Validator.getString(scnr, "Country Name: ");
		long population = Validator.getLong(scnr, "Population: ");
		return new Country(name, population);
	}
	
	
	
	public static List<String> readLinesOfFile(Path path) {


		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to read file.");
			return new ArrayList<>();
		}

	}

	public static void appendLineToFile(Path path, String line) {


		List<String> lines = Collections.singletonList(line);

		try {
			Files.write(path, lines, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Unable to write to file.");
		}

	}
	
    public static void removeLineFromFile(String file, String lineToRemove) {
    	
    	System.out.println();
    	
    	//Note to instructor, I got this from Stack Overflow and while I'd love for you to think
    	//I'm smart enough to have built this on my own, I did not.  But I did gain a better sense
    	//of how it works as I was configuring it to work with my application.
    	
    try {

      File inFile = new File(file);

      if (!inFile.isFile()) {
        System.out.println("Hmmm... doesn't look like that's a valid file.");
        return;
      }

      //Construct the new file that will later be renamed to the original filename.
      File tempFile = new File(inFile.getAbsolutePath() + ".tmp");

      BufferedReader br = new BufferedReader(new FileReader(file));
      PrintWriter pw = new PrintWriter(new FileWriter(tempFile));

      String line = null;

      //Read from the original file and write to the new
      //unless content matches data to be removed.
      while ((line = br.readLine()) != null) {

        if (!line.trim().toLowerCase().startsWith(lineToRemove.toLowerCase())) {
        	System.out.println("Checking...");
        	pw.println(line);
        	pw.flush();
                    
        } else {
        	System.out.println(lineToRemove + " has been removed!");
        }
        
      }
      pw.close();
      br.close();

      //Delete the original file
      if (!inFile.delete()) {
        System.out.println("Could not delete file");
        return;
      }

      //Rename the new file to the filename the original file had.
      if (!tempFile.renameTo(inFile))
        System.out.println("Could not rename file");

    }
    catch (FileNotFoundException ex) {
      ex.printStackTrace();
    }
    catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
