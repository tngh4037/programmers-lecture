package basic.j_exception.b_throws;

public class ExceptionExam2 {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }

    public static int divide(int i, int j) throws ArithmeticException { // 나는 처리하지 않을 것이니, 나를 호출한 쪽에서 처리하세요. -> throws
        int k = i / j; // java.lang.ArithmeticException: / by zero
        return k;
    }

}
