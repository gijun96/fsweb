package a0925.EX.kr.koreait.graphicTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JPanel;

public class GraphicTest5 extends JPanel implements Runnable {

	int xpos1 = 50, ypos1 = 50, xpos2 = 180, ypos2 = 350;
	Dimension dimension;
	static Frame window = new Frame("Graphic");
	
	public static void main(String[] args) {
		
		window.setBounds(1200, 100, 500, 600);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		GraphicTest5 graphic = new GraphicTest5();
		Thread thread = new Thread(graphic);
		thread.start();
		
		window.add(graphic);
		window.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, dimension.width, dimension.height);
		g.setColor(Color.RED);
		g.fillOval(xpos1, ypos1, 50, 50);
		g.setColor(Color.BLUE);
		g.fillOval(xpos2, ypos2, 50, 50);
		
	}

	@Override
	public void run() {
	
		int xsw1 = 1, ysw1 = 1, xsw2 = -2, ysw2 = -1;
		while(true) {
			
			dimension = window.getSize();
			
			xpos1 += xsw1;
			if(xpos1 > dimension.width - 65 || xpos1 < 0) {
				xsw1 *= -1;
			}
			ypos1 += ysw1;
			if(ypos1 > dimension.height - 85 || ypos1 < 0) {
				ysw1 *= -1;
			}
			
			xpos2 += xsw2;
			if(xpos2 > dimension.width - 65 || xpos2 < 0) {
				xsw2 *= -1;
			}
			ypos2 += ysw2;
			if(ypos2 > dimension.height - 85 || ypos2 < 0) {
				ysw2 *= -1;
			}
			
//			충돌 감지
			if(Math.abs(xpos1 - xpos2) <= 40 && Math.abs(ypos1 - ypos2) <= 40) {
//				System.out.println("꽝");
				xsw1 *= -1;
				ysw1 *= -1;
				xsw2 *= -1;
				ysw2 *= -1;
			}
			
			try { Thread.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
			repaint();
		}
		
	}

}























