package basic.g_interface.b_defaultmethod;

public class MyCal implements Calculator {

    @Override
    public int plus(int i, int j) {
        return i + j;
    }

    @Override
    public int multiply(int i, int j) {
        return i * j;
    }

    // @Override
    // public int exec(int i, int j) {
    //     return Calculator.super.exec(i, j);
    // }
}
