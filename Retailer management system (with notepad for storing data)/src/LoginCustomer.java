import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;



public class LoginCustomer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel inv;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginCustomer frame = new LoginCustomer();
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
	public LoginCustomer() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 777, 500);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setBounds(41, 73, 339, 293);
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		contentPane.setLayout(null);
		contentPane.setLayout(null);
		lblNewLabel.setIcon(new ImageIcon(img));
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 382, 461);
		panel.setBackground(new Color(255, 204, 204));
		contentPane.add(panel);
		
		JLabel lblNewLabel_1 = new JLabel("Customer Login");
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 26));
		lblNewLabel_1.setBounds(493, 11, 187, 61);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectionPage p = new DirectionPage();
				p.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(102, 153, 102));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBounds(382, 0, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("Username :");
		lblNewLabel_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		lblNewLabel_1_1.setBounds(493, 133, 187, 33);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Password :");
		lblNewLabel_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 18));
		lblNewLabel_1_1_1.setBounds(493, 214, 187, 33);
		contentPane.add(lblNewLabel_1_1_1);
		
		textField = new JTextField();
		textField.setBounds(493, 169, 195, 23);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(493, 251, 200, 23);
		contentPane.add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File myobj = new File ("CustomerRegistration.txt");
				Scanner sc = null; 
				
				String user = textField.getText();
				String pass = passwordField.getText();
				
				
				
				try {
					 sc = new Scanner(myobj);
						
					} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
					}
				
				
				while (sc.hasNext()) {
					
					String seriel = sc.next();	
					String ID = sc.next(); 
					String Fname = sc.next(); 
					String Lname = sc.next();
					String Gender = sc.next();
					String Dob = sc.next();
					String Email = sc.next();
					String State = sc.next();
					String City = sc.next();
					String Street = sc.next();
					String Phone = sc.next();
					String Username = sc.next();
					String Password = sc.next();
					


					if ( Username.equals(user) && Password.equals(pass) ) 
					{   
						sc.close();
						JFrame f;
						f=new JFrame();  
				        JOptionPane.showMessageDialog(f,"Login success"); 
				        
						
				    
		            CustomerDashboard page=new CustomerDashboard();
		            page.Name.setText(Fname);
		            page.idread.setText(ID);
		            page.setVisible(true);
		            
		            dispose(); 
		            
		            
		            
					}
					
					else {
						inv.setVisible(true);
						inv.setText("invalid username or password !");
						
					}//----------enf of if
					
					
					
					
					
					 }//-----------end of while 
				
				
				
				
				
			}
		});
		btnLogin.setForeground(Color.WHITE);
		btnLogin.setBackground(new Color(102, 153, 102));
		btnLogin.setBounds(493, 324, 195, 42);
		contentPane.add(btnLogin);
		
		inv = new JLabel("");
		inv.setVisible(false);
		inv.setBounds(493, 288, 187, 14);
		contentPane.add(inv);
	}
}
