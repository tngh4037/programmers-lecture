package z_challenges.exam.handle;

import java.util.Arrays;
import java.util.List;

public class ArrayHandle {

    public static void main(String[] args) {
        // String[] -> String
        String[] str1 = new String[]{"a", "b", "c"};
        String str1_string = String.join("", str1);

        // String[] -> List<String>
        String[] str2 = new String[]{"a", "b", "c"};
        List<String> str2_list = Arrays.stream(str2).toList();

        // int[] -> List<Integer>
        int[] arr = new int[]{2};
        List<Integer> l1 = Arrays.stream(arr).boxed().toList();

        // int[] -> sum
        int arr_sum = Arrays.stream(arr).sum();

        // int[] -> count
        long count = Arrays.stream(arr).count();
    }
}
