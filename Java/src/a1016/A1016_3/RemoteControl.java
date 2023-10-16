package a1016.A1016_3;

public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute){
        if (mute){
            System.out.println("무음 처리합니다.");
            setVolume(MIN_VOLUME);
        }else {
            System.out.println("무음 해제합니다.");
        }
    }


}
