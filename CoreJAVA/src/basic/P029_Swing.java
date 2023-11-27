package basic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

class SwingDemo implements ActionListener{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2,b3,b4;
	public SwingDemo() {
		JFrame fr = new JFrame("MyApp");
		fr.setVisible(true);
		fr.setSize(700, 500);
		fr.setLayout(null);
		
		l1 = new JLabel("Id : ");
		l1.setBounds(100, 100, 120, 20);
		fr.add(l1);
		l2 = new JLabel("Name : ");
		l2.setBounds(100, 130, 120, 20);
		fr.add(l2);
		l3 = new JLabel("Contact : ");
		l3.setBounds(100, 160, 120, 20);
		fr.add(l3);
		l4 = new JLabel("Address : ");
		l4.setBounds(100, 190, 120, 20);
		fr.add(l4);
		l5 = new JLabel("Email : ");
		l5.setBounds(100, 220, 120, 20);
		fr.add(l5);
		
		t1 = new JTextField();
		t1.setBounds(200, 100, 120, 20);
		fr.add(t1);
		t2 = new JTextField();
		t2.setBounds(200, 130, 120, 20);
		fr.add(t2);
		t3 = new JTextField();
		t3.setBounds(200, 160, 120, 20);
		fr.add(t3);
		t4 = new JTextField();
		t4.setBounds(200, 190, 120, 20);
		fr.add(t4);
		t5 = new JTextField();
		t5.setBounds(200, 220, 120, 20);
		fr.add(t5);
		
		b1 = new JButton("Submit");
		b1.setBounds(100, 280, 120, 20);
		fr.add(b1);
		b2 = new JButton("Search");
		b2.setBounds(250, 280, 120, 20);
		fr.add(b2);
		b3 = new JButton("Update");
		b3.setBounds(100, 310, 120, 20);
		fr.add(b3);
		b4 = new JButton("Delete");
		b4.setBounds(250, 310, 120, 20);
		fr.add(b4);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			int id = Integer.parseInt(t1.getText());
			String name = t2.getText();
			long contact = Long.parseLong(t3.getText());
			String address = t4.getText();
			String email = t5.getText();
			System.out.println("submit button clicked");
			System.out.println(id);
			System.out.println(name);
			System.out.println(contact);
			System.out.println(address);
			System.out.println(email);
		}
		else if(e.getSource() == b2) {
			System.out.println("search button clicked");
		}
		else if(e.getSource() == b3) {
			System.out.println("update button clicked");
		}
		else if(e.getSource() == b4) {
			System.out.println("delete button clicked");
		}
	}
}
public class P029_Swing {
	public static void main(String[] args) {
		new SwingDemo();
	}
}
