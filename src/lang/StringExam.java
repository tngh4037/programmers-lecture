package lang;

public class StringExam {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = str1.substring(5); // String 클래스는 불변클래스 이다. ( substring 으로 5번째 부터 문자열을 잘라서 새로운 문자열을 반환 -> 원본에 지장 X )
        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1 + str2;
        System.out.println(str3);

        String str4 = new StringBuffer().append(str1).append(str2).toString();
        System.out.println(str4);

        String str5 = "";
        for (int i = 0; i < 100; i++) { // 반복문을 돌 때 마다 객체를 만들어냄.
            str5 = str5 + "*";
        }
        System.out.println(str5);

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < 100; i++) {
            sb.append("*");
        }
        String str6 = sb.toString();
        System.out.println(str6);
    }
}

// 참고)
// 문자열과 문자열을 더하게 되면 내부적으로는 다음과 같은 코드가 실행
// String str4 = new StringBuffer().append(str1).append(str2).toString();
// System.out.println(str4);
//
// => 따라서 문자열을 반복문 안에서 더하는 것은, 그만큼의 객체가 생성될 수 있어 성능상 문제가 생길 수 있으니 반드시 피하도록 합시다.
