package lang;

public class MathExam {

    public static void main(String[] args) {
        int value1 = Math.max(5, 20); // 20
        System.out.println("value1 = " + value1);
        int value2 = Math.min(5, -5); // -5
        System.out.println("value2 = " + value2);
        int value3 = Math.abs(-10); // 10
        System.out.println("value3 = " + value3);
        double value4 = Math.random(); // 0 <= x < 1
        System.out.println("value4 = " + value4);
        double value5 = Math.sqrt(25); // 5.0
        System.out.println("value5 = " + value5);
    }
}

// Math 클래스는 생성자가 private으로 되어 있기 때문에 new 연산자를 이용하여 객체를 생성할 수 없다.
// 객체를 생성할 수는 없지만 모든 메소드와 속성이 static으로 정의되어 있기 때문에 객체를 생성하지 않고도 사용할 수 있다.