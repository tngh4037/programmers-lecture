Throws

throws 는 예외가 발생했을때, 예외를 호출한 쪽에서 처리하도록 던져준다.

```java
public class ExceptionExam2 {   
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = divide(i, j);
        System.out.println(k);
    }

    public static int divide(int i, int j){
        int k = i / j;
        return k;
    }
}
```
- 매개변수로 정수를 2개를 받아들인 후 나눗셈을 한 후 그 결과를 반환하는 divide 메소드가 있다.
- main 메소드에서는 divde메소드를 호출한다.


다음과 같이 divide 메소드를 수정해보자.
```java
public class ExceptionExam2 {
    
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = divide(i, j);
        System.out.println(k);
    }

    public static int divide(int i, int j) throws ArithmeticException {
        int k = i / j;
        return k;
    }
}
```


메소드 선언 뒤에 `throws ArithmeticException` 이 적혀있는 것을 확인할 수 있다. 

이 말인 즉슨, divide 메소드는 `ArithmeticException` 이 발생하니, divide 메소드를 호출하는 쪽에서 오류를 처리하라는 뜻입니다.


```java
package javaStudy;

public class ExceptionExam2 {

    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch(ArithmeticException e) {
            System.out.println("0으로 나눌수 없습니다.");
        }
    }

    public static int divide(int i, int j) throws ArithmeticException {
        int k = i / j;
        return k;
    }
}
```