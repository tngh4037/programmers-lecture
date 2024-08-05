오버라이딩

오버라이딩이란 부모가 가지고 있는 메소드와 똑같은 모양의 메소드를 자식이 가지고 있는 것이다.

즉, 오버라이딩이란 메소드를 재정의 하는 것이다.


---


메소드 오버라이딩

MyCar5 클래스를 상속받은 MyBus5 클래스는 부모클래스가 가지고 있는 run() 메소드를 잘 사용한다.
```java
// run 메소드를 가지고 있는 MyCar5 클래스 
public class MyCar5 {
    public void run() {
        System.out.println("MyCar5의 run 메소드");
    }
}

// MyCar5 를 상속받는 MyBus5 클래스 
public class MyBus5 extends MyCar5 {
}

public class BusExam {
    public static void main(String args[]) {
        MyBus5 myBus5 = new MyBus5();
        myBus5.run(); // MyCar5 의 run 메소드가 실행된다. 
    }
}
```


MyBus5 클래스에 부모가 가지고 있는 메소드와 모양이 같은 메소드를 선언
```java
public class MyBus5 extends MyCar5 {
    public void run() {
        System.out.println("MyBus5의 run 메소드");
    }
}

public class MyBus5Exam {
    public static void main(String args[]) {
        MyBus5 myBus5 = new MyBus5();
        myBus5.run(); // MyBus5 run 메소드가 실행된다. 
    }
}
```
- MyBus5Exam 을 실행해 보도록 하겠습니다. `"MyBus5 run 메소드"` 가 출력된다.
- `메소드를 오버라이드 하면, 항상 자식클래스에서 정의된 메소드가 호출된다.`
- `오버라이딩 한다고 해서 부모의 메소드가 사라지는 것은 아니다.`
- `오버라이딩(overriding) 할때는 부모의 메서드 보다 넓은 범위의 접근제어자를 지정해야 한다.`
- super 키워드를 이용하면, 부모의 메소드를 호출할 수 있다.
```java
public class MyBus5 extends MyCar5 {
    public void run() {
        super.run();  // 부모의 run() 메소드를 호출 
        System.out.println("MyBus5의 run 메소드");
    }
}
```
