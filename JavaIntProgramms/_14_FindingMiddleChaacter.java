package JavaIntProgramms;

import java.util.Scanner;

public class _14_FindingMiddleChaacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        String str = sc.nextLine();
        System.out.println(str.length()%2);
        System.out.println("the middle number is "+middle(str));
    }
    public static String middle(String str)
    {//lets assume user inpur is 1234567,so length is 7//546378
        int position;
        int length;
        if (str.length() % 2 == 0)//it wil fail in this case as modulo will be 1
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else//
        {
            position = str.length() / 2;//here lenth will be 5 and quoteint will be 2
            length = 1;
        }
        return str.substring(position,position + length);//it this case postion = 2 and postion+legth will be 2 so it will pick
        //word from 2nd indices
    }
}
