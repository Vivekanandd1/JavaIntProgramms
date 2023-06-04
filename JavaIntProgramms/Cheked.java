package JavaIntProgramms;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Cheked {
	public static void main(String[] args) {
		
		readFile("myfile.txt");
		
	}
	
	private static void readFile(String filename) {
		try {
		FileReader reader  = new FileReader(filename);
		}
		catch(FileNotFoundException fnfe) {
			System.out.println("this file is not available");
			
		}
	}

}
