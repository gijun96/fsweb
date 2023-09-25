package a0925.EX.kr.koreait.listenerTest;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MouseListenerTest2 extends JFrame {
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	
	public MouseListenerTest2() {
		setTitle("MouseListener");
		setBounds(1200, 100, 400, 500);
		
		setLayout(new GridLayout(2, 1));
		add(panel1);
		panel2.setBackground(Color.ORANGE);
		add(panel2);
		
//		MouseListener 인터페이스를 사용하면 코딩하기는 편하지만 MouseListener 인터페이스에 정의된 5개의 추상 메소드가 모두 Override 되고 사용하지
//		않는 메소드라도 빈 메소드로 남겨둬야 하는 문제가 있다.
//		Mouse 이벤트 중에서 필요한 이벤트만 사용하려면 필요한 메소드만 Override 시켜서 사용하면 편리하다. => MouseAdapter 클래스 객체를 익명으로
//		선언하고 필요함 메소드만 Override 시켜서 사용한다.
		panel2.addMouseListener(new MouseAdapter() {

//			ActionListener는 마우스 왼쪽 버튼을 누를 때 실행되지만 MouseListener는 마우스의 모든 버튼을 누를 때 실행된다.
			@Override
			public void mouseClicked(MouseEvent e) {
				
//				getButton() : 마우스의 어떤 버튼에서 MouseListener가 실행되었나 얻어온다. => 어떤 버튼이 클릭되었나 얻어온다. => 2bit 방식
//				왼쪽 : 1 => 01, 가운데 : 2 => 10, 오른쪽 : 3 => 11
//				System.out.println(e.getButton());
				/*
				switch(e.getButton()) {
					case 1: // case MouseEvent.BUTTON1:
						System.out.println("왼쪽 버튼");
						break;
					case 2: // case MouseEvent.BUTTON2:
						System.out.println("휠");
						break;
					case 3: // case MouseEvent.BUTTON3:
						System.out.println("오른쪽 버튼");
						break;
				}
				*/
//				getModifiers() : 어떤 버튼이 클릭되었나 얻어온다. => 1bit 방식
//				왼쪽 : 16 => 10000, 가운데 : 8 => 01000, 오른쪽 : 4 => 00100
//				System.out.println(e.getModifiers());
				/*
				switch(e.getModifiers()) {
					case 16: // case MouseEvent.BUTTON1_MASK:
						System.out.println("왼쪽 버튼");
						break;
					case 8: // case MouseEvent.BUTTON2_MASK:
						System.out.println("휠");
						break;
					case 4: // case MouseEvent.BUTTON3_MASK:
						System.out.println("오른쪽 버튼");
						break;
				}
				*/
				
//				getModifiersEx() : 마우스 버튼이 어떤 기능키(shift, ctrl, alt)와 같이 클릭되었나 얻어온다.
//				shift : 64, ctrl : 128, alt : 512
//				System.out.println(e.getModifiersEx());
				/*
				switch(e.getModifiersEx()) {
					case 64: // case MouseEvent.SHIFT_DOWN_MASK:
						System.out.println("shift + 클릭"); break;
					case 128: // case MouseEvent.CTRL_DOWN_MASK:
						System.out.println("ctrl + 클릭"); break;
					case 512: // case MouseEvent.ALT_DOWN_MASK:
						System.out.println("alt + 클릭"); break;
					case 192:
						System.out.println("shift + ctrl + 클릭"); break;
					case 576:
						System.out.println("shift + alt + 클릭"); break;
					case 640:
						System.out.println("ctrl + alt + 클릭"); break;
					case 704:
						System.out.println("shift + ctrl + alt + 클릭"); break;
					case 1024:
						System.out.println("왼쪽 버튼 + 나머지 클릭"); break;
					case 2048:
						System.out.println("휠 + 나머지 클릭"); break;
					case 4096:
						System.out.println("오른쪽 버튼 + 나머지 클릭"); break;
				}
				*/

//				System.out.println(e.getModifiers());
//				ctrl + 마우스 우클릭
				if(e.getModifiers() == 6) {
					System.out.println("ctrl + 마우스 우클릭");
				}
//				마우스 왼쪽 버튼과 오른쪽 버튼이 동시에 눌렸을 때
				if(e.getModifiers() == 16 && e.getModifiersEx() == 4096 || e.getModifiers() == 4 && e.getModifiersEx() == 1024) {
					System.out.println("왼쪽 버튼과 오른쪽 버튼이 동시에 클릭됨");
				}
				
//				getClickCount() : 마우스 버튼이 연속적으로 클릭된 횟수를 얻어온다.
//				System.out.println(e.getClickCount());
//				왼쪽 버튼 더블 클릭
				if(e.getModifiers() == 16 && e.getClickCount() == 2) {
					System.out.println("왼쪽 버튼 더블 클릭");
				}
				
			}
			
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MouseListenerTest2 window = new MouseListenerTest2();
		
	}

}























