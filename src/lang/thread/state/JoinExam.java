package lang.thread.state;

public class JoinExam {

    public static void main(String[] args) {
        MyThread5 t1 = new MyThread5();
        t1.start();

        System.out.println("Thread가 종료될때까지 기다립니다.");
        try {
            t1.join(); // main 스레드는 해당 쓰레드가 끝날때까지 기다린다.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread가 종료되었습니다.");
    }
}

// join() 메소드는 쓰레드가 끝날때까지 기다리게 한다.