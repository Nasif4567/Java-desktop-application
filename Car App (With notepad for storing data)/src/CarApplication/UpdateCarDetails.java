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
import javax.swing.JTextField;
import java.awt.Choice;
import javax.swing.JButton;
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
import java.awt.Button;
import java.awt.Window.Type;

public class UpdateCarDetails extends JFrame {

	private JPanel contentPane;
	private JTextField carName;
	private JTextField carModel;
	private JTextField carNumber;
	private JTextField renttxt;
	private JTextField txtInsertId;
	private JTextField seatType;
	private JTextField carType;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateCarDetails frame = new UpdateCarDetails();
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
	public UpdateCarDetails() {
		setType(Type.UTILITY);
		setBackground(Color.DARK_GRAY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 846, 514);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Update car details");
		lblNewLabel_1.setForeground(new Color(250, 250, 210));
		lblNewLabel_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 34));
		lblNewLabel_1.setBounds(194, 14, 360, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Car name");
		lblNewLabel.setBounds(32, 138, 65, 14);
		contentPane.add(lblNewLabel);
		
		carName = new JTextField();
		carName.setEditable(false);
		carName.setColumns(10);
		carName.setBounds(32, 163, 96, 20);
		contentPane.add(carName);
		
		JLabel lblSeatType = new JLabel("Seat Type :");
		lblSeatType.setBounds(219, 138, 72, 14);
		contentPane.add(lblSeatType);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(33, 227, 48, 14);
		contentPane.add(lblModel);
		
		carModel = new JTextField();
		carModel.setEditable(false);
		carModel.setColumns(10);
		carModel.setBounds(32, 244, 96, 20);
		contentPane.add(carModel);
		
		JLabel lblCarType = new JLabel("Car type");
		lblCarType.setBounds(240, 227, 68, 14);
		contentPane.add(lblCarType);
		
		JLabel lblCarNumber = new JLabel("Car number");
		lblCarNumber.setBounds(32, 324, 81, 14);
		contentPane.add(lblCarNumber);
		
		carNumber = new JTextField();
		carNumber.setEditable(false);
		carNumber.setColumns(10);
		carNumber.setBounds(32, 340, 96, 20);
		contentPane.add(carNumber);
		
		JLabel lblRentPrice = new JLabel("Rent Price :");
		lblRentPrice.setBounds(236, 324, 72, 14);
		contentPane.add(lblRentPrice);
		
		renttxt = new JTextField();
		renttxt.setColumns(10);
		renttxt.setBounds(236, 340, 96, 20);
		contentPane.add(renttxt);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String RentPrice =renttxt.getText();
				 String filepath = "Cars.txt";
					String removeTerm = txtInsertId.getText();
					
					String tempFile = "temp.txt";
					   File oldFile = new File (filepath);
					   File newFile = new File (tempFile);
					   Scanner x = null;
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
								   
								   pw.println(seriel+" "+ ID +" "+name+" " +model+" " +number+" " + seat+ " "+type +" "+RentPrice+" "+rented);
							  
								   JFrame f;
								   f=new JFrame(); 
									 JOptionPane.showMessageDialog(f,"Updated !");
							   
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
						   
						  

					}
					   
					   catch (Exception e1 ) { 
						   
						   System.out.println("error") ;
					   }
					   
					   
				
				
				
				
				
				
			}
		});
		btnUpdate.setBounds(143, 415, 89, 23);
		contentPane.add(btnUpdate);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(369, 93, 390, 291);
		contentPane.add(textArea);
		
		Label label = new Label("Car data");
		label.setBounds(699, 65, 62, 22);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("refresh");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  File myobj = new File ("Cars.txt");
					
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
					String cn = y.next(); 
					String cm = y.next();
					String cnum = y.next();
					String ctype = y.next();
					String cstype = y.next();
					String crnprice = y.next();
					String caravail = y.next();
					
					
					if (caravail.equals("No") || caravail.equals("Yes"))  {
					
						textArea.append("\n"+ ID +"         "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice );
					
					}
					
					
					}
					y.close();
			}
		});
		btnNewButton_1.setBounds(519, 399, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblInsertId = new JLabel("Insert ID");
		lblInsertId.setBounds(32, 62, 65, 14);
		contentPane.add(lblInsertId);
		
		txtInsertId = new JTextField();
		txtInsertId.setColumns(10);
		txtInsertId.setBounds(32, 87, 96, 20);
		contentPane.add(txtInsertId);
		
		JButton btnNewButton_2 = new JButton("Search");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File myobj1 = new File ("Cars.txt");
				String sid = txtInsertId.getText();
			    Scanner sc1 =null;
				
				try {
					sc1= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
				
				while (sc1.hasNext()) {
					
					String seriel = sc1.next();
					String id = sc1.next();
					String name = sc1.next();
					String model = sc1.next();
					String number = sc1.next();
					String type = sc1.next();
					String seat = sc1.next();
					String fee = sc1.next();
					String rented =sc1.next();
					
						
					
					if (txtInsertId.equals("") ) {
						JOptionPane.showMessageDialog(null, "Please enter the ID");
					}
					
					
					
					
					 if (id.equals(sid) )
						 
						{
						 
						carName.setText(name);
						carModel.setText(model);
						carNumber.setText(number);
						carType.setText(type);
						seatType.setText(seat);
						renttxt.setText(fee);
						
						}
					 
				}
					 
				
				sc1.close();
				
				
				
			}
		});
		btnNewButton_2.setBounds(143, 86, 89, 23);
		contentPane.add(btnNewButton_2);
		
		seatType = new JTextField();
		seatType.setEditable(false);
		seatType.setColumns(10);
		seatType.setBounds(219, 163, 96, 20);
		contentPane.add(seatType);
		
		carType = new JTextField();
		carType.setEditable(false);
		carType.setColumns(10);
		carType.setBounds(219, 244, 96, 20);
		contentPane.add(carType);
		
		Button button_1 = new Button("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarManageDirectory page = new CarManageDirectory();
	            page.setVisible(true);
	            dispose();
				
			}
		});
		button_1.setBounds(666, 14, 70, 22);
		contentPane.add(button_1);
		
		Label label_2 = new Label("The left side first word is the ID ex.\"C1\"");
		label_2.setBounds(369, 65, 233, 22);
		contentPane.add(label_2);
		
		JLabel lblnoteOnlyThe = new JLabel("*note* only the rent price can be updated other data are permanent");
		lblnoteOnlyThe.setBounds(10, 390, 412, 14);
		contentPane.add(lblnoteOnlyThe);
	}
}
