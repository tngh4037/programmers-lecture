super 와 부모생성자

class가 인스턴스화 될때 생성자가 실행되면서 객체의 초기화를 한다.

그때 자신의 생성자만 실행이 되는것이 아니고, 부모의 생성자부터 실행된다.


---


부모 생성자
```java
public class MyCar4 {
    public MyCar4() {
        System.out.println("MyCar4의 기본생성자입니다.");
    }
}

public class MyBus4 extends MyCar4 {
    public MyBus4() {
        System.out.println("MyBus4의 기본생성자입니다.");
    }
}
```


생성자 테스트
```java
public class MyBus4Exam {
    public static void main(String args[]) {
        MyBus4 b = new MyBus4();
    }
}
```
- 결과
  - `MyCar4의 기본생성자입니다.`
  - `MyBus4의 기본생성자입니다.`


&nbsp;

`new` 연산자로 MyBus4 객체를 생성하면, MyBus4 객체가 메모리에 올라갈 때, 부모인 MyCar4도 함께 메모리에 올라간다. ( 자식이 태어나기 위해서는, 반드시 그 부모가 먼저 태어나야 한다. )

생성자는 객체를 초기화 하는 일을 한다.

생성자가 호출될 때 자동으로 부모의 생성자가 호출되면서 부모 객체를 초기화 하게된다.


---

super

- 자신을 가리키는 키워드가 this 라면, 부모들 가리키는 키워드는 super
- super() 는 부모의 생성자를 의미한다.
- 부모의 생성자를 임의로 호출하지 않으면, 부모 class의 기본 생성자가 자동으로 호출된다.
- 아래 예제처럼 호출해보면 위에서 super()를 호출하지 않을때와 결과가 같다.
```java
public MyBus4() {
    super();
    System.out.println("MyBus4의 기본생성자입니다.");
}
```


&nbsp;

부모의 기본생성자가 아닌 다른 생성자를 호출하는 방법

- 클래스는 기본 생성자가 없는 경우도 존재한다.
```java
public class MyCar4 {
    public MyCar4(String name) {
        System.out.println(name + " 을 받아들이는 생성자입니다.");
    }
}
```
- MyCar4 class가 위 처럼 수정되면, MyBus4 생성자에서 컴파일 오류가 발생한다.
- 부모가 기본생성자가 없기 때문에 컴파일 오류가 발생하게 되는 것이다.
- 이런 문제를 해결하려면, 아래와 같이 자식 클래스의 생성자에서 직접 부모의 생성자를 호출해야 합니다.
```java
public MyBus4() {
    super("소방차"); // 문자열을 매개변수로 받는 부모 생성자를 호출하였다.
    System.out.println("MyBus4의 기본생성자입니다.");
}
```

&nbsp;

참고) super 키워드는 자식에서 부모의 메소드나 필드를 사용할 때도 사용합니다.