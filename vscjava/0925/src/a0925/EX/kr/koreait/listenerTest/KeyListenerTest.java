package a0925.EX.kr.koreait.listenerTest;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class KeyListenerTest extends JFrame {
	
	boolean shiftFlag = false;			// 왼쪽 shift 키가 눌렸나 기억하는 변수
	
	public KeyListenerTest() {
		setTitle("KeyListenerListener");
		setBounds(1200, 100, 300, 400);
		
		addKeyListener(new KeyListener() {
//			keyTyped() 메소드가 keyReleased() 메소드 보다 먼저 실행된다.
			@Override
			public void keyTyped(KeyEvent e) {
//				System.out.println("키보드를 타이핑 할 때");
			}
			@Override
			public void keyReleased(KeyEvent e) {
//				System.out.println("키보드를 누르고 있는 손가락이 떨어질 때");
				
//				spacebar에서 손가락이 떨어지면 shiftFlag 변수의 값을 false로 변경한다.
				if(e.getKeyCode() == 16) {
					shiftFlag = false;
				}
			}
			@Override
			public void keyPressed(KeyEvent e) {
//				System.out.println("키보드를 누르고 있을 때");
				
//				getKeyChar() : 누른 키보드에 해당되는 문자를 얻어온다. => 한글이나 눌러도 아무것도 표시되지 않는 키보드는 아무것도 얻어오지
//				못한다. => 대소문자 구분은 한다.
//				System.out.println(e.getKeyChar());
				
//				getKeyCode() : 누른 키보드에 해당되는 키 코드값을 얻어온다. => 아무것도 표시되지 않는 키보드라 하더라도 키 코드가 할당되어
//				있으므로 할당된 키 코드를 얻어와 작업할 수 있다. => 대소문자 구분을 하지 못한다.
				System.out.println(e.getKeyCode());
				
				/*
				switch(e.getKeyCode()) {
//					case 37: case 65:
					case KeyEvent.VK_LEFT: case KeyEvent.VK_A:
						System.out.println("캐릭터가 왼쪽으로 이동합니다.");
						break;
//					case 38: case 87:
					case KeyEvent.VK_UP: case KeyEvent.VK_W:
						System.out.println("캐릭터가 위로 이동합니다.");
						break;
//					case 39: case 68:
					case KeyEvent.VK_RIGHT: case KeyEvent.VK_D:
						System.out.println("캐릭터가 오른쪽으로 이동합니다.");
						break;
//					case 40: case 83:
					case KeyEvent.VK_DOWN: case KeyEvent.VK_S:
						System.out.println("캐릭터가 아래로 이동합니다.");
						break;
//					case 32:
					case KeyEvent.VK_SPACE:
						System.out.println("캐릭터가 쩜프합니다.");
						break;
				}
				*/
				
//				getModifiersEx() 메소드와 함께 getKeyCode() 메소드를 사용하면 단축키를 지정할 수 있다.
				/*
				if(e.getKeyCode() == 83 && e.getModifiersEx() == 128) {
					System.out.println("저장하기!!!");
				}
				if(e.getKeyCode() == 79 && e.getModifiersEx() == 128) {
					System.out.println("열기!!!");
				}
				if(e.getKeyCode() == 83 && e.getModifiersEx() == 576) {
					System.out.println("이클립스 source 메뉴");
				}
				*/
				
//				getKeyText(keyCode) : keyCode에 해당되는 키보드 위의 문자열을 얻어온다. => getKeyChar() 메소드는 아무 문자도 입력되지 않는
//				키보드위의 문자열을 얻어올 수 없기 때문에 getKeyText() 메소드를 사용해서 얻어온다.
//				System.out.println(e.getKeyText(e.getKeyCode()));
				
//				e.getKeyModifiersText(e.getModifiers()) : 기능키가 조합되는 문자열을 얻어온다.
//				System.out.println(e.getKeyModifiersText(e.getModifiers()));
//				e.getModifiersExText(e.getModifiersEx()) : 기능키가 조합되는 문자열을 얻어온다.
//				System.out.println(e.getModifiersExText(e.getModifiersEx()));
				
//				getKeyLocation() : 키보드에 2개 이상 있는 키 중에서 어떤 키가 눌렸나 얻어온다.
//				System.out.println(e.getKeyLocation());
				
//				왼쪽 오른쪽 구분 없이 shift와 spacebar가 동시에 눌렸나 검사한다.
				if(e.getModifiersEx() == 64 && e.getKeyCode() == 32) {
					System.out.println("shift + spacebar");
				}
				
//				왼쪽 shift 키가 눌리면 shiftFlag 변수를 true로 변경한다.
				if(e.getModifiersEx() == 64 && e.getKeyLocation() == 2) {
					shiftFlag = true;
				}
				
//				왼쪽 shift와 spacebar가 동시에 눌렸나 검사한다.
				if(e.getModifiersEx() == 64 && e.getKeyCode() == 32 && shiftFlag) {
					System.out.println("왼쪽 shift + spacebar");
				}
//				오른쪽 shift와 spacebar가 동시에 눌렸나 검사한다.
				if(e.getModifiersEx() == 64 && e.getKeyCode() == 32 && !shiftFlag) {
					System.out.println("오른쪽 shift + spacebar");
				}
			}
		});
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		KeyListenerTest window = new KeyListenerTest();
		
	}

}























