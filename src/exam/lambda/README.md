람다식

람다식은 다른말로 익명 메소드라고도 한다.

- 인터페이스 중에서 메소드를 하나만 가지고 있는 인터페이스를 함수형 인터페이스라고 한다.
  - ex) 쓰레드를 만들때 사용하는 Runnable 인터페이스의 경우 run() 메소드를 하나만 가지고 있다.


Runnable을 이용하여 쓰레드를 만드는 방법

```java
public class LambdaExam1 {

    public static void main(String[] args) {
        new Thread(new Runnable(){public void run(){
            for(int i = 0; i < 10; i++){
                System.out.println("hello");
            }
        }}).start();
    }   
}
```

- 쓰레드가 실행되면 쓰레드 생성자 안에 넣은 run() 메소드가 실행된다.
- 자바는 메소드만 매개변수로 전달할 방법이 없다. 인스턴스만 전달할 수 있다.
- 그렇기 때문에 run() 메소드를 가지고 있는 Runnable 객체를 만들어서 전달한다.


메소드만 전달할 수 있다면, 좀더 편리하게 프로그래밍할 수 있을텐데,자바는 메소드만 전달할 수 있는 방법은 없었기 기때문에 매번 객체를 생성해서 매개변수로 전달해야 했다. 이런 부분을 해결한 것이 람다표현식이다.

- 람다식을 이용해서 수정한 코드

```java
public class LambdaExam1 {  
    public static void main(String[] args) {
        new Thread(()->{
            for(int i = 0; i < 10; i++){
                System.out.println("hello");
            }
        }).start();
    }   
}
```

- `() -> { ..... }` 부분이 람다식, 다른말로 익명 메소드
- JVM은 Thread 생성자를 보고 `()->{}` 이 무엇인지 대상을 추론한다.
- Thread 생성자 api를 보면 Runnable 인터페이스를 받아들이는 것을 알 수 있다.
- JVM은 Thread 생성자로 Runnable 인터페이스를 구현한 것이 와야 하는 것을 알게 되고 람다식을 Runnable을 구현하는 객체로 자동으로 만들어서 매개변수로 넣어준다.


---


람다식 기본문법

`(매개변수목록)->{실행문}`

- 2개의 값을 비교하여 어떤 값이 더 큰지 구하는 compareTo() 라는 메소드를 가지고 있는 Compare 인터페이스가 있다고 가정하자.

```java
public interface Compare {
    public int compareTo(int value1, int value2);
}
```

- 람다식을 사용해서 이용해보자.

```java
public class CompareExam {
  public static void main(String[] args) {
    exec((i, j)->{
      return i - j;
    });
  }

  public static void exec(Compara compara){
    int k = 10;
    int m = 20;
    int value = compara.compareTo(k, m);
    System.out.println(value);
  }
}
```

- 호출하는 쪽에서 compareTo() 메소드를 어떻게 구현했는지에 따라서 출력되는 값이 다름


자바는 메소드만 인자로 전달하려면 반드시 객체를 만들어서 전달해야 했다. Java8에 람다식이 생기면서, 마치 함수만 전달하는 것처럼 간편하게 문법을 사용할 수 있게 된다.