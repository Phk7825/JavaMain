package Swing;

import java.awt.*;
import javax.swing.*;

class MyFrameEx extends JFrame{
	Container c;
	JButton button_lise[] = new JButton[4];
	String str_list[]= {"확인","취소","뒤로가기" , "앞으로가기"};
	
	MyFrameEx(){
		setTitle("나의 두번째 프레임");
		setSize(300,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setButton();
		setVisible(true);
	}
	void setButton() {
		
		c=getContentPane();
		c.setLayout(new FlowLayout());
		JLabel la = new JLabel("나의 프로그램");
		c.add(la);
		for(int i =0; i< 4; i++) {
			button_lise[i]= new JButton(str_list[i]);
			c.add(button_lise[i]);
		}
	}
}
public class MyFrame2 {
	public static void main(String[] args) {
		new MyFrameEx();
	}
}
