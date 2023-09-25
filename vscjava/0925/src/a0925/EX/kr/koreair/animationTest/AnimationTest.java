package a0925.EX.kr.koreair.animationTest;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JPanel;

public class AnimationTest extends JPanel {
	
	Image bg, duke;			// 디스크의 이미지를 읽어서 저장할 변수를 선언한다.
	int w = 55, h = 68;		// 이미지 한 장의 크기를 저장해둔다.
	
//	객체가 생성될 때 생성자에서 윈도우에 표시할 이미지를 디스크에서 읽어 Image 변수에 저장한다.
	public AnimationTest() {
//		읽어올 이미지가 저장된 경로와 파일명을 지정한다.
		String filename = "src\\a0925\\EX\\images\\bg.png";
//		디스크의 이미지를 읽어 Image 변수에 저장한다.
		bg = Toolkit.getDefaultToolkit().getImage(filename);
		duke = Toolkit.getDefaultToolkit().getImage("src\\a0925\\EX\\images\\Duke06.gif");
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
		
		AnimationTest graphic = new AnimationTest();
		window.add(graphic);
		
		window.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		
//		drawImage(img, x, y, observer) : 원본 이미지를 변형 없이 그대로 윈도우에 표시한다. => 배경 이미지를 표시할 때 사용한다.
//		img => 윈도우에 표시할 이미지가 저장된 변수나 배열 요소
//		x, y => 이미지가 표시될 윈도우의 좌표 => 이 자리에 이미지의 좌측 상단 모서리가 위치한다.
//		observer => 이미지가 표시될 윈도우 => 현재 윈도우에 표시하면 되기 때문에 this라 적으면 된다.
//		g.drawImage(bg, 0, 0, this);
		g.drawImage(duke, 0, 0, this);
		
//		drawImage(img, dx1, dy1, dx2, dy2, sx1, sy1, sx2, sy2, observer)
//		img => 윈도우에 표시할 이미지가 저장된 변수나 배열 요소
//		dx1, dy1 => 윈도우에 이미지가 표시될 시작 좌표
//		dx2, dy2 => 윈도우에 이미지가 표시될 끝 좌표
//		sx1, sy1 => 윈도우에 표시할 원본 이미지의 시작 좌표
//		sx2, sy2 => 윈도우에 표시할 원본 이미지의 끝 좌표
//		observer => 이미지가 표시될 윈도우 => 현재 윈도우에 표시하면 되기 때문에 this라 적으면 된다.
		g.drawImage(duke, w*1, h*0, w*2, h*1, 0, 0, w, h, this);		// 원래 모양, 원본 이미지를 왼쪽 위 => 오른쪽 아래 방향으로 읽는다.
		g.drawImage(duke, w*2, h*0, w*3, h*1, w, 0, 0, h, this);		// 좌우 대칭, 원본 이미지를 오른쪽 위 => 왼쪽 아래 방향으로 읽는다.
		g.drawImage(duke, w*3, h*0, w*4, h*1, 0, h, w, 0, this);		// 상하 대칭, 원본 이미지를 왼쪽 아래 => 오른쪽 위 방향으로 읽는다.
		g.drawImage(duke, w*4, h*0, w*5, h*1, w, h, 0, 0, this);		// 상하좌우 대칭, 원본 이미지를 오른쪽 아래 => 왼쪽 위 방향으로 읽는다.
		g.drawImage(duke, w*5, h*0, w*7, h*2, 0, 0, w, h, this);		// 4배 확대
		g.drawImage(duke, w*7, h*0, w*7+w/2, h/2, 0, 0, w, h, this);	// 1/4배 축소
		
	}

}























