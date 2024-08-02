package lang;

import java.util.Objects;

public class ObjectExam {

    public static void main(String[] args) {
        // ================= [[ Student Start ]] =================
        Student s1 = new Student();
        s1.name = "홍길동";
        s1.number = "1234";
        s1.birthYear = 1993;

        Student s2 = new Student();
        s2.name = "홍길동";
        s2.number = "1234";
        s2.birthYear = 1993;

        // equals ( Student 에서 재정의하지 않았으므로, Object 가 구현하고 있는 메서드를 따른다. )
        if (s1.equals(s2)) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        // hashCode ( Student 에서 재정의하지 않았으므로, Object 가 구현하고 있는 메서드를 따른다. )
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());

        // toString ( Student 에서 재정의하지 않았으므로, Object 가 구현하고 있는 메서드를 따른다. )
        System.out.println("s1.toString(): " + s1.toString());
        System.out.println("s2.toString(): " + s2.toString());
        // ================= [[ Student End ]] =================

        System.out.println("==========================================================");

        // ================= [[ Student2 Start ]] ===============
        Student2 n_s1 = new Student2();
        n_s1.name = "홍길동";
        n_s1.number = "1234";
        n_s1.birthYear = 1995;

        Student2 n_s2 = new Student2();
        n_s2.name = "홍길동";
        n_s2.number = "1234";
        n_s2.birthYear = 1995;

        // equals ( Student 에서 재정의 했으므로, 재정의한 메서드를 따른다. )
        if (n_s1.equals(n_s2)) {
            System.out.println("n_s1 == n_s2");
        } else {
            System.out.println("n_s1 != n_s2");
        }

        // hashCode ( Student 에서 재정의 했으므로, 재정의한 메서드를 따른다. )
        System.out.println("n_s1.hashCode(): " + n_s1.hashCode());
        System.out.println("n_s2.hashCode(): " + n_s2.hashCode());

        // toString ( Student 에서 재정의 했으므로, 재정의한 메서드를 따른다. )
        System.out.println("n_s1.toString(): " + n_s1.toString()); // 참고) 객체를 출력하면 내부적으로 toString 메서드를 호출한다.
        System.out.println("n_s2.toString(): " + n_s2.toString());
        // ================= [[ Student2 End ]] =================
    }

    public static class Student {
        String name; // 이름
        String number; // 학번
        int birthYear; // 생년월일
    }

    public static class Student2 {
        String name; // 이름
        String number; // 학번
        int birthYear; // 생년월일

        // 비교시 학번 속성이 같으면 같다고 본다. (기준은 프로그래머가 정의)
        @Override
        public boolean equals(Object object) {
            if (this == object) return true; // 참조가 같으면 무조건 같다.
            if (object == null || getClass() != object.getClass()) return false; // 인자로 들어온 object 가 null 이거나, 클래스 정보가 다르면 false ( 서로 다른 클래스들끼리 값을 비교할 필요가 없는 것 )
            Student2 student2 = (Student2) object; // 형 변환
            return Objects.equals(number, student2.number); // number 비교
        }

        // 학번 속성을 기반으로 해시코드 생성 (기준은 프로그래머가 정의)
        @Override
        public int hashCode() {
            return Objects.hash(number);
        }

        @Override
        public String toString() {
            return "Student2{" +
                    "name='" + name + '\'' +
                    ", number='" + number + '\'' +
                    ", birthYear=" + birthYear +
                    '}';
        }
    }
}

// [참고]
// Object 클래스는 모든 클래스의 최상위 클래스 ( 아무것도 상속받지 않으면 자동으로 Object를 상속 )
// Object가 가지고 있는 메소드는 모든 클래스에서 다 사용할 수 있다는 것을 의미
//
// ex)
// equals: 객체가 가진 값을 비교할 때 사용
// toString: 객체가 가진 값을 문자열로 반환
// hashCode: 객체의 해시코드 값 반환