package JavaIntProgramms;

public class _1_ReverseString {
    public static void main(String[] args) {
        // 1.Type 1
        String name = "ideaintellj";
        for( int i = name.length()-1;i>=0;i--) {
            System.out.print(name.charAt(i));
        }

        System.out.println("\n_____________________________");
            // 2.Type2
            StringBuilder Reverse = new StringBuilder(name);
            Reverse.reverse();
            String name1 = Reverse.toString();
            System.out.println(name1);

        }
    }

