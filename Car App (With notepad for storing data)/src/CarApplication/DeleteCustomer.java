package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class DeleteCustomer extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteCustomer frame = new DeleteCustomer();
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
	public DeleteCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 749, 456);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Delete Customers");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel.setBounds(15, -4, 285, 37);
		contentPane.add(lblNewLabel);
		
		TextField insertID = new TextField();
		insertID.setBounds(48, 363, 155, 22);
		contentPane.add(insertID);
		
		Button button = new Button("Delete");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String filepath = "Registration.txt";
				String removeTerm = insertID.getText();
				
				   String tempFile = "temp1.txt";
				   File oldFile = new File (filepath);
				   File newFile = new File (tempFile);
				   Scanner y = null ;
				   
				   
				   try { 
					   FileWriter fw = new FileWriter(tempFile , true);
					   BufferedWriter bw = new BufferedWriter(fw);
					   PrintWriter pw = new PrintWriter(bw);
					   y = new Scanner(new File(filepath));
					   
					   
				   
					   while(y.hasNext())
					   {
						    String  seriel = y.next();	
							String ID12 = y.next(); 
							String Fname = y.next(); 
							String Lname = y.next();
							String Gender = y.next();
							String Dob = y.next();
							String Email = y.next();
							String Phone = y.next();
							String Username = y.next();
							String Password = y.next();
							
							 if (!ID12.equals(removeTerm)) {
								   
								   pw.println(seriel+"    "+ID12+" "+Fname+" " +Lname+" " +Gender+" " + Dob+ " "+Email +" "+Phone+" "+ Username +" "+Password);
							   }
					   }
					   
					   y.close();
					   pw.flush();
					   pw.close();
					   oldFile.delete();
					   File dump = new File (filepath);
					   newFile.renameTo(dump);
					   
					   JFrame f;
					   f=new JFrame(); 
						 JOptionPane.showMessageDialog(f,"operation proceeded !");

					   
				   }
				   
                   catch (Exception e1 ) { 
					   
					   System.out.println("error") ;
				   }
				   
				   
			}
				   
				   
		
		});
		button.setBounds(230, 363, 70, 22);
		contentPane.add(button);
		
		
		
		TextArea textArea = new TextArea();
		textArea.setBounds(143, 66, 435, 203);
		contentPane.add(textArea);
		
		Button button_1 = new Button("Refresh");
		button_1.addActionListener(new ActionListener() {
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
		button_1.setBounds(508, 275, 70, 22);
		contentPane.add(button_1);
		
		Label label = new Label("Insert ID :");
		label.setForeground(Color.WHITE);
		label.setBounds(21, 333, 62, 22);
		contentPane.add(label);
		
		Button button_1_1 = new Button("Back");
		button_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerManageDirectory page = new CustomerManageDirectory();
	            page.setVisible(true);
	            dispose();
				
			}
		});
		button_1_1.setBounds(623, 11, 70, 22);
		contentPane.add(button_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("*Note* make sure you match the ID other wise the operation wont work");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(35, 275, 421, 14);
		contentPane.add(lblNewLabel_1);
		
		Label label_2 = new Label("The left side first word is the ID ex.\"CUS1\"");
		label_2.setBounds(230, 38, 233, 22);
		contentPane.add(label_2);
	}
}
