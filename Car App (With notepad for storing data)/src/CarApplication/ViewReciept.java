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
import java.awt.TextArea;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class ViewReciept extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JLabel Model4;
	TextArea textArea;
	JLabel custoid;
	JLabel custoname;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewReciept frame = new ViewReciept();
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
	public ViewReciept() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 486);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCustomerName = new JLabel("Customer Name :");
		lblCustomerName.setBounds(22, 63, 120, 14);
		contentPane.add(lblCustomerName);
		
		custoname = new JLabel("");
		custoname.setBounds(137, 63, 89, 14);
		contentPane.add(custoname);
		
		JLabel lblNewLabel_1_1 = new JLabel("Cus ID :");
		lblNewLabel_1_1.setBounds(22, 98, 48, 14);
		contentPane.add(lblNewLabel_1_1);
		
	    custoid = new JLabel("");
		custoid.setBounds(80, 98, 91, 14);
		contentPane.add(custoid);
		
		JLabel lblNewLabel_5 = new JLabel("Car ID :");
		lblNewLabel_5.setBounds(22, 136, 48, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel carid = new JLabel("");
		carid.setBounds(80, 136, 91, 14);
		contentPane.add(carid);
		
		JLabel lblNewLabel_6 = new JLabel("Car Name :");
		lblNewLabel_6.setBounds(22, 174, 70, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel carname = new JLabel("");
		carname.setBounds(90, 174, 96, 14);
		contentPane.add(carname);
		
		JLabel lblNewLabel_7 = new JLabel("Car number :");
		lblNewLabel_7.setBounds(22, 231, 91, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel carnumber = new JLabel("");
		carnumber.setBounds(123, 231, 103, 14);
		contentPane.add(carnumber);
		
		JLabel lblNewLabel_8 = new JLabel("Car type :");
		lblNewLabel_8.setBounds(22, 267, 70, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel cartype = new JLabel("");
		cartype.setBounds(108, 267, 91, 14);
		contentPane.add(cartype);
		
		JLabel lblNewLabel_9 = new JLabel("Seat type :");
		lblNewLabel_9.setBounds(22, 308, 70, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel seattype = new JLabel("");
		seattype.setBounds(108, 308, 48, 14);
		contentPane.add(seattype);
		
		JLabel lblNewLabel_10 = new JLabel("Days :");
		lblNewLabel_10.setBounds(22, 345, 48, 14);
		contentPane.add(lblNewLabel_10);
		
		JLabel DEYS = new JLabel("");
		DEYS.setBounds(72, 345, 84, 14);
		contentPane.add(DEYS);
		
		JLabel lblNewLabel_11 = new JLabel("Total cost : ");
		lblNewLabel_11.setBounds(22, 422, 70, 14);
		contentPane.add(lblNewLabel_11);
		
		JLabel totalfee = new JLabel("");
		totalfee.setBounds(90, 422, 96, 14);
		contentPane.add(totalfee);
		
		JLabel lblNewLabel_12 = new JLabel("Date :");
		lblNewLabel_12.setBounds(22, 390, 48, 14);
		contentPane.add(lblNewLabel_12);
		
		JLabel date = new JLabel("");
		date.setBounds(72, 390, 114, 14);
		contentPane.add(date);
		
		JLabel lblNewLabel = new JLabel("Search Reciepts ID :");
		lblNewLabel.setBounds(22, 11, 120, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(158, 8, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("My reciepts");
		lblNewLabel_1.setFont(new Font("Yu Gothic UI", Font.BOLD, 17));
		lblNewLabel_1.setBounds(513, 11, 169, 29);
		contentPane.add(lblNewLabel_1);
		
		textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(367, 81, 442, 257);
		contentPane.add(textArea);
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AvailablePage page = new AvailablePage();
				page.setVisible(true);
	            dispose();
	            
	            page.identity.setText(custoid.getText());
	            page.Name.setText(custoname.getText());
	            
			}
		});
		button.setBounds(751, 11, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Search ");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				File myobj1 = new File ("Reciepts.txt");
				String id = textField.getText();
				
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
						
					
					if (id.equals("") ) {
						JOptionPane.showMessageDialog(null, "Please enter the ID");
					}
					
					
					
					
					 if (RecieptID.equals(id) )
						 
						{
						 
						 
						 
						 carid.setText(cai);
						 carname.setText(cn);
						 Model4.setText(cm);
						 carnumber.setText(cnum);
						 cartype.setText(ctype);
						 seattype.setText(cstype);
						 DEYS.setText(bds);
						 totalfee.setText(crnprice);
						 date.setText(date1);
						
						}
					 
					 
					 
						 
						 
					 }
					 
				
				y.close();
			}
		});
		button_1.setBounds(278, 11, 70, 22);
		contentPane.add(button_1);
		
	    Model4 = new JLabel("");
		Model4.setBounds(118, 199, 96, 14);
		contentPane.add(Model4);
		
		JLabel lblModel = new JLabel("Model :");
		lblModel.setBounds(22, 199, 84, 14);
		contentPane.add(lblModel);
		
		Label label = new Label("*Note this page will show Reciepts based on the logged in customer only ");
		label.setBounds(367, 345, 481, 22);
		contentPane.add(label);
		
		Label label_1 = new Label("it will not show other customer reciepts");
		label_1.setBounds(377, 364, 329, 22);
		contentPane.add(label_1);
		
		Label label_2 = new Label("The left side first word is the ID ex.\"R1\"");
		label_2.setBounds(369, 55, 233, 22);
		contentPane.add(label_2);
	}
}
