package util.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExam {

    public static void main(String[] args) {
        Date date = new Date(); // 객체 생성시 현재 시간 정보를 담고있다.
        System.out.println(date.toString());

        SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz"); // a: 오전/오후 표시  | zzz : 타임존 표시 (한국: KST)
        String format = ft.format(date);
        System.out.println("format = " + format);

        System.out.println(date.getTime()); // 날짜를 long 타입으로 표현

        System.out.println(System.currentTimeMillis()); // 시스템의 현재시간을 long 타입으로 표현

        System.out.println(System.currentTimeMillis() - date.getTime());
    }
}

// (JDK 1.0) DATE: 지역화 고려 x ( Date 클래스는 지역화를 지원하지 않는다. 지역화란 국가별로 현재 날짜와 시간은 다를 수 있는데, 그 부분을 지원하지 못한다. )
// (JDK 1.1) Calendar: 지역화 고려 O ( 이런 문제를 해결하기 위하여 나온 클래스가 Calendar클래스. Calendar클래스는 자바 1.1에 등장하였다. | 참고) 지역화와 관련된 클래스들은 Locale로 시작되는 이름을 가진 클래스들입니다. 역시 1.1 이후에 등장한다. )
