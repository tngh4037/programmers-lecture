package lang.thread.state;

public class WaitAndNotifyExam {

    public static void main(String[] args) {
        // 해당 쓰레드가 실행되면, 해당 쓰레드는 run() 메소드 안에서 자신의 모니터링 락을 획득
        MyThread6 t1 = new MyThread6();
        t1.start();

        // t1에 대하여 동기화 블럭을 설정
        // 만약 main 쓰레드가 아래의 블록을 위의 Thread 보다 먼저 실행되었다면 wait를 하게 되면서 모니터링 락을 놓고 대기
        synchronized (t1) {
            try {
                // t1.wait() 메소드를 호출.
                // 메인 쓰레드는 정지
                // MyThread6가 5번 값을 더한 후 notify()를 호출하게 되면 wait에서 깨어남
                System.out.println("t1가 완료될때까지 기다립니다.");
                t1.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 깨어난 후 결과를 출력
            System.out.println("Total is: " + t1.total);
        }
    }
}
