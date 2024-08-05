package basic.g_interface.a_declaration;

public class LedTV implements TV {

    @Override
    public void turnOn() {
        System.out.println("켜다.");
    }

    @Override
    public void turnOff() {
        System.out.println("끄다.");
    }

    @Override
    public void changeVolume(int volume) {
        System.out.println("볼륨을 조정하다.");
    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("채널을 지정하다.");
    }
}
