package basic.c_control.c_while;

public class WhileExam {

    public static void main(String[] args) {

        // 0부터 9까지 출력하는 반복문
        int i = 0;
        while (i < 10) { // 조건문의 실행 결과가 true일 동안 반복해서 실행한다.
            System.out.println(i);
            i++;
        }


        // 1부터 100까지의 합
        int num = 1;
        int sum = 0;
        while (num <= 100) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}

// [ 반복문 ]
// - 반복문은 실행문을 반복적으로 실행해야 할 때 사용 한다.
// - 반복문의 종류는 ( while문, do-while문, for문 )이 있다.