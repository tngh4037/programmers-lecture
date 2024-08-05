Exception

프로그램 실행 중 예기치 못한 사건을 예외라고 한다.

그리고 이런 예외 상황은 미리 예측하고 처리할 수 있는데, 이렇게 하는 것을 예외 처리라고 한다.

```java
public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 5;
        int k = i / j;
        System.out.println(k);
        System.out.println("main 종료!!");
    }
}
```
- 위 코드에서 `j` 를 `0` 으로 바꾸면 Excption 이 발생한다.
  - j를 0으로 바꾸면 `ArithmeticException` 이 발생하면서 프로그램이 종료된다.
  - Java는 정수를 정수로 나눌때 0으로 나누면 안된다. ( 0으로 나누면 오류가 발생하는 것입니다. )
- 예외 처리
  - 프로그래머는 j라는 변수에 0이 들어올지도 모르는 예외 상황을 미리 예측하고 처리할 수 있다.
- 예외 처리하는 문법 ( `try-catch-finally` )
  - 오류가 발생할 예상 부분을 `try` 라는 블록으로 감싼 후, 발생할 오류와 관련된 Exception 을 `catch` 라는 블록에서 처리한다.
  - 오류가 발생했든 안했든 무조건 실행되는 `finally` 라는 블록을 가질 수 있다.
  - `finally 블록은 생략 가능` 하다.

```java
public class ExceptionExam {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        
        try {
            int k = i / j;
            System.out.println(k);
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다. : " + e.toString());
        } finally {
            System.out.println("오류가 발생하든 안하든 무조건 실행되는 블록입니다.");
        }
    }
}
```
- 실행결과
  - `0으로 나눌 수 없습니다. : java.lang.ArithmeticException: / by zero`
  - `오류가 발생하든 안하든 무조건 실행되는 블록입니다.`
- Exception 처리하지 않았을때는 프로그램이 강제 종료되었는데 catch 라는 블록으로 Exception 을 처리하니 강제종료되지 않고 잘 실행되는 것을 알 수 있다.
- try 블록에서 여러 종류의 Exception 이 발생한다면 catch 라는 블록을 여러개 둘 수 있다.
- Exception 클래스들은 모두 Exception 클래스를 상속받으므로, 예외클래스에 Exception 을 두게 되면 어떤 오류가 발생하든지 간에 하나의 catch 블록에서 모든 오류를 처리할 수 있다.
