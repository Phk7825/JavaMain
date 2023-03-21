package Swing;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;

class RandomGame extends JFrame implements ActionListener{
	JMenuBar jb;
	JMenu m1,m2,m3, subMenu, subMenu2;
	JMenuItem t1,t2,t3,t4,t5,t6,t7, sub1,sub2,sub3,sub4 ;
	RandomGame()
	{
		setSize(900,800);
		setTitle("하이");
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton j1 = new JButton("후우");
		JButton j2 = new JButton("하아");
		ImageIcon icon = new ImageIcon("1.png");
		JLabel la = new JLabel("이미지넣기 짜잔.",icon,SwingConstants.CENTER);
		String str[] = {"사과" ,"배","바나나","복숭아 ","포도"};
		JComboBox <String> com = new JComboBox<String>();
				for(int i =0 ; i< str.length; i ++) {
					com.addItem(str[i]);
				}
		c.add(com);
		c.add(la);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.add(j1);
		c.add(j2);
		j1.addActionListener(this);
		
		jb = new JMenuBar();
		m1 = new JMenu("파일");
		t1 = new JMenuItem("새로만들던지");
		t2 = new JMenuItem("열던지");
		subMenu = new JMenu("저장하던지");
		sub1 = new JMenuItem("다른이름으로 저장");
		sub2 = new JMenuItem("그대로 저장");
		subMenu2 = new JMenu("하기 귀찮다");
		sub3 = new JMenuItem("어쩌지");
		sub4 = new JMenuItem("하지 말까");
				
				
		m2 = new JMenu("편집");
		t4 = new JMenuItem("복사");
		t5 = new JMenuItem("붙혀넣기");
		t6 = new JMenuItem("잘라내기기기기");
		
		m3 = new JMenu("도움말");
		t7 = new JMenuItem("정보확인할거야?");
	
		
		jb.add(m1);
		jb.add(m2);
		jb.add(m3);
		
		m1.add(t1);m1.add(t2);m1.add(subMenu);
		m2.add(t4);m2.add(t5);m2.add(t6);
		m3.add(t7);m3.add(subMenu2);
		subMenu.add(sub1); subMenu.add(sub2);
		subMenu2.add(sub4); subMenu2.add(sub3); subMenu2.add(sub1);
		
		setJMenuBar(jb);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RandomGame();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}