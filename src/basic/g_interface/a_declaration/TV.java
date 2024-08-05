package basic.g_interface.a_declaration;

public interface TV {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void changeVolume(int volume);
    public abstract void changeChannel(int channel);
}
