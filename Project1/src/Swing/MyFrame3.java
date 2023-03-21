package Swing;

import java.awt.*;
import javax.swing.*;

class MyFrameEx2 extends JFrame{
	Container c;
	JPanel pal;
	JButton button_lise[] = new JButton[4];
	String str_list[]= {"확인","취소","뒤로가기" , "앞으로가기"};
	
	MyFrameEx2(){
		setTitle("나의 두번째 프레임");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setButton();
		setVisible(true);
	}
	void setButton() {
		
		c=getContentPane();
		pal= new JPanel();
		pal.setBackground(Color.cyan);
		pal.setLayout(new CardLayout());
		for(int i =0; i< 4; i++) {
			button_lise[i]= new JButton(str_list[i]);
			pal.add(button_lise[i]);
		}
		c.add(pal);
	}
}
public class MyFrame3 {
	public static void main(String[] args) {
		new MyFrameEx2();
	}
}