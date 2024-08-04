package basic.e_class.c_string;

public class StringExam {

    public static void main(String[] args) {
        // 1) new 연산자를 이용하지 않고 인스턴스를 만드는 경우
        String str1 = "hello"; // "hello" 문자열은, 메모리 중에 상수가 저장되는 영역(String constant pool)에 저장된다. ( 상수는 변하지 않는 값을 의미. ) | 참고) String Constant Pool도 엄밀히 따지면 Heap 내부에 존재한다.
        String str2 = "hello"; // "hello" 라는 문자열 상수는 이미 만들어져 있으므로 str1이 참조하는 인스턴스를 str2도 참조한다.

        // 2) new 연산자를 이용해서 인스턴스를 만드는 경우
        String str3 = new String("hello"); // new 연산자를 이용하여 인스턴스를 만들면 인스턴스는 무조건 새롭게 만들어진다. (Heap 영역에 매번 새로운 객체가 생성)
        String str4 = new String("hello");


        // 참조 변수끼리 == 로 비교하면, 값을 비교하는게 아니라, 서로 같은 것을 참조하는지 비교한다.
        if (str1 == str2) {
            System.out.println("str1과 str2는 같은 레퍼런스입니다.");
        }

        if (str1 == str3) {
            System.out.println("str1과 str3는 같은 레퍼런스입니다.");
        } else {
            System.out.println("str1과 str3는 같은 레퍼런스가 아닙니다.");
        }

        if (str3 == str4) {
            System.out.println("str3과 str4는 같은 레퍼런스입니다.");
        } else {
            System.out.println("str3과 str4는 같은 레퍼런스가 아닙니다.");
        }


        // String은 불변 클래스이다.
        System.out.println(str1);
        System.out.println(str1.substring(3));
        System.out.println(str1);
    }
}
