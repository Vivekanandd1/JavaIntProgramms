package JavaIntProgramms;
import java.util.Scanner;
public class _22_VowelAndConsonant {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter a word");
        String word = sc.nextLine();
        int vowel = 0;
        int cons = 0;
        for(int i = 0; i<word.length();i++){
            char ch = word.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }
            else{
                cons++;
            }
        }
        System.out.println(vowel);
        System.out.println(cons);
    }
}
