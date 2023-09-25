package a0925.EX.kr.koreait.windowTest;

import java.text.SimpleDateFormat;

import javax.swing.JFrame;

//	스레드를 이용해 윈도우의 제목 표시줄에 현재 시간이 표시되게 한다.
public class WindowTest5 extends JFrame implements Runnable {

	public WindowTest5() {
		this("제목 없는 윈도우");
	}
	public WindowTest5(String title) {
		setTitle(title);
		setBounds(800, 100, 400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
	
		WindowTest5 window = new WindowTest5();
		Thread thread = new Thread(window);
		thread.start();
		
	}
	
	@Override
	public void run() {
		
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss.SSS");
		while(true) {
			setTitle(sdf.format(System.currentTimeMillis()));
			try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
		}
		
	}
	
}








