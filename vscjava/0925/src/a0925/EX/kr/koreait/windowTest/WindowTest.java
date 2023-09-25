package a0925.EX.kr.koreait.windowTest;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

//	Frame 클래스 객체를 생성해서 윈도우 띄우기
public class WindowTest {

	public static void main(String[] args) {
		
//		Frame window = new Frame();						// 제목 없는 윈도우를 만든다.
		Frame window = new Frame("제목 있는 윈도우");	// 제목 없는 윈도우를 만든다.
		window.setTitle("제목이 변경된 윈도우");		// 윈도우의 제목을 변경한다.
//		window.setSize(400, 300);						// 윈도우의 크기를 변경한다.
//		window.setLocation(800, 100);					// 윈도우가 모니터에 표시되는 위치를 변경한다.
		window.setBounds(800, 100, 400, 300);			// 윈도우의 위치와 크기를 한꺼번에 변경한다.
//		window.setBackground(Color.ORANGE);				// 윈도우의 배경색을 변경한다.
		
//		Color 클래스를 이용해 색상 만들기
//		생성자의 인수로 red, green, blue 색상을 넘겨 만들며 각 색상의 범위는 0 ~ 255 사이의 정수를 입력한다.
//		숫자를 크게 할 수록 색상은 밝아지고(가법혼합) 작게 할 수록 색상은 어두워진다.
//		색상을 모두 같은 값으로 지정하면 무조건 회색이 나오며 숫자의 크기에 따라서 명도면 변경된다.
//		Color color = new Color(88, 250, 130);
//		Color color = new Color(2796245);
//		window.setBackground(color);
		
		window.setBackground(new Color(new Random().nextInt(16777216)));
		
//		Frame 클래스를 이용해 윈도우를 띄웠을 경우 윈도우 닫기
		window.addWindowListener(new WindowAdapter() {
//			윈도우 닫기 버튼을 클릭하면 자동으로 실행되는 메소드(콜백 메소드)인 windowClosing() 메소드를 Override 해서 윈도우를 닫는 코드를
//			넣어준다.
			@Override
			public void windowClosing(WindowEvent e) {
//				System.exit(0);							// 프로그램을 강제로 종료한다. => 모든 윈도우를 닫는다.
				window.dispose();						// 윈도우가 사용하던 자원을 컴퓨터 시스템에게 반납한다. => 현재 윈도우만 닫는다.
			}
		});
		
		window.setVisible(true);						// 윈도우를 화면에 표시한다. => 윈도우 설정을 마치고 마지막에 실행한다.
		
	}
	
}












