package JavaIntProgramms;

import java.nio.charset.StandardCharsets;

public class _23_DuplicateCharInString {
    public static void main(String[] args) {
        String cc = "elephanta";
        char[] ar = cc.toCharArray();
        int count=0;
        for(int i=0;i<cc.length();i++){
            for(int j=i+1;j<cc.length();j++){
                char ce =cc.charAt(j);
                if(ar[i]==ar[j]){
                    System.out.println(ar[j]+" is duplicate");
                    count++;
                    break;
                }
            }


        }
    }
}
