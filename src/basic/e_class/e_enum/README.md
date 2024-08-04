열거형(enum)

자바는 열거타입을 이용하여 변수를 선언할 때 변수타입으로 사용할 수 있다.
- 열거형은 JDK5에서 추가되었다.
- JDK5 이전에는 상수를 열거형 대신 사용했다.
- 참고) 상수를 이용하는 방법

```java
public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;

        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;                  
    }
}
```

상수를 사용했때의 문제점
- String으로 선언된 gender1 에는 MALE,FEMALE 둘 중 한가지 값을 갖기 원하는데, gender1의 type이 String 이기 때문에 gender1 = "소년"; 이렇게 수행 되어도 전혀 문제가 되지 않는다.
- 실행할때 원했던 값인 MALE,FEMALE 이 아닌 다른 값이 들어오게 되므로 문제를 발생시킬 수 있다.


해결 방법
- 이런 문제를 발생시키지 않게 하기 위해서 열거형을 사용하면 된다.
- 열거형 정의 방법
```java
enum Gender{
    MALE, FEMALE;
}
```

- 열거형 사용 방법
```java
Gender gender2;

gender2 = Gender.MALE;
gender2 = Gender.FEMALE;

//Gender타입의 변수에는 MALE이나 FEMALE만 대입이 가능. 다른 값은 저장할 수가 없다.  
```


특정 값만 가져야 한다면 열거형을 사용하는 것이 좋다.