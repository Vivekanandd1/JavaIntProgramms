package JavaIntProgramms;

import java.util.Scanner;

public class _7_QuoteintAndRemainder {
    public static void main(String[] args) {
        Scanner sc  =  new Scanner(System.in);
        System.out.println("enter the dividend");
        int dividend = sc.nextInt();
        System.out.println("enter the divisor");
        int divisor = sc.nextInt();
        if(divisor>0){
            int Q = dividend%divisor;
            int r = dividend/divisor;
            System.out.println("the Quotient is "+r);
            System.out.println("the remainder is "+Q);
        }
        else{
            System.out.println("it will throw error");
        }

    }
}
