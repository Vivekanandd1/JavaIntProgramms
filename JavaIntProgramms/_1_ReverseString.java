package JavaIntProgramms;

public class _1_ReverseString {
    public static void main(String[] args) {
        // 1.Type 1 with reversing and palindrome check
        String name = "nusun";
        String rev = "";
        for( int i = name.length()-1;i>=0;i--) {
            rev = rev+name.charAt(i);
        }
        System.out.println(rev);
        if(name.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palidrome");
        }

       ///_______________________________________________________///
            // 2.Type2
//            StringBuilder Reverse = new StringBuilder(name);
//            Reverse.reverse();
//            String name1 = Reverse.toString();
//            System.out.println(name1);

            ///_______________________________________________________///


        }
    }

