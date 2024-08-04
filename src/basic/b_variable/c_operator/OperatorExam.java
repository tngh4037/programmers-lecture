package basic.b_variable.c_operator;

public class OperatorExam {

    public static void main(String[] args) {
        // === 단항 연산 ===
        int a = -5; // -: 부호연산자, 5: 피연산자
        int b = +a;
        int c = -a;

        System.out.println(a); // -5
        System.out.println(b); // -5
        System.out.println(c); // 5

        int d = ++c; // ++c: c = c + 1; (먼저 더한 다음에, 더한 결과값을 d에 대입)
        System.out.println(d); // 6
        System.out.println(c); // 6

        int e = c++; // c++: c = c + 1; (먼저 기존값을 e에 대입한 후에, 더함)
        System.out.println(e); // 6
        System.out.println(c); // 7


        // === 산술 연산 ===
        int i = 5;
        int j = 2;

        System.out.println(i + j);
        System.out.println(i - j);
        System.out.println(i * j);
        System.out.println(i / j); // 2  ==>  2.5(X) -> ( int / int = int ) ( 정수끼리의 연산은 정수로 리턴, 소수점 절사 )
        System.out.println(i / (double) j); // 2.5  ==>  피 연산자 둘중 하나는 최소한 실수여야지만 2.5라는 값을 얻어낼 수 있다.
        System.out.println(i % j);


        // === 비교 연산 ===
        int x = 10;
        int y = 10;

        System.out.println(x == y); // 비교 연산자의 결과는 boolean 이다.
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x <= y);
        System.out.println(x > y);
        System.out.println(x >= y);


        // === 대입 연산 ===
        int p;
        p = 2; // 단순 대입
        System.out.println(p);
        p += 5; // 복합 대입 ( p = p + 5 )
        System.out.println(p);
    }
}
