package lang.thread.shared_sync;

public class MusicBoxExam1 {

    public static void main(String[] args) {
        MusicBox box = new MusicBox();

        MusicPlayer musicPlayer1_kim = new MusicPlayer(1, box);
        MusicPlayer musicPlayer2_lee = new MusicPlayer(2, box);
        MusicPlayer musicPlayer3_park = new MusicPlayer(3, box);

        musicPlayer1_kim.start();
        musicPlayer2_lee.start();
        musicPlayer3_park.start();
    }
}

// [ 쓰레드와 공유객체 ]
// - 하나의 객체를 여러개의 Thread가 사용한다는 것을 의미
//
// [실행결과]
// 신나는 음악
// 슬픈 음악
// 카페 음악
// 슬픈 음악
// 슬픈 음악
// 카페 음악
// 신나는 음악
// 카페 음악
// 신나는 음악
// 슬픈 음악
// 슬픈 음악
// 카페 음악
// 신나는 음악
// ...
//
// => 결과를 보면, 각 player 들이 동시에 수행되는 것을 확인할 수 있다.
//
// ===================================================================================
//
// [ 가정 ]
// MusicBox 내부의 3개 메서드는 동시에 호출되면 안된다고 가정해보자. (뮤직박스 고장)
// 그러면 결국, 공유객체가 가진 메소드를, 여러 스레드가 동시에 호출하지 않도록 해야한다. 어떻게 해야할까?
// -> 메소드 앞에 synchronized 키워드를 붙힌다. (리턴타입 앞에)
// -> 여러개의 Thread들이 공유객체의 메소드를 사용할 때, 메소드에 synchronized가 붙어 있을 경우, 먼저 호출한 스레드가 객체의 사용권(Monitoring Lock)을 얻는다.
//
// [ synchronized 참고 ]
// - 메소드 앞에 synchronized 를 붙혀서 실행해 보면, 메소드 하나가 모두 실행된 후에 다음 메소드가 실행된다.
// - 해당 모니터링 락은 메소드 실행이 종료되거나, wait()와 같은 메소드를 만나기 전까지 유지된다.
// - 다른 쓰레드들은 모니터링 락을 놓을때까지 대기한다.
// - synchronized를 붙히지 않은 메소드는 다른 쓰레드들이 synchronized 메소드를 실행하면서 모니터링 락을 획득했다 하더라도, 그것과 상관없이 실행된다.
// - synchronized를 메소드에 붙혀서 사용할 경우, 메소드의 코드가 길어지면 마지막에 대기하는 쓰레드가 너무 오래 기다리는 것을 막기위해서 메소드에 synchronized를 붙이지 않고, 문제가 있을것 같은 부분만 synchronized 블록을 사용한다. ( 필요한 부분만 동기화 시킬 수 있다. )
//
// [ synchronized 적용 후 실행 결과 ]
// 신나는 음악
// 신나는 음악
// 신나는 음악
// 신나는 음악
// 신나는 음악
// 신나는 음악
// 신나는 음악
// 신나는 음악
// 신나는 음악
// 신나는 음악
// 카페 음악
// 카페 음악
// 카페 음악
// 카페 음악
// 카페 음악
// 카페 음악
// 카페 음악
// 카페 음악
// 카페 음악
// 카페 음악
// 슬픈 음악
// 슬픈 음악
// 슬픈 음악
// 슬픈 음악
// 슬픈 음악
// 슬픈 음악
// 슬픈 음악
// 슬픈 음악
// 슬픈 음악
// 슬픈 음악
