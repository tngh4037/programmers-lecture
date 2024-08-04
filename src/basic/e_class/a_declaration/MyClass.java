package basic.e_class.a_declaration;

// 다양한 형태의 메소드
public class MyClass {

    // 매개변수도 없고, 리턴하는 것도 없는 형태의 메소드
    public void method1() {
        System.out.println("m1이 실행됨...");
    }

    // 정수를 받아들인 후, 리턴하지 않는 메소드
    public void method2(int x) {
        System.out.println(x + "를 이용한 m2 실행");
    }

    // 아무것도 받아들이지 않고, 정수를 반환하는 메소드
    public int method3() {
        System.out.println("m3 실행");
        return 10;
    }

    // 정수를 2개 매개변수로 받고, 아무것도 반환하지 않는 메소드
    public void method4(int x, int y) {
        System.out.println(x + ", " + y + "를 이용한 m4 실행");
    }

    // 정수를 한개 받아들인 후, 정수를 반환하는 메소드
    public int method5(int y) {
        System.out.println(y + "를 이용한 m5 실행");
        return y * 2;
    }
}
