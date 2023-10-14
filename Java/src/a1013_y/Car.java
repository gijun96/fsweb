package a1013_y;

public class Car {

    // 필드 선언
    private int speed;
    private boolean stop;

    // speed필드와 Getter/Setter 선언
    // 인텔리제이 Getter/Setter 단축키 Alt + Insert
    public int getSpeed(){
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed<0) {
            this.speed = 0;
            return;
        }else{
            this.speed =speed;
        }
    }
    public boolean isStop() {
        return stop;
    }
    public void setStop(boolean stop) {
        this.stop = stop;
        if (stop == true){
            this.speed =0;
        }
    }
}