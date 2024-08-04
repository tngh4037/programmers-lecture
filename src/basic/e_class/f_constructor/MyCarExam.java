package basic.e_class.f_constructor;

public class MyCarExam {

    public static void main(String[] args) {
        // MyCar c1 = new MyCar();
        MyCar c2 = new MyCar("소방차");
        MyCar c3 = new MyCar("구급차");

        System.out.println(c2.name);
        System.out.println(c3.name);
    }
}
