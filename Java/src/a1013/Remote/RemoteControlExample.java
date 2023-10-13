package a1013.Remote;

public class RemoteControlExample {
    public static void main(String[] args) {
        RemoteControl rc;

        // rc변수에 Television을 대입
        rc = new Television();
        rc.turnOn();

        rc = new Audio();
        rc.turnOn();
    }
}
