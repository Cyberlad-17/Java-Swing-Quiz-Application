import java.awt.*;
import java.awt.event.*;
import java.awt.font.*;
import javax.swing.*;
import java.net.*;  
import javax.imageio.ImageIO;
import java.io.IOException;
import java.awt.image.BufferedImage;

class Image_Attach extends javax.swing.JFrame 
{
   Image_Attach(JFrame f,URL pic)
   {
		//URL url=new URL("https://wallpaperaccess.com/full/3308617.png");  
		//f.setContentPane(new JLabel(new ImageIcon(url)));
		f.setContentPane(new JLabel(new ImageIcon(pic)));
		f.setLayout(null);
		f.setVisible(true);
   }
   
   Image_Attach(JFrame f,String pic)
   {
		f.setContentPane(new JLabel(new ImageIcon(pic)));
		f.setLayout(null);
		f.setVisible(true);
   }
}

class QuestionPageFormat
{
	static int m1;
	static String String_1;
	static JFrame f2,q;
	static JLabel l1;
	static JRadioButton b1,b2,b3,b4;
	static JButton b5;
	public void PageFormat()
	{
		l1.setFont(new Font("Verdana",Font.BOLD,43));
		b1.setFont(new Font("casteller",Font.BOLD,35));
		b2.setFont(new Font("casteller",Font.BOLD,35));
		b3.setFont(new Font("casteller",Font.BOLD,35));
		b4.setFont(new Font("casteller",Font.BOLD,35));
		b5.setFont(new Font("cooper",Font.BOLD,39));
		l1.setForeground(Color.white);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		b4.setForeground(Color.white);
		b5.setForeground(Color.black);
		l1.setBounds(550,265,1400,49);
		b1.setBounds(370,500,650,40);
		b2.setBounds(1230,500,650,40);
		b3.setBounds(370,670,650,40);
		b4.setBounds(1230,670,650,40);
		b5.setBounds(770,820,345,55);
	}
}

class Quiz implements ActionListener
{
	JFrame f;
	JLabel label1,label_quizname,Label2,label_username,Label3,label11,Label5;
	JTextField tf_username;
	JButton b2,Button_ok,Button_cancel;
	Quiz()  
	{
		f=new JFrame("QUIZ APPLICATION ");
		//f.getContentPane().setBackground(Color.cyan);
		String pic=new String("C:\\Users\\Sanjeev\\Downloads\\quiztime2.png");
		// This is the image, I stored in that directory in my machine
		new Image_Attach(f,pic);
		f.setVisible(true);
		f.setSize(2000,2000);
		//f.setLayout(new FlowLayout(FlowLayout.CENTER,700,35));
		label_quizname=new JLabel("QUIZZOPHILES ASSEMBLE !!!!");
		label1=new JLabel("Ready for squeezing those softy-thingy hiding behind those rock-hard skulls !!!! ");
		label11=new JLabel("Then, Yeah Fellas....  You are at the right destination!!!!! ");
		b2=new JButton("Instructions");
		Label2=new JLabel("Just pass on your username, so that it can be scripted down in QUIZZOPHILES History ");
		label_username=new JLabel("UserName");
		tf_username=new JTextField(10);
		Button_ok=new JButton("I'm ready to fire-in");
		Button_cancel=new JButton("Oops!!");
		Label3=new JLabel("1.Each quiz-tion carry 10 points. No neggys here for the wrong answers. ");
		Label5=new JLabel("2.You can select only one option from A to D.");
		Color c1 =new Color(255,50,205);  
		label_quizname.setBounds(616,60,1000,58);
		label1.setBounds(380,175,1700,35);
		label11.setBounds(567,245,1700,35);
		b2.setBounds(840,315,200,40);
		Label3.setBounds(413,380,1350,35);
		Label5.setBounds(613,445,950,35);
		Label2.setBounds(260,540,1500,35);
		label_username.setBounds(693,610,150,35);
		tf_username.setBounds(1030,610,290,35);
		Button_ok.setBounds(860,690,260,45);
		Button_cancel.setBounds(1160,690,150,45);
		label_quizname.setForeground(Color.white);
		label1.setForeground(c1);
		label11.setForeground(c1);
		b2.setForeground(Color.white);
		Label2.setForeground(Color.green);
		Label3.setForeground(Color.yellow);
		Label5.setForeground(Color.yellow);
		label_username.setForeground(Color.white);
		b2.setBackground(Color.gray);
		Button_ok.setBackground(Color.orange);
		Button_cancel.setBackground(Color.red);
		label_quizname.setFont(new Font("Algerian",Font.BOLD,50));
		label1.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,30));
		label11.setFont(new Font("Arial Rounded MT Bold",Font.PLAIN,30));
		b2.setFont(new Font("cooper",Font.BOLD,25));
		Button_ok.setFont(new Font("cooper",Font.BOLD,25));
		Button_cancel.setFont(new Font("cooper",Font.BOLD,25));
		Label3.setFont(new Font("Gill Sans",Font.BOLD,30));
		Label5.setFont(new Font("casteller",Font.BOLD,30));
		Label2.setFont(new Font("Century Schoolbook",Font.BOLD,30));
		label_username.setFont(new Font("casteller",Font.BOLD,30));
		tf_username.setFont(new Font("casteller",Font.BOLD,20));
		f.add(label_quizname);
		f.add(label1);
		f.add(label11);
		f.add(b2);
		f.add(Label3);
		f.add(Label5);
		f.add(Label2);
		f.add(label_username);
		f.add(tf_username);
		f.add(Button_ok);
		f.add(Button_cancel);
		Button_ok.addActionListener(this);
		Button_cancel.addActionListener(this);
	}
	public void actionPerformed(ActionEvent eef)
	{
		if(eef.getSource().equals(Button_ok))
		{
			String s1=tf_username.getText();
			f.setVisible(false);
			new Page1(f,s1);
		}
		else
		{
			f.setVisible(false);
		}
	}
	public static void main(String[] args)  
	{
		new Quiz();
	}
}

class Page1 implements ActionListener
{
	int m=0;
	JFrame f1,p;
	JRadioButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10;
	JLabel l1;
	JButton b11;
	String ss1,ss2;
	Page1 (JFrame f,String s1)  
	{
		ButtonGroup g11=new ButtonGroup();
		f1=f;
		ss1=s1;
		p=new JFrame("QUESTIONS PAGE ");
		String pic=new String("C:\\Users\\Sanjeev\\Downloads\\Neon Lines.jpg");
		//This is the image, I stored in that directory in my machine
		new Image_Attach(p,pic);
		p.setVisible(true);
		p.setSize(1920,1080);
		//p.setLayout(new FlowLayout(FlowLayout.CENTER,400,50));
		b1=new JRadioButton("Question 1");
		b1.setOpaque(false);
		b2=new JRadioButton("Question 2");
		b2.setOpaque(false);
		b3=new JRadioButton("Question 3");
		b3.setOpaque(false);
		b4=new JRadioButton("Question 4");
		b4.setOpaque(false);
		b5=new JRadioButton("Question 5");
		b5.setOpaque(false);
		b6=new JRadioButton("Question 6");
		b6.setOpaque(false);
		b7=new JRadioButton("Question 7");
		b7.setOpaque(false);
		b8=new JRadioButton("Question 8");
		b8.setOpaque(false);
		b9=new JRadioButton("Question 9");
		b9.setOpaque(false);
		b10=new JRadioButton("Question 10");
		b10.setOpaque(false);
		l1=new JLabel("Good Luck !!! You can proceed.");
		l1.setFont(new Font("cooper",Font.BOLD,50));
		b11=new JButton("SAVE and COMPLETE");
		l1.setBounds(616,60,1000,55);
		b1.setBounds(430,220,300,35);
		b2.setBounds(1270,220,300,35);
		b3.setBounds(430,350,300,35);
		b4.setBounds(1270,350,300,35);
		b5.setBounds(430,480,300,35);
		b6.setBounds(1270,480,300,35);
		b7.setBounds(430,610,300,35);
		b8.setBounds(1270,610,300,35);
		b9.setBounds(430,740,300,35);
		b10.setBounds(1270,740,300,35);
		b11.setBounds(745,850,440,55);
		g11.add(b1);
		g11.add(b2);
		g11.add(b3);
		g11.add(b4);
		g11.add(b5);
		g11.add(b6);
		g11.add(b7);
		g11.add(b8);
		g11.add(b9);
		g11.add(b10);
		l1.setForeground(Color.white);
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		b4.setForeground(Color.white);
		b5.setForeground(Color.white);
		b6.setForeground(Color.white);
		b7.setForeground(Color.white);
		b8.setForeground(Color.white);
		b9.setForeground(Color.white);
		b10.setForeground(Color.white);
		b11.setForeground(Color.black);
		b11.setFont(new Font("Helvetica",Font.BOLD,35));
		b1.setFont(new Font("Palatino",Font.BOLD,35));
		b2.setFont(new Font("Palatino",Font.BOLD,35));
		b3.setFont(new Font("Palatino",Font.BOLD,35));
		b4.setFont(new Font("Palatino",Font.BOLD,35));
		b5.setFont(new Font("Palatino",Font.BOLD,35));
		b6.setFont(new Font("Palatino",Font.BOLD,35));
		b7.setFont(new Font("Palatino",Font.BOLD,35));
		b8.setFont(new Font("Palatino",Font.BOLD,35));
		b9.setFont(new Font("Palatino",Font.BOLD,35));
		b10.setFont(new Font("Palatino",Font.BOLD,35));
		p.add(l1);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(b11);
		b11.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		p.setVisible(false);
		if(ae.getSource().equals(b1))
		{
			new Q1(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b2))
		{
			new Q2(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b3))
		{
			new Q3(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b4))
		{
			new Q4(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b5))
		{
			new Q5(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b6))
		{
			new Q6(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b7))
		{
			new Q7(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b8))
		{
			new Q8(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b9))
		{
			new Q9(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b10))
		{	
			new Q10(p,m,f1,ss1);
		}
		if(ae.getSource().equals(b11))
		{
			JOptionPane.showMessageDialog(null,"That's Great. You are done with the quiz...");
			new FinalPage(ss1,m);
		}
	}
	public void marks(int m1)
	{
		m=m+m1;
	}
}

class Q1 extends QuestionPageFormat implements ActionListener
{
	Q1(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 1");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("1.Where is RAM located?");
		b1=new JRadioButton("Exception Board");
		b1.setOpaque(false);
		b2=new JRadioButton("External Drive");
		b2.setOpaque(false);
		b3=new JRadioButton("Mother Board");
		b3.setOpaque(false);
		b4=new JRadioButton("None of the above");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		super.PageFormat();
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b3.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}

class Q2 extends QuestionPageFormat implements ActionListener
{
	Q2(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 2");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("2.Computers in a networking system is ");
		JLabel l12=new JLabel("known as");
		l12.setBounds(595,323,1400,50);
		l12.setFont(new Font("Verdana",Font.BOLD,43));
		l12.setForeground(Color.white);
		b1=new JRadioButton("Systems");
		b1.setOpaque(false);
		b2=new JRadioButton("Nodes");
		b2.setOpaque(false);
		b3=new JRadioButton("Hubs");
		b3.setOpaque(false);
		b4=new JRadioButton("Servers");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		super.PageFormat();
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(l12);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b2.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}

class Q3 extends QuestionPageFormat implements ActionListener
{
	Q3(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 3");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("3.Which Cable provides highest bandwidth ");
		JLabel l12= new JLabel("and faster transmission rate");
		l12.setBounds(595,323,1400,50);
		l12.setFont(new Font("Verdana",Font.BOLD,43));
		l12.setForeground(Color.white);
		b1=new JRadioButton("Fibre optic cable");
		b1.setOpaque(false);
		b2=new JRadioButton("Coaxial cable");
		b2.setOpaque(false);
		b3=new JRadioButton("Twisted pair cable");
		b3.setOpaque(false);
		b4=new JRadioButton("UTP cable");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		super.PageFormat();
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(l12);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b1.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}
class Q4 extends QuestionPageFormat implements ActionListener
{
	Q4(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 4");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("4.Which Protocol is used to assign ");
		JLabel l12=new JLabel(" IP address automatically?");
		l12.setBounds(595,323,1400,50);
		l12.setFont(new Font("Verdana",Font.BOLD,43));
		l12.setForeground(Color.white);
		b1=new JRadioButton("Windows Internet Name Service");
		b1.setOpaque(false);
		b2=new JRadioButton("Simple Mail Transfer Protocol");
		b2.setOpaque(false);
		b3=new JRadioButton("Dynamic Host Configuration Protocol");
		b3.setOpaque(false);
		b4=new JRadioButton("NetBIOS");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		super.PageFormat();
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(l12);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b3.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}
class Q5 extends QuestionPageFormat implements ActionListener
{
	Q5(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 5");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("5.Computer program that manages computer");
		JLabel l12=new JLabel("hardware resources is known as ");
		l12.setBounds(595,323,1400,50);
		l12.setFont(new Font("Verdana",Font.BOLD,43));
		l12.setForeground(Color.white);
		b1=new JRadioButton("Memory manager");
		b1.setOpaque(false);
		b2=new JRadioButton("DB Management System");
		b2.setOpaque(false);
		b3=new JRadioButton("System software");
		b3.setOpaque(false);
		b4=new JRadioButton("Operating System");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		super.PageFormat();
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(l12);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b4.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}
class Q6 extends QuestionPageFormat implements ActionListener
{
	Q6(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 6");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("6.Which device is used for controlling ");
		JLabel l12=new JLabel("network security and external access");
		l12.setBounds(595,323,1400,50);
		l12.setFont(new Font("Verdana",Font.BOLD,43));
		l12.setForeground(Color.white);
		b1=new JRadioButton("Firewalls");
		b1.setOpaque(false);
		b2=new JRadioButton("Routers");
		b2.setOpaque(false);
		b3=new JRadioButton("Modem");
		b3.setOpaque(false);
		b4=new JRadioButton("Switch");
		b4.setOpaque(false);
		b5=new JButton("Save and Next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		super.PageFormat();
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(l12);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b1.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}
class Q7 extends QuestionPageFormat implements ActionListener
{
	Q7(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 7");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("7.What is the use of Parity bits ");
		b1=new JRadioButton("Encryption of data");
		b1.setOpaque(false);
		b2=new JRadioButton("To identify the user");
		b2.setOpaque(false);
		b3=new JRadioButton("To transmit faster");
		b3.setOpaque(false);
		b4=new JRadioButton("To detect errors");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		super.PageFormat();
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b4.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}
class Q8 extends QuestionPageFormat implements ActionListener
{
	Q8(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 8");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("8.How are the sequence of letters can be ");
		JLabel l12=new JLabel("rearranged in cryptography");
		l12.setBounds(595,323,1400,50);
		l12.setFont(new Font("Verdana",Font.BOLD,43));
		l12.setForeground(Color.white);
		b1=new JRadioButton("Substitution ciphers");
		b1.setOpaque(false);
		b2=new JRadioButton("Caesar ciphers");
		b2.setOpaque(false);
		b3=new JRadioButton("Transposition ciphers");
		b3.setOpaque(false);
		b4=new JRadioButton("Both a and c");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		super.PageFormat();
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(l12);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b3.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}
class Q9 extends QuestionPageFormat implements ActionListener
{
	Q9(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 9");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("9.Cookies were originally designed for ");
		b1=new JRadioButton("Client side programming");
		b1.setOpaque(false);
		b2=new JRadioButton("Server side programming");
		b2.setOpaque(false);
		b3=new JRadioButton("Socket Programming");
		b3.setOpaque(false);
		b4=new JRadioButton("Both a and b");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		super.PageFormat();
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b2.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}
class Q10 extends QuestionPageFormat implements ActionListener
{
	Q10(JFrame f,int m,JFrame f1,String ss1)  
	{
		m1=m;
		f2=f;
		String_1=ss1;
		q=new JFrame("QUESTION 10");
		ButtonGroup j=new ButtonGroup();
		l1=new JLabel("10.Typical speed of current SuperComputers is ");
		JLabel l12=new JLabel("measured in");
		l12.setBounds(605,323,1400,50);
		l12.setFont(new Font("Verdana",Font.BOLD,43));
		l12.setForeground(Color.white);
		b1=new JRadioButton("Petaflops");
		b1.setOpaque(false);
		b2=new JRadioButton("GigaHertz");
		b2.setOpaque(false);
		b3=new JRadioButton("MIPS");
		b3.setOpaque(false);
		b4=new JRadioButton("None of the above");
		b4.setOpaque(false);
		b5=new JButton("Save and next");
		String pic2=new String("C:\\Users\\Sanjeev\\Downloads\\Question Templ.jpg");
		new Image_Attach(q,pic2);
		q.setVisible(true);
		q.setSize(2000,2000);
		//q.setLayout(new FlowLayout(FlowLayout.CENTER,2000,20));
		super.PageFormat();
		j.add(b1);
		j.add(b2);
		j.add(b3);
		j.add(b4);
		q.add(l1);
		q.add(l12);
		q.add(b1);
		q.add(b2);
		q.add(b3);
		q.add(b4);
		q.add(b5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource().equals(b5))
		{
			if(b1.isSelected())
				m1=m1+10;
			q.setVisible(false);
			Page1 k=new Page1(f2,String_1);
			k.marks(m1);
		}
	}
}

class FinalPage extends QuestionPageFormat
{
	JFrame f;
	JLabel ll1,ll2,ll3,ll4,ll5,ll6;
	
	FinalPage(String sss1,int m)
	{
		f =new JFrame("QUIZ RESULT ");
		String pic=new String("C:\\Users\\Sanjeev\\Downloads\\Neon Tunnel.png");
		// This is the image, I stored in that directory in my machine
		new Image_Attach(f,pic);
		f.setVisible(true);
		f.setSize(2000,2000);
		ll1=new JLabel(" "+m);
		if(m>=100)
			ll2=new JLabel("And that's a Bulls Eye");
		else if((m>=90)&&(m<100))
			ll2=new JLabel("Marvellous");
		else if((m<90)&&(m>=70))
			ll2=new JLabel("Impressive");
		else if((m<70)&&(m>=50))
			ll2=new JLabel("Well- Done");
		else if((m<50)&&(m>=40))
			ll2=new JLabel("Satisfactory");
		else 
			ll2=new JLabel("Lotta way to go...");
		ll3=new JLabel("Congratulations to you "+sss1+"!!!!! You Scored "+m+" points in the Quiz ... ");
		ll4=new JLabel("Thanks for attending the QUIZZOPHILES ASSEMBLE Quiz page. ");
		ll5=new JLabel("Hoping to see you next time !!!!");
		ll6=new JLabel("And Don't Forget to share it with your friends and other people.... Why should they miss all the fun *hehe*");
		ll1.setBounds(690,70,650,300);
		if(m>=100)
		{
			ll2.setBounds(620,400,1700,90);
		}
		else if(m<10)
		{
			ll2.setBounds(740,400,1700,90);
		}
		else
		{	
			ll2.setBounds(680,400,1700,90);
		}
		ll3.setBounds(460,590,1900,45);
		ll4.setBounds(500,730,1200,35);
		ll5.setBounds(710,790,650,40);
		ll6.setBounds(225,855,1900,40);
		ll1.setForeground(Color.white);
		ll2.setForeground(Color.white);
		ll3.setForeground(Color.white);
		ll4.setForeground(Color.white);
		ll5.setForeground(Color.white);
		ll6.setForeground(Color.white);
		ll1.setFont(new Font("Britannic Bold",Font.BOLD,280));
		ll2.setFont(new Font("Berlin Sans FB Demi",Font.BOLD,80));
		ll3.setFont(new Font("Cascadia Code SemiBold",Font.BOLD,35));
		ll4.setFont(new Font("Arial Black",Font.BOLD,25));
		ll5.setFont(new Font("Arial Black",Font.BOLD,25));
		ll6.setFont(new Font("Arial Black",Font.BOLD,25));
		f.add(ll1);
		f.add(ll2);
		f.add(ll3);
		f.add(ll4);
		f.add(ll5);
		f.add(ll6);
	}
}