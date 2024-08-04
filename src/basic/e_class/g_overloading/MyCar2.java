package basic.e_class.g_overloading;

public class MyCar2 {
    String name;
    int number;

    public MyCar2() {
        // this.name = "이름없음";
        // this.number = 0;

        // 위처럼 작성했을 경우, 아래 MyCar2(String name, int number) 코드와의 중복이 발생한다. 이때, 자신이 가지고 있는 다른 생성자를 호출해서 중복을 방지할 수 있다.
        // -> 자기 자신의 생성자를 호출함으로써 비슷한 코드가 중복되서 나오는 것을 방지할 수 있다.
        this("이름없음", 0);
    }

    public MyCar2(String name) {
        this.name = name;
    }

    public MyCar2(String name, int number) {
        this.name = name;
        this.number = number;
    }
}
