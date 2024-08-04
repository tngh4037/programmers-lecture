package basic.c_control.b_switch;

public class SwitchExam {

    public static void main(String[] args) {

        int value = 1;
        switch (value) {
            case 1:
                System.out.println("value의 값은 1입니다.");
                break;
            case 2:
                System.out.println("value의 값은 2입니다.");
                break;
            case 3:
                System.out.println("value의 값은 3입니다.");
                break;
            default:
                System.out.println("그 외의 숫자");
        }

        String str = "A";
        switch (str) {
            case "A":
                System.out.println("A");
                break;
            case "B":
                System.out.println("B");
                break;
            default:
                System.out.println("그 외의 문자");
        }
    }
}

// [switch]
// switch 문은 어떤 변수의 값에 따라서 문장을 실행할 수 있도록 하는 제어문이다.
// switch 문에서 사용하는 키워드는 ( switch, case, default, break ) 이다.
//
// 주의)
// break 를 제거하면 value가 1일 경우, 해당 case 문이 수행되고, 이후에 switch 문장을 빠져나가는 것이 아니라 (1,2,3, 그외의숫자)가 연속해서 실행된다.
// break 문장이 있을 경우와 없을 경우를 확실하게 구분할 수 있어야 합니다. ( break가 없다면, 조건에 부합한 case를 만난 순간부터 나머지 모두 수행 )