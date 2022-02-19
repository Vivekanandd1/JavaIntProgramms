package JavaIntProgramms;

public class _1_ReverseString {
    public static void main(String[] args) {
        String name = "ideaintellj";
        for( int i = name.length()-1;i>=0;i--){
            System.out.print(name.charAt(i));
        }
    }
}
