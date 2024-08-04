package basic.c_control.d_for;

public class ForExam {

    public static void main(String[] args) {

        // 1) for 문을 이용하여 1부터 100까지의 합을 구해보자.
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
        }
        System.out.println(total);


        // 2) for 문을 이용하여 1부터 100까지의 짝수의 합을 구해보자.
        total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                continue; // 아래 실행문을 수행하지 않는다.
            }

            total += i;
        }
        System.out.println(total);


        // 3) for 문을 이용하여 실행문을 반복하다가, 합이 50을 넘는 순간 반복문을 종료하도록 해보자.
        total = 0;
        for (int i = 1; i <= 100; i++) {
            if (total > 50) {
                break; // 반복문을 빠져나간다.
            }

            total += i;
        }
        System.out.println(total);
    }
}

// [ For 문 ]
// for (변수 초기화식; 조건식; 증감식) {
//     실행문;
// }
//
// 참고) 수행 순서
// 1) 초기화식은 최초 한 번만 수행합니다.
// 2) "조건식을 수행"해서 수행 결과가 false 라면 for 반복문을 빠져 나갑니다.
// 3) 수행 결과가 true 라면 "실행문을 수행"한다.
// 4) 그 다음 "증감식을 수행"한다.
// 5) 2번부터 4번까지 반복적으로 수행한다.