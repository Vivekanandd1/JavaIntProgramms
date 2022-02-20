package JavaIntProgramms;

import java.util.Scanner;

public class _6_ReverseNumber {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        String num1 = Integer.toString(num);//changing integer to String
        for(int i =num1.length()-1;i>=0;i--){
            System.out.print(num1.charAt(i));
        }

    }
}
