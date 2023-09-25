package a0925.EX.kr.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GraphTest extends JPanel implements Runnable {

	int java, jsp, spring;
	static JPanel panel = new JPanel();
	static JLabel javaLabel = new JLabel("JAVA");
	static JLabel jspLabel = new JLabel("JSP");
	static JLabel springLabel = new JLabel("SPRING");
//	TextField는 입력 상자를 만든다. 생성자의 인수로 TextField의 크기를 지정할 수 있다.
	static TextField javaField = new TextField(3);
	static TextField jspField = new TextField(3);
	static TextField springField = new TextField(3);
	static JButton button = new JButton("그래프 보기");
	
	public static void main(String[] args) {
		
		JFrame window = new JFrame("Graphic");
		window.setBounds(1200, 100, 400, 350);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.add(javaLabel);
//		setEchoChar() : 텍스트 필드에 문자가 입력될 때 대신 표시할 문자를 지정한다. => 비밀번호를 입력할 경우 사용한다.
//		javaField.setEchoChar('*');
		panel.add(javaField);
		panel.add(jspLabel);
		panel.add(jspField);
		panel.add(springLabel);
		panel.add(springField);
		panel.add(button);
		window.add(panel, BorderLayout.SOUTH);
		
		GraphTest graphic = new GraphTest();
		
//		그래프 보기 버튼이 클릭되면 점수에 따른 그래프를 나타내는 스레드를 실행한다.
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Thread thread = new Thread(graphic);
				thread.start();
			}
		});
		
		window.add(graphic);
		window.setVisible(true);
		
	}

	@Override
	public void paint(Graphics g) {
		
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 350);
		
		g.setColor(Color.BLACK);
		g.drawLine(50, 30, 50, 250);	// y축
		for(int i = 0; i < 11; i++) {
			g.drawLine(50, 250 - i * 20, 350, 250 - i * 20);				// x축
			g.drawString(String.format("%3d", i * 10), 20, 255 - i * 20);	// y축 레이블 
		}
		
//		x축 레이블
		g.drawString("JAVA", 90, 270);
		g.drawString("JSP", 192, 270);
		g.drawString("SPRING", 280, 270);
		
//		각 과목의 점수에 따라서 그래프를 표시한다.
		g.setColor(Color.RED);
		g.fillRect(95, 250 - java * 2, 20, java * 2);
		g.fillRect(192, 250 - jsp * 2, 20, jsp * 2);
		g.fillRect(290, 250 - spring * 2, 20, spring * 2);
		
	}

	@Override
	public void run() {
	
//		100점 까지 3과목의 막대 그래프를 올려준다.
		for(int i = 0; i <= 100; i++) {
			java = jsp = spring = i;
			try { Thread.sleep(30); } catch (InterruptedException e) { e.printStackTrace(); }
			repaint();
		}
		
//		100점 까지 올려준 막대를 해당 과목의 점수 까지 내려준다.
		boolean javaFlag = false, jspFlag = false, springFlag = false;
		while(true) {
			if(java != Integer.parseInt(javaField.getText())) {
				java--;
			} else {
				javaFlag = true;
			}
			if(jsp != Integer.parseInt(jspField.getText())) {
				jsp--;
			} else {
				jspFlag = true;
			}
			if(spring != Integer.parseInt(springField.getText())) {
				spring--;
			} else {
				springFlag = true;
			}
			
//			그래프를 다 그렸으면 스레드를 종료하기 위해 무한 루프를 탈출한다.
			if(javaFlag && jspFlag && springFlag) {
				break;
			}
			try { Thread.sleep(30); } catch (InterruptedException e) { e.printStackTrace(); }
			repaint();
		}
		
//		그래프 작업이 완료된 후 다음 그래프를 그릴 점수를 입력받기 위해서 텍스트 필드에 입력한 내용을 지워준다.
		javaField.setText("");
		jspField.setText("");
		springField.setText("");
//		requestFocus() : 특정 컴포넌트로 포커스를 옮긴다.
		javaField.requestFocus();
		
	}

}























