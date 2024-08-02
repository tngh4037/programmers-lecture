package lang;

public class StringBufferExam {

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("hello");
        sb.append(" ");
        sb.append("world");
        String str = sb.toString(); // StringBuffer에 추가된 값을 toString() 메소드를 이용하여 반환
        System.out.println("str = " + str);

        StringBuffer sb2 = new StringBuffer();
        StringBuffer sb3 = sb2.append("hello"); // StringBuffer가 가지고 있는 메소드들은 대부분 자기 자신, this를 반환 ( 메서드 체이닝 형식 )
        if (sb2 == sb3) {
            System.out.println("sb2 == sb3");
        }

        String str2 = new StringBuffer().append("hello").append(" ").append("world").toString();
        System.out.println(str2);
    }
}
