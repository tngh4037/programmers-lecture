생성자

모든 클래스는 인스턴스화 될때 생성자를 사용한다.


생성자의 특징
- 생성자는 리턴타입이 없다.
- 생성자를 프로그래머가 만들지 않으면 매개변수가 없는 생성자가 컴파일할 때 자동으로 만들어진다. (by compiler)
- 매개변수가 없는 생성자를 `기본생성자` 라고 한다.
- 생성자를 하나라도 프로그래머가 만들었다면 기본생성자는 자동으로 만들어지지 않는다.


생성자의 역할
- 생성자가 하는 일은 객체가 될 때 필드를 초기화 하는 역할을 수행한다.
- 자동차가 객체가 될때 반드시 이름을 가지도록 하려면, MyCar 클래스를 다음과 같이 만들어야 한다.
```java
public class MyCar{
    String name;
    int number;

    public MyCar(String n){ // 이름을 받아들일 수 있는 매개변수를 하나 받아서, 받은 매개변수를 속성에 넣어준다.
        name = n;
    }
}
```


위의 MyCar 클래스를 이용하여 MyCar 인스턴스를 생성하는 방법
```java
public class MyCarExam{
    public static void main(String args[]){

        MyCar c1 = new MyCar("소방차");
        MyCar c2 = new MyCar("구급차");
        //MyCar c3 = new MyCar(); // 컴파일 오류가 발생합니다.

        System.out.println(c1.name);
        System.out.println(c2.name);
    }
}
```


프로그래머가 생성자를 만들었기 때문에, 이제 MyCar 클래스는 기본 생성자를 가지지 않는다. 그래서 기본생성자로 MyCar 객체를 생성할 수 없다. ( 이때는 기본생성자가 필요하다면 개발자가 직접 생성해야 한다. )


---

this

this 는 현재 객체, 자기 자신을 나타낸다. ( 객체 자신을 참조하는 키워드 )

this 의 사용

```java
public class MyCar {
    String name;
    int number;

    public MyCar(String n){
        name = n;
    }
}
```
- MyCar 클래스의 생성자 매개변수의 이름이 n 이다. n 이라는 변수명은 무엇을 의미하는지 쉽게 알 수 없다.
- 따라서 n 으로 쓰기 보다는 name 으로 사용하는 것이 좋다.
```java
public MyCar(String name) {
    name = name;
}
```
- 'name=name' 이라고 코드를 바꾸면, `가깝게 선언된 변수를 우선 사용`하기 때문에 'name=name'이라는 코드는 `매개변수의 name의 값을 매개변수 name에 대입하라`는 의미가 된다.
- `즉, 필드는 바뀌지 않는다.` 이런 경우 필드라는 것을 컴파일러와 JVM에게 알려주기 위해서 `this 키워드`를 사용해야 한다.
```java
public MyCar(String name) {
    this.name = name;
}
```
- 앞의 `this.name` 은 `필드 name` 을 말하고 =(이퀄) 뒤의 `name` 은 `매개변수` 를 의미한다.
- 즉 매개변수의 값을 필드에 대입하라는 의미가 된다.


&nbsp;

참고로 클래스 안에서 자기 자신이 가지고 있는 메소드를 사용할 때도 `this.메소드명()` 으로 호출할 수 있다. ( 나의 생성자를 호출할 떄 에도 this 키워드를 사용할 수 있다. )