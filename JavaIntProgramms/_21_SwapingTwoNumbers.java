package JavaIntProgramms;

public class _21_SwapingTwoNumbers {
    public static void main(String[] args) {
        //1.this is with a third temporary variable
        /*int x = 20;
        int y = 30;
        int t = y;
         y = x;
        x = t;

        System.out.println(x+" "+y);*/
        //2.This is without the third Temporary variable
        int x =20;
        int y= 30;
         x = x+y;
         y=x-y;
         x = x-y;
        System.out.println(x+" "+y);



    }
}
