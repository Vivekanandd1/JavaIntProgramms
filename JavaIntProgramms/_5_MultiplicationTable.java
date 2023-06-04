package JavaIntProgramms;

import java.util.Scanner;

public class _5_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for table");
        int num = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println("here is table");
            System.out.printf("%d x %d = %d \n",num,i,num*i);
        }
    }
}
