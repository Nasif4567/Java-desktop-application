package CarApplication;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;
import java.awt.Label;

public class ResidentLogin extends JFrame {

	private JPanel contentPane;
	private JTextField usernametxt;
	private JTextField passwordtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResidentLogin frame = new ResidentLogin();
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
	public ResidentLogin() {
		setType(Type.UTILITY);
		setBackground(Color.WHITE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(450, 150, 700, 407);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelimage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/CarLogo.jpg.jpg")).getImage();
		labelimage.setIcon(new ImageIcon(img));
		labelimage.setBounds(10, 0, 229, 189);
		contentPane.add(labelimage);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File myobj = new File ("Registration.txt");
				Scanner sc = null; 
				String username =usernametxt.getText();
				String password =passwordtxt.getText();
				
				
				
				
				try {
					 sc = new Scanner(myobj);
						
					} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
					}
				
				
				while (sc.hasNext()) {
					
					String seriel = sc.next();
					String id = sc.next();
					String fname = sc.next();
					String lname = sc.next();
					String gender = sc.next();
					String dob = sc.next();
					String email = sc.next();
					String phone = sc.next();
					String user = sc.next();
					String pass = sc.next();
					


					if ( user.equals(username) && pass.equals(password)) 
					{   
						sc.close();
						JFrame f;
						f=new JFrame();  
				        JOptionPane.showMessageDialog(f,"Login successfull !");  
						
				    
		            AvailablePage page=new AvailablePage();
		            page.Name.setText(fname);
		            page.identity.setText(id);
		            page.setVisible(true);
		            
		            dispose(); 
		            
					}
					
					
					
					
					
					 }
				
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(268, 322, 71, 23);
		contentPane.add(btnNewButton);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(225, 249, 149, 20);
		contentPane.add(usernametxt);
		usernametxt.setColumns(10);
		
		passwordtxt = new JTextField();
		passwordtxt.setBounds(225, 280, 149, 20);
		contentPane.add(passwordtxt);
		passwordtxt.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setBounds(134, 252, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setBounds(134, 283, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(260, 118, 96, 58);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage page=new Mainpage();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_1.setBounds(369, 11, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("*Note* if the the system doesn't");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(432, 98, 211, 14);
		contentPane.add(lblNewLabel);
		
		Label label = new Label("login then the username or pass is invalid");
		label.setBounds(423, 117, 251, 22);
		contentPane.add(label);
	}
}
