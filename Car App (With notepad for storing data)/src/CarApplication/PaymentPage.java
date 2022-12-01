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
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class PaymentPage extends JFrame {
	private static Scanner x ;
	JLabel cusname;
	JLabel cusid;
	JLabel Cid;
	JLabel name;
	JLabel number;
	JLabel model;
	JLabel booking;
	JLabel seat;
	JLabel type;
	JLabel fee;
	JLabel Totaldays;
	
	

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PaymentPage frame = new PaymentPage();
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
	public PaymentPage() {
		setType(Type.UTILITY);
		setBackground(new Color(143, 188, 143));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 654, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Name :");
		lblNewLabel.setBounds(30, 11, 48, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Cus ID :");
		lblNewLabel_1.setBounds(30, 36, 48, 14);
		contentPane.add(lblNewLabel_1);
		
		cusname = new JLabel("Nasif");
		cusname.setBounds(88, 11, 62, 14);
		contentPane.add(cusname);
		
		cusid = new JLabel("R1");
		cusid.setBounds(88, 36, 62, 14);
		contentPane.add(cusid);
		
		JLabel lblNewLabel_4 = new JLabel("Payment");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel_4.setBounds(259, 11, 174, 39);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Car ID :");
		lblNewLabel_5.setBounds(102, 125, 48, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Car Name :");
		lblNewLabel_6.setBounds(102, 160, 70, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Car number :");
		lblNewLabel_7.setBounds(102, 229, 91, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Car type :");
		lblNewLabel_8.setBounds(102, 270, 70, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Seat type :");
		lblNewLabel_9.setBounds(102, 295, 70, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Days :");
		lblNewLabel_10.setBounds(102, 332, 48, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Total fee : ");
		lblNewLabel_11.setBounds(102, 372, 70, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Date :");
		lblNewLabel_12.setBounds(102, 409, 48, 14);
		contentPane.add(lblNewLabel_12);
		
		JButton btnNewButton = new JButton("Pay now !");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				RecieptPage trans = new RecieptPage();
				 trans.setVisible(true);
				 
				    
					
				 
				 String available ="No";
				 String filepath = "Cars.txt";
					String removeTerm = Cid.getText();
					
					String tempFile = "temp.txt";
					   File oldFile = new File (filepath);
					   File newFile = new File (tempFile);
					   
					   try { 
						   FileWriter fw = new FileWriter(tempFile , true);
						   BufferedWriter bw = new BufferedWriter(fw);
						   PrintWriter pw = new PrintWriter(bw);
						   x = new Scanner(new File(filepath));
						   
						   
					   
						   while(x.hasNext())
							   
						   {
							  
							   String seriel = x.next();
							  String ID = x.next() ;
							  String name = x.next() ;
							  String model = x.next();
							  String number = x.next();
							  String seat = x.next();
							  String type =x.next();
							  String fee =x.next();
							  String rented =x.next();
							  
							   if (ID.equals(removeTerm)) {
								   
								   pw.println(seriel+" "+ ID +" "+name+" " +model+" " +number+" " + seat+ " "+type +" "+fee+" "+available);
							   }
							   
							   else {  pw.println(seriel+"    "+ID+" "+name+" " +model+" " +number+" " + seat+ " "+type +" "+fee+" "+rented); 
							   
							   }

						   }
						   
						   x.close();
						   pw.flush();
						   pw.close();
						   oldFile.delete();
						   File dump = new File (filepath);
						   newFile.renameTo(dump);
						   
						   dispose();
						   
					}
					   
					   catch (Exception e1 ) { 
						   
						   System.out.println("error") ;
					   }
					   
					   
					   
					   
					   
					   
					    String custname = cusname.getText();
					    String custid = cusid.getText();
					    String carid = Cid.getText();
					    String carname = name.getText();
						String carmodel = model.getText();
						String carnumber = number.getText();
						String cartype = type.getText();
						String carseatype = seat.getText();
						String rentprice = fee.getText();
						String date = booking.getText() ;
						String Totadays = Totaldays.getText();
						JFrame f;
						
						
						int max = 0;
						
						Scanner y = null;
						try{
						y = new Scanner(new File("Payment.txt"));
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
						
						
						String recieptcar = Cid.getText();
						
						if ( cai.equals(recieptcar) ) 
						{    
							 RecieptPage page=new RecieptPage();
	
			             }
					
						
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
							
							
						FileWriter f1 = new FileWriter("Payment.txt", true);
						x = new Formatter(f1);
						x.format("%d P%s %s %s %s %s %s %s %s %s  %s %s %s%n%n",++max,max,carid,carname,carmodel,carnumber,cartype,carseatype,rentprice,Totadays,date,custname,custid);
						
						x.close();
						
						
						}
						
						
						
						catch(Exception e2)
						{
							 f=new JFrame(); 
							 JOptionPane.showMessageDialog(f," Sorry Registration unsuccessful !");
						}
						
						
						trans.carid.setText(Cid.getText());
						trans.carname.setText(name.getText());
						trans.carnumber.setText(number.getText());
						trans.cartype.setText(type.getText());
						trans.seattype.setText(seat.getText());
						trans.totalfee.setText(fee.getText());
						trans.date.setText(booking.getText());  
						trans.custoname.setText(cusname.getText());  
						trans.custoid.setText(cusid.getText()); 
						trans.DEYS.setText(Totaldays.getText()); 
						trans.model56.setText(model.getText());
						trans= new RecieptPage();
				
				
				
			}
		});
		btnNewButton.setBackground(new Color(245, 255, 250));
		btnNewButton.setBounds(495, 341, 111, 45);
		contentPane.add(btnNewButton);
		
		Cid = new JLabel("");
		Cid.setBounds(160, 125, 76, 14);
		contentPane.add(Cid);
		
		name = new JLabel("");
		name.setBounds(170, 160, 76, 14);
		contentPane.add(name);
		
		number = new JLabel("");
		number.setBounds(183, 229, 76, 14);
		contentPane.add(number);
		
		type = new JLabel("");
		type.setBounds(170, 270, 76, 14);
		contentPane.add(type);
		
		seat = new JLabel("");
		seat.setBounds(170, 295, 76, 14);
		contentPane.add(seat);
		
		booking = new JLabel("");
		booking.setBounds(152, 409, 84, 14);
		contentPane.add(booking);
		
		JLabel lblNewLabel_21 = new JLabel("Car model :");
		lblNewLabel_21.setBounds(102, 193, 70, 14);
		contentPane.add(lblNewLabel_21);
		
		model = new JLabel("");
		model.setBounds(184, 193, 62, 14);
		contentPane.add(model);
		
		fee = new JLabel("");
		fee.setBounds(173, 372, 48, 14);
		contentPane.add(fee);
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AvailablePage page=new AvailablePage();
	            page.setVisible(true);
	            dispose();
	            
	            page.identity.setText(cusid.getText());
	            page.Name.setText(cusname.getText());
				
			}
		});
		btnNewButton_1.setBounds(495, 397, 111, 23);
		contentPane.add(btnNewButton_1);
		
		Totaldays = new JLabel("New label");
		Totaldays.setBounds(160, 332, 48, 14);
		contentPane.add(Totaldays);
	}
}
