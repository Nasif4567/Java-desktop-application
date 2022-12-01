package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class RecieptPage extends JFrame {
	
	JLabel date;
	JLabel carid;
	JLabel carname;
	JLabel cartype;
	JLabel seattype;
	JLabel carmodel;
	JLabel days;
	JLabel carnumber;
	JLabel totalfee;
	JLabel custoid;
	JLabel custoname;
	JLabel DEYS;
	JLabel model56;
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RecieptPage frame = new RecieptPage();
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
	public RecieptPage() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 553, 532);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Transaction successfull !");
		lblNewLabel.setForeground(new Color(255, 255, 240));
		lblNewLabel.setFont(new Font("Kozuka Gothic Pro B", Font.BOLD, 23));
		lblNewLabel.setBounds(10, 11, 286, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Reciept ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(206, 52, 76, 21);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_5 = new JLabel("Car ID :");
		lblNewLabel_5.setBounds(30, 202, 48, 14);
		contentPane.add(lblNewLabel_5);
		
		carid = new JLabel("");
		carid.setBounds(88, 202, 91, 14);
		contentPane.add(carid);
		
		JLabel lblNewLabel_6 = new JLabel("Car Name :");
		lblNewLabel_6.setBounds(30, 237, 70, 14);
		contentPane.add(lblNewLabel_6);
		
		carname = new JLabel("");
		carname.setBounds(98, 237, 96, 14);
		contentPane.add(carname);
		
		JLabel lblNewLabel_7 = new JLabel("Car number :");
		lblNewLabel_7.setBounds(30, 304, 91, 14);
		contentPane.add(lblNewLabel_7);
		
		carnumber = new JLabel("");
		carnumber.setBounds(108, 304, 103, 14);
		contentPane.add(carnumber);
		
		JLabel lblNewLabel_8 = new JLabel("Car type :");
		lblNewLabel_8.setBounds(30, 329, 70, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Seat type :");
		lblNewLabel_9.setBounds(30, 354, 70, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Days :");
		lblNewLabel_10.setBounds(30, 391, 48, 14);
		contentPane.add(lblNewLabel_10);
		
	    DEYS = new JLabel("New label");
		DEYS.setBounds(80, 391, 84, 14);
		contentPane.add(DEYS);
		
		JLabel lblNewLabel_11 = new JLabel("Total fee : ");
		lblNewLabel_11.setBounds(30, 431, 70, 14);
		contentPane.add(lblNewLabel_11);
		
		totalfee = new JLabel("");
		totalfee.setBounds(98, 431, 96, 14);
		contentPane.add(totalfee);
		
		JLabel lblNewLabel_12 = new JLabel("Date :");
		lblNewLabel_12.setBounds(30, 468, 48, 14);
		contentPane.add(lblNewLabel_12);
		
	    date = new JLabel("");
		date.setBounds(80, 468, 114, 14);
		contentPane.add(date);
		
		JLabel lblCustomerName = new JLabel("Customer Name :");
		lblCustomerName.setBounds(30, 124, 120, 14);
		contentPane.add(lblCustomerName);
		
		custoname = new JLabel("");
		custoname.setBounds(145, 124, 89, 14);
		contentPane.add(custoname);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cus ID :");
		lblNewLabel_1_1.setBounds(30, 166, 48, 14);
		contentPane.add(lblNewLabel_1_1);
		
		custoid = new JLabel("");
		custoid.setBounds(88, 166, 91, 14);
		contentPane.add(custoid);
		
		JButton btnNewButton = new JButton("Back ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AvailablePage page=new AvailablePage();
	            page.setVisible(true);
	            dispose();
	            
	            page.identity.setText(custoid.getText());
	            page.Name.setText(custoname.getText());
			}
		});
		btnNewButton.setBackground(new Color(255, 248, 220));
		btnNewButton.setBounds(424, 14, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String custname = custoname.getText();
				    String custid = custoid.getText();
				    String cari = carid.getText();
				    String carnam = carname.getText();
					String carmodel = model56.getText();
					String canumber = carnumber.getText();
					String catype = cartype.getText();
					String carseatype = seattype.getText();
					String rentprice = totalfee.getText();
					String dat = date.getText() ;
					String Totadays = DEYS.getText();
					JFrame f;
					
					
					int max = 0;
					
					Scanner y = null;
					try{
					y = new Scanner(new File("Reciepts.txt"));
					while(y.hasNext())
					{
					
				    int seriel = y.nextInt();
					String paymentID = y.next();
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
						
						
					FileWriter f1 = new FileWriter("Reciepts.txt", true);
					x = new Formatter(f1);
					x.format("%d R%s %s %s %s %s %s %s %s %s  %s %s %s%n%n",++max,max,cari,carnam,carmodel,canumber,catype,carseatype,rentprice,Totadays,dat,custname,custid);
					
					 f=new JFrame(); 
					 JOptionPane.showMessageDialog(f," Reciept saved");
					
					
					x.close();
					
					
					}
					
					
					
					catch(Exception e2)
					{
						 f=new JFrame(); 
						 JOptionPane.showMessageDialog(f," Something went wrong");
					}
					
			}
		});
		btnNewButton_1.setBounds(424, 427, 103, 27);
		contentPane.add(btnNewButton_1);
		
		cartype = new JLabel("");
		cartype.setBounds(98, 329, 91, 14);
		contentPane.add(cartype);
		
		seattype = new JLabel("");
		seattype.setBounds(116, 354, 48, 14);
		contentPane.add(seattype);
		
		JLabel lblNewLabel_2 = new JLabel("Car model :");
		lblNewLabel_2.setBounds(30, 262, 76, 14);
		contentPane.add(lblNewLabel_2);
		
		model56 = new JLabel("New label :");
		model56.setBounds(108, 262, 63, 14);
		contentPane.add(model56);
	}

}
