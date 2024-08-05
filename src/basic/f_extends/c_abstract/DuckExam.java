package basic.f_extends.c_abstract;

public class DuckExam {

    public static void main(String[] args) {
        Duck duck = new Duck();
        duck.sing();
        duck.fly();

        // Bird bird = new Bird(); // compile error -> 'Bird' is abstract; cannot be instantiated
    }
}
