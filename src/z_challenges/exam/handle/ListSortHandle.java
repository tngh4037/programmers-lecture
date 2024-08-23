package z_challenges.exam.handle;

import java.util.ArrayList;
import java.util.Collections;

public class ListSortHandle {

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(5);
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(2);

        // Collections.sort(list1, Collections.reverseOrder());
        Collections.sort(list1, (v1, v2) -> v2 - v1);
        System.out.println(list1);  // 출력: [5, 4, 3, 2, 1]

        // ==============================================================

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(5);
        list2.add(1);
        list2.add(3);
        list2.add(4);
        list2.add(2);

        // Collections.sort(list2);
        Collections.sort(list2, (v1, v2) -> v1 - v2);
        System.out.println(list2);  // 출력: [1, 2, 3, 4, 5]
    }
}

// 리스트 정렬 참고1): https://hianna.tistory.com/569
// 리스트 정렬 참고2): https://llshl.tistory.com/74