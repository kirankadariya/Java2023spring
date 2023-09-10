package bufferedreader;

import java.io.*;
public class BufferedDread {

	public static void main(String[] args) {
		
		// start try by catch 
		
		try {
			
			// create the file 
			
			FileReader reader = new FileReader("examplereader.txt");
			
			
			//start the buffered reader 
			
			BufferedReader br = new BufferedReader(reader);
			
			
			// create string to store data 
			
			String line;
			
			
			//start while loop
			
			while ((line = br. readLine())!=null) {
				
				
				System.out.println(line);
			}

			}
			
			// start catch 
			
			catch (IOException e) {
			
				e.printStackTrace();			
			
			
		}

	}

	private String readline() {
		
		return null;
		
	}
}
