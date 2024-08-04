String 클래스
- 문자열을 표현하는 자바에서 가장 많이 사용하는 클래스


String 클래스는, 가장 많이 사용하는 클래스인 만큼 자바에서도 특별하게 취급한다.

String 은 new 라는 키워드를 사용하지 않고도 인스턴스를 만들어낼 수 있다.


---


자바 인스턴스 생성 방법

(1) new 연산자를 이용하지 않고 인스턴스를 만드는 경우
```java
String str1 = "hello";
String str2 = "hello";
```
- "hello" 라는 문자열이 메모리 중에서 상수가 저장되는 영역에 저장된다. 상수는 변하지 않는 값을 의미.
- `String str2 = "hello";` 이 문장이 실행될 때에 hello 라는 문자열 상수는 이미 만들어져 있으므로 str1이 참조하는 인스턴스를 str2도 참조한다.


(2) new 연산자를 이용해서 인스턴스를 만드는 경우
```java
String str3 = new String("hello");
String str4 = new String("hello");
```
- new 연산자를 이용하여 인스턴스를 만들면 인스턴스는 무조건 새롭게 만들어진다.
- `String str4 = new String("hello");` 이 문장이 실행될 때도 새롭게 만들게 되므로, str3 과 str4는 서로 다른 인스턴스를 참조한다.


참고1) 참조 변수끼리 `==` 로 비교하면 서로 같은 것을 참조하는지 비교한다.

```java
if (str1 == str2) {  // 같은 인스턴스를 참조하므로 결과는 true 
    System.out.println("str1과 str2는 같은 레퍼런스입니다.");
}

if (str1 == str3) {  // str1과 str3은 서로 다른 인스턴스를 참조하므로 결과는 false 
    System.out.println("str1과 str3는 같은 레퍼런스입니다.");
}

if (str3 == str4) {  // str3과 str4는 서로 다른 인스턴스를 참조하므로 결과는 false 
    System.out.println("str3과 str4는 같은 레퍼런스입니다.");
}
```
- `==` 연산자는 문자열 변수를 비교할 때 변수의 레퍼런스를 비교합니다. 변수의 레퍼런스를 비교하고 싶은 게 아니라, 변수가 저장하는 문자열이 같은지 확인하고 싶은 경우, `equals` 메소드를 사용해야 한다. ( ex. `str1.equals(str2)` )



참고2) String 클래스
- String은 다른 클래스와 다르게 new를 사용하지 않고 사용할 수 있다. 메모리를 아끼려면 String은 new를 사용하지 않고 사용하는 것이 좋다.
- String은 불변 클래스이다. 불변이란 String이 인스턴스가 될때 가지고 있던 값을 나중에 수정할 수 없다.
- String은 문자열과 관련된 다양한 메소드를 가지고 있다. 메소드를 호출한다 하더라도 String은 내부의 값이 변하지 않는다.
- String이 가지고 있는 메소드중 String을 반환하는 메소드는 모두 새로운 String을 생성해서 반환한다.


---


String Class가 제공하는 메소드 이용하기 ( StringMethodExam )

- 문자열 길이 구하기: length()
- 문자열 붙히기: concat()
- 문자열 자르기: subString()












