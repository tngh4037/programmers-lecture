package basic.e_class.g_overloading;

public class MyClass2 {

    public int plus(int x, int y) {
        return x + y;
    }

    public int plus(int x, int y, int z) {
        return x + y + z;
    }

    public String plus(String x, String y) {
        return x + y;
    }

    // public int plus(int i, int j) { // compile error: 매개변수의 변수명은 오버로딩과 연관이 없다.
    //     return i + j;
    // }

}

// 메소드 오버로딩의 기준은 ( 매개변수의 타입, 매개변수의 개수 ) 이다.
