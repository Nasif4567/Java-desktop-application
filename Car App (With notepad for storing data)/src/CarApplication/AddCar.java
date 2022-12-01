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
import java.awt.Label;
import java.awt.Button;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.Choice;
import java.awt.Window.Type;

public class AddCar extends JFrame {
	Choice carseat;
	Choice cartyp;
	private JPanel contentPane;
	private JTextField carnametxt;
	private JTextField carmodeltxt;
	private JTextField carnumbertxt;
	private JTextField carprice;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddCar frame = new AddCar();
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
	public AddCar() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(250, 150, 871, 484);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Car name");
		lblNewLabel.setBounds(85, 109, 65, 14);
		contentPane.add(lblNewLabel);
		
		carnametxt = new JTextField();
		carnametxt.setBounds(85, 134, 96, 20);
		contentPane.add(carnametxt);
		carnametxt.setColumns(10);
		
		JLabel lblCarType = new JLabel("Car type");
		lblCarType.setBounds(293, 198, 68, 14);
		contentPane.add(lblCarType);
		
		JLabel lblModel = new JLabel("Model");
		lblModel.setBounds(86, 198, 48, 14);
		contentPane.add(lblModel);
		
		JLabel lblSeatType = new JLabel("Seat Type :");
		lblSeatType.setBounds(289, 109, 72, 14);
		contentPane.add(lblSeatType);
		
		JLabel lblCarNumber = new JLabel("Car number");
		lblCarNumber.setBounds(85, 295, 81, 14);
		contentPane.add(lblCarNumber);
		
		JLabel lblRentPrice = new JLabel("Rent Price :");
		lblRentPrice.setBounds(289, 295, 72, 14);
		contentPane.add(lblRentPrice);
		
		carmodeltxt = new JTextField();
		carmodeltxt.setColumns(10);
		carmodeltxt.setBounds(85, 215, 96, 20);
		contentPane.add(carmodeltxt);
		
		carnumbertxt = new JTextField();
		carnumbertxt.setColumns(10);
		carnumbertxt.setBounds(85, 311, 96, 20);
		contentPane.add(carnumbertxt);
		
		carprice = new JTextField();
		carprice.setBounds(289, 311, 96, 20);
		contentPane.add(carprice);
		carprice.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Register a new car ");
		lblNewLabel_1.setForeground(new Color(250, 250, 210));
		lblNewLabel_1.setFont(new Font("Tekton Pro Cond", Font.BOLD, 34));
		lblNewLabel_1.setBounds(260, 11, 294, 42);
		contentPane.add(lblNewLabel_1);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setBounds(444, 93, 390, 291);
		contentPane.add(textArea);
		
		Label label = new Label("Car data");
		label.setBounds(594, 62, 62, 22);
		contentPane.add(label);
		
		JButton btnNewButton = new JButton("Register");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String carname = carnametxt.getText();
				String carmodel = carmodeltxt.getText();
				String carnumber = carnumbertxt.getText();
				String cartype = cartyp.getSelectedItem().toString();
				String carseatype = carseat.getSelectedItem().toString();
				String rentprice = carprice.getText();
				String caravailability = "Yes" ;
				JFrame f;
				
				
				int max = 0;
				
				Scanner y = null;
				try{
				y = new Scanner(new File("Cars.txt"));
				while(y.hasNext())
				{
				
				int seriel = y.nextInt();
				String ID = y.next(); 
				String cn = y.next(); 
				String cm = y.next();
				String cnum = y.next();
				String ctype = y.next();
				String cstype = y.next();
				String crnprice = y.next();
				String caravail = y.next();
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
				
					if(!carname.equals("") && !carmodel.equals("") && !carnumber.equals("") && !rentprice.equals("") ) { 
					
				FileWriter f1 = new FileWriter("Cars.txt", true);
				x = new Formatter(f1);
				x.format("%d C%s %s %s %s %s %s %s %s%n%n",++max,max,carname,carmodel,carnumber,cartype,carseatype,rentprice,caravailability);
				
				 f=new JFrame(); 
				 JOptionPane.showMessageDialog(f,"Registration successfull !");
				x.close();
				
				carnametxt.setText("");
			    carmodeltxt.setText("");
				carnumbertxt.setText("");
				carprice.setText(""); 
				
			
					}
					
					else { f=new JFrame(); 
					 JOptionPane.showMessageDialog(f,"Please fill up the form"); }
				
				
				}
				
				
				
				catch(Exception e2)
				{
					 f=new JFrame(); 
					 JOptionPane.showMessageDialog(f," Sorry Registration unsuccessful !");
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		btnNewButton.setBounds(174, 381, 89, 23);
		contentPane.add(btnNewButton);
		
		carseat = new Choice();
		carseat.add("Four");  
        carseat.add("Six");
		carseat.setBounds(271, 134, 131, 20);
		contentPane.add(carseat);
		
		cartyp = new Choice();
		cartyp.add("Economy");  
        cartyp.add("Premium");
		cartyp.setBounds(271, 218, 131, 20);
		contentPane.add(cartyp);
		
		JButton btnNewButton_1 = new JButton("Refresh");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textArea.setText("");
				Scanner y = null;
				try{
				y = new Scanner(new File("Cars.txt"));
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
				
				textArea.append("\n"+ID+"        "+cn+"        "+cm+"        "+ cnum +"        "+ ctype +"        "+ cstype +"        "+ crnprice);
				
				}
				y.close();
				}
				
				
				catch(Exception e1)
				
				
				{
				
				
			}
				
			}
		});
		btnNewButton_1.setBounds(594, 399, 89, 23);
		contentPane.add(btnNewButton_1);
		
		Button button = new Button("Back");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CarManageDirectory page = new CarManageDirectory();
	            page.setVisible(true);
	            dispose();
			}
		});
		button.setBounds(733, 11, 70, 22);
		contentPane.add(button);
	}
}
