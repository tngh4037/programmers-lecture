package lang.thread.creation;

// 자바에서 Thread를 만드는 방법은 크게 두가지이다.
// 1) Thread 클래스를 상속받는 방법
// 2) Runnable 인터페이스를 구현하는 방법
//
// 이번엔 2) Runnable 인터페이스를 구현해서 쓰레드를 만드는 방법을 알아보자.
public class MyThread2Exam {

    public static void main(String[] args) {
        MyThread2 task1 = new MyThread2("*");
        MyThread2 task2 = new MyThread2("-");

        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        t1.start();
        t2.start();

        System.out.println("main thread end");
    }
}

// [ Runnable 인터페이스를 구현해서 쓰레드를 만드는 방법 ]
// 1) Runnable 인터페이스를 구현해서, Runable 인터페이스가 가지고 있는 run() 메서드를 재정의한다.
// 2) Runnable 인터페이스를 구현한 클래스의 객체를 생성한다.
// 3) Thread 객체를 생성하고, 해당 생성자에 2)를 넣는다.
// 4) Thread 클래스가 가진 start() 메소드를 호출한다.
//
//
// [ 자바가 Runnable 인터페이스를 구현하는 방법을 지원하는 이유]
// - 자바는 단일 상속만 지원하기 때문에, 만약 이미 다른 클래스를 기존에 상속받고 있었다면, Thread 클래스를 상속받을 수 없다.
// - Thread 를 상속받는 구조라면, 사실은 run() 메서드만 재정의 해서 사용하면 되는데, Thread 클래스가 가지고 있는 모든 자원을 상속받게 됨 -> 비효율
