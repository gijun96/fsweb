package a1018.thread;

// 동작하고 있는 프로그램을 프로세서(process)라고 한다. 보통 한 개의 프로세서는 한가지의 일을 하지만,
// 스레드(thread)를 이용하면 한 프로세스 내에서 두가지 또는 그 이상의 일을 동시에 할 수 있다.
public class Thread2 extends Thread {
    int seq;

    public Thread2(int seq) {
        this.seq = seq;
    }
    public void run(){
        System.out.println(this.seq + " thread start."); //Thread start
        try{
            Thread.sleep(1000); //1초 대기한다.
        } catch (Exception e){

        }
        System.out.println(this.seq + "thread end");
    }

    public static void main(String[] args) {
        for (int i =0; i< 10; i++){
            Thread t = new Thread2(i);
            t.start();
        }
        System.out.println("main end");
    }
}
