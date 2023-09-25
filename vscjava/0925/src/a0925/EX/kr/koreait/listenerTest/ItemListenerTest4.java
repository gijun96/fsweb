package a0925.EX.kr.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class ItemListenerTest4 extends JFrame implements ItemListener {
	
//	java.awt 패키지를 사용할 때는 Checkbox 클래스는 체크 박스나 라디오 버튼을 만들었지만 javax.swing 패키지는 체크 박스를 JCheckBox 클래스로
//	라디오 버튼은 JRadioButton 클래스로 만든다.
//	Checkbox football, baseball, handball;
	JRadioButton football, baseball, handball;
	JPanel panel = new JPanel();
	JLabel label = new JLabel("이곳에 선택한 목록이 나와요");
	
//	ButtonGroup 클래스로 같은 그룹의 라디오 버튼을 묶어준다. => ButtonGroup 클래스 객체에 JRadioButton 클래스 객체를 추가한다.
	ButtonGroup group = new ButtonGroup();
	
	public ItemListenerTest4() {
		setTitle("ItemListenerListener");
		setBounds(1200, 100, 500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		체크 박스 만들기
//		new JRadioButton() : 레이블이 표시되지 않는 라디오 버튼을 만든다.
//		new JRadioButton("레이블") : 레이블이 표시되는 라디오 버튼을 만든다.
//		new JRadioButton("레이블", 선택 여부) : 레이블이 표시되는 라디오 버튼을 만들고 선택 여부를 지정한다.
//		new JRadioButton("레이블", 이미지) : 레이블이 표시되는 라디오 버튼을 만드는데 체크 박스 대신 이미지를 표시한다.
//		new JRadioButton("레이블", 이미지, 선택 여부) : 레이블이 표시되는 라디오 버튼을 만드는데 체크 박스 대신 이미지를 표시하고 선택 여부를 
//		지정한다.
		football = new JRadioButton("축구");
		baseball = new JRadioButton("야구", true);
		handball = new JRadioButton("핸드볼", new ImageIcon("./src/images/Duke01.gif"));
		panel.add(football);
		panel.add(baseball);
		panel.add(handball);
		add(panel);
		
//		같은 그룹의 JRadioButton 클래스 객체를 ButtonGroup 클래스 객체에 추가해서 같은 그룹으로 묶어준다.
		group.add(football);
		group.add(baseball);
		group.add(handball);
		
		label.setPreferredSize(new Dimension(500, 50));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.SOUTH);
		
//		라디오 버튼에 ItemListener를 걸어준다.
		football.addItemListener(this);
		baseball.addItemListener(this);
		handball.addItemListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ItemListenerTest4 window = new ItemListenerTest4();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
//		getItem() 메소드를 실행하면 체크 박스의 레이블만 얻어오는 것이 아니라 체크 박스 전체 정보를 얻어오기 때문에 아래와 같이 getSource()
//		메소드로 ItemListener가 실행된 객체 정보를 얻어온 후 사용해야 한다.
//		System.out.println(e.getItem());
		
		Object object = e.getSource();
		JRadioButton checkbox = (JRadioButton) object;
		
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























