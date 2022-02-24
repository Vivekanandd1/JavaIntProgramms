package JavaIntProgramms;

import java.util.Arrays;

public class _13_SortedArraysToPrint {
    //Question - write a program which would take input an
    // Integer array having only zeros and ones and output will be sorted Integer like 000011111?
    public static void main(String[] args) {
        int arr[] = {0,1,0,0,1,0,1,1,0,1,0,1};
        Arrays.sort(arr);
        System.out.print(Arrays.toString(arr));

    }
}
