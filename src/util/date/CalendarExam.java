package util.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarExam {

    public static void main(String[] args) {
        // 객체 생성시 현재 시간 정보를 담고있다.
        Calendar cal = Calendar.getInstance(); // Calendar 는 추상클래스이다. 따라서 new 키워드를 사용해서 인스턴스 생성 불가. 대신 내부에서 static 메서드로 제공 ( getInstance()메소드를 호출하면 내부적으로 java.util.GregorianCalendar 인스턴스를 만들어서 리턴한다. GregorianCalendar는 Calendar의 자식 클래스이다. )

        System.out.println(cal.get(Calendar.YEAR)); // Calendar가 가지고 있는 get 메소드에 Calendar의 상수를 넣어준다. ( Calendar 는 내부에 무수히 많은 상수를 제공한다. )
        System.out.println(cal.get(Calendar.MONTH) + 1); // 월은 0부터 시작한다.
        System.out.println(cal.get(Calendar.DATE));

        System.out.println(cal.get(Calendar.HOUR)); // 시간을 12시까지 표현 ( ex. 오후 1시: 1 )
        System.out.println(cal.get(Calendar.HOUR_OF_DAY)); // 시간을 24시까지 표현 ( ex. 오후 1시: 13 )
        System.out.println(cal.get(Calendar.MINUTE));

        cal.add(Calendar.HOUR, 4); // 4시간 후로 변경
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        cal.add(Calendar.HOUR, -4); // 4시간 전으로 변경
        System.out.println(cal.get(Calendar.HOUR_OF_DAY));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        String format = sdf.format(cal.getTime());
        System.out.println("format = " + format);
    }
}

// Calendar: Date의 단점을 해결하고 등장한 것이 Calendar 클래스