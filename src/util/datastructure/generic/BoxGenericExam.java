package util.datastructure.generic;

public class BoxGenericExam {

    public static void main(String[] args) {
        BoxGeneric<Object> box = new BoxGeneric<>(); // Object를 사용하는 BoxGeneric 인스턴스를 만들겠다는 의미
        box.setObj("string add");
        Object obj = box.getObj();

        BoxGeneric<String> box1 = new BoxGeneric<>(); // String을 사용하는 BoxGeneric 인스턴스를 만들겠다는 의미
        // box1.setObj(3); // 컴파일 오류
        box1.setObj("string add");
        String str = box1.getObj(); // 형변환 불필요
        System.out.println(str);

        BoxGeneric<Integer> box2 = new BoxGeneric<>(); // Integer를 사용하는 BoxGeneric 인스턴스를 만든다는 의미
        // box2.setObj("1234"); // 컴파일 오류
        box2.setObj(1234);
        int value = box2.getObj(); // 형변환 불필요
        System.out.println(value);
    }
}

// 참고)
// - Java5에는 Generic이라는 문법이 사용됨으로써 인스턴스를 만들때 사용하는 타입을 지정하는 문법이 추가.
// - Generic을 사용함으로써 선언할때는 가상의 타입으로 선언하고, 사용시에는 구체적인 타입을 설정함으로써 다양한 타입의 클래스를 이용하는 클래스를 만들 수 있다.
// - Generic을 사용하는 대표적인 클래스는 컬렉션 프레임워크와 관련된 클래스이다.
