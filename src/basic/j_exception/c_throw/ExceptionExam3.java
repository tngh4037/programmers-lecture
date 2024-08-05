package basic.j_exception.c_throw;

public class ExceptionExam3 {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;

        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (IllegalArgumentException e) {
            System.out.println(e.toString());
        }
    }

    public static int divide(int i, int j) throws IllegalArgumentException {
        if (j == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없습니다.");
        }

        int k = i / j;
        return k;
    }

}

// 참고) 자바는 이미 만들어놓은 다양한 예외클래스들을 제공한다.