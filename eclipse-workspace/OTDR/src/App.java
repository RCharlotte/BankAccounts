import java.io.*;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class App {

	public String errorResult() {
		
		//Adds the current date and time to the file
				DateTimeFormatter formt = DateTimeFormatter.ofPattern("YYYY/MM/dd  HH:mm:ss");  
		       LocalDateTime now = LocalDateTime.now();  
		       String frm= formt.format(now); 
		       
		  //This portion of the code reads the file called otdrDistances.txt    
		File file = new File("otdrDistances.txt");
		try (FileReader fileReader = new FileReader(file);
				Scanner scn =new Scanner(fileReader);){
			int line= scn.nextInt();
		//Taking the estimation of the right distance to be 500, this while loop continues to print the values of date and time, along with the distance
			while(line>500) {
			
				
				System.out.printf(" %20s %15d %n",frm,line);
				line= scn.nextInt(); //reads the next integer value in the otdr file
		//if the current value is less than 500,an error is brought up, to show the exact distance from the otdr where the fault is
		// this makes the technician's work easier, since this will be sent to their email 
				if(line<500) {
					
					
					return " Error at " + line + " m away from OTDR ";
					
					
				}
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("*****file not found");
			return "Try:"
					+ "*Checking your network connection"
					+ "*Determining whether your OTDR is online"
					+ "Check with your service provider";			
		} catch (IOException e) {
			return "Problem reading the file:" + file.getName();
			
		}
		return null;
		

	}

}

