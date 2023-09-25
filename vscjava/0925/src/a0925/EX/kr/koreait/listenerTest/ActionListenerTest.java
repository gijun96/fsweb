package a0925.EX.kr.koreait.listenerTest;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

//	ActionListener는 버튼을 마우스 왼쪽 버튼으로 클릭하거나 텍스트 상자에서 엔터키를 누를 때 동작하는 이벤트이다.
//	ActionListener를 걸어주는 방법은 2가지가 있는데 ActionListener 인터페이스를 구현하고 actionPerformed() 메소드를 Override 해서 구현하는 방법과
//	ActionListener를 걸어줄 객체에 addActionListener() 메소드를 사용해 구현하는 방법이 있다.
public class ActionListenerTest extends JFrame implements ActionListener {
	
	JButton button1 = new JButton("눌러봐~~~~~");
	JButton button2 = new JButton("눌러보라니까~~~~~");
	JButton button3 = new JButton("왜안눌러봐~~~~~");
	
	public ActionListenerTest() {
		setTitle("ActionListener");
		setBounds(1200, 100, 300, 400);
		
		setLayout(new GridLayout(3, 1));
		add(button1);
		add(button2);
		add(button3);
		
//		버튼 객체에 이름을 지정한다. => 버튼 위에 이미지가 올라가서 문자열을 올릴수 없을 경우 버튼에 이름을 붙여줘야 한다.
		button1.setName("button1");
		button2.setName("button2");
		button3.setName("button3");
		
//		button1에만 ActionListener를 걸어준다.
//		컴포넌트 단위로 ActionListener를 걸어주려면 컴포넌트에서 addActionListener() 메소드를 실행하고 메소드의 인수로 ActionListener 인터페이스
//		객체를 익명으로 구현한다. => actionPerformed() 메소드가 자동으로 Override 된다. => actionPerformed() 메소드에 실행할 기능을 구현한다.
		button1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
//				MessageDialog : 간단한 메시지를 화면에 표시한다.
//				showMessageDialog(parentComponent, message)
//				parentComponent : MessageDialog가 어떤 컴포넌트 위에 표시될지 지정한다. => null을 입력하면 모니터 정 가운데 표시된다.
//				message : MessageDialog에 표시할 메시지
//				JOptionPane.showMessageDialog(button1, "눌렀냐~~~~~");
				
//				showMessageDialog(parentComponent, message, title, messageType)
//				title : MessageDialog의 제목 표시줄에 나타낼 문자열
//				messageType : 메시지 앞에 표시할 아이콘을 설정한다. *_MESSAGE
//				JOptionPane.showMessageDialog(button1, "눌렀냐~~~~~", "에러", JOptionPane.PLAIN_MESSAGE);
				
//				showMessageDialog(parentComponent, message, title, messageType, icon)
//				icon : messageType 대신 표시할 이미지를 지정한다. => ImageIcon 클래스 객체를 사용해서 넣어준다.
				JOptionPane.showMessageDialog(button1, "눌렀냐~~~~~", "에러", JOptionPane.PLAIN_MESSAGE, 
						new ImageIcon("./src/images/Duke01.gif"));
			}
		});
		
//		클래스에 ActionListener 인터페이스를 구현받아 여러 컴포넌트에서 실행되는 ActionListener를 구현할 경우 아래와 같이 addActionListener()
//		메소드를 각각의 컴포넌트에 구현하고 인수에 this를 actionPerformed() 메소드로 넘겨서 처리한다.
		button2.addActionListener(this);
		button3.addActionListener(this);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ActionListenerTest window = new ActionListenerTest();
		
	}

//	컴포넌트에 addActionListener(this) 형태로 actionPerformed() 메소드가 호출되면 ActionListener가 실행된 컴포넌트의 정보가 actionPerformed() 
//	메소드의 인수 ActionEvent 클래스의 객체 e로 넘어온다.
	@Override
	public void actionPerformed(ActionEvent e) {
		
//		ActionListener 인터페이스를 구현받아 여러 컴포넌트에서 같이 실행하는 ActionListener를 적용해야 할 경우 어떤 컴포넌트에서 ActionListener가
//		실행되었나 판단하는 코드가 필요하다.
		
//		getActionCommand() 메소드로 버튼 위의 명령(문자열)을 얻어와서 어떤 버튼에서 ActionListener가 실행되었나 판단한다.
		/*
		if(e.getActionCommand().equals("눌러보라니까~~~~~")) {
			System.out.println("눌러보라니까~~~~~ 버튼에서 ActionListener가 실행됨");
		} else if(e.getActionCommand().equals("왜안눌러봐~~~~~")) {
			System.out.println("왜안눌러봐~~~~~ 버튼에서 ActionListener가 실행됨");
		}
		*/
		/*
		switch(e.getActionCommand()) {
			case "눌러보라니까~~~~~":
				System.out.println("눌러보라니까~~~~~ 버튼에서 ActionListener가 실행됨");
				break;
			case "왜안눌러봐~~~~~":
				System.out.println("왜안눌러봐~~~~~ 버튼에서 ActionListener가 실행됨");
				break;
		}
		*/
		
//		버튼위에 문자열이 없으면 getActionCommand() 메소드를 사용할 수 없다.
//		어떤 컴포넌트에서 ActionListener가 실행될지 모르기 때문에 자바의 최상위 클래스인 Object 클래스 타입으로 받아서 사용할 컴포넌트로 형변환
//		한 다음에 사용해야 한다.
//		getSource() : Listener가 실행된 컴포넌트를 얻어온다.
		Object object = e.getSource();
		JButton button = (JButton) object;
		
		/*
		if(button.getName().equals("button2")) {
			System.out.println("눌러보라니까~~~~~ 버튼에서 ActionListener가 실행됨");
		} else if(button.getName().equals("button3")) {
			System.out.println("왜안눌러봐~~~~~ 버튼에서 ActionListener가 실행됨");
		}
		*/
		
		if(button == button2) {
//			System.out.println("눌러보라니까~~~~~ 버튼에서 ActionListener가 실행됨");
			
//			ConfirmDialog : 메시지를 보여주고 사용자의 응답(예/아니오, 확인/취소)을 받는다.
//			예(YES), 확인(OK) => 0
//			아니오(NO) => 1
//			취소(CANCEL) => 2
			
//			showConfirmDialog(parentComponent, message)
//			int result = JOptionPane.showConfirmDialog(button2, "프로그램을 종료하겠습니까?");
//			System.out.println(result);
			
//			showConfirmDialog(parentComponent, message, title, optionType)
//			optionType : ConfirmDialog에 표시할 버튼의 종류를 지정한다. *_OPTION 상수를 사용한다.
//			OK_CANCEL_OPTION => 확인/취소, YES_NO_CANCEL_OPTION => 예/아니오/취소, YES_NO_OPTION => 예/아니오
//			int result = JOptionPane.showConfirmDialog(button2, "프로그램을 종료하겠습니까?", "프로그램 종료", JOptionPane.YES_NO_OPTION);
			
//			showConfirmDialog(parentComponent, message, title, optionType, messageType)
//			int result = JOptionPane.showConfirmDialog(button2, "프로그램을 종료하겠습니까?", "프로그램 종료", JOptionPane.YES_NO_OPTION, 
//					JOptionPane.QUESTION_MESSAGE);
			
//			showConfirmDialog(parentComponent, message, title, optionType, messageType, icon)
			int result = JOptionPane.showConfirmDialog(button2, "프로그램을 종료하겠습니까?", "프로그램 종료", JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE, new ImageIcon("./src/images/Duke01.gif"));
			
			if(result == 0) {
				System.exit(0);
			}
			
			
		} else if(button == button3) {
//			System.out.println("왜안눌러봐~~~~~ 버튼에서 ActionListener가 실행됨");
			
//			InputDialog : 메시지를 보여주고 사용자의 입력(문자열)을 받는다.
			
//			showInputDialog(message)
//			String name = JOptionPane.showInputDialog("니 이름이 뭐니?");
			
//			showInputDialog(parentComponent, message)
//			String name = JOptionPane.showInputDialog(button3, "니 이름이 뭐니?");
			
//			showInputDialog(message, initialSelectionValue)
//			initialSelectionValue : InputDialog에 표시되는 기본값
//			String name = JOptionPane.showInputDialog("니 이름이 뭐니?", "이름을 입력하세요");
			
//			showInputDialog(parentComponent, message, initialSelectionValue)
//			String name = JOptionPane.showInputDialog(button3, "니 이름이 뭐니?", "이름을 입력하세요");
			
//			JOptionPane.showInputDialog(parentComponent, message, title, messageType)
//			String name = JOptionPane.showInputDialog(button3, "니 이름이 뭐니?", "이름 입력", JOptionPane.INFORMATION_MESSAGE);
			
			String[] food = {"짜장면", "짬뽕", "탕수육", "군만두", "마파두부", "오향장육"};
//			showInputDialog(parentComponent, message, title, messageType, icon, selectionValues, initialSelectionValue)
//			selectionValues : 콤보 상자에 표시할 데이터가 저장된 배열
//			initialSelectionValue : 콤보 상자에 표시할 데이터 중에서 InputDialog에 표시되는 기본값
//			selectionValues에 사용할 배열의 데이터를 형변환 시켜서 변수에 저장해야 한다.
			String name = (String) JOptionPane.showInputDialog(button3, "니 이름이 뭐니?", "이름 입력", JOptionPane.INFORMATION_MESSAGE, 
					new ImageIcon("./src/images/Duke01.gif"), food, "오향장육");
					
		}
		
	}

}























