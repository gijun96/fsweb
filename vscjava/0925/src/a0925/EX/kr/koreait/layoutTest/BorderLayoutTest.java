package a0925.EX.kr.koreait.layoutTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JPanel;

//	BorderLayout은 컨테이너를 5개의 영역으로 나누고 각각의 영역에 컴포넌트를 배치하는 레이아웃 매니저이다.
public class BorderLayoutTest extends Frame {

	Label label = new Label("TEST1");
	Label label2 = new Label("TEST2");
	Label label3 = new Label("TEST3");
	Label label4 = new Label("TEST4");
	Label label5 = new Label("TEST5");
	Label label6 = new Label("TEST6");
	
	public BorderLayoutTest() {
		setTitle("BorderLayout");
		setBounds(1200, 100, 400, 500);
		
//		BorderLayout border = new BorderLayout();
//		setLayout(border);
		
		label.setBackground(Color.YELLOW);
		label.setAlignment(Label.CENTER);
//		add(컴포넌트, 방향), 방향을 생략하면 CENTER가 기본값으로 사용된다.
		add(label, BorderLayout.NORTH);
		
		label2.setBackground(Color.ORANGE);
		label2.setAlignment(Label.CENTER);
//		add(label2, BorderLayout.SOUTH);
		
		label3.setBackground(Color.GREEN);
		label3.setAlignment(Label.CENTER);
//		add(label3, BorderLayout.WEST);
//		add("방향", 컴포넌트) => 방향은 반드시 첫 문자만 대문자로 코딩해야 한다.
		add("West", label3);
		
		label4.setBackground(Color.MAGENTA);
		label4.setAlignment(Label.CENTER);
		add(label4, BorderLayout.EAST);
		
		/*
		label5.setBackground(Color.CYAN);
		label5.setAlignment(Label.CENTER);
//		add(label5, BorderLayout.CENTER);
		add(label5);
		*/
		
		label6.setBackground(Color.PINK);
		label6.setAlignment(Label.CENTER);
//		add(label6, BorderLayout.SOUTH);
		
//		한 구역에 여러개의 컴포넌트를 넣고 싶으면 Panel 이나 JPanel에 컴포넌트를 배치하고 Panel 이나 JPanel을 컨테이너에 넣어주면 된다.
//		Panel, JPanel의 기본 레이아웃은 FlowLayout 이다.
//		Panel panel = new Panel();			// 생성자로 레이아웃 매니저를 넘겨주지 않았으므로 FlowLayout이 적용된다.
		Panel panel = new Panel(new GridLayout(1, 2));
		panel.add(label2);
		panel.add(label6);
		add(panel, BorderLayout.SOUTH);
		
		/*
		JPanel panel2 = new JPanel(new GridLayout(4, 3));
		JButton[] buttons = new JButton[12];
		String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(numbers[i]);
			panel2.add(buttons[i]);
			buttons[i].setFont(new Font("Dialog", Font.BOLD, 30));
		}
		add(panel2, BorderLayout.CENTER);
		*/
		
		Phone phone = new Phone();
		add(phone, BorderLayout.CENTER);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		BorderLayoutTest window = new BorderLayoutTest();
		
	}
	
}













