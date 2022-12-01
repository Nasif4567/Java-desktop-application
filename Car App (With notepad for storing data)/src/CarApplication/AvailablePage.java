package CarApplication;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import com.toedter.calendar.JDayChooser;


import com.toedter.calendar.JDateChooser;
import java.awt.SystemColor;
import javax.swing.SpinnerNumberModel;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.Window.Type;
import java.awt.Label;

public class AvailablePage extends JFrame {
	
	private static Scanner y ;
	private static Scanner sc1 ;
	JLabel carnum;
	JLabel identity;
	JLabel Name;
	Choice seattype;
	Choice cartype;
	private JPanel contentPane;
	/**
	 * @wbp.nonvisual location=1,-31
	 */
	private final JLabel label = new JLabel("New label");
	private JTextField caridtxt;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvailablePage frame = new AvailablePage();
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
	public AvailablePage() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 100, 918, 559);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Car ID :");
		lblNewLabel_3.setBounds(20, 375, 48, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Car name :");
		lblNewLabel_4.setBounds(20, 413, 63, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Car Model :");
		lblNewLabel_5.setBounds(20, 455, 95, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Seat type:");
		lblNewLabel_6.setBounds(261, 455, 82, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Car type:");
		lblNewLabel_7.setBounds(261, 413, 72, 14);
		contentPane.add(lblNewLabel_7);
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(new Integer(0), new Integer(0), null, new Integer(1)));
		spinner.setBounds(556, 410, 48, 20);
		contentPane.add(spinner);
		
		JLabel lblNewLabel_8 = new JLabel("Days :");
		lblNewLabel_8.setBounds(481, 413, 63, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Price:");
		lblNewLabel_9.setBounds(481, 455, 48, 14);
		contentPane.add(lblNewLabel_9);
		
		Date today = new Date();
		JDateChooser bookingdate = new JDateChooser(today);
		bookingdate.setBounds(657, 407, 147, 20);
		contentPane.add(bookingdate);
		
		JLabel carfee = new JLabel("");;
		carfee.setBounds(539, 455, 89, 14);
		contentPane.add(carfee);
		
		JLabel cartype1 = new JLabel("");
		cartype1.setBounds(353, 413, 89, 14);
		contentPane.add(cartype1);
		
		JLabel carseat = new JLabel("");
		carseat.setBounds(353, 455, 82, 14);
		contentPane.add(carseat);
		
		JLabel carname = new JLabel("");
		carname.setBounds(103, 413, 79, 14);
		contentPane.add(carname);
		
		TextArea data = new TextArea();
		data.setEditable(false);
		data.setBounds(273, 77, 453, 256);
		contentPane.add(data);
		
		JLabel carmodel = new JLabel("");
		carmodel.setBounds(142, 455, 79, 14);
		contentPane.add(carmodel);
		
		caridtxt = new JTextField();
		caridtxt.setBounds(93, 372, 96, 20);
		contentPane.add(caridtxt);
		caridtxt.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("Confirm");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idvalid = caridtxt.getText();
				String carmodelval = carmodel.getText();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String Bdate = sdf.format(bookingdate.getDate());
				String days = spinner.getValue().toString();
				String prilabel = carfee.getText();
				int d=Integer.parseInt(days);
				int p=Integer.parseInt(prilabel);
				int TP = d * p ;
				String TotalPrice = Integer.toString(TP);
				
					    
		        
				if (!idvalid.equals("") && !carmodelval.equals("") && !days.equals("0")) {	
			    
				PaymentPage pageP= new PaymentPage();
				pageP.setVisible(true);
				pageP.Cid.setText(caridtxt.getText());
				pageP.name.setText(carname.getText());
				pageP.model.setText(carmodel.getText());
				pageP.number.setText(carnum.getText());
				pageP.type.setText(cartype1.getText());
				pageP.seat.setText(carseat.getText());
				pageP.cusname.setText(Name.getText());
				pageP.cusid.setText(identity.getText());
				pageP.Totaldays.setText(days);
				pageP.fee.setText(TotalPrice);
				pageP.booking.setText(Bdate);     
				pageP= new PaymentPage();
				
			
			    dispose();    }
				
				else { 
					
					JOptionPane.showMessageDialog(null, "Please select number of days");  
				}
			}
		});
		btnNewButton_1.setForeground(new Color(0, 0, 0));
		btnNewButton_1.setBackground(new Color(255, 160, 122));
		btnNewButton_1.setBounds(713, 451, 96, 34);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Search available car");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File myobj = new File ("Cars.txt");
				
				data.setText("");
				String n = data.getText(); 
				String sid =cartype.getSelectedItem().toString();
				String sid1 =seattype.getSelectedItem().toString();
				
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
				
				
				if (ctype.equals(sid) && cstype.equals(sid1) && caravail.equals("Yes"))  {
				
				data.append("\n"+ ID +"         "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice);
				
				}
				
				
				}
				y.close();
				
				
				
			}
		});
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setBackground(new Color(255, 160, 122));
		btnNewButton_2.setBounds(20, 242, 162, 34);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel_13 = new JLabel("Choose date :");
		lblNewLabel_13.setBounds(645, 392, 81, 14);
		contentPane.add(lblNewLabel_13);
		
		JButton btnNewButton_3 = new JButton("Search ID");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				File myobj1 = new File ("Cars.txt");
				String sid = caridtxt.getText();
				String textid = caridtxt.getText();
				
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
					
						
					
					if (textid.equals("") ) {
						JOptionPane.showMessageDialog(null, "Please enter the ID");
					}
					
					
					
					
					 if (id.equals(sid) )
						 
						{
						 
						carname.setText(name);
						carmodel.setText(model);
						carnum.setText(number);
						cartype1.setText(type);
						carseat.setText(seat);
						carfee.setText(fee);
						
						}
					 
					 
					  if (id.equals(sid) && rented.equals("No") )   {
						  
						    carname.setText("");
						    carmodel.setText("");
							carnum.setText("");
							cartype1.setText("");
							carseat.setText("");
							carfee.setText("");  
							
					JOptionPane.showMessageDialog(null, "This car is already rented");  
					  }
							
						 
						 
						 
					 }
					 
				
				sc1.close();
				
			}
		});
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(new Color(255, 160, 122));
		btnNewButton_3.setBounds(204, 371, 103, 23);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_17 = new JLabel("Seat type :");
		lblNewLabel_17.setBounds(20, 164, 72, 14);
		contentPane.add(lblNewLabel_17);
		
		
		JLabel lblNewLabel_17_1 = new JLabel("Car type :");
		lblNewLabel_17_1.setBounds(20, 94, 72, 14);
		contentPane.add(lblNewLabel_17_1);
		
		JLabel lblNewLabel = new JLabel("Customer ID:");
		lblNewLabel.setForeground(new Color(250, 235, 215));
		lblNewLabel.setBounds(10, 11, 82, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_2 = new JLabel("Hello, ");
		lblNewLabel_2.setForeground(new Color(250, 235, 215));
		lblNewLabel_2.setBounds(204, 11, 36, 14);
		contentPane.add(lblNewLabel_2);
		
		 Name = new JLabel("New label");
		Name.setForeground(new Color(250, 235, 215));
		Name.setBounds(246, 11, 72, 14);
		contentPane.add(Name);
		
		identity = new JLabel("R1");
		identity.setForeground(new Color(250, 235, 215));
		identity.setBounds(103, 11, 48, 14);
		contentPane.add(identity);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(255, 160, 122));
		panel.setBounds(0, 0, 343, 43);
		contentPane.add(panel);
		
		JButton btnNewButton = new JButton("Logout");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ResidentLogin login = new ResidentLogin();
				login.setVisible(true);
				dispose();
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 160, 122));
		btnNewButton.setBounds(715, 23, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_18 = new JLabel("*Note*");
		lblNewLabel_18.setBounds(781, 116, 48, 14);
		contentPane.add(lblNewLabel_18);
		
		JLabel lblNewLabel_19 = new JLabel("If box is empty");
		lblNewLabel_19.setBounds(781, 141, 95, 14);
		contentPane.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Means no car ");
		lblNewLabel_20.setBounds(781, 164, 82, 14);
		contentPane.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("available");
		lblNewLabel_21.setBounds(781, 187, 63, 14);
		contentPane.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Car number :");
		lblNewLabel_22.setBounds(20, 495, 82, 14);
		contentPane.add(lblNewLabel_22);
		
		carnum = new JLabel("");
		carnum.setBounds(142, 495, 98, 14);
		contentPane.add(carnum);
		
		cartype = new Choice();
		cartype.add("Economy");  
        cartype.add("Premium");
		cartype.setBounds(20, 114, 131, 20);
		contentPane.add(cartype);
		
		seattype = new Choice();
		seattype.add("Four");  
        seattype.add("Six");
		seattype.setBounds(20, 194, 131, 20);
		contentPane.add(seattype);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(233, 150, 122));
		panel_1.setBounds(0, 85, 200, 217);
		contentPane.add(panel_1);
		
		JButton btnNewButton_4 = new JButton("View my reciepts");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ViewReciept page = new ViewReciept();
	            
	            
				File myobj1 = new File ("Reciepts.txt");
				String casID = identity.getText();
				
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
						
					
					
					
					 if (casID.equals(custi) )
						 
						{
						 
						 
						 page.textArea.append("\n"+ RecieptID +"      "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice+ "   "+bds+"   "+date1+"   "+custn+"   "+custi );
						 
						 
						
						}
					 
					 page.setVisible(true);
			            dispose();
			            
			            
			            page.custoid.setText(identity.getText());
			            page.custoname.setText(Name.getText());
			            
			            
					 
					 
					 
						 
						 
					 }
					 
				
				y.close();
			}
		});
		btnNewButton_4.setBackground(new Color(233, 150, 122));
		btnNewButton_4.setBounds(375, 7, 200, 23);
		contentPane.add(btnNewButton_4);
		
		Label label_2 = new Label("The left side first word is the ID ex.\"C1\"");
		label_2.setBounds(395, 49, 233, 22);
		contentPane.add(label_2);
		
		
		
		
	}
}
