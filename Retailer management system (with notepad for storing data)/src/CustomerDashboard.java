import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CustomerDashboard extends JFrame {

	private JPanel contentPane;
	private JPanel MainPanel;
	private JPanel ProfilePanel;
	private JPanel HomePanel;
	private JLabel idlbl;
	JLabel Name;
	JLabel idread;
	private JLabel fn;
	private JLabel ln; 
	private JLabel gn;
	private JLabel dob;
	private JLabel pn;
	private JLabel ps;
	private JLabel em;
	private JLabel st;
	private JLabel ct;
	private JLabel us;
	private JLabel sa;
	private JTable table;
	private JTable table_1;
	JPanel ViewOrderPanel;
	private JTextField pronam;
	private JLabel typ;
	private JLabel br;
	private JLabel man;
	private JLabel wght;
	private JLabel qlt;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerDashboard frame = new CustomerDashboard();
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
	public CustomerDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 20, 860, 711);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(204, 0, 204));
		panel.setBounds(0, 0, 217, 679);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnProfile = new JButton("Profile");
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(ProfilePanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				//--------------------------------------------------------------------------
				File myobj = new File ("CustomerRegistration.txt");
				Scanner sc = null; 
				
				String id = idread.getText();
				
				
				
				try {
					 sc = new Scanner(myobj);
						
					} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
					}
				
				
				while (sc.hasNext()) {
					
					String seriel = sc.next();	
					String ID = sc.next(); 
					String Fname = sc.next(); 
					String Lname = sc.next();
					String Gender = sc.next();
					String Dob = sc.next();
					String Email = sc.next();
					String State = sc.next();
					String City = sc.next();
					String Street = sc.next();
					String Phone = sc.next();
					String Username = sc.next();
					String Password = sc.next();
					


					if (ID.equals(id)) 
					{   
						 
				        
					idlbl.setText(ID);	
		            fn.setText(Fname);
		            ln.setText(Lname);
		            dob.setText(Dob);
		            gn.setText(Gender);
		            st.setText(State);
		            sa.setText(Street);
		            ct.setText(City);
		            em.setText(Email);
		            pn.setText(Phone);
		            ps.setText(Password);
		            us.setText(Username);
		            ct.setText(City);
		            
		            
		            
		            sc.close();
		            
					}// end of if 
					
					
					
					}// end of while 
			}
		});
		btnProfile.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnProfile.setBounds(0, 215, 217, 56);
		panel.add(btnProfile);
		btnProfile.setForeground(Color.WHITE);
		btnProfile.setBorderPainted(false);
		btnProfile.setBackground(new Color(204, 102, 255));
		
		JLabel lblNewLabel_3 = new JLabel("Terms and policy");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		lblNewLabel_3.setBounds(48, 643, 147, 23);
		panel.add(lblNewLabel_3);
		
		JButton btnViewMyOrder = new JButton("View my order");
		btnViewMyOrder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(ViewOrderPanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				//------------------------------------------------------------------------------------
				
				DefaultTableModel modelclear = (DefaultTableModel) table.getModel();
				modelclear.setRowCount(0);
				
            File myobj1 = new File ("Order.txt");
            
            
				
				
				Scanner y = null;
				
				try {
					y= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				String id = idread.getText();
				
				
				while (y.hasNext()) {
					
					    String seriel = y.next();
						String OrderID = y.next();
						String CusID = y.next();
						String OrderDate = y.next();
						String DeliveryDate = y.next();
						String OrderPrice = y.next();
						
					
					if (id.equals(CusID) && !id.equals("")) {
					     
						DefaultTableModel model = (DefaultTableModel)table.getModel();
						Object [] lines = {seriel , OrderID , CusID , OrderDate , DeliveryDate , OrderPrice };
					
							model.addRow(lines); 	
							
					      
						
			            }
					 
						 
						 
					 }
					 
				
				y.close();
				
				
				
				
				
				
				
				
				
				
//------------------------------------------------------------------------------------
				
				DefaultTableModel modelclear9 = (DefaultTableModel) table_1.getModel();
				modelclear9.setRowCount(0);
				
                File myobj9 = new File ("OrderItem.txt");
            
            
				
				
				Scanner y6 = null;
				
				try {
					y6= new Scanner(myobj9);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				String id1 = idread.getText();
				
				
				while (y6.hasNext()) {
					
						String Pron = y6.next();
						String ProID = y6.next();
						String CUSiD = y6.next();
						String OID = y6.next();
						String PRCC = y6.next();
						
					
					if (id1.equals(CUSiD) && !id.equals("")) {
					     
						DefaultTableModel model8 = (DefaultTableModel)table_1.getModel();
						Object [] liness = {Pron,PRCC};
					
							model8.addRow(liness); 	
							
					      
						
			            }
					 
						 
						 
					 }
					 
				
				y6.close();
				
				
				
				
				
			}
		});
		btnViewMyOrder.setForeground(Color.WHITE);
		btnViewMyOrder.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnViewMyOrder.setBorderPainted(false);
		btnViewMyOrder.setBackground(new Color(204, 102, 255));
		btnViewMyOrder.setBounds(0, 303, 217, 56);
		panel.add(btnViewMyOrder);
		
		JLabel lblNewLabel_1_1 = new JLabel("Hello ,");
		lblNewLabel_1_1.setBounds(10, 11, 48, 42);
		panel.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		lblNewLabel_1_1.setBackground(new Color(0, 51, 102));
		
		Name = new JLabel("Name");
		Name.setForeground(Color.WHITE);
		Name.setFont(new Font("Segoe UI Light", Font.BOLD, 15));
		Name.setBackground(new Color(0, 51, 102));
		Name.setBounds(63, 11, 154, 42);
		panel.add(Name);
		
		JButton btnHome = new JButton("Home");
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(HomePanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				
			}
		});
		btnHome.setForeground(Color.WHITE);
		btnHome.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnHome.setBorderPainted(false);
		btnHome.setBackground(new Color(204, 102, 255));
		btnHome.setBounds(0, 127, 217, 56);
		panel.add(btnHome);
		
		JButton btnLogout = new JButton("Logout ");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFrame f7 =new JFrame(); 
	          int rs = JOptionPane.showConfirmDialog(f7,"Are you sure you want to logout ? ", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (rs==JOptionPane.YES_OPTION ) {
					LoginCustomer p = new LoginCustomer();
					p.setVisible(true);
					dispose();
				}
				
				
				else {
					
				}
				
			}
		});
		btnLogout.setForeground(Color.WHITE);
		btnLogout.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnLogout.setBorderPainted(false);
		btnLogout.setBackground(new Color(204, 102, 255));
		btnLogout.setBounds(0, 390, 217, 56);
		panel.add(btnLogout);
		
		JLabel lblNewLabel_1 = new JLabel("Welcome to Mealdicted");
		lblNewLabel_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 25));
		lblNewLabel_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1.setBounds(234, 0, 389, 61);
		contentPane.add(lblNewLabel_1);
		
		idread = new JLabel("ID");
		idread.setVisible(false);
		idread.setForeground(new Color(0, 51, 51));
		idread.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		idread.setBackground(new Color(0, 51, 102));
		idread.setBounds(753, 0, 84, 15);
		contentPane.add(idread);
		
		MainPanel = new JPanel();
		MainPanel.setBackground(Color.WHITE);
		MainPanel.setBounds(216, 53, 635, 627);
		contentPane.add(MainPanel);
		MainPanel.setLayout(new CardLayout(0, 0));
		
		HomePanel = new JPanel();
		HomePanel.setBackground(Color.WHITE);
		MainPanel.add(HomePanel, "name_205026257924500");
		HomePanel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
	    lblNewLabel.setBounds(155, 128, 339, 293);
		HomePanel.add(lblNewLabel);
		
	    ProfilePanel = new JPanel();
		ProfilePanel.setBackground(Color.WHITE);
		MainPanel.add(ProfilePanel, "name_205033942386200");
		ProfilePanel.setLayout(null);
		
		JLabel lblCustomerId = new JLabel("Customer ID :");
		lblCustomerId.setForeground(new Color(0, 51, 51));
		lblCustomerId.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblCustomerId.setBackground(new Color(0, 51, 102));
		lblCustomerId.setBounds(71, 84, 84, 15);
		ProfilePanel.add(lblCustomerId);
		
		idlbl = new JLabel("ID");
		idlbl.setForeground(new Color(0, 51, 51));
		idlbl.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		idlbl.setBackground(new Color(0, 51, 102));
		idlbl.setBounds(166, 84, 84, 15);
		ProfilePanel.add(idlbl);
		
		JLabel lblName = new JLabel("First name :");
		lblName.setForeground(new Color(0, 51, 51));
		lblName.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblName.setBackground(new Color(0, 51, 102));
		lblName.setBounds(71, 127, 84, 15);
		ProfilePanel.add(lblName);
		
		fn = new JLabel("ID");
		fn.setForeground(new Color(0, 51, 51));
		fn.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		fn.setBackground(new Color(0, 51, 102));
		fn.setBounds(166, 127, 84, 15);
		ProfilePanel.add(fn);
		
		JLabel lblLastName = new JLabel("Last name :");
		lblLastName.setForeground(new Color(0, 51, 51));
		lblLastName.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblLastName.setBackground(new Color(0, 51, 102));
		lblLastName.setBounds(71, 169, 84, 15);
		ProfilePanel.add(lblLastName);
		
		ln = new JLabel("ID");
		ln.setForeground(new Color(0, 51, 51));
		ln.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		ln.setBackground(new Color(0, 51, 102));
		ln.setBounds(166, 169, 84, 15);
		ProfilePanel.add(ln);
		
		JLabel lblGender = new JLabel("Gender :");
		lblGender.setForeground(new Color(0, 51, 51));
		lblGender.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblGender.setBackground(new Color(0, 51, 102));
		lblGender.setBounds(71, 213, 84, 15);
		ProfilePanel.add(lblGender);
		
		gn = new JLabel("ID");
		gn.setForeground(new Color(0, 51, 51));
		gn.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		gn.setBackground(new Color(0, 51, 102));
		gn.setBounds(166, 213, 84, 15);
		ProfilePanel.add(gn);
		
		JLabel lblDateOfBirth = new JLabel("Date of Birth");
		lblDateOfBirth.setForeground(new Color(0, 51, 51));
		lblDateOfBirth.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblDateOfBirth.setBackground(new Color(0, 51, 102));
		lblDateOfBirth.setBounds(71, 263, 84, 15);
		ProfilePanel.add(lblDateOfBirth);
		
		dob = new JLabel("ID");
		dob.setForeground(new Color(0, 51, 51));
		dob.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		dob.setBackground(new Color(0, 51, 102));
		dob.setBounds(166, 263, 84, 15);
		ProfilePanel.add(dob);
		
		JLabel lblEmail = new JLabel("Email ");
		lblEmail.setForeground(new Color(0, 51, 51));
		lblEmail.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblEmail.setBackground(new Color(0, 51, 102));
		lblEmail.setBounds(71, 311, 84, 15);
		ProfilePanel.add(lblEmail);
		
		em = new JLabel("ID");
		em.setForeground(new Color(0, 51, 51));
		em.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		em.setBackground(new Color(0, 51, 102));
		em.setBounds(166, 311, 222, 15);
		ProfilePanel.add(em);
		
		JLabel lblState = new JLabel("State :");
		lblState.setForeground(new Color(0, 51, 51));
		lblState.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblState.setBackground(new Color(0, 51, 102));
		lblState.setBounds(398, 84, 84, 15);
		ProfilePanel.add(lblState);
		
		st = new JLabel("ID");
		st.setForeground(new Color(0, 51, 51));
		st.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		st.setBackground(new Color(0, 51, 102));
		st.setBounds(493, 84, 84, 15);
		ProfilePanel.add(st);
		
		JLabel lblCity = new JLabel("City :");
		lblCity.setForeground(new Color(0, 51, 51));
		lblCity.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblCity.setBackground(new Color(0, 51, 102));
		lblCity.setBounds(398, 127, 84, 15);
		ProfilePanel.add(lblCity);
		
		ct = new JLabel("ID");
		ct.setForeground(new Color(0, 51, 51));
		ct.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		ct.setBackground(new Color(0, 51, 102));
		ct.setBounds(493, 127, 84, 15);
		ProfilePanel.add(ct);
		
		JLabel lblStreetAddress = new JLabel("Street Address :");
		lblStreetAddress.setForeground(new Color(0, 51, 51));
		lblStreetAddress.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblStreetAddress.setBackground(new Color(0, 51, 102));
		lblStreetAddress.setBounds(398, 169, 84, 15);
		ProfilePanel.add(lblStreetAddress);
		
		sa = new JLabel("ID");
		sa.setForeground(new Color(0, 51, 51));
		sa.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		sa.setBackground(new Color(0, 51, 102));
		sa.setBounds(493, 169, 84, 15);
		ProfilePanel.add(sa);
		
		JLabel lblPhone = new JLabel("Phone :");
		lblPhone.setForeground(new Color(0, 51, 51));
		lblPhone.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblPhone.setBackground(new Color(0, 51, 102));
		lblPhone.setBounds(398, 213, 84, 15);
		ProfilePanel.add(lblPhone);
		
		pn = new JLabel("ID");
		pn.setForeground(new Color(0, 51, 51));
		pn.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		pn.setBackground(new Color(0, 51, 102));
		pn.setBounds(493, 213, 84, 15);
		ProfilePanel.add(pn);
		
		JLabel lblUsername = new JLabel("Username :");
		lblUsername.setForeground(new Color(0, 51, 51));
		lblUsername.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblUsername.setBackground(new Color(0, 51, 102));
		lblUsername.setBounds(398, 263, 84, 15);
		ProfilePanel.add(lblUsername);
		
		us = new JLabel("ID");
		us.setForeground(new Color(0, 51, 51));
		us.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		us.setBackground(new Color(0, 51, 102));
		us.setBounds(493, 263, 84, 15);
		ProfilePanel.add(us);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setForeground(new Color(0, 51, 51));
		lblPassword.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblPassword.setBackground(new Color(0, 51, 102));
		lblPassword.setBounds(398, 311, 84, 15);
		ProfilePanel.add(lblPassword);
		
		ps = new JLabel("ID");
		ps.setForeground(new Color(0, 51, 51));
		ps.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		ps.setBackground(new Color(0, 51, 102));
		ps.setBounds(493, 311, 84, 15);
		ProfilePanel.add(ps);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 391, 631, 225);
		ProfilePanel.add(panel_1);
		
		ViewOrderPanel = new JPanel();
		ViewOrderPanel.setBackground(Color.WHITE);
		MainPanel.add(ViewOrderPanel, "name_215447532961300");
		ViewOrderPanel.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 71, 597, 107);
		ViewOrderPanel.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "Order ID", "CUSID", "New column", "New column", "New column"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(0);
		table.getColumnModel().getColumn(0).setMinWidth(0);
		table.getColumnModel().getColumn(0).setMaxWidth(0);
		table.getColumnModel().getColumn(1).setMinWidth(100);
		table.getColumnModel().getColumn(2).setPreferredWidth(0);
		table.getColumnModel().getColumn(2).setMinWidth(0);
		table.getColumnModel().getColumn(2).setMaxWidth(0);
		table.getColumnModel().getColumn(3).setMinWidth(100);
		table.getColumnModel().getColumn(4).setMinWidth(100);
		table.getColumnModel().getColumn(5).setMinWidth(100);
		scrollPane.setRowHeaderView(table);
		
		JLabel lblNewLabel_1_2 = new JLabel("My order ");
		lblNewLabel_1_2.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lblNewLabel_1_2.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2.setBounds(10, 0, 389, 27);
		ViewOrderPanel.add(lblNewLabel_1_2);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 256, 446, 224);
		ViewOrderPanel.add(scrollPane_1);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)table_1.getModel();
				int sr = table_1.getSelectedRow();
				
				pronam.setText(modl.getValueAt(sr, 0).toString());
				
			}
		});
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"New column", "New column"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(300);
		table_1.getColumnModel().getColumn(0).setMinWidth(300);
		table_1.getColumnModel().getColumn(1).setPreferredWidth(500);
		table_1.getColumnModel().getColumn(1).setMinWidth(300);
		scrollPane_1.setRowHeaderView(table_1);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("My order's Items ");
		lblNewLabel_1_2_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 20));
		lblNewLabel_1_2_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_1.setBounds(10, 187, 389, 37);
		ViewOrderPanel.add(lblNewLabel_1_2_1);
		
		JLabel lblNewLabel_1_2_2 = new JLabel("Order ID");
		lblNewLabel_1_2_2.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblNewLabel_1_2_2.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2.setBounds(10, 38, 59, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2);
		
		JLabel lblNewLabel_1_2_2_1 = new JLabel("Order Date");
		lblNewLabel_1_2_2_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblNewLabel_1_2_2_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_1.setBounds(119, 38, 102, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_1);
		
		JLabel lblNewLabel_1_2_2_2 = new JLabel("Delivery date ");
		lblNewLabel_1_2_2_2.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblNewLabel_1_2_2_2.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_2.setBounds(230, 38, 102, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_2);
		
		JLabel lblNewLabel_1_2_2_3 = new JLabel("Total price ");
		lblNewLabel_1_2_2_3.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblNewLabel_1_2_2_3.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_3.setBounds(354, 38, 102, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_3);
		
		JLabel lblNewLabel_1_2_2_4 = new JLabel("Product name ");
		lblNewLabel_1_2_2_4.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblNewLabel_1_2_2_4.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_4.setBounds(10, 228, 99, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_4);
		
		JLabel lblNewLabel_1_2_2_1_1 = new JLabel("Price ");
		lblNewLabel_1_2_2_1_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 14));
		lblNewLabel_1_2_2_1_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_1_1.setBounds(390, 228, 102, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_1_1);
		
		JLabel lblNewLabel_1_2_2_1_1_1 = new JLabel("To check the product details just select the product name from the table and click on check");
		lblNewLabel_1_2_2_1_1_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 10));
		lblNewLabel_1_2_2_1_1_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_1_1_1.setBounds(10, 491, 402, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_1_1_1);
		
		pronam = new JTextField();
		pronam.setBounds(431, 494, 96, 20);
		ViewOrderPanel.add(pronam);
		pronam.setColumns(10);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1 = new JLabel("Manufacturer :");
		lblNewLabel_1_2_2_1_1_1_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_1_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_1_1_1_1.setBounds(10, 596, 96, 16);
		ViewOrderPanel.add(lblNewLabel_1_2_2_1_1_1_1);
		
		man = new JLabel("");
		man.setForeground(new Color(0, 51, 51));
		man.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		man.setBackground(new Color(0, 51, 102));
		man.setBounds(105, 596, 116, 16);
		ViewOrderPanel.add(man);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1_1 = new JLabel("Brand :");
		lblNewLabel_1_2_2_1_1_1_1_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_1_1_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_1_1_1_1_1.setBounds(10, 556, 47, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_1_1_1_1_1);
		
		br = new JLabel("");
		br.setForeground(new Color(0, 51, 51));
		br.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		br.setBackground(new Color(0, 51, 102));
		br.setBounds(105, 563, 116, 20);
		ViewOrderPanel.add(br);
		
		JButton btnNewButton = new JButton("Check");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (pronam.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Please select or enter the name");
				}
				
				else {
					
				
				File myobj1 = new File ("Products.txt");
				String name = pronam.getText();
				
				Scanner y = null;
				
				try {
					y= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
				
				while (y.hasNext()) {
					
					int seriel = y.nextInt();	
					String ID = y.next(); 
					String Gtype = y.next(); 
					String Manf = y.next();
					String Brand = y.next();
					String Pron = y.next();
					String Weight = y.next();
					String Quality = y.next();
					String Price = y.next();
					
					
					
					
					 if (Pron.equals(name) )
						 
						{
						 
						 typ.setText(Gtype);
						 man.setText(Manf);
						 br.setText(Brand);
						 wght.setText(Weight);
						 qlt.setText(Quality);
						 
						
						}
					 
					 
					 
						 
						 
					 }
					 
				
				y.close();
				
				}
			}
		});
		btnNewButton.setBounds(431, 518, 99, 23);
		ViewOrderPanel.add(btnNewButton);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1_1_1 = new JLabel("Type");
		lblNewLabel_1_2_2_1_1_1_1_1_1.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_1_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_1_1_1_1.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_1_1_1_1_1_1.setBounds(10, 518, 47, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_1_1_1_1_1_1);
		
		typ = new JLabel("");
		typ.setForeground(new Color(0, 51, 51));
		typ.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		typ.setBackground(new Color(0, 51, 102));
		typ.setBounds(105, 521, 116, 20);
		ViewOrderPanel.add(typ);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1_1_2 = new JLabel("Weight :");
		lblNewLabel_1_2_2_1_1_1_1_1_2.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_1_1_1_1_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_1_1_1_2.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_1_1_1_1_1_2.setBounds(233, 525, 64, 20);
		ViewOrderPanel.add(lblNewLabel_1_2_2_1_1_1_1_1_2);
		
		wght = new JLabel("");
		wght.setForeground(new Color(0, 51, 51));
		wght.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		wght.setBackground(new Color(0, 51, 102));
		wght.setBounds(329, 525, 102, 20);
		ViewOrderPanel.add(wght);
		
		JLabel lblNewLabel_1_2_2_1_1_1_1_1_3 = new JLabel("Quality :");
		lblNewLabel_1_2_2_1_1_1_1_1_3.setForeground(new Color(0, 51, 51));
		lblNewLabel_1_2_2_1_1_1_1_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_1_2_2_1_1_1_1_1_3.setBackground(new Color(0, 51, 102));
		lblNewLabel_1_2_2_1_1_1_1_1_3.setBounds(230, 556, 47, 27);
		ViewOrderPanel.add(lblNewLabel_1_2_2_1_1_1_1_1_3);
		
		qlt = new JLabel("");
		qlt.setForeground(new Color(0, 51, 51));
		qlt.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		qlt.setBackground(new Color(0, 51, 102));
		qlt.setBounds(326, 559, 102, 20);
		ViewOrderPanel.add(qlt);
		
		
	}
}
