package JavaIntProgramms;

import java.util.ArrayList;
import java.util.Arrays;

public class _25_ArrayListToArray {
    public static void main(String[] args) {
        ArrayList<Integer> lst = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,600));
        Object[] Arr = lst.toArray();
        for(Object obj : Arr) {
            System.out.println(obj);
        }
    }
}
