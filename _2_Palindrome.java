package JavaIntProgramms;

import java.util.Scanner;

public class _2_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//object for user input
        System.out.println("enter a number");//printing to ask user to input a number
        int num = sc.nextInt();//asking for user input
        int org_num = num;//Temporary adding user input to a local variable
        int rev =0;// process output in variable we are for adding executionputting value as '0' in local variable
        while(org_num>0) {//here it will check if num is less than '0' it will skip this step otherwise it will proceed with while steps
            //suppose user input is 121
            rev = rev*10+org_num%10;//1.rev*10 will be 0 and 121%10 will provide 1 as remainder so rev value is 1
            //2.rev*10 will be 10 and 12%10 will provide 2 as remainder so rev value is 12
            //3.rev*10 will be 120 and 1%10 will provide 1 as remainder so rev value is 121
            org_num = org_num/10;//1.org_num got the value of 121 so it will give you 12 as quotient and it will become 12
            //2.org_num got the value of 12 so it will give you 1 as quotient and it will become 1
            //3.org_num got the value of 1 so it will give you 0 as quotient and it will become 0
            //now as we got the value of org_num as 0 it wont match with condition and stop the while loop
        }
        if(num==rev) {
            System.out.println(num+ " this is palindrome number");
        }
        else {
            System.out.println(num+" this is not palindrome number");
        }
    }
}
