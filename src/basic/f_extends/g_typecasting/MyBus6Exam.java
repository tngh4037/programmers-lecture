package basic.f_extends.g_typecasting;

public class MyBus6Exam {

    public static void main(String[] args) {
        MyCar6 myCar6 = (MyCar6) new MyBus6();
        myCar6.run();
        // myCar6.ppangppang(); // 컴파일 오류 발생 ( 부모타입으로 자식객체를 참조하게 되면, 부모가 가지고 있는(=부모가 알고있는) 메소드 까지만 접근해서 사용할 수 있다. )

        MyBus6 myBus6 = (MyBus6) myCar6;  // 부모타입을 자식타입으로 형변환 ( 부모타입의 객체를 자식타입으로 참조하게 할때는 명시적으로 형변환 해주어 한다. )
        myBus6.run();
        myBus6.ppangppang();
    }
}
