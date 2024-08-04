package basic.c_control.a_if;

public class IfExam {

    public static void main(String[] args) {
        int x = 50;
        int y = 60;

        if (x == y) {
            System.out.println("x는 y와 같습니다.");
        }


        if (x == y)
            System.out.println("x는 y와 같습니다."); // if(조건식) 다음의 { } 를 생략할 수 있다. 하지만, 생략할 경우 if문에 포함되는 실행문은 단 한 줄만 포함된다.


        if (x == y) {
            System.out.println("x는 y와 같습니다.");
        } else if (x < y) {
            System.out.println("x는 y보다 작습니다.");
        } else {
            System.out.println("x는 y보다 큽니다.");
        }


        if (x >= 50 && x <= 60) {
            System.out.println("x는 50이상 60이하 입니다.");
        }
    }
}

// 처음 if문의 조건식의 조건문이 true일 경우 처음 if문의 블록이 실행되고, false일 경우 다음 조건식의 결과에 따라 실행 블록이 달라진다.
// else if 문의 수는 제한이 없다. 그러나 너무 많은 else if 문은 실행 속도를 느리게 한다.
// 마지막 else 블록은 생략되도 상관없다.
