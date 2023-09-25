package a0925.EX.kr.koreait.graphicTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

//	윈도우에 그래픽을 표시하려면 Panel 또는 JPanel 클래스를 상속받고 paint() 메소드를 Override 시켜서 그래픽을 구현하고 Panel 또는 JPanel 클래스를
//	상속받아 그래픽을 구현한 클래스의 객체를 윈도우에 추가하면 된다.
public class GraphicTest extends Panel implements Runnable {

	int xpos = 0;			// 팩맨의 이동을 담당하는 x좌표
	int xsw = 1;			// 팩맨 이동 방향 및 눈깔 위치를 반대로 바꿀때 사용할 변수
	int position = 0;		// 팩맨이 벽에 부딛혔을 때 입 방향을 반대로 바꿀때 사용할 변수
	int angle = 0;
	
	public static void main(String[] args) {
		
		Frame window = new Frame("Graphic");
		window.setBounds(1200, 100, 500, 600);
		window.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		GraphicTest graphic = new GraphicTest();
		window.add(graphic);
		
		window.setVisible(true);
		
		Thread thread = new Thread(graphic);
		thread.start();
		
	}

	@Override
	public void paint(Graphics g) {
		
		/*
//		drawString(str, x, y) : str에 저장된 문자열을 윈도우 좌표 x, y에 그린다.
		g.drawString("밥 먹었으니 합시다.", 100, 50);
//		drawLine(x1, y1, x2, y2) : x1, y1(시작점 좌표) 부터 x2, y2(끝점 좌표)를 이어주는 직선을 그린다.
		g.drawLine(100, 100, 200, 200);
		g.setColor(Color.RED);		// 도형의 색을 변경한다.
//		drawRect(x, y, width, height) : x, y(시작점, 사각형의 왼쪽 상단 모서리) 부터 폭(width), 높이(height) 만큼의 사각형을 그린다.
		g.drawRect(100, 100, 100, 100);
//		drawOval(x, y, width, height) : x, y 부터 폭, 높이 만큼의 사각형에 내접하는 원을 그린다.
		g.setColor(Color.BLUE);
		g.drawOval(100, 100, 100, 100);
		
		g.setColor(Color.MAGENTA);
		g.fillRect(250, 100, 100, 100);
//		Color 클래스 생성자의 4번째 인수로 투명도를 지정할 수 있다.
//		투명도의 범위는 0 ~ 255 사이의 숫자이며 기본값은 255로 완전 불투명을 의미하고 숫자를 작게 지정할 수록 투명해진다.
		g.setColor(new Color(0, 255, 0, 100));
		g.fillOval(300, 100, 100, 100);
		*/
		
		g.setColor(Color.ORANGE);
//		drawArc(x, y, width, height, startAngle, arcAngle) : x, y 부터 폭, 높이 만큼의 사각형에 내접하는 startAngle 에서 시작해서 arcAngle 만큼
//		진행하는 호를 그린다. 각도는 양수를 지정하면 시계 반대 방향을 의미하고 음수를 지정하면 시계 방향을 의미한다.
		g.fillArc(xpos, 300, 100, 100, position + angle, 360 - angle * 2);
		g.setColor(Color.BLUE);
		g.fillOval(xpos + 46 + xsw * 20, 315, 10, 10);
		
	}

	@Override
	public void run() {
		
		int asw = 1;
		while(true) {
			
			angle += asw;
			if(angle > 35 || angle < 0) {
				asw *= -1;
			}
			
			xpos += xsw;
			if(xpos > 390 || xpos < 0) {
				xsw *= -1;
//				position = position == 30 ? 210 : 30;
				position = (position + 180) % 360;
			}
			
			try { Thread.sleep(5); } catch (InterruptedException e) { e.printStackTrace(); }
//			화면에 표시할 그래픽의 내용이 변경되면 반드시 repaint() 메소드를 실행해서 변경된 내용대로 paint() 메소드를 다시 실행하게 해야 한다.
//			Panel 클래스를 상속받아 작성한 그래픽을 다시 그릴 경우 기존에 내용을 모두 지우고 다시 그리기 때문에 컴퓨터의 성능이 낮은 경우
//			화면이 깜박거리는 현상이 발생될 수 있다.
//			JPanel 클래스를 상속받아 작성한 그래픽은 다시 그릴 경우 기존의 내용을 지우지 않고 메모리에서 미리 그려놓은 그림을 화면에 표시하기
//			때문에 깜박거림 현상이 현저히 줄어든다.
			repaint();
		}
		
	}

}























