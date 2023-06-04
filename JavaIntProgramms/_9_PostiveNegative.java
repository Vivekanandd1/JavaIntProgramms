package JavaIntProgramms;

import java.util.Scanner;

public class _9_PostiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        if(num<0){
            System.out.println("this is negative number");
        }
        else{
            System.out.println("this is positive number");
        }
    }
}
