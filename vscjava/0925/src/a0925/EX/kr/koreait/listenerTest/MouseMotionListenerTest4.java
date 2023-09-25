package a0925.EX.kr.koreait.listenerTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MouseMotionListenerTest4 extends JPanel implements Runnable {

	int xpos = 50, ypos = 50;
	static int xbar = 175;
	
	public static void main(String[] args) {
		
		Frame window = new Frame("Graphic");
		window.setBounds(1200, 100, 500, 600);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		MouseMotionListenerTest4 graphic = new MouseMotionListenerTest4();
		Thread thread = new Thread(graphic);
		thread.start();
		
//		수평 막대가 움직일 수 있도록 MouseMotionListener를 걸어준다.
		graphic.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				xbar = e.getX() - 75;
				xbar = xbar < 0 ? 0 : xbar;
				xbar = xbar > 335 ? 335 : xbar;
			}
		});
		
		window.add(graphic);
		window.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		
//		JPanel은 이전 그래픽의 잔상이 남아있기 때문에 흰색의 사각형을 윈도우의 크기 만큼 그려준다.
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 600);
		g.setColor(Color.RED);
		g.fillOval(xpos, ypos, 50, 50);
//		수평 막대를 만든다.
		g.setColor(Color.BLUE);
		g.fillRect(xbar, 530, 150, 25);
		
	}

	@Override
	public void run() {
	
		int xsw = 1, ysw = 1;
		while(true) {
			xpos += xsw;
			if(xpos > 435 || xpos < 0) {
				xsw *= -1;
			}
			ypos += ysw;
//			수평 막대 위에 공이 부딛힐 때만 튕겨 올라갈 수 있도록 조건을 지정한다.
			if((ypos > 480 && xpos >= xbar && xpos <= xbar + 150) || ypos < 0) {
				ysw *= -1;
			}
//			수평 막대 아래로 공이 내려가면 스레드를 중지시키기 위해 무한 루프를 탈출시킨다.
			if(ypos >= 500) {
				break;
			}
			try { Thread.sleep(10); } catch (InterruptedException e) { e.printStackTrace(); }
			repaint();
		}
		JOptionPane.showMessageDialog(null, "GAME OVER!!!");
		System.exit(0);
		
	}

}























