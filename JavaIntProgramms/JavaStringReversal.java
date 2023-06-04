package JavaIntProgramms;
public class JavaStringReversal {
	
	public static void main(String[] args) {
		String Name = "nusun";
		String Rev = "";
		   for( int i = Name.length()-1;i>=0;i--) {
	            Rev = Rev+Name.charAt(i);
	        }
	        System.out.println(Rev);
	        if(Name.equalsIgnoreCase(Rev)){
	            System.out.println("palindrome");
	        }
	        else{
	            System.out.println("not palidrome");
        }
	}

}
