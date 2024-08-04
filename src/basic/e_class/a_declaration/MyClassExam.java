package basic.e_class.a_declaration;

public class MyClassExam {

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.method1();
        myClass.method2(5);
        int value = myClass.method3();
        System.out.println("m3이 리턴한 값: " + value);
        myClass.method4(5,10);
        int result1 = myClass.method5(5);
        System.out.println("m5가 리턴한 값: " + result1);
    }
}

// 참고) 메소드 사용해보기
// - 메소드를 사용하기 위해서는 메소드가 정의된 클래스인 MyClass가 객체로 만들어져야 한다.
// - 객체를 생성할 때는 new 연산자를 이용한다.
// - 메소드 사용할 때는 레퍼런스변수.메소드명() 으로 접근하여 사용할 수 있다.
