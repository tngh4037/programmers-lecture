package lang.thread.creation;

public class MyThread2 implements Runnable {

    private final String str;

    public MyThread2(String str) {
        this.str = str;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.print(str);

            try {
                // 컴퓨터가 너무 빠르기 때문에 수행결과를 잘 확인 할 수 없어서 Thread.sleep() 메서드를 이용해서 조금씩 쉬었다가 출력할 수 있게한다.
                Thread.sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// 참고) MyThread2는 Thread를 상속받지 않았기 때문에 Thread가 아니다.