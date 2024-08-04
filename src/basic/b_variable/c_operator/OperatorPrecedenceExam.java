package basic.b_variable.c_operator;

// 연산자 우선순위
public class OperatorPrecedenceExam {

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        int c = 15;

        System.out.println(a - b * c); // -145
        System.out.println((a - b) * c); // -75

        System.out.println(a > 5 && b > 5); // false
        System.out.println(a > 5 || b > 5); // true

        System.out.println(++a - 5); // 1
        System.out.println(a++ - 5); // 1
        System.out.println(a); // 7


    }
}
