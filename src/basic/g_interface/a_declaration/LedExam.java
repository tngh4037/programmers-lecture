package basic.g_interface.a_declaration;

public class LedExam {

    public static void main(String[] args) {
        TV tv = new LedTV(); // 참조변수의 타입으로 인터페이스를 사용할 수 있다. 이 경우 인터페이스가 가지고 있는 메소드만 사용할 수 있다.
        tv.turnOn();
        tv.changeChannel(8);
        tv.changeVolume(39);
        tv.turnOff();
    }
}
