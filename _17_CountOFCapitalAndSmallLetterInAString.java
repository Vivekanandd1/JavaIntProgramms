package JavaIntProgramms;

public class _17_CountOFCapitalAndSmallLetterInAString {
    public static void main(String[] args) {
        String s = "WelCome to Automation";
        int Lower = 0;
        int upper = 0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                upper++;
            }
            else{
                Lower++;
            }
            System.out.println(Lower);
            System.out.println(upper);
        }

    }
}
