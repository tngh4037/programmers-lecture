패키지

패키지(package)란 서로 관련이 있는 클래스 또는 인터페이스들을 묶어 놓은 묶음이다. 

패키지를 사용함으로써 클래스들이 필요할 때만 사용될 수 있도록 하고, 클래스를 패키지 이름과 함께 계층적인 형태로 사용함으로써 다른 그룹에 속한 클래스와 발생할 수 있는 클래스 이름간의 충돌을 막아줌으로 클래스의 관리를 편하게 해준다.


---


패키지 정의방법
- package 이름은 보통 도메인 이름을 거꾸로 적은 후, 그 뒤에 프로젝트 이름을 붙여서 만든다. 물론, 프로젝트 이름 뒤에 또 다른 이름이 나올 수도 있다.
- package 이름은 폴더명 점 폴더명 점 폴더명 과 같은 형식으로 만들어진다. 각각의 폴더명은 숫자로 시작할 수 없다.
- 도메인 이름이 `8cruz.com` 이고 프로젝트 이름이 `javastudy` 라면 `com.eightcruz.javastudy.Hello` 로 패키지를 지정할 수 있다.
  - 도메인이 숫자로 시작되는데 패키지명은 첫글자에 숫자를 사용할 수 없으므로 적절하게 수정한다.
  - 도메인으로 사용하는 이유는 패키지가 중복되는 것을 방지하기 위함이므로, 반드시 존재하는 도메인이 아니라도 상관없다.


패키지에 생성된 클래스 사용하기
- java.lang 패키지를 제외하고는 다른 패키지에 있는 클래스를 사용하려면 `import` 라는 구문을 적어줘야 한다.
  - `import com.eightcruz.javastudy.Hello;`
  - `import`: 다른 패키지에 들어있는 클래스를 사용하기 위한 키워드
- 위의 코드는 `com.eightcruz.javastudy` 패키지 아래의 `Hello` 클래스를 사용하겠다는 것을 컴파일러와 JVM에게 알리는 것이다.
- 클래스 이름대신에 `*` 를 적어도 된다.
  - `import com.eightcruz.javastudy.*;`
  - 해당 패키지 안에 들어있는 모든 클래스를 사용하겠다는 것을 컴파일러와 JVM에게 알린다. 


import 하지 않고 사용하는 방법
- 만약 import를 하기 싫다면, 혹은 각기 다른 패키지에 존재하는 같은 이름의 클래스 파일을 사용해야 한다면 아래와 같이 이용한다.
  - `com.eightcruz.javastudy.Hello hello = newe com.eightcruz.javastudy.Hello();` 이렇게 사용한다.