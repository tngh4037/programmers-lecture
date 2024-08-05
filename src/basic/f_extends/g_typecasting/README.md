클래스 형변환

부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다.

자식객체가 가지고 있는 메소드나 속성을 사용하고 싶다면 형변환 해야 한다.


---


형변환

```java
public class MyCar6 {
    public void run() {
        System.out.println("MyCar6의 run메소드");
    }
}

public class MyBus6 extends MyCar6 {
    public void ppangppang() {
        System.out.println("빵빵.");
    }
}
```


부모타입으로 자식객체를 참조할 수 있다. 단, 부모타입으로 자식객체를 참조하게 되면 부모가 가지고 있는 메소드만 사용할 수 있다.
```java
public class MyBus6Exam {
    public static void main(String args[]) {
        MyCar6 myCar6 = new MyBus6();
        myCar6.run();
        myCar6.ppangppang(); // 컴파일 오류 발생
    }
}
```

ppangppang() 메소드를 호출하고 싶다면 Bus 타입의 참조변수로 참조해야 한다.
```java
public class MyBus6Exam {
    public static void main(String args[]) {
        MyCar6 myCar6 = (MyCar6) new MyBus6();
        myCar6.run();
        // myCar6.ppangppang(); // 컴파일 오류 발생

        MyBus6 myBus6 = (MyBus6) myCar6;  // 부모타입을 자식타입으로 형변환 
        myBus6.run();
        myBus6.ppangppang();
    }
}
```
- 객체들 끼리도 형변환이 가능하다. 단 상속관계에 있었을 때만 가능하다.
- 부모타입으로 자식타입의 객체를 참조할 때는 묵시적으로 형변환이 일어난다.
- 부모타입의 객체를 자식타입으로 참조하게 할때는 명시적으로 형변환 해주어 한다. 단 이렇게 형변환 할때에는 부모가 참조하는 인스턴스가 형변환 하려는 자식타입일 때만 가능하다.