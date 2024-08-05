package basic.f_extends.f_overriding;

public class MyBus5 extends MyCar5 {

    @Override
    public void run() {
        super.run();
        System.out.println("MyBus5의 run 메소드");
    }
}
