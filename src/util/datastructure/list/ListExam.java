package util.datastructure.list;

import java.util.ArrayList;
import java.util.List;

public class ListExam {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // list에 3개의 문자열을 저장
        list.add("kim");
        list.add("lee");
        list.add("kim");
        System.out.println(list.size()); // list에 저장된 자료의 수를 출력 (중복을 허용하므로 3 출력)

        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            System.out.println(str);
        }
    }
}

// List 는 데이터의 중복이 있을 수 있고, 순서도 있다.
//
// 참고) 리스트는 배열과 비슷하게 사용되는 자료구조이다. 다른 점은, 배열은 한번 생성하면 크기가 변경되지 않는 자료구조였다면, 리스트는 저장공간이 필요에 따라서 자동으로 늘어날 수 있는 자료구조이다.
