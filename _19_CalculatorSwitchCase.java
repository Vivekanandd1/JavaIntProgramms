package JavaIntProgramms;

import java.util.Scanner;

public class _19_CalculatorSwitchCase {
    public static void main(String[] args) {
        double result;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the symbol for operation : / for division, * for multiply,+ for sum and - for substraction");
        char operation = sc.next().charAt(0);
        System.out.println("print first number");
        int firstnum = sc.nextInt();
        System.out.println("print the second numbber");
        int secondnum = sc.nextInt();
        switch (operation){
            case '/':
                result = firstnum/secondnum;
                System.out.println(result);
                break;

            case '*':
                result = firstnum*secondnum;
                System.out.println(result);
                break;
            case '+':
                result = firstnum+secondnum;
                System.out.println(result);
                break;
            case '-':
                 result = firstnum-secondnum;
                System.out.println(result);break;
        }
    }
}
