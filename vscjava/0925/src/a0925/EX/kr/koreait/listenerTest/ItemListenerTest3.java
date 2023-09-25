package a0925.EX.kr.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemListenerTest3 extends JFrame implements ItemListener {
	
//	java.awt 패키지를 사용할 때는 Checkbox 클래스는 체크 박스나 라디오 버튼을 만들었지만 javax.swing 패키지는 체크 박스를 JCheckBox 클래스로
//	라디오 버튼은 JRadioButton 클래스로 만든다.
//	Checkbox football, baseball, handball;
	JCheckBox football, baseball, handball;
	JPanel panel = new JPanel();
	JLabel label = new JLabel("이곳에 선택한 목록이 나와요");
	
	public ItemListenerTest3() {
		setTitle("ItemListenerListener");
		setBounds(1200, 100, 500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		체크 박스 만들기
//		new JCheckBox() : 레이블이 표시되지 않는 체크 박스를 만든다.
//		new JCheckBox("레이블") : 레이블이 표시되는 체크 박스를 만든다.
//		new JCheckBox("레이블", 선택 여부) : 레이블이 표시되는 체크 박스를 만들고 선택 여부를 지정한다.
//		new JCheckBox("레이블", 이미지) : 레이블이 표시되는 체크 박스를 만드는데 체크 박스 대신 이미지를 표시한다.
//		new JCheckBox("레이블", 이미지, 선택 여부) : 레이블이 표시되는 체크 박스를 만드는데 체크 박스 대신 이미지를 표시하고 선택 여부를 지정한다.
//		선택 여부의 기본값은 false 이고 선택되지 않은 상태를 의미하며 true로 변경하면 선택된 상태로 화면에 표시된다.
//		체크 박스는 선택 여부에 true를 여러개 지정하면 true가 지정된 모든 항목이 선택된다.
		football = new JCheckBox("축구");
		baseball = new JCheckBox("야구", true);
		handball = new JCheckBox("핸드볼", new ImageIcon("./src/images/Duke01.gif"));
		panel.add(football);
		panel.add(baseball);
		panel.add(handball);
		add(panel);
		
		label.setPreferredSize(new Dimension(500, 50));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.SOUTH);
		
//		체크 상자에 ItemListener를 걸어준다.
		football.addItemListener(this);
		baseball.addItemListener(this);
		handball.addItemListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ItemListenerTest3 window = new ItemListenerTest3();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
//		getItem() 메소드를 실행하면 체크 박스의 레이블만 얻어오는 것이 아니라 체크 박스 전체 정보를 얻어오기 때문에 아래와 같이 getSource()
//		메소드로 ItemListener가 실행된 객체 정보를 얻어온 후 사용해야 한다.
//		System.out.println(e.getItem());
		
		Object object = e.getSource();
		JCheckBox checkbox = (JCheckBox) object;
		
//		getText() : 선택되거나 해제되는 체크 박스의 레이블을 얻어온다. => casting 하거나 toString() 메소드를 사용하거나 String.valueOf()를
//		사용할 필요 없다.
//		System.out.println(checkbox.getText());
//		isSelected() : ItemListener가 실행된 체크 박스가 선택되면 true, 해제되면 false를 얻어온다.
//		System.out.println(checkbox.isSelected());
//		label.setText(checkbox.getText() + " " + (checkbox.isSelected() ? "선택" : "해제"));
		
		if(checkbox == football) {
			label.setText("축구 " + (checkbox.isSelected() ? "선택" : "해제"));
		} else if(checkbox == baseball) {
			label.setText("야구 " + (checkbox.isSelected() ? "선택" : "해제"));
		} else if(checkbox == handball) {
			label.setText("핸드볼 " + (checkbox.isSelected() ? "선택" : "해제"));
			if(checkbox.isSelected()) {
//				setIcon() : 체크 박스대신 표시되는 이미지를 변경한다.
				handball.setIcon(new ImageIcon("./src/images/Duke06.gif"));
			} else {
				handball.setIcon(new ImageIcon("./src/images/Duke01.gif"));
			}
		}
		
	}

}























