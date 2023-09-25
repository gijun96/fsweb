package a0925.EX.kr.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseWheelListenerTest extends JFrame {
	
	JLabel label = new JLabel("테스트");
	JPanel panel1 = new JPanel(new BorderLayout());
	JPanel panel2 = new JPanel();
	int size = 35;
	
	public MouseWheelListenerTest() {
		setTitle("MouseWheelListener");
		setBounds(1200, 100, 400, 500);
		
		setLayout(new GridLayout(2, 1));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setFont(new Font("D2Coding", Font.BOLD, size));
		panel1.add(label);
		add(panel1);
		panel2.setBackground(Color.PINK);
		add(panel2);
		
		panel2.addMouseWheelListener(new MouseWheelListener() {
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				
//				getWheelRotation() : 마우스 휠을 굴린 방향을 얻어온다. 앞으로 밀면 -1(음수)를 리턴하고 뒤로 당기면 1(양수)을 리턴한다.
//				System.out.println(e.getWheelRotation());
				
				if(e.getWheelRotation() < 0) {
					size = ++size > 120 ? 120 : size;
				} else {
					size = --size < 10 ? 10 : size;
				}
				label.setFont(new Font("D2Coding", Font.BOLD, size));
				
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		MouseWheelListenerTest window = new MouseWheelListenerTest();
		
	}

}























