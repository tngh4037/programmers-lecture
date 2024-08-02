package lang;

public class WrapperExam {
    public static void main(String[] args) {
        int i = 5;
        Integer i2 = new Integer(5);
        Integer i3 = 5;     //오토박싱
        int i4 = i2.intValue();
        int i5 = i2;       //오토언박싱
    }
}