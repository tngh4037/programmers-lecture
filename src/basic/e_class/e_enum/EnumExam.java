package basic.e_class.e_enum;

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;
        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        // gender2 = "boy"; // compile error
    }
}

enum Gender {
    MALE, FEMALE;
}

// [ 상수를 사용했때의 문제점 ]
// String으로 선언된 gender1 에는 MALE,FEMALE 둘 중 한가지 값을 갖기 원하는데,
// gender1의 type이 String 이기 때문에 gender1 = "소년"; 이렇게 수행 되어도 전혀 문제가 되지 않는다.
//
// 이런 문제를 발생시키지 않게 하기 위해서 "열거형"을 사용하면 된다. ( ex) enum 이름 { 값1, 값2; } )
