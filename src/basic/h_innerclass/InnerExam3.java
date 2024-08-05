package basic.h_innerclass;

// 지역 중첩 클래스 또는 지역 클래스
public class InnerExam3 {

    public void exec() {

        class Cal {
            int value = 0;
            public void plus() {
                value++;
            }
        }

        Cal cal = new Cal(); // 메소드 안에서 해당 클래스를 이용할 수 있다.
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}
