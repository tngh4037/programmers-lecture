인터페이스(interface)

서로 관계가 없는 물체들이 상호 작용을 하기 위해서 사용하는 장치나 시스템


---


인터페이스 정의하는 방법

```java
public interface TV {
    public int MAX_VOLUME = 100;
    public int MIN_VOLUME = 0;

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}
```
- 인터페이스 내부에는 추상 메소드와 상수를 정의할 수 있다.


인터페이스에서 변수를 선언하면 컴파일시 자동으로 아래와 같이 바뀐다.
```java
public static final int MAX_VOLUME = 100;
public static final int MIN_VOLUME = 0;
```
- 인터페이스 내부 변수는 반드시 `public static final` 이어야 한다. (생략 가능)


인터페이스에서 정의된 메소드는 모두 추상 메소드이다. 위에서 선언된 모든 메소드는 컴파일 시에 다음과 같이 자동으로 변경된다.
```java
public abstract void on();
public abstract void off();
public abstract void volume(int value);
public abstract void channel(int number);
```
- 메서드는 `public abstract` 이어야 한다. (생략 가능)


&nbsp;

참고) 인터페이스 / 추상클래스 ( 인터페이스는 추상 클래스의 일종이다. )
- `https://blog.naver.com/29java/70189390355`


---

인터페이스 사용하기

인터페이스는 사용할때 해당 인터페이스를 구현하는 클래스에서 `implements` 키워드를 이용한다.
```java
// 참고) 인터페이스가 가지고 있는 메소드를 하나라도 구현하지 않는다면 해당 클래스는 추상클래스가 된다. ( 추상클래스는 인스턴스를 만들 수 없음 )
public class LedTV implements TV {
    public void on(){
        System.out.println("켜다");
    }
    public void off(){
        System.out.println("끄다");   
    }
    public void volume(int value){
        System.out.println(value + "로 볼륨조정하다.");  
    }
    public void channel(int number){
        System.out.println(number + "로 채널조정하다.");         
    }
}

public class LedTVExam{
    public static void main(String args[]) {
        TV tv = new LedTV();
        tv.on();
        tv.volume(50);
        tv.channel(6);
        tv.off();
    }
}
```
- `TV tv = new LedTV();`: 참조변수의 타입으로 인터페이스를 사용할 수 있다. 이 경우 인터페이스가 가지고 있는 메소드만 사용할 수 있다.
  - `인터페이스도 타입이 될 수 있다.`
- 만약 TV인터페이스를 구현하는 LcdTV를 만들었다면 위의 코드에서 new LedTV부분만 new LcdTV로 변경해도 똑같이 프로그램이 동작할 것다. `동일한 인터페이스를 구현한다는 것은 클래스 사용법이 같다는 것을 의미한다.`
- 클래스는 이러한 인터페이스를 여러개 구현할 수 있다.
