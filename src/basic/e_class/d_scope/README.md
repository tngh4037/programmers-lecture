변수의 scope와 static


---


변수의 스코프

프로그램상에서 사용되는 변수들은 사용 가능한 범위를 가진다. 

그 범위를 변수의 스코프라고 한다.

1) 변수가 선언된 블럭이 그 변수의 사용범위이다.

```java
public class ValableScopeExam{

    int globalScope = 10; // 인스턴스 변수 

    public void scopeTest(int value) {   
        int localScope = 10;
        System.out.println(globalScope);
        System.out.println(localScpe);
        System.out.println(value);
    }
}
```
- 클래스의 속성으로 선언된 변수 globalScope 의 사용 범위는 클래스 전체 이다.
- 매개변수로 선언된 int value 는 블럭 바깥에 존재하기는 하지만, 메서드 선언부에 존재하므로 사용범위는 해당 메소드 블럭내이다.
- 메소드 블럭내에서 선언된 localScope 변수의 사용범위는 메소드 블럭내이다.


2) main 메소드에서 사용하기

- 같은 클래스 안에 있는데 globalScope 변수를 사용 할 수 없다.
- main은 static한 메소드이다. static한 메서드에서는 static 하지 않은 필드를 사용 할 수 없다.
```java
public class VariableScopeExam {
    int globalScope = 10; 

    public void scopeTest(int value){
        int localScope = 20;            
        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }   
    public static void main(String[] args) {
        System.out.println(globalScope);  //오류
        System.out.println(localScope);   //오류
        System.out.println(value);        //오류  
    }   
}
```

---

static

- 같은 클래스 내에 있음에도 해당 변수들을 사용할 수 없다.
- main 메소드는 static 이라는 키워드로 메소드가 정의되어 있다. 이런 메서드를 static 한 메소드 라고 한다.
- static한 필드(필드 앞에 static 키워드를 붙힘)나, static한 메소드는 Class가 인스턴스화 되지 않아도 사용할 수 있다.

```java
public class VariableScopeExam {
    int globalScope = 10; 
    static int staticVal = 7;

    public void scopeTest(int value){
        int localScope = 20;        
    }

    public static void main(String[] args) {
        System.out.println(staticVal); // 사용 가능 
    }

}
```


&nbsp;

static한 변수는 공유된다.

static하게 선언된 변수는 값을 저장할 수 있는 공간이 하나만 생성된다. 그러므로, 인스턴스가 여러개 생성되도 static한 변수는 하나다.

```java
ValableScopeExam v1 = new ValableScopeExam();
ValableScopeExam v2 = new ValableScopeExam();
v1.golbalScope = 20;
v2.golbalScope = 30; 

System.out.println(v1.golbalScope); // 20이 출력된다. 
System.out.println(v2.golbalScope); // 30이 출력된다. 

v1.staticVal = 10;
v2.staticVal = 20; 

System.out.println(v1.statVal); // 20 이 출력된다. 
System.out.println(v2.statVal); // 20 이 출력된다. 
```
- golbalScope 같은 변수(필드)는 인스턴스가 생성될때 생성되기 때문에 `인스턴스 변수` 라고 한다.
- staticVal같은 static한 필드를 `클래스 변수` 라고 한다.
- `클래스 변수는` 레퍼런스.클래스변수명 하고 사용하기 보다는, `클래스이름.클래스변수명` 으로 사용하는 것이 더 바람직하다.
  - ex) `VariableScopeExam.staticVal`
