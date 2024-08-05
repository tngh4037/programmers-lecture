package basic.g_interface.b_defaultmethod;

public class MyCalExam {

    public static void main(String[] args) {
        Calculator cal = new MyCal();
        cal.plus(3, 4);
        cal.multiply(3, 4);

        int i = cal.exec(5, 5);
        System.out.println(i);

        // cal.exec2(5, 5); // compile error : 인터페이스에서 정의한 static 메서드는 반드시 "인터페이스명.메소드명()" 형식으로 호출해야 한다. ( 참조변수.메소드명() 으로 호출할 수 X )
        int j = Calculator.exec2(5, 5);
        System.out.println(j);
    }
}
