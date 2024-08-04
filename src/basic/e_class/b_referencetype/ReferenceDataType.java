package basic.e_class.b_referencetype;

public class ReferenceDataType {

    public static void main(String[] args) {
        int i = 4; // i라는 4바이트 크기의 정수 타입 변수에 숫자 4를 저장한다.

        String str = new String("hello"); // str은 메모리에 생성된 String 인스턴스를 참조한다. (참조형)
    }
}

// 자바는 변수를 선언하려면 반드시 변수의 타입을 정해줘야 한다.
// 자바의 변수 타입은 기본형 타입과 참조형 타입이 있다.
//
// 기본형 타입에는 앞서 배운 ( 논리형(boolean), 문자형(char), 정수형(byte, short, int, long), 실수형(float, double) ) 가 있다.
// 참고로 기본형 타입은 클래스가 아니다.
//
// 그러면 자바에서 참조형 타입이란 무엇일까?
// 자바에서 참조형 타입은, 기본형 타입을 제외한 모든 타입이다. (앞서 배웠던 배열도 참조형이고, 클래스도 참조형이다.)
