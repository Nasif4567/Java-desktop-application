import java.awt.BorderLayout;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.BoxLayout;
import javax.swing.Icon;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField usernametxt;
	private JPasswordField passwordtxt;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 905, 507);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(0, 102, 153));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		//setUndecorated(true);
	
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(41, 73, 339, 293);
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(435, 0, 470, 474);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Admin Login ");
		lblNewLabel_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 25));
		lblNewLabel_1.setBounds(191, 22, 162, 61);
		panel.add(lblNewLabel_1);
		
		usernametxt = new JTextField();
		usernametxt.setBounds(122, 180, 268, 28);
		panel.add(usernametxt);
		usernametxt.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Username : ");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2.setForeground(new Color(0, 51, 51));
		lblNewLabel_2.setBounds(122, 163, 149, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Password :");
		lblNewLabel_2_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_2_1.setForeground(new Color(0, 51, 102));
		lblNewLabel_2_1.setBounds(122, 258, 149, 14);
		panel.add(lblNewLabel_2_1);
		
		JButton btnNewButton = new JButton("Login ");
		btnNewButton.setBorderPainted(false);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File myobj = new File ("Admin.txt"); // it will read the file which already exists in the systems's file 
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
					
					


					if (!usernametxt.getText().equals("") && !usernametxt.getText().equals("") && username1.equals(username) && password1.equals(password)) 
					{    
						f=new JFrame();  
				    JOptionPane.showMessageDialog(f,"Login successfull !");  
						
				    
		            AdminDashboard page=new AdminDashboard();
		            page.setVisible(true);
		            dispose();
				    
				   
						}
					
					
					else {  f1=new JFrame();  
				    JOptionPane.showMessageDialog(f1,"Invalid username or password !");
				    
					}
						}//------------end if while 
				
				
				
				
			}	
				
				
				
				
				
			
		});
		btnNewButton.setBackground(new Color(47, 79, 79));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(128, 359, 262, 41);
		panel.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Terms and policy");
		lblNewLabel_3.setFont(new Font("Book Antiqua", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(216, 440, 147, 23);
		panel.add(lblNewLabel_3);
		
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnNewButton_1.setBorderPainted(false);
		
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectionPage p = new DirectionPage();
				p.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(102, 153, 102));
		btnNewButton_1.setBounds(0, 0, 90, 23);
		panel.add(btnNewButton_1);
		
		passwordtxt = new JPasswordField();
		passwordtxt.setBounds(122, 274, 268, 28);
		panel.add(passwordtxt);
		
		
		
		
	}
}
