package exam.lambda;

public class LambdaExam1 {

    public static void main(String[] args) {
        // 자바는 메소드만 매개변수로 전달할 방법이 없다. 인스턴스만 전달할 수 있다.
        // 그렇기 때문에 run() 메소드를 가지고 있는 Runnable 객체를 만들어서 전달한다.
        new Thread(new Runnable() {
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("hello");
                }
            }
        }).start();

        // 메소드만 전달할 수 있다면, 좀더 편리하게 프로그래밍할 수 있을텐데, 자바는 메소드만 전달할 수 있는 방법은 없었기 때문에 매번 객체를 생성해서 매개변수로 전달해야 했다.
        // 이런 부분을 해결한 것이 "람다표현식" 이다.
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("hello");
            }
        }).start();
    }
}

// 람다식 문법
// : (매개변수 목록) -> { 구현부 }