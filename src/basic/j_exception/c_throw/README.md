throw

강제로 오류를 발생시키는 throw

throw는, 오류를 떠넘기는 throws와 보통 같이 사용됩니다.

```java
public class ExceptionExam3 {   
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = divide(i, j);
        
        System.out.println(k);
    }       
    
    public static int divide(int i, int j) {
        int k = i / j;
        return k;
    }   
}
```
- divide 메소드는 2번째 파라미터의 값이 0일 경우, 나누기를 할 때 예외가 발생한다.

여기서 생각해보면, 두 번째 매개변수가 0으로 전달되는 것 자체가, 일단 잘못 전달된 것이라고도 볼 수 있다.

그래서 연산을 하기 전에, 먼저 그 부분을 체크해서 에러가 발생하지 않도록 수정해보면 다음과 같다.
```java
public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = divide(i, j);
        
        System.out.println(k);      
    }

    public static int divide(int i, int j) {
        if (j == 0) {
            System.out.println("2번째 매개변수는 0이면 안됩니다.");
            return 0;
        }
        
        int k = i / j;
        return k;
    }
}
```
- j가 0일 경우 안된다는 메시지가 출력되도록 수정하고 `0` 을 리턴한다.
- 이렇게 할 경우 main 메소드의 k변수는 0값을 가지게 되고 0을 출력하게 된다.
- `0으로 나눈 결과는 0이 아니다.` `0으로 반환하면 더 큰 문제가 발생할 수도 있다.`



에러도 발생하지 않고, 올바르지 않은 결과를 리턴하지 않도록 수정해보자.
```java
public class ExceptionExam3 {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int k = divide(i, j);
        
        System.out.println(k);
    }       
    
    public static int divide(int i, int j) throws IllegalArgumentException {
        if (j == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없어요.");
        }
        
        int k = i / j;
        return k;
    }   
}
```
- j가 0일 경우에 `new` 연산자를 통하여 `IllegalArgumentException` 객체가 만들어 진다.
- new 앞에 `throw` 는 해당 라인에서 익셉션이 발생한다는 의미이다.
- 즉 그 줄에서 오류가 발생했다는 것이다. 0으로 나눌수 없습니다. 라는 오류가 발생한 것이다.
- Exception 클래스 이름을 보면 아규먼트가 잘못되었기 때문에 발생한 오류라는 것을 알 수 있다.


divide 메소드를 호출한 쪽에서의 오류 처리
```java
public class ExceptionExam3 {   
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        
        try {
            int k = divide(i, j);
            System.out.println(k);
        } catch (IllegalArgumentException e) {
            System.out.println("0으로 나누면 안됩니다.");
        }           
    }

    public static int divide(int i, int j) throws IllegalArgumentException {
        if (j == 0) {
            throw new IllegalArgumentException("0으로 나눌 수 없어요.");
        }
        
        int k = i / j;
        return k;
    }   
}
```
- divide 메소드 뒤에 `throws IllegalArgumentException` 은 해당 오류는 divide를 호출한 쪽에서 처리를 해야한다는 것을 의미한다.