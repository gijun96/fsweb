package a1018.thread;

public class Sample extends Thread{
    public void run(){
// Thread를 상속하면 run메서드를 구현해야한다.
        System.out.println("tread run.");
    }

}
