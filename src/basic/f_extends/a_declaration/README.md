상속

상속 이란 부모가 가지고 있는 것을 자식이 물려받는 것을 말한다. 즉, 부모가 가지고 있는 것을 자식이 사용할 수 있게 된다.

자바는 클래스 이름 뒤에 `extends` 키워드를 적고 부모클래스 이름을 적게 되면 부모 클래스가 가지고 있는 것을 상속받을 수 있게 된다.


---


MyCar3 를 상속받은 MyBus 를 class로 표현하는 방법

```java
public class MyCar3 {
}

public class MyBus extends MyCar3 {
}
```


부모클래스에 메소드 추가하기

- MyCar3 에 run() 메소드를 추가
```java
public class MyCar3 {
    public void run() {
        System.out.println("달리다.");
    }
}
```


- MyCar3 를 상속받은 MyBus 사용
```java
public class MyBusExam {
    public static void main(String args[]) {
        MyBus bus = new MyBus();
        bus.run();  
        // MyBus class 는 아무런 코드를 가지지 않는다. 그럼에도 run() 이라는 메소드를 사용하는데 문제가 발생되지 않는다. 
    }   
}
```


- MyBus 에 메소드 추가
```java
public class MyBus extends MyCar3 {
    public void ppangppang() {
        System.out.println("빵빵");
    }
}
```
- MyBus 는 MyCar3 에서 물려받은 run() 메소드와 ppangppang() 메소드를 사용할 수 있게 된다.
- 부모가 가지고 있는 메소드외에 추가로 메소드를 선언하는 것을 확장하였다고 표현한다.