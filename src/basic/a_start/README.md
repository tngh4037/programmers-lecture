자바란?

자바의 탄생
- 1995년에 썬 마이크로시스템즈에서 발표한 객체지향 언어
- 현재 썬 마이크로시스템즈는 오라클에 인수가 된 상태

자바의 특징
- 쉬운 언어이다.
  - C와 C++언어의 문법을 기본으로 차용하여 개발된 언어
  - C와 C++이 가진 어려운 문법인 포인터와 다중 상속 제거
  - C와 C++에 비해 쉬운 언어이다.
- 플랫폼에 독립적이다.
  - 자바는 JVM 만 있으면 윈도우, 리눅스, 맥등 어떤 플랫폼에서도 실행이 가능
    - JVM - 자바로 만들어진 프로그램을 실행해주는 프로그램 
- 객체지향 언어이다.
- 메모리 관리를 자동으로 해준다. (Garbage Collector)


---


자바 개발환경 구축 (Windows 기준)

- JDK 다운로드 및 설치
- 환경변수 설정
  - JAVA_HOME 추가
    - `C:\Program Files\jdk-12.0.1` (jdk 설치 경로)
  - Path 편집
    - `%JAVA_HOME%\bin`
  - CLASSPATH 추가
    - `%JAVA_HOME%\lib;.` 
- 이클립스 설치
  - 참고) 이클립스: JDK 를 이용해서 자바를 쉽게 개발할 수 있도록 도와주는 도구


---


자바 개발 순서

- (1) 소스 작성
```java
// C드라이브 밑에 tmp 폴더를 생성하고, HelloWorld.java 생성해서 아래 코드 작성
public class HelloWorld{
    public static void main(String args[]) { // 프로그램의 시작점
        System.out.println("Hello World");
    }
}
```
- (2) 작성한 소스 컴파일
  - 윈도 콘솔을 실행 ( 윈도우 버튼 -> 실행 -> cmd를 입력한 후 엔터를 입력 )
  - cd c:\tmp 로 이동합니다.
  - `javac HelloWorld.java` 로 컴파일 합니다.
- (3) 컴파일한 소스를 JVM을 이용하여 실행
  - `java HelloWorld` 로 실행
  - 화면에 `HelloWorld` 가 출력되는 것을 확인


---


참고) 주석

- 주석이란, 프로그램의 코드와 실행에는 영향을 주지 않는 문장 (주석은 컴파일 대상에서 제외된다.)
- 주석의 종류
  - 구현 주석
    - 행 단위 주석 ( `//` 를 해주면, 해당 행이 주석 처리됨 )
    - 블럭 단위 주석 ( `/* 주석으로 사용할 내용 */` )
  - 문서화 주석
    - `/** 문서에 포함할 내용을 작성함 */`
    - 문서화 주석은 클래스, 인터페이스 그리고 멤버 당 하나씩 가질 수 있고, 선언 바로 전에 작성


문서화 주석 예)

```java
import java.io.*;

/**
* <h1>Add Two Numbers!</h1>
* The AddNum program implements an application that
* simply adds two given integer numbers and Prints
* the output on the screen.
* <p>
* <b>Note:</b> Giving proper comments in your program makes it more
* user friendly and it is assumed as a high quality code.
*
* @author  Zara Ali
* @version 1.0
* @since   2014-03-31
*/
public class AddNum {
   /**
   * This method is used to add two integers. This is
   * a the simplest form of a class method, just to
   * show the usage of various javadoc Tags.
   * @param numA This is the first paramter to addNum method
   * @param numB  This is the second parameter to addNum method
   * @return int This returns sum of numA and numB.
   */
   public int addNum(int numA, int numB) {
      return numA + numB;
   }

   /**
   * This is the main method which makes use of addNum method.
   * @param args Unused.
   * @return Nothing.
   * @exception IOException On input error.
   * @see IOException
   */
   public static void main(String args[]) throws IOException
   {

      AddNum obj = new AddNum();
      int sum = obj.addNum(10, 20);

      System.out.println("Sum of 10 and 20 is :" + sum);
   }
}
```

---

참고) 컴파일러

- 컴파일러는 작성한 코드를 실행가능한 파일로 변환하는 프로그램이다. ( 이런 작업을 컴파일한다라고 한다. )
  - `Language Code >>> Compiler >>> Machine Code`
- 프로그램에 오류가 있으면, 컴파일 과정에서 에러가 발생한다.
  - 이런 경우, 컴파일 에러가 생긴다라고 이야기한다.

