package basic.c_control.c_while;

import java.util.Scanner;

public class DoWhileExam {

    public static void main(String[] args) {

        int value = 0;
        Scanner scanner = new Scanner(System.in);

        do {
            // 반복할 문장들
            value = scanner.nextInt();
            System.out.println("입력받은 값: " + value);
        } while (value != 10);

        System.out.println("반복문 종료");
    }
}

// [ do-while 문 ]
// while 문의 경우, 조건이 만족하지 않는다면 한번도 반복하지 않을 수 있다.
// 하지만, do while 문의 경우는 무조건 한번은 실행되는 반복문이다.
//
// 참고)
//   do {
//      실행문;
//   } while (조건문);