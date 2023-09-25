package a0925.EX.kr.koreait.listenerTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class KeyListenerTest2 extends JPanel implements Runnable {

	static int xpos = 0, ypos = 0, position = 0, speed = 10;
	int angle = 0;
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Graphic");
		window.setBounds(1200, 100, 500, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		KeyListenerTest2 graphic = new KeyListenerTest2();
		window.add(graphic);
		Thread thread = new Thread(graphic);
		thread.start();

		window.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				switch(e.getKeyCode()) {
					case KeyEvent.VK_LEFT: case KeyEvent.VK_A:
						xpos -= speed;
						xpos = xpos < 0 ? 0 : xpos;
						position = 180;
						break;
					case KeyEvent.VK_UP: case KeyEvent.VK_W:
						ypos -= speed;
						ypos = ypos < 0 ? 0 : ypos;
						position = 90;
						break;
					case KeyEvent.VK_RIGHT: case KeyEvent.VK_D:
						xpos += speed;
						xpos = xpos > 387 ? 387 : xpos;
						position = 0;
						break;
					case KeyEvent.VK_DOWN: case KeyEvent.VK_S:
						ypos += speed;
						ypos = ypos > 462 ? 462 : ypos;
						position = 270;
						break;
				}
				
			}
		});
		
		window.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 600);
		g.setColor(Color.ORANGE);
		g.fillArc(xpos, ypos, 100, 100, position + angle, 360 - angle * 2);
		
	}

	@Override
	public void run() {
		
		int asw = 1;
		while(true) {
			angle += asw;
			if(angle > 35 || angle < 0) {
				asw *= -1;
			}
			try { Thread.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
			repaint();
		}
		
	}

}























