package basic.e_class.d_scope;

public class VariableScopeExam {

    int globalScope = 10;
    static int staticVal = 10;

    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }

    public void scopeTest2(int value2) {
        System.out.println(globalScope);
        System.out.println(value2);
        // System.out.println(localScope); // compile error (caused by scope)
        // System.out.println(value); // compile error (caused by scope)

        System.out.println(staticVal);
    }

    public static void main(String[] args) {
        // System.out.println(globalScope); // compile error (caused by scope) ==> 근데 얘는 왜지 ? 비밀은 static 이라고 하는 키워드에 있다.
        // System.out.println(localScope); // compile error (caused by scope)
        // System.out.println(value); // compile error (caused by scope)
        // System.out.println(value2); // compile error (caused by scope)

        System.out.println(staticVal);

        // 각 인스턴스 변수는 별도의 메모리 공간에서 생성된다.
        VariableScopeExam v1 = new VariableScopeExam();
        VariableScopeExam v2 = new VariableScopeExam();
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope); // 10
        System.out.println(v2.globalScope); // 20

        // static한 변수는 공유된다.
        v1.staticVal = 50;
        v2.staticVal = 100;
        System.out.println(v1.staticVal); // 100
        System.out.println(v2.staticVal); // 100

        System.out.println(VariableScopeExam.staticVal); // 100
    }
}

// [ 모든 클래스는 인스턴스화 하지 않은 채로 사용할 수 없다. ]
// - 붕어빵 틀이 붕어빵은 아니다.
//
// [ static 키워드를 사용하면, 인스턴스화 하지 않아도 사용할 수 있다. ]
// - static 한 메서드는 객체를 생성하지 않아도 사용할 수 있기 때문에, static 메서드 내에서, static 하지 않은 필드는 사용할 수 없다.
// - static 하지 않은 메서드에서는 static 한 변수들을 사용할 수 있다.
//
// 그러면 static 한 메서드에서 static 하지 않은 변수들을 사용하려면 어떻게 하면 될까?
// - 객체를 생성하고 사용하면 된다.