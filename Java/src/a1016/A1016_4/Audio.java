
package a1016.A1016_4;

public class Audio implements RemoteControl {
    private int volume;


    @Override
    public void turnOn() {
        System.out.println("Audio를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("Audio 끕니다.");
    }

    @Override
    public void setVolume(int volume) {
        if(volume > MAX_VOLUME){
            this.volume =MAX_VOLUME;
        }else if (volume < MIN_VOLUME){
            this.volume = MIN_VOLUME;
        }else {
            this.volume = volume;
        }
        System.out.println("현재 Audio 볼륨 : "+ this.volume);
    }

    private int memoryVolume;

    // 디폴트 메소드 정의
    @Override
    public void setMute(boolean mute){
        if (mute) {
            this.memoryVolume = this.volume;
            System.out.println("무음 처리합니다.");
        }else{
            System.out.println("무음 해제합니다.");
            setVolume(this.memoryVolume);
        }
    }

}
