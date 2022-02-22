package JavaIntProgramms;

import java.util.Scanner;

public class _11_FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int fact = 1;//for storing we have to initalize one value with 1
        for(int i = 1;i<=num;i++){//i<=num;this condition will fail once i become equal to user number
            fact = fact*i;
        }
        System.out.println(fact);

    }
}
