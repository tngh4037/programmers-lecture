package basic.b_variable.b_primitive;

public class PrimitiveDataTypeCastingExam {

    public static void main(String[] args) {
        int x = 50000;
        long bigX = x; // 묵시적 형변환 ( 크기가 작은 타입을 크기가 더 큰 타입으로 바꿀 때는 컴파일러에 별도의 명령을 하지 않아도 된다. )

        long bigY = 50000;
        // int y = bigY; // compile error -> 프로그래머가 명시적으로 형변환 해줘야 함. ( 값의 소실이 발생할 수 있기 때문 )
        int y = (int) bigY;
    }
}

// 작은 그릇 -> 큰 그릇 : 자동 형변환 (암묵적 형변환, 묵시적 형변환)
// 큰 그릇 -> 작은 그릇 : 자동 형변환 X (명시적 형변환, 강제 형변환)
