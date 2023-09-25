package a0925.EX.kr.koreait.listenerTest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class PuzzleGameMouseListener extends JFrame implements ActionListener, MouseListener {
	
	JPanel puzzlePanel = new JPanel(new GridLayout(4, 4));
	JButton[] puzzleButton = new JButton[16];
	String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16"};
	JButton startButton = new JButton("시작");
	Random random = new Random();
	Image[] images = new Image[16];
	
	public PuzzleGameMouseListener() {
		setTitle("PuzzleGame");
		setBounds(1200, 100, 400, 500);
		
		String[] puzzleName = {"뽀로로", "보노보노", "코난", "인형", "도라에몽", "미니언즈", "나루토", "숫자", "원피스", "피카츄", "곰돌이푸",
				"호랑이형님", "설현"};
		String imageName = (String) JOptionPane.showInputDialog(null, "퍼즐 이미지를 선택하세요", "퍼즐선택", JOptionPane.PLAIN_MESSAGE, 
				new ImageIcon("./src/bbororo/뽀로로.jpg"), puzzleName, "숫자");
		
		switch(imageName) {
		
			case "뽀로로":
				for(int i = 0; i < images.length; i++) {
					String filename = String.format("./src/bbororo/%02d.jpg", i + 1);
					images[i] = Toolkit.getDefaultToolkit().getImage(filename);
				}
				break;
			case "보노보노":
				for(int i = 0; i < images.length; i++) {
					String filename = String.format("./src/bonobono/bono%02d.jpg", i + 1);
					images[i] = Toolkit.getDefaultToolkit().getImage(filename);
				}
				break;
			case "코난":
				for(int i = 0; i < images.length; i++) {
					String filename = String.format("./src/conan/%02d.jpg", i + 1);
					images[i] = Toolkit.getDefaultToolkit().getImage(filename);
				}
				break;
			case "숫자":
				for(int i = 0; i < images.length; i++) {
					String filename = String.format("./src/number/%02d.jpg", i + 1);
					images[i] = Toolkit.getDefaultToolkit().getImage(filename);
				}
				break;
			case "설현":
				for(int i = 0; i < images.length; i++) {
					String filename = String.format("./src/설현/설현_%03d.jpg", i + 1);
					images[i] = Toolkit.getDefaultToolkit().getImage(filename);
				}
				break;
			
		}
		
		viewPuzzle();
		startButton.setPreferredSize(new Dimension(500, 100));
		startButton.setFont(new Font("궁서체", Font.BOLD, 50));
		startButton.addActionListener(this);
		add(startButton, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	private void viewPuzzle() {
		for(int i = 0; i < puzzleButton.length; i++) {
			int index = Integer.parseInt(numbers[i]) - 1;
			puzzleButton[i] = new JButton(new ImageIcon(images[index]));
//			puzzleButton[i].addActionListener(this);
			puzzleButton[i].addMouseListener(this);
			puzzlePanel.add(puzzleButton[i]);
			puzzleButton[i].setName(numbers[i]);
			if(puzzleButton[i].getName().equals("16")) {
				puzzleButton[i].setVisible(false);
			}
		}
		add(puzzlePanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		
		PuzzleGameMouseListener window = new PuzzleGameMouseListener();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < 1000000; i++) {
			int r = random.nextInt(15) + 1;
			String temp = numbers[0];
			numbers[0] = numbers[r];
			numbers[r] = temp;
		}
		
		for(int i = 0; i < puzzleButton.length; i++) {
			puzzleButton[i].setVisible(true);
			puzzlePanel.remove(puzzleButton[i]);
		}
		
		viewPuzzle();
		revalidate();
		
	}

	@Override
	public void mouseClicked(MouseEvent e) { }

	@Override
	public void mousePressed(MouseEvent e) { }

	@Override
	public void mouseReleased(MouseEvent e) { }

	@Override
	public void mouseEntered(MouseEvent e) {

		Object object = e.getSource();
		JButton button = (JButton) object;
		
		int i;
		for(i = 0; i < puzzleButton.length; i++) {
			if(puzzleButton[i].getName().equals(button.getName())) {
				break;
			}
		}
		
		if(i % 4 != 0) {
			if(puzzleButton[i - 1].getName().equals("16")) {
				String temp = numbers[i - 1];
				numbers[i - 1] = numbers[i];
				numbers[i] = temp;
				JButton tempBtn = puzzleButton[i - 1];
				puzzleButton[i - 1] = puzzleButton[i];
				puzzleButton[i] = tempBtn;
			}
		}
		
		if(i % 4 != 3) {
			if(puzzleButton[i + 1].getName().equals("16")) {
				String temp = numbers[i + 1];
				numbers[i + 1] = numbers[i];
				numbers[i] = temp;
				JButton tempBtn = puzzleButton[i + 1];
				puzzleButton[i + 1] = puzzleButton[i];
				puzzleButton[i] = tempBtn;
			}
		}
		
		if(i / 4 != 0) {
			if(puzzleButton[i - 4].getName().equals("16")) {
				String temp = numbers[i - 4];
				numbers[i - 4] = numbers[i];
				numbers[i] = temp;
				JButton tempBtn = puzzleButton[i - 4];
				puzzleButton[i - 4] = puzzleButton[i];
				puzzleButton[i] = tempBtn;
			}
		}
		
		if(i / 4 != 3) {
			if(puzzleButton[i + 4].getName().equals("16")) {
				String temp = numbers[i + 4];
				numbers[i + 4] = numbers[i];
				numbers[i] = temp;
				JButton tempBtn = puzzleButton[i + 4];
				puzzleButton[i + 4] = puzzleButton[i];
				puzzleButton[i] = tempBtn;
			}
		}
		
		for(i = 0; i < puzzleButton.length; i++) {
			puzzleButton[i].setVisible(true);
			puzzlePanel.remove(puzzleButton[i]);
		}
		
		viewPuzzle();
		revalidate();
		
		good:
		while(true) {
			for(i = 0; i < puzzleButton.length - 1; i++) {
				if(i + 1 != Integer.parseInt(puzzleButton[i].getName())) {
					break good;
				}
			}
			JOptionPane.showMessageDialog(null, "맞췄다!!!!! 축하해~~~~~");
			System.exit(0);
		}

	}

	@Override
	public void mouseExited(MouseEvent e) { }

}























