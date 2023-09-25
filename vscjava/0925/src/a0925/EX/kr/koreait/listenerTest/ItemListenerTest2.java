package a0925.EX.kr.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Dimension;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ItemListenerTest2 extends JFrame implements ItemListener {
	
//	Checkbox 클래스는 체크 박스나 라디오 버튼을 만든다.
	Checkbox football, baseball, handball;
	JPanel panel = new JPanel();
	JLabel label = new JLabel("이곳에 선택한 목록이 나와요");
	
//	Checkbox 클래스로 라디오 버튼을 만들려면 CheckboxGroup 클래스 객체를 만들과 같은 그룹의 라디오 버튼을 만들때 Checkbox 클래스 생성자의 3번째
//	인수로 넘겨주면 같은 그룹으로 묶인 라디오 버튼이 만들어진다.
	CheckboxGroup group = new CheckboxGroup();
	
	public ItemListenerTest2() {
		setTitle("ItemListenerListener");
		setBounds(1200, 100, 500, 250);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		체크 박스 만들기
//		new Checkbox() : 레이블이 표시되지 않는 체크 박스를 만든다.
//		new Checkbox("레이블") : 레이블이 표시되는 체크 박스를 만든다.
//		new Checkbox("레이블", 선택 여부) : 레이블이 표시되는 체크 박스를 만들고 선택 여부를 지정한다.
//		선택 여부의 기본값은 false 이고 선택되지 않은 상태를 의미하며 true로 변경하면 선택된 상태로 화면에 표시된다.
//		체크 박스는 선택 여부에 true를 여러개 지정하면 true가 지정된 모든 항목이 선택된다.
		
//		라디오 버튼 만들기
//		new Checkbox("레이블", 선택 여부, CheckboxGroup 클래스 객체) : 레이블이 표시되는 라디오 버튼을 만들고 선택 여부를 지정한 후 같은
//		그룹의 라디오 버튼을 묶어준다. => 2번째 인수 선택 여부를 반드시 적어야 한다.
//		라디오 버튼은 선택 여부에 true를 여러개 사용하면 마지막에 true를 사용한 항목만 선택된다.
		football = new Checkbox("축구", true, group);
		baseball = new Checkbox("야구", true, group);
		handball = new Checkbox("핸드볼", false, group);
		panel.add(football);
		panel.add(baseball);
		panel.add(handball);
		add(panel);
		
		label.setPreferredSize(new Dimension(500, 50));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label, BorderLayout.SOUTH);
		
//		라디오 상자에 ItemListener를 걸어준다.
		football.addItemListener(this);
		baseball.addItemListener(this);
		handball.addItemListener(this);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		ItemListenerTest2 window = new ItemListenerTest2();
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		
//		getItem() : 체크 박스나 라디오 버튼에서 선택한 항목의 레이블을 얻어온다.
//		getItem() 메소드의 리턴 타입은 Object 타입이므로 setText() 메소드로 넣어줄 때 casting을 하거나 toString() 메소드를 실행하거나 
//		String 클래스의 valueOf() 메소드를 이용하거나 + 연산자로 ""를 붙여서 문자열로 변환시킨 후 넣어줘야 한다.
//		label.setText((String) e.getItem());
//		label.setText(e.getItem().toString());
//		label.setText(String.valueOf(e.getItem()));
//		label.setText(e.getItem() + "");
//		getStateChange() : 체크 박스나 라디오 버튼이 선택되면 1, 해제되면 2를 리턴한다. => 라디오 버튼은 해제할 수 없다.
//		label.setText(e.getStateChange() + "");
//		label.setText(e.getItem() + " " + (e.getStateChange() == 1 ? "선택" : "해제"));
		
//		====================================================================================================================================
		
		Object object = e.getSource();
		Checkbox checkbox = (Checkbox) object;
		
//		getState() : 체크 박스나 라디오 버튼 객체 단위(ItemEvent 객체 e를 사용하지 않는다.)로 선택되면 true, 해제되면 false를 리턴한다.
		if(checkbox == football) {
			label.setText("축구 " + (football.getState() ? "선택" : "해제"));
		} else if(checkbox == baseball) {
			label.setText("야구 " + (baseball.getState() ? "선택" : "해제"));
		} else if(checkbox == handball) {
			label.setText("핸드볼 " + (handball.getState() ? "선택" : "해제"));
		}
		
	}

}























