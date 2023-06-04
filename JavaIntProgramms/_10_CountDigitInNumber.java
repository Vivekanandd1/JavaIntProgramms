package JavaIntProgramms;

import java.util.Scanner;

public class _10_CountDigitInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int num = sc.nextInt();
        String num1 = Integer.toString(num);
        System.out.println(num1.length());
    }
}
