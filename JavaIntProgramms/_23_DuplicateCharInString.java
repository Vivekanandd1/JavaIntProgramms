package JavaIntProgramms;

import java.nio.charset.StandardCharsets;

public class _23_DuplicateCharInString {
    public static void main(String[] args) {
        String cc = "beeautifuul beach";
        int count;
        char sentnc[] = cc.toCharArray();
            for(int i=0;i<sentnc.length;i++){
                count=1;
                for(int j=i+1;j<sentnc.length;j++){
                    if(sentnc[j]==sentnc[i] && sentnc[j]!=' '){
                        count++;
                        sentnc[j]='0';
                    }
                }
                if(count>1 && sentnc[i]!='0') {
                    System.out.println(sentnc[i]);
                }
            }
    }
}