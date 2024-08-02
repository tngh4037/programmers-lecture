package util.datastructure.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExam {

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();

        boolean flag1 = set1.add("kim"); // 참고) 데이터가 잘 저장되었는지 결과 반환
        boolean flag2 = set1.add("lee");
        boolean flag3 = set1.add("kim");

        System.out.println(set1.size()); // 저장된 크기를 출력한다. 3개를 저장하였지만, 이미 같은 값이 있었기 때문에 2개가 출력된다.
        System.out.println(flag1); // true
        System.out.println(flag2); // true
        System.out.println(flag3); // false

        Iterator<String> iter = set1.iterator();
        while (iter.hasNext()) { // 꺼낼 것이 있다면 true 리턴.
            String str = iter.next(); // next() 메소드는 하나를 꺼낸다. 하나를 꺼내면 자동으로 다음것을 참조한다.
            System.out.println(str);
        }
    }
}

// Set 은 중복이 없고, 순서도 없는 자료구조. 구현 클래스로는 Hashset 과 TreeSet 이 있다.