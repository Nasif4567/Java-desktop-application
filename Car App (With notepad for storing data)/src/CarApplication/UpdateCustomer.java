package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Button;
import java.awt.Window.Type;

public class UpdateCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField gendertext;
	private JTextField dobtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCustomer frame = new UpdateCustomer();
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
	public UpdateCustomer() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 1076, 586);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel contentPane_1 = new JPanel();
		contentPane_1.setLayout(null);
		contentPane_1.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane_1.setBackground(new Color(255, 140, 0));
		contentPane_1.setBounds(10, 11, 668, 450);
		contentPane.add(contentPane_1);
		
		Label label = new Label("Update customer details");
		label.setFont(new Font("Dialog", Font.PLAIN, 22));
		label.setBounds(237, 24, 271, 34);
		contentPane_1.add(label);
		
		Label label_9 = new Label("ID :");
		label_9.setBounds(167, 98, 62, 22);
		contentPane_1.add(label_9);
		
		TextField idtxt = new TextField();
		idtxt.setBounds(195, 126, 95, 22);
		contentPane_1.add(idtxt);
		
		Label label_1 = new Label("First name :");
		label_1.setBounds(133, 153, 62, 22);
		contentPane_1.add(label_1);
		
		TextField fnametxt = new TextField();
		fnametxt.setEditable(false);
		fnametxt.setBounds(194, 183, 135, 22);
		contentPane_1.add(fnametxt);
		
		Label label_2 = new Label("Last name :");
		label_2.setBounds(133, 211, 62, 22);
		contentPane_1.add(label_2);
		
		TextField lnametxt = new TextField();
		lnametxt.setEditable(false);
		lnametxt.setBounds(194, 232, 135, 22);
		contentPane_1.add(lnametxt);
		
		Label label_3 = new Label("Gender :");
		label_3.setBounds(133, 266, 62, 22);
		contentPane_1.add(label_3);
		
		Label label_4 = new Label("Date of birth :");
		label_4.setBounds(117, 343, 78, 22);
		contentPane_1.add(label_4);
		
		Label label_5 = new Label("Phone No. ");
		label_5.setBounds(446, 142, 62, 22);
		contentPane_1.add(label_5);
		
		TextField phonetxt = new TextField();
		phonetxt.setBounds(469, 170, 163, 22);
		contentPane_1.add(phonetxt);
		
		Label label_6 = new Label("Email :");
		label_6.setBounds(446, 211, 62, 22);
		contentPane_1.add(label_6);
		
		TextField emailtxt = new TextField();
		emailtxt.setBounds(469, 239, 177, 22);
		contentPane_1.add(emailtxt);
		
		Label label_7 = new Label("Username :");
		label_7.setBounds(446, 274, 62, 22);
		contentPane_1.add(label_7);
		
		TextField usernametxt = new TextField();
		usernametxt.setBounds(482, 303, 177, 22);
		contentPane_1.add(usernametxt);
		
		Label label_8 = new Label("Password :");
		label_8.setBounds(446, 331, 62, 22);
		contentPane_1.add(label_8);
		
		TextField passwordtxt = new TextField();
		passwordtxt.setBounds(482, 369, 177, 22);
		contentPane_1.add(passwordtxt);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String fname = fnametxt.getText();
				String lname = lnametxt.getText();
				String gender = gendertext.getText();
				String dob = dobtxt.getText();
				String email = emailtxt.getText();
				String password = passwordtxt.getText();
				String username = usernametxt.getText();
				String phone = phonetxt.getText();
				
				
				 String filepath = "Registration.txt";
					String removeTerm = idtxt.getText();
			
					
					String tempFile = "temp.txt";
					   File oldFile = new File (filepath);
					   File newFile = new File (tempFile);
					   Scanner y = null;
					   try { 
						   FileWriter fw = new FileWriter(tempFile , true);
						   BufferedWriter bw = new BufferedWriter(fw);
						   PrintWriter pw = new PrintWriter(bw);
						   y = new Scanner(new File(filepath));
						   
						   
					   
						   while(y.hasNext())
							   
						   {
							  
							    String seriel = y.next();	
								String ID = y.next(); 
								String Fname = y.next(); 
								String Lname = y.next();
								String Gender = y.next();
								String Dob = y.next();
								String Email = y.next();
								String Phone = y.next();
								String Username = y.next();
								String Password = y.next();
								
							
							  
							   if (ID.equals(removeTerm)) {
								   
								   pw.println(seriel+" "+ ID +" "+fname+" " +lname+" " +gender+" " + dob+ " "+email +" "+phone+" "+username+" "+password);
								   
								   JFrame f;
								   f=new JFrame(); 
									 JOptionPane.showMessageDialog(f,"Updated !");
								   
								   
							   }
							   
							   else {  pw.println(seriel+" "+ID+" "+Fname+" " +Lname+" " +Gender+" " + Dob + " "+Email +" "+Phone+" "+Username+" "+Password); 
							   
							   }

						   }
						   
						   y.close();
						   pw.flush();
						   pw.close();
						   oldFile.delete();
						   File dump = new File (filepath);
						   newFile.renameTo(dump);
						  
						   
					}
					   
					   catch (Exception e1 ) { 
						   
						   System.out.println("error") ;
					   }
				
				
				
			}
		});
		btnNewButton.setBounds(366, 416, 89, 23);
		contentPane_1.add(btnNewButton);
		
		Label label_10 = new Label("Customer data");
		label_10.setBounds(690, 36, 95, 22);
		contentPane_1.add(label_10);
		
		JButton btnNewButton_1 = new JButton("Search");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File myobj1 = new File ("Registration.txt");
				String id = idtxt.getText();
				
				Scanner y = null;
				
				try {
					y= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
				
				while (y.hasNext()) {
					
					    String seriel = y.next();	
						String ID = y.next(); 
						String Fname = y.next(); 
						String Lname = y.next();
						String Gender = y.next();
						String Dob = y.next();
						String Email = y.next();
						String Phone = y.next();
						String Username = y.next();
						String Password = y.next();
						
					
					if (id.equals("") ) {
						JOptionPane.showMessageDialog(null, "Please enter the ID");
					}
					
					
					
					
					 if (ID.equals(id) )
						 
						{
						 
						fnametxt.setText(Fname);
						lnametxt.setText(Lname);
						gendertext.setText(Gender);
						dobtxt.setText(Dob);
					    emailtxt.setText(Email);
						phonetxt.setText(Phone);
						usernametxt.setText(Username);
						passwordtxt.setText(Password);
						
						}
					 
					 
					 
						 
						 
					 }
					 
				
				y.close();
			}
		});
		btnNewButton_1.setBounds(299, 125, 89, 23);
		contentPane_1.add(btnNewButton_1);
		
		gendertext = new JTextField();
		gendertext.setEditable(false);
		gendertext.setBounds(133, 294, 96, 20);
		contentPane_1.add(gendertext);
		gendertext.setColumns(10);
		
		dobtxt = new JTextField();
		dobtxt.setEditable(false);
		dobtxt.setBounds(127, 371, 135, 20);
		contentPane_1.add(dobtxt);
		dobtxt.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("*note* only the phone, email, username and pass can be updated other data are permanent");
		lblNewLabel.setBounds(82, 64, 550, 14);
		contentPane_1.add(lblNewLabel);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(698, 81, 352, 353);
		contentPane.add(textArea);
		
		Label label_11 = new Label("Customer data");
		label_11.setBounds(684, 53, 101, 22);
		contentPane.add(label_11);
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerManageDirectory page = new CustomerManageDirectory();
	            page.setVisible(true);
	            dispose();
				
			}
		});
		button.setBounds(927, 11, 70, 22);
		contentPane.add(button);
		
		JButton btnNewButton_2 = new JButton("Refresh");
		btnNewButton_2.addActionListener(new ActionListener() {
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
		btnNewButton_2.setBounds(728, 454, 89, 23);
		contentPane.add(btnNewButton_2);
		
		Label label_2_1 = new Label("The left side first word is the ID ex.\"CUS1\"");
		label_2_1.setBounds(802, 53, 248, 22);
		contentPane.add(label_2_1);
	}
}
