package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class AdminLogin extends JFrame {

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
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 613, 407);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelimage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/CarLogo.jpg.jpg")).getImage();
		labelimage.setIcon(new ImageIcon(img));
		labelimage.setBounds(21, 0, 229, 189);
		contentPane.add(labelimage);
		
		JLabel lblNewLabel_1 = new JLabel("Username :");
		lblNewLabel_1.setBounds(188, 263, 81, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password :");
		lblNewLabel_2.setBounds(188, 294, 65, 14);
		contentPane.add(lblNewLabel_2);
		
		usernametxt = new JTextField();
		usernametxt.setColumns(10);
		usernametxt.setBounds(279, 260, 149, 20);
		contentPane.add(usernametxt);
		
		passwordtxt = new JTextField();
		passwordtxt.setColumns(10);
		passwordtxt.setBounds(279, 291, 149, 20);
		contentPane.add(passwordtxt);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.PLAIN, 27));
		lblNewLabel_3.setBounds(314, 129, 96, 58);
		contentPane.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage page=new Mainpage();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_1.setBounds(423, 22, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File myobj = new File ("Admin.txt");
				Scanner sc = null; 
				String username =usernametxt.getText();
				String password =passwordtxt.getText();
				JFrame f;
				JFrame f1; 
				
				
				try {
					 sc = new Scanner(myobj);
						
					} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
					}
				
				
				while (sc.hasNext()) {
					
					String username1 = sc.next();
					String password1 = sc.next();
					
					


					if ( username1.equals(username) && password1.equals(password)) 
					{    
						f=new JFrame();  
				    JOptionPane.showMessageDialog(f,"Login successfull !");  
						
				    
		            DirectoryPage page=new DirectoryPage();
		            page.setVisible(true);
		            dispose();
				    
				   
						}
					
					
					else {  f1=new JFrame();  
				    JOptionPane.showMessageDialog(f1,"Invalid username or password !");
				    
					}
						}
				
			}
			
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBounds(322, 333, 71, 23);
		contentPane.add(btnNewButton);
	}

}
