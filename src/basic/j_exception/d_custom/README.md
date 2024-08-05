사용자 정의 Exception

사용자 정의 Exception 클래스를 만드는 이유는, 예외 클래스 자체가 어떤 특별한 일을 한다기 보다는, 이름 때문이다.
예외 클래스의 이름만 봐도, 어떤 오류가 발생했는지 직관적으로 알 수 있기 때문이다.


- (1) `Exception` 클래스를 상속 받아 정의한 `checked Exception`
  - 반드시 오류를 처리 해야만 하는 Exception
  - 예외 처리하지 않으면 컴파일 오류를 발생 시킨다.
- (2) `RuntimeException` 클래스를 상속 받아 정의한 `Unchecked Exception`
  - 예외 처리하지 않아도 컴파일 시에는 오류를 발생시키지 않는다.


---


RuntimeException 을 상속받은 BizException 객체
```java
public class BizException extends RuntimeException {
    public BizException(String msg) {
        super(msg);
    }   
    
    public BizException(Exception ex) {
        super(ex);
    }
}
```


BizService 클래스는 업무를 처리하는 메소드를 가지고 있다고 가정한다.
```java
public class BizService {
    public void bizMethod(int i) throws BizException {
        System.out.println("비지니스 로직이 시작합니다.");
        if (i < 0) {
            throw new BizException("매개변수 i는 0이상이어야 합니다.");
        }
        
        System.out.println("비지니스 로직이 종료됩니다.");
    }
}
```


앞에서 만든 BizService를 이용하는 BizExam 클래스
```java
public class BizExam {  
    public static void main(String[] args) {
        BizService biz = new BizService();
        biz.bizMethod(5);
        
        try {
            biz.bizMethod(-3);
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}
```
- 매개변수 값을 -1을 넘길때는 Exception이 발생하기 때문에 try catch 블록으로 처리한다.


---

실행결과

```text
비지니스 로직이 시작합니다.
비지니스 로직이 종료됩니다.
비지니스 로직이 시작합니다.
javaStudy.BizException: 매개변수 i는 0이상이어야 합니다.
at javaStudy.BizService.bizMethod(BizService.java:7)
at javaStudy.BizExam.main(BizExam.java:9)
```