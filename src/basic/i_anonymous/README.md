익명 중첩 클래스

익명 중첩 클래스는 보통 익명 클래스라고도  말하며, 내부 클래스이기도 하다.
```java
public abstract class Action{
    public abstract void exec();
}

// 추상클래스 Action을 상속받은 클래스 MyAction
public class MyAction extends Action{
    public void exec(){
        System.out.println("exec");
    }
}

// MyAction을 사용하는 클래스 ActionExam 
public class ActionExam{
    public static void main(String args[]){
        Action action = new MyAction();
        action.exec();
    }
}

// MyAction을 사용하지 않고 Action을 상속받는 익명 클래스를 만들어서 사용하도록 수정해 보도록 하겠습니다.
public class ActionExam{
    public static void main(String args[]){
        Action action = new Action(){
            public void exec(){
                System.out.println("exec");
            }
        };
        action.exec();
    }
}
```
- `생성자 다음에 중괄호 열고 닫고({})가 나오면, 해당 생성자 이름에 해당하는 클래스를 상속받는 이름없는 객체를 만든다는 것을 뜻한다.`
- `괄호 안에는 메소드를 구현하거나 메소드를 추가할 수 있다. 이렇게 생성된 이름 없는 객체를 action이라는 참조변수가 참조하도록 하고, exec() 메소드를 호출.`
- `익명클래스를 만드는 이유는 Action을 상속받는 클래스를 굳이 만들 필요가 없을 경우이다.`
  - `Action을 상속받는 클래스가 해당 클래스에서만 사용되고 다른 클래스에서는 사용되지 않는 경우이다. (한번만 쓰고 안쓰는 등)`

