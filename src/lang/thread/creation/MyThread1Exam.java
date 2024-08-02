package lang.thread.creation;

// 자바에서 Thread를 만드는 방법은 크게 두가지이다.
//
// 1) Thread 클래스를 상속받는 방법
// 2) Runnable 인터페이스를 구현하는 방법
//
// 먼저 1) Thread 클래스를 상속받는 방법에 대해 알아보자.
public class MyThread1Exam {

    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1("*");
        MyThread1 t2 = new MyThread1("-");

        t1.start(); // 스레드를 동작시키게 할 때, run() 을 호출하는게 아니라 start() 를 호출해야 한다. ( start() 를 통해 스레드가 실행될 준비를 하도록 한다. 준비가 다 되면 내부에서 run()이 호출된다. ) -> 따라서, start() 메서드를 호출하지 않으면 스레드는 동작하지 않는다.
        t2.start();

        System.out.println("main thread end");
    }
}

// [ Thread 클래스를 상속받아 쓰레드를 만드는 방법 ]
// 1) java.lang.Thread 클래스를 상속받는다.
// 2) 그리고 Thread 가 가지고 있는 run() 메소드를 오버라이딩한다.
// 3) 상속받은 클래스(스레드)의 객체를 생성하고, Thread 클래스가 가지고 있는 start() 메소드를 호출한다.
//
// 참고) t1.start();
// : start() 를 실행할 때, 이때부터 프로그램의 흐름이 둘로 나뉘게 된다. ( 원래 main을 수행하던 흐름과, 스레드가 하나 더 발생되서 run()을 수행하는 흐름 )
//
// 참고) t2.start();
// : 이제 수행 흐름이 3개가 된다.
