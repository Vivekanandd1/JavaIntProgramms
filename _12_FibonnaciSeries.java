package JavaIntProgramms;

import java.util.Scanner;

public class _12_FibonnaciSeries {
    public static void main(String[] args) {//we have to print 0,1,1,2,3,5,8
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        int n1= 0,n2=1,n3;
        int i=0;
        while(i<num){
//            System.out.println("_____________");
            System.out.print(n1);
            System.out.print(",");
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            i++;

        }

    }
}
