package a0925.EX.kr.koreait.listenerTest;

import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseMotionListenerTest extends JFrame {
	
	JPanel panel = new JPanel();
	
	public MouseMotionListenerTest() {
		setTitle("MouseMotionListener");
		setBounds(1200, 100, 300, 400);
		
//		MouseMotionListener를 JFrame에 걸어준다. => 윈도우 전체(창틀 포함)에 걸어준다.
//		addMouseMotionListener(new MouseMotionListener() {
//			@Override
//			public void mouseMoved(MouseEvent e) {
//				System.out.println("마우스 이동 : " + e.getPoint());
//			}
//			@Override
//			public void mouseDragged(MouseEvent e) {
//				System.out.println("마우스 드래그 : " + e.getX() + ", " + e.getY());
//			}
//		});
		
		add(panel);
//		MouseMotionListener를 JPanel에 걸어준다. => 윈도우에서 창틀을 제외한 영역에 걸어준다.
		panel.addMouseMotionListener(new MouseMotionListener() {
			@Override
			public void mouseMoved(MouseEvent e) {
				System.out.println("마우스 이동 : " + e.getPoint());
			}
			@Override
			public void mouseDragged(MouseEvent e) {
				System.out.println("마우스 드래그 : " + e.getX() + ", " + e.getY());
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MouseMotionListenerTest window = new MouseMotionListenerTest();
		
	}

}























