package basic.e_class.c_string;

public class StringMethodExam {

    public static void main(String[] args) {
        // String str = new String("hello");

        String str = "hello";

        // 문자열 길이 확인
        int length = str.length();
        System.out.println(length);

        // 문자열 더하기
        String concat = str.concat(" world");
        System.out.println(concat);

        // 문자열 자르기
        String str1 = str.substring(0);// 시작 인덱스부터 마지막까지
        System.out.println(str1);
        String str2 = str.substring(0, 3);// 시작 인덱스부터 3번째 인덱스까지
        System.out.println(str2);
    }
}
