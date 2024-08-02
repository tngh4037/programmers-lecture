package util.datastructure.generic;

public class BoxExam {

    public static void main(String[] args) {
        Box box = new Box();
        box.setObj(new Object());
        Object obj = box.getObj();

        box.setObj("string add");
        String str = (String) box.getObj(); // 문자를 넣었기 떄문에 String 으로 받고싶다. (Object 로 받게되니, String의 내부 편의 메서드 등을 사용 불가) -> 형변환 필요
        System.out.println(str);

        box.setObj(1234);
        int value = (int) box.getObj(); // 숫자를 넣었기 떄문에 숫자형으로 받고싶다. -> 형변환 필요
        System.out.println(value);
    }
}

// 참고)
// Object 타입이기에 모든 객체가 다 set 될수는 있지만, 조회시에는 매번 형변환을 해줘야 하는 불편함
