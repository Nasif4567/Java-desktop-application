package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Label;
import java.awt.Font;
import java.awt.TextField;
import java.awt.Choice;
import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class CustomerRegistration extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerRegistration frame = new CustomerRegistration();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CustomerRegistration() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 150, 1071, 515);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("Register a customer");
		label.setFont(new Font("Dialog", Font.PLAIN, 22));
		label.setBounds(275, 31, 217, 34);
		contentPane.add(label);
		
		Label label_1 = new Label("First name :");
		label_1.setBounds(133, 153, 62, 22);
		contentPane.add(label_1);
		
		TextField fnametxt = new TextField();
		fnametxt.setBounds(194, 183, 135, 22);
		contentPane.add(fnametxt);
		
		Label label_2 = new Label("Last name :");
		label_2.setBounds(133, 211, 62, 22);
		contentPane.add(label_2);
		
		TextField lnametxt = new TextField();
		lnametxt.setBounds(194, 232, 135, 22);
		contentPane.add(lnametxt);
		
		Label label_3 = new Label("Gender :");
		label_3.setBounds(133, 266, 62, 22);
		contentPane.add(label_3);
		
		Choice gendercombo = new Choice();
		
		gendercombo.add("Male");  
        gendercombo.add("Female");
		gendercombo.setBounds(183, 294, 135, 20);
		contentPane.add(gendercombo);
		
		Label label_4 = new Label("Date of birth :");
		label_4.setBounds(117, 343, 78, 22);
		contentPane.add(label_4);
		
		Date today = new Date();
		JDateChooser dobtxt = new JDateChooser(today);
		dobtxt.setBounds(154, 371, 172, 20);
		contentPane.add(dobtxt);
		
		Label label_5 = new Label("Phone No. ");
		label_5.setBounds(446, 142, 62, 22);
		contentPane.add(label_5);
		
		TextField phonetxt = new TextField();
		phonetxt.setBounds(469, 170, 135, 22);
		contentPane.add(phonetxt);
		
		Label label_6 = new Label("Email :");
		label_6.setBounds(446, 211, 62, 22);
		contentPane.add(label_6);
		
		TextField emailtxt = new TextField();
		emailtxt.setBounds(469, 239, 155, 22);
		contentPane.add(emailtxt);
		
		Label label_7 = new Label("Username :");
		label_7.setBounds(446, 274, 62, 22);
		contentPane.add(label_7);
		
		TextField usernametxt = new TextField();
		usernametxt.setBounds(482, 303, 155, 22);
		contentPane.add(usernametxt);
		
		Label label_8 = new Label("Password :");
		label_8.setBounds(446, 331, 62, 22);
		contentPane.add(label_8);
		
		TextField passwordtxt = new TextField();
		passwordtxt.setBounds(504, 359, 155, 22);
		contentPane.add(passwordtxt);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fname = fnametxt.getText();
				String lname = lnametxt.getText();
				String gender = gendercombo.getSelectedItem().toString();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String dob = sdf.format(dobtxt.getDate());
				String email = emailtxt.getText();
				String password = passwordtxt.getText();
				String username = usernametxt.getText();
				String phone = phonetxt.getText();
				JFrame f7;
				
				
				int max = 0;
				
				Scanner y = null;
				try{
				y = new Scanner(new File("Registration.txt"));
				while(y.hasNext())
				{	
				int seriel = y.nextInt();	
				String ID = y.next(); 
				String Fname = y.next(); 
				String Lname = y.next();
				String Gender = y.next();
				String Dob = y.next();
				String Email = y.next();
				String Phone = y.next();
				String Username = y.next();
				String Password = y.next();
				
				
			
				max = seriel;
				
				}
				y.close();
				}
				
				
				catch(Exception e1)
				
				
				{
					
				e1.printStackTrace();
				
				}
				
				
				Formatter x = null;
				try{
				
					if ( !fname.equals("") && !lname.equals("") && !phone.equals("") && !email.equals("") && !username.equals("") && !password.equals("") ) {
					
				FileWriter file = new FileWriter("Registration.txt", true);
				x = new Formatter(file);
				x.format("%d CUS%s %s %s %s %s %s %s %s %s%n%n",++max,max,fname,lname,gender,dob,email,phone,username,password); 
				
				  f7 =new JFrame(); 
				 JOptionPane.showMessageDialog(f7,"Registration successfull");
				 x.close();
				 
				 fnametxt.setText("");
				 lnametxt.setText("");
				 phonetxt.setText("");
				 emailtxt.setText("");
				 usernametxt.setText("");
				 passwordtxt.setText("");
				 
				}
				
					else {
						f7 =new JFrame(); 
						 JOptionPane.showMessageDialog(f7,"Please fill up the form");
						
					}
				
				 
				
				
				}
				
				
				
				catch(Exception e2)
				{
					 f7=new JFrame(); 
					 JOptionPane.showMessageDialog(f7," Sorry Registration unsuccessful !");
				}
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(366, 416, 89, 23);
		contentPane.add(btnNewButton);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(665, 65, 380, 353);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Customer data");
		lblNewLabel.setBounds(665, 45, 95, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  File myobj = new File ("Registration.txt");
					
	                textArea.setText("");
					String n = textArea.getText(); 
					;
					Scanner y = null ;
					
					try {
						 y = new Scanner(myobj);
							
						} catch (FileNotFoundException e1) {
							
							e1.printStackTrace();
						}
					
					while(y.hasNext())
					{
					
				    String seriel = y.next();
					String ID = y.next(); 
					String fn = y.next(); 
					String lm = y.next();
					String g = y.next();
					String d = y.next();
					String em = y.next();
					String nu = y.next();
					String us = y.next();
					String pas = y.next();
					
					
					
					
					textArea.append("\n"+ ID +"         "+ fn +"     "+ lm +"     "+ g +"     "+ d +"     "+ em +"     "+ nu +"     "+us+"     "+pas );
					
					
					
					
					}
					y.close();
			}
		});
		btnNewButton_1.setBounds(675, 428, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Back");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerManageDirectory page = new CustomerManageDirectory();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_2.setBounds(897, 11, 89, 23);
		contentPane.add(btnNewButton_2);
	}
}
