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
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class DeleteCar extends JFrame {

	private JPanel contentPane;
	private JTextField ID;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeleteCar frame = new DeleteCar();
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
	public DeleteCar() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 150, 847, 497);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String filepath = "Cars.txt";
				String removeTerm = ID.getText();
				
				   String tempFile = "temp.txt";
				   File oldFile = new File (filepath);
				   File newFile = new File (tempFile);
				   Scanner x = null ;
				   
				   
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
						  
						   if (!ID.equals(removeTerm)) {
							   
							   pw.println(seriel+"    "+ID+" "+name+" " +model+" " +number+" " + seat+ " "+type +" "+fee+" "+rented);
						   }

					   }
					   
					   x.close();
					   pw.flush();
					   pw.close();
					   oldFile.delete();
					   File dump = new File (filepath);
					   newFile.renameTo(dump);
					   
					   JFrame f;
					   f=new JFrame(); 
						 JOptionPane.showMessageDialog(f,"operation proceeded !");

				}
				   
				   catch (Exception e1 ) { 
					   
					   System.out.println("error") ;
				   }
			}
		});
		btnDelete.setBounds(101, 212, 89, 23);
		contentPane.add(btnDelete);
		
		JLabel lblNewLabel_1 = new JLabel("Delete car");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 34));
		lblNewLabel_1.setBounds(36, 11, 294, 42);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblInsertCarId = new JLabel("Insert car ID");
		lblInsertCarId.setBounds(73, 145, 90, 14);
		contentPane.add(lblInsertCarId);
		
		ID = new JTextField();
		ID.setColumns(10);
		ID.setBounds(94, 170, 96, 20);
		contentPane.add(ID);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(359, 82, 390, 291);
		contentPane.add(textArea);
		
		Label label = new Label("Car data");
		label.setBounds(562, 379, 62, 22);
		contentPane.add(label);
		
		JButton btnNewButton_1 = new JButton("Refresh");
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
				
					textArea.append("\n"+ ID +"    "+ cn +"     "+ cm +"     "+ cnum +"     "+ ctype +"     "+ cstype +"     "+ crnprice );
				
				}
				
				
				}
				y.close();
			}
		});
		btnNewButton_1.setBounds(387, 424, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarManageDirectory page = new CarManageDirectory();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton.setBounds(718, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("*Note* make sure you match the ID other wise the operation wont work");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1_1.setBounds(35, 62, 421, 14);
		contentPane.add(lblNewLabel_1_1);
		
		Label label_2 = new Label("The left side first word is the ID ex.\"C1\"");
		label_2.setBounds(527, 54, 233, 22);
		contentPane.add(label_2);
	}

}
