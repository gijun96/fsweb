package a0925.EX.kr.koreait.layoutTest;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;

//	FlowLayout은 컨테이너(Frame, JFrame, Panel, JPanel)에 컴포넌트를 원래 크기대로 차례차례 배치하는 레이아웃 매니저이다.
//	Frame, JFrame의 기본 레이아웃은 BorderLayout이고 Panel, JPanel의 기본 레이아웃은 FlowLayout 이다.
public class FlowLayoutTest extends Frame {

	Label label = new Label("TEST1");
	Label label2 = new Label("TEST2");
	Label label3 = new Label("TEST3");
	JLabel label4 = new JLabel("테스트0");
	
	public FlowLayoutTest() {
		setTitle("FlowLayout");
		setBounds(1200, 100, 400, 300);
		
//		FlowLayout 객체를 만들어 컨테이너(윈도우)에 적용시킨다.
		FlowLayout flow = new FlowLayout();
		setLayout(flow);			// 컨테이너에 레이아웃을 적용시킨다.
//		위의 2문장을 아래와 같이 1문장으로 줄여서 사용할 수 있다.
//		setLayout(new FlowLayout());
		
//		FlowLayout 객체를 만들 때 생성자의 인수로 컴포넌트 정렬 방법을 지정할 수 있다. => 기본값은 가운데 정렬이다.
//		new FlowLayout(FlowLayout.LEFT) => 왼쪽 정렬
//		new FlowLayout(FlowLayout.CENTER) => 가운데 정렬, 기본값
//		new FlowLayout(FlowLayout.RIGHT) => 오른쪽 정렬
		
		label.setBackground(Color.CYAN);			// Label의 배경색을 변경한다.
		label.setForeground(Color.MAGENTA);			// Label의 전경(글자)색을 변경한다.
//		Label.LEFT => 왼쪽 정렬, 기본값, Label.CENTER => 가운데 정렬, Label.RIGHT => 오른쪽 정렬
		label.setAlignment(Label.LEFT);				// Label 내부 텍스트의 정렬 방식을 변경한다.
		
//		Font 클래스를 이용해서 글꼴 이름, 글꼴 스타일, 글꼴 크기를 변경하기
//		new Font(name, style, size)
//		name => 글꼴 이름, Serif, SansSerif, Monospaced, Dialog, DialogInput 5가지만 사용할 수 있다.
//		style => 글꼴 스타일, Font.BOLD => 굵게, Font.ITALIC => 기울임꼴, Font.PLAIN => 보통모양
//		size => 글꼴 크기
		Font font = new Font("Serif", Font.BOLD, 30);
		label.setFont(font);						// Label 내부 텍스트의 글꼴을 변경한다.
		
		add(label);									// 컨테이너(윈도우)에 컴포넌트(레이블)을 추가한다.
		
		label2.setBackground(Color.RED);
		label2.setForeground(Color.BLUE);
		label2.setAlignment(Label.CENTER);
		label2.setFont(new Font("Monospaced", Font.PLAIN, 20));
		add(label2);
		
		label3.setBackground(Color.YELLOW);
		label3.setForeground(Color.ORANGE);
		label3.setAlignment(Label.RIGHT);
		label3.setFont(new Font("Dialog", Font.ITALIC, 50));
		add(label3);
		
//		java.awt 패키지의 컴포넌트는 UTF-8(유니코드)를 사용하면 한글이 깨지는데 한글을 제대로 표시하려면 아래와 같이 하면된다.
//		Run => Run Configurations => Arguments => VM~ 상자에 -Dfile.encoding=ms949 입력 => Run 버튼 클릭
//		이 기능은 클래스 파일을 새로 만들면 또 실행해야 하고 콘솔에 한글이 깨져서 출력된다.
//		System.out.println("한글이 깨져용");
		
//		JLabel 객체는 배경색을 변경한 후 setOpaque(true) 메소드를 실행해서 배경을 투명하게 해줘야 변경된 배경색이 보인다.
		label4.setOpaque(true);
		label4.setBackground(Color.BLACK);
		label4.setForeground(Color.WHITE);
		
//		javax.swing 패키지의 컴포넌트는 setPreferredSize() 메소드의 인수로 Dimension 클래스 객체를 넘겨서 컴포넌트의 크기를 변경할 수 있다.
//		setSize() 메소드로는 크기를 변경할 수 없음을 주의한다.
		label4.setPreferredSize(new Dimension(200, 100));
		
//		Label 객체는 setAlignment() 메소드로 텍스트 수평 정렬만 가능했지만 JLabel은 수평, 수직 정렬이 모두 가능하다.
//		JLabel.LEFT => 왼쪽 정렬, 기본값, JLabel.CENTER => 가운데 정렬, JLabel.RIGHT => 오른쪽 정렬
		label4.setHorizontalAlignment(JLabel.RIGHT);		// JLabel의 가로 텍스트 정렬 방식을 변경한다.
//		JLabel.TOP => 위쪽 정렬, JLabel.CENTER => 가운데 정렬, 기본값, JLabel.BOTTOM => 아래쪽 정렬
		label4.setVerticalAlignment(JLabel.BOTTOM);
		
//		Label에서는 5개의 글꼴만 사용할 수 있었지만 JLabel은 컴퓨터에 설치된 다른 글꼴을 더 사용할 수 있다.
		label4.setFont(new Font("D2Coding", Font.BOLD, 50));
		
		add(label4);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		FlowLayoutTest window = new FlowLayoutTest();
		
	}
	
}













