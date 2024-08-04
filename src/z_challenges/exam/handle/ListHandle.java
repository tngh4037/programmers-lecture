package z_challenges.exam.handle;

import java.util.ArrayList;
import java.util.List;

public class ListHandle {
    public static void main(String[] args) {
        // List<String> -> String[]
        List<String> list = new ArrayList<>();
        list.add("21");
        list.add("22");
        list.add("23");
        String[] array = list.toArray(String[]::new);


    }
}
