package a0925.EX.kr.koreait.layoutTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class NullLayoutTest extends Frame {

	Label label = new Label("NullLayout");
	
	public NullLayoutTest() {
		setTitle("NullLayout");
		setBounds(1200, 100, 400, 500);
		
//		특정 레이아웃 매니저를 사용하지 않는다.
		setLayout(null);
		
//		레이아웃이 없으므로 컴포넌트에 setBounds() 메소드로 컨테이너에 표시될 좌표와 크기를 지정한 후 컨테이너에 추가한다.
		
		label.setBounds(100, 150, 200, 300);
		label.setBackground(Color.YELLOW);
		add(label);
				
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		NullLayoutTest window = new NullLayoutTest();
		
	}

}













