package basic.e_class.g_overloading;

public class MethodOverloadExam {

    public static void main(String[] args) {
        MyClass2 m = new MyClass2();
        System.out.println(m.plus(4, 5)); // 9
        System.out.println(m.plus(4, 6, 7)); // 17
        System.out.println(m.plus("hello", "world")); // helloworld
    }
}
