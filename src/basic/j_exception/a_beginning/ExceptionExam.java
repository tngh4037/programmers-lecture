package basic.j_exception.a_beginning;

public class ExceptionExam {

    public static void main(String[] args) {
        int i = 10;
//        int j = 5;
        int j = 0;

        try {
            int k = i / j; // java.lang.ArithmeticException: / by zero
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. " + e.toString());
        } finally {
            System.out.println("오류가 발생했든 발생하지 않았든 무조건 실행!!");
        }

        System.out.println("main end!!");
    }
}

// 참고) 예외클래스명.toString() : 예외에 대한 정보를 알려주는 메소드