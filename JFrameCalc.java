package calc;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JFrameCalc extends JFrame{
	
	
	int a;
	int b;
	char c;
	double g;
	calc obj = new calc();
	
	JFrameCalc(){
		setSize(400,400);//super(400,400);
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		
		
		JTextField tf = new JTextField();
		tf.setBounds(50, 50, 300, 30);
		tf.setHorizontalAlignment(tf.RIGHT);
		
		
		
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b0 = new JButton("0");
		b1.setBounds(50, 90, 50, 30);
		b2.setBounds(110, 90, 50, 30);
		b3.setBounds(170, 90, 50, 30);
		b4.setBounds(50, 130, 50, 30);
		b5.setBounds(110, 130, 50, 30);
		b6.setBounds(170, 130, 50, 30);
		b7.setBounds(50, 170, 50, 30);
		b8.setBounds(110, 170, 50, 30);
		b9.setBounds(170, 170, 50, 30);
		b0.setBounds(110, 210, 50, 30);
		
		JButton plus = new JButton("+");
		JButton minus = new JButton("-");
		JButton kobeitu = new JButton("*");
		JButton bolu = new JButton("/");
		JButton equal = new JButton("=");
		plus.setBounds(300, 90, 50, 30);
		minus.setBounds(300, 130, 50, 30);
		kobeitu.setBounds(300, 170, 50, 30);
		bolu.setBounds(300, 210, 50, 30);
		equal.setBounds(300, 250, 50, 30);
		
		
		
		JButton plus_minus = new JButton("+/-");
		JButton fac = new JButton("!");
		JButton koren = new JButton("sqrt");
		JButton square = new JButton("^2");
		JButton stepen = new JButton("^n");
		JButton C = new JButton("C");
		JButton AC = new JButton("AC");
		plus_minus.setBounds(50, 210, 50, 30);
		fac.setBounds(240, 130, 50, 30);
		koren.setBounds(170, 210, 57, 30);
		square.setBounds(240, 170, 50, 30);
		stepen.setBounds(240, 210, 50, 30);
		C.setBounds(240, 90, 50, 30);
		
		
		
		
		
		
		
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"1");
				
			}
		});
		
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"2");
				
			}
		});
		
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"3");
				
			}
		});
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"4");
				
			}
		});
		b5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"5");
				
			}
		});
		
		b6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"6");
				
			}
		});
		
		b7.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"7");
				
			}
		});
		
		b8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"8");
				
			}
		});
		b9.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"9");
				
			}
		});
		
		b0.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tf.getText().length()<10)
					tf.setText(tf.getText()+"0");
				
			}
		});
		
		
		
		
		
		plus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '+';
			}
		});
		
		minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '-';
			}
		});
		kobeitu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '*';
			}
		});
		
		bolu.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '/';
			}
		});
		
		
		plus_minus.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				a=a*(-1);
	
				
				tf.setText(""+a);
				c = 'P';
			}
		});
		fac.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '!';
			}
		});
		koren.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = 's';
			}
		});
		square.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = 'k';
			}
		});
		stepen.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = '^';
			}
		});
		
		C.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				a = Integer.parseInt(tf.getText());
				tf.setText("");
				c = ' ';
			}
		});
		
		
		
		equal.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(c=='+' || c=='-' || c=='*' || c=='/' || c=='^' ) {
				b = Integer.parseInt(tf.getText());
				if(c=='+')
					tf.setText((int)obj.plus(a, b)+"");
				if(c=='-')
					tf.setText((int)obj.minus(a, b)+"");
				if(c=='*')
					tf.setText((int)obj.kobeitu(a, b)+"");
				if(c=='/')
					tf.setText((int)obj.bolu(a, b)+"");
				if(c=='^')
					tf.setText((int)obj.stepen(a, b)+"");
				c=' ';
				a=0;
				b=0;
				}	
				
				//if(c=='P')
					//tf.setText((int)obj.plus_minus(a)+"");
				if(c=='!')
					tf.setText((int)obj.fac(a)+"");
				if(c=='s')
					tf.setText((int)obj.koren(a)+"");
				if(c=='k')
					tf.setText((int)obj.square(a)+"");
			
				c=' ';
				a=0;
				b=0;
				}			
		});
		
		
		
		
		
		
		
		
		add(tf);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b0);
		add(plus);
		add(minus);
		add(kobeitu);
		add(bolu);
		add(equal);
		add(plus_minus);
		add(fac);
		add(koren);
		add(square);
		add(stepen);
		add(C);
		
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JFrameCalc();
	}

}
