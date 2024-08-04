메소드 오버로딩

매개변수의 개수나 타입을 다르게 하여 같은 이름의 메소드를 여러 개 가질 수 있게하는 기술

이름은 같지만 매개변수가 다른 메소드
```java
class MyClass2{
    public int plus(int x, int y) {
        return x+y;
    }

    public int plus(int x, int y, int z) {
        return x + y + z;
    }

    public String plus(String x, String y) {
        return x + y;
    }
}
```


메소드 오버로딩은 매개변수 부분이 달라야 한다.
```java
public int plus(int i, int f) {
    return i+f;
}
```
- 위처럼 매개변수의 변수명은 다르지만, 매개변수의 타입과 개수가 동일한 메소드를 또 정의할 수는 없다.


&nbsp;

오버로딩된 메소드 이용하기

- 메소드의 인자에 어떤 값이 쓰이느냐에 따라서 각기 다른 메소드가 호출된다.
```java
public MethodOverloadExam {
    public static void main(String args[]) {
        MyClass2 m = new MyClass2();
        System.out.println(m.plus(5,10));
        System.out.println(m.plus(5,10,15));
        System.out.println(m.plus("hello" + " world"));
    }
}
```

---

생성자 오버로딩과 this()

생성자 오버로딩: 생성자의 매개변수의 타입이나 개수를 다르게 하여 같은 이름의 생성자를 여러 개 가질 수 있다.


- 생성자도 메소드와 마찬가지로 여러개를 선언할 수 있다.
- 매개변수의 수와 타입이 다르다면 여러개의 생성자를 선언할 수 있다.
```java
public class MyCar2 {
    String name;
    int number;

    public MyCar2() {
    }

    public MyCar2(String name) {
        this.name = name;
    }

    public MyCar2(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
```

오버로딩된 생성자 이용하기
```java
public class MyCarExam2 {
    public static void main(String args[]) {
        MyCar2 c1 = new MyCar2();
        MyCar2 c2 = new MyCar2("소방차");
        MyCar2 c3 = new MyCar2("구급차", 1234);
    }
}
```


&nbsp;


자기 생성자 호출하는 this()

- 기본생성자를 호출하였을 때 name을 "이름없음" , 숫자를 0으로 초기화 해보자.
```java
public MyCar2() {
    this.name = "이름없음";
    this.number = 0;
}
```
- 위처럼 작성했을 경우, `MyCar2(String name, int number)` 생성자의 내부 코드와 중복이 일어난다.
- 이때, 자신이 가지고 있는 다른 생성자를 호출해서 중복을 방지할 수 있다.
```java
public MyCar2() {
    this("이름없음", 0);
}
```
- this 괄호 열고로 시작하면 자신의 생성자를 호출하는 것이다.
- 자기 자신의 생성자를 호출함으로써 비슷한 코드가 중복되서 나오는 것을 방지할 수 있다.