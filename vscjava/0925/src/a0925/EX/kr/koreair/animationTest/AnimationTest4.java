package a0925.EX.kr.koreair.animationTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

import javax.swing.JPanel;

public class AnimationTest4 extends JPanel implements Runnable {
	
	Image[] images = new Image[15];
	int w = 88, h = 146, xpos = 50, index = 0;
	
	public AnimationTest4() {
		
		for(int i = 0; i < images.length; i++) {
			/*
			String filename = "";
			if(i < 10) {
				filename = "./src/images/princess_walk_0" + i + ".png";
			} else {
				filename = "./src/images/princess_walk_" + i + ".png";
			}
			*/
			String filename = String.format("./src/images/princess_walk_%02d.png", i);
//			System.out.println(filename);
			images[i] = Toolkit.getDefaultToolkit().getImage(filename);
		}
		
	}
	
	public static void main(String[] args) {
		
		Frame window = new Frame("Animation");
		window.setBounds(1000, 100, 720, 320);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		AnimationTest4 graphic = new AnimationTest4();
		window.add(graphic);
		
		window.setVisible(true);
		
		Thread thread = new Thread(graphic);
		thread.start();
		
	}

	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 720, 320);
//		g.drawImage(images[index], xpos, 100, this);
		g.drawImage(images[index % images.length], xpos, 100, this);
		
	}

	@Override
	public void run() {
		
		while(true) {
			if(++xpos >= 720) {
				xpos = -w;
			}
//			index = ++index % images.length;
			index++;
			try { Thread.sleep(1); } catch (InterruptedException e) { e.printStackTrace(); }
			repaint();
		}
		
	}

}























