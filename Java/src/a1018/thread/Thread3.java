package a1018.thread;

import java.util.ArrayList;

public class Thread3 extends Thread {
    int seq;

    public Thread3(int seq) {
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
        ArrayList<Thread> threads = new ArrayList<>();
        for (int i =0; i< 10; i++){
            Thread t = new Thread3(i);
            t.start();
            threads.add(t);
        }
        for (int i =0; i<threads.size();i++){
            Thread t = threads.get(i);
            try {
                t.join();   // 쓰레드가 종료할 떄 까지 기다린다.
            }catch (Exception e){

            }
        }
        System.out.println("main end");
    }
}
