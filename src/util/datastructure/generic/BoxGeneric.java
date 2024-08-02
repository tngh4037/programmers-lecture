package util.datastructure.generic;

public class BoxGeneric<E> { // 제네릭 타입 선언 ( 가상의 타입으로 선언 )
    private E obj;

    public E getObj() {
        return obj;
    }

    public void setObj(E obj) {
        this.obj = obj;
    }
}

// 클래스 이름 뒤에 <E>가 제네릭을 적용한 것이다. BoxGeneric 는 가상의 클래스 E를 사용한다는 의미.
// Object를 받아들이고, 리턴하던 부분이 E로 변경. E는 실제로 존재하는 클래스는 아니다.
