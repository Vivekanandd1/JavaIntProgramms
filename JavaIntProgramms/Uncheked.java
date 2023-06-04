package JavaIntProgramms;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Uncheked {
public static void main(String[] args) {
//		String Name = "Vivekanand";
	String Name = null;
		StringLength(Name);
		
		
	}
	
	private static void StringLength(String MyString) {
		try {
		System.out.println(MyString.length());
	}
		catch(NullPointerException Npe) {
			System.out.println("String is Null");
		}
		}
		
}
