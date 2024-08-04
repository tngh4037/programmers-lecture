package basic.b_variable.b_constant;

public class ConstantExam {

    public static void main(String[] args) {
        final int J;
        J = 10;
        // J = 50; // compile error

        // ============================================

        final double PI = 3.14; // 1) 값이 변하면 위험한 경우에 상수를 사용
        double circleArea = 3 * 3 * PI;

        final int OIL_PRICE = 1450; // 2) 값만 봤을때 무엇을 의미하는지 쉽게 파악할 수 없는 값에도 값 자체를 사용하기 보다는 상수를 사용
        int totalPrice = 50 * OIL_PRICE;
    }
}

