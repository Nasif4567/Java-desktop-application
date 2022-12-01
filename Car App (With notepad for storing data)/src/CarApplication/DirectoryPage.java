package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class DirectoryPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DirectoryPage frame = new DirectoryPage();
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
	public DirectoryPage() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 420, 357);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Manage customers");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerManageDirectory page=new CustomerManageDirectory();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton.setBounds(46, 95, 159, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Manage cars");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarManageDirectory page=new CarManageDirectory();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_1.setBounds(46, 151, 159, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("View rented cars and Update to returned cars ");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UpdateRentedCars page=new UpdateRentedCars();
	            page.setVisible(true);
	            dispose();
                
				File myobj = new File ("Cars.txt");
				
                UpdateRentedCars.textArea.setText("");
				String n = UpdateRentedCars.textArea.getText(); 
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
				String cn = y.next(); 
				String cm = y.next();
				String cnum = y.next();
				String ctype = y.next();
				String cstype = y.next();
				String crnprice = y.next();
				String caravail = y.next();
				
				
				if (caravail.equals("No"))  {
				
					UpdateRentedCars.textArea.append("\n"+ ID +"         "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice);
				
				}
				
				
				}
				y.close();
			}
		});
		btnNewButton_3.setBounds(46, 195, 306, 37);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Billing");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewBilling page=new ViewBilling();
	           
	            

	            
	            
				File myobj1 = new File ("Payment.txt");
				
				
				Scanner y = null;
				
				try {
					y= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
				
				while (y.hasNext()) {
					
					    String seriel = y.next();
						String RecieptID = y.next();
						String cai = y.next();
						String cn = y.next(); 
						String cm = y.next();
						String cnum = y.next();
						String ctype = y.next();
						String cstype = y.next();
						String crnprice = y.next();
						String bds = y.next();
						String date1 = y.next();
						String custn = y.next();
						String custi = y.next();
						
					
					
					
					 
						page.textArea.append("\n"+ RecieptID +"      "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice+ "   "+bds+"   "+date1+"   "+custn+"   "+custi );
						 
						 
						
						
					 
					    page.setVisible(true);
			            dispose();
			            
			            
			          
			            
					 
					 
					 
						 
						 
					 }
					 
				
				y.close();
				
			}
		});
		btnNewButton_4.setBounds(46, 256, 156, 23);
		contentPane.add(btnNewButton_4);
		
		JLabel lblNewLabel = new JLabel("Hi ADMIN !");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(46, 24, 110, 23);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton_5 = new JButton("Logout");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Mainpage page=new Mainpage();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_5.setBounds(279, 27, 89, 23);
		contentPane.add(btnNewButton_5);
	}
}
