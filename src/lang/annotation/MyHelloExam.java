package lang.annotation;

import java.lang.reflect.Method;

public class MyHelloExam {

    public static void main(String[] args) {
        MyHello hello = new MyHello();

        try {
            Method method = hello.getClass().getDeclaredMethod("hello"); // getClass() : 인스턴스를 만들 때 사용한 클래스의 정보

            if (method.isAnnotationPresent(Count100.class)) { // 메서드에 특정 애노테이션이 적용되어 있는지 체크
                for (int i = 0; i < 100; i++) {
                    hello.hello();
                }
            } else {
                hello.hello();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
