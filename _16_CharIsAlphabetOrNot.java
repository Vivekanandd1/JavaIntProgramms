package JavaIntProgramms;

import java.util.Scanner;

public class _16_CharIsAlphabetOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the char");
        char c = sc.next().charAt(0);
        if((c>='A' && c<='Z')||(c>='a' && c<='z')){
            System.out.println("this one is Alphabet");
        }
        else{
            System.out.println("this is not alphabet");
        }
    }

}
