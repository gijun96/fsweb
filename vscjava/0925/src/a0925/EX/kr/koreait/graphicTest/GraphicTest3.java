package a0925.EX.kr.koreait.graphicTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JPanel;

public class GraphicTest3 extends JPanel implements Runnable {

	int xpos = 50, ypos = 50;
	Color color = new Color(255, 0, 0);
	
	public static void main(String[] args) {
		
		Frame window = new Frame("Graphic");
		window.setBounds(1200, 100, 500, 600);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		GraphicTest3 graphic = new GraphicTest3();
		Thread thread = new Thread(graphic);
		thread.start();
		
		window.add(graphic);
		window.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 500, 600);
		g.setColor(color);
		g.fillOval(xpos, ypos, 50, 50);
		
	}

	@Override
	public void run() {
	
		int xsw = 1, ysw = 1;
		while(true) {
			xpos += xsw;
			if(xpos > 435 || xpos < 0) {
				xsw *= -1;
				changeColor();
			}
			ypos += ysw;
			if(ypos > 515 || ypos < 0) {
				ysw *= -1;
				changeColor();
			}
			try { Thread.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
			repaint();
		}
		
	}

	private void changeColor() {
		color = new Color(new Random().nextInt(16777216));
	}

}























