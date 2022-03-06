package JavaIntProgramms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class _24_ArrayToArrayList {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        //1st way Through the loop
//       List<Integer> lst = new ArrayList<>(arr.length);
//        for (int i : arr) {
//           lst.add(i);
//        }
//        System.out.println(lst);

        //2. through the loop
        List<Integer>lst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        System.out.println(lst);


    }
}
