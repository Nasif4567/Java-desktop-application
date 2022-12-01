package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.TextArea;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class UpdateRentedCars extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	static TextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UpdateRentedCars frame = new UpdateRentedCars();
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
	public UpdateRentedCars() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(350, 150, 824, 491);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Not returned cars");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBackground(Color.GRAY);
		lblNewLabel.setBounds(292, 68, 237, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Please insert the ID of the car :");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(73, 381, 189, 14);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(272, 378, 96, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Update to returned");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 String available ="Yes";
				 String filepath = "Cars.txt";
					String removeTerm = textField.getText();
					
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
								   
								   pw.println(seriel+" "+ ID +" "+name+" " +model+" " +number+" " + seat+ " "+type +" "+fee+" "+available);
								   JFrame j;
								   j=new JFrame();  
								   JOptionPane.showMessageDialog(j,"Updated to available , now this car is again available to book or be rented");
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
		btnNewButton.setBounds(414, 377, 164, 23);
		contentPane.add(btnNewButton);
		
		Button button = new Button("refresh");
		button.addActionListener(new ActionListener() {
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
				
				
				if (caravail.equals("No"))  {
				
					textArea.append("\n"+ ID +"         "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice );
				
				}
				
				
				}
				y.close();
				
				
			
			}
		});
		button.setBounds(635, 316, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("Back");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectoryPage page = new DirectoryPage();
	            page.setVisible(true);
	            dispose();
			}
		});
		button_1.setBounds(684, 10, 70, 22);
		contentPane.add(button_1);
		
		 textArea = new TextArea();
		 textArea.setEditable(false);
		textArea.setBounds(139, 104, 464, 212);
		contentPane.add(textArea);
		
		Label label_2 = new Label("The left side first word is the ID ex.\"C1\"");
		label_2.setBounds(139, 316, 233, 22);
		contentPane.add(label_2);
	}
}
