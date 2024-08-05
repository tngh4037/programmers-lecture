package basic.g_interface.b_defaultmethod;

public interface Calculator {
    public abstract int plus(int i, int j);
    public abstract int multiply(int i, int j);

    // 자바8 에서는 default 키워드를 이용해서 메서드의 구현부를 작성할 수 있다.
    public default int exec(int i, int j) {
        return i + j;
    }

    // 자바8 에서는 static method 를 정의할 수 있도록 변경되었다. ( 인터페이스에서 정의한 static 메서드는 반드시 "인터페이스명.메소드명()" 형식으로 호출해야 한다. ( 참조변수.메소드명() 으로 호출할 수 X ) )
    public static int exec2(int i, int j) {
        return i * j;
    }
}
