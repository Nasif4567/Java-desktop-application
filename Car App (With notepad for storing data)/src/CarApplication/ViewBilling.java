package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import java.awt.TextArea;
import java.awt.Label;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import com.toedter.calendar.JDateChooser;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class ViewBilling extends JFrame {

	private JPanel contentPane;
	TextArea textArea;
	JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewBilling frame = new ViewBilling();
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
	public ViewBilling() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 878, 498);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectoryPage page=new DirectoryPage();
	            page.setVisible(true);
	            dispose();
			}
		});
		button.setBounds(583, 10, 70, 22);
		contentPane.add(button);
		
		 textArea = new TextArea();
		 textArea.setEditable(false);
		textArea.setBounds(103, 140, 435, 260);
		contentPane.add(textArea);
		
		JLabel lblNewLabel = new JLabel("Billings");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.PLAIN, 17));
		lblNewLabel.setBounds(312, 18, 158, 29);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("View ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
               textArea.setText("");
               
               SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			String Bdate = sdf.format(dateChooser.getDate());

	            
	            
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
						
					
					if (Bdate.equals(date1)) {
					
					 
						textArea.append("\n"+ RecieptID +"      "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice+ "   "+bds+"   "+date1+"   "+custn+"   "+custi );
						 
			            
			          
			            
					 
					}
					 
						 
						 
					 }
					 
				
				y.close();
			}
		});
		btnNewButton.setBounds(278, 80, 89, 23);
		contentPane.add(btnNewButton);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(106, 83, 146, 20);
		contentPane.add(dateChooser);
		
		JLabel lblNewLabel_1 = new JLabel("Choose the specific you want to view : ");
		lblNewLabel_1.setBounds(28, 58, 235, 14);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("Back to View all dates billing");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
	           
	            textArea.setText("");

	            
	            
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
						
					
					
					
					 
						textArea.append("\n"+ RecieptID +"      "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice+ "   "+bds+"   "+date1+"   "+custn+"   "+custi );
						 
			            
			          
			            
					 
					 
					 
						 
						 
					 }
					 
				
				y.close();
			}
		});
		btnNewButton_1.setBounds(418, 80, 271, 23);
		contentPane.add(btnNewButton_1);
		
		
		JButton btnNewButton_4 = new JButton("Billing");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		
	}
}
