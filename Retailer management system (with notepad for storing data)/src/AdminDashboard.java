import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Formatter;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import javax.swing.JPasswordField;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.Component;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSpinner;

import com.toedter.calendar.JDateChooser;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Dimension;

public class AdminDashboard extends JFrame {

	private JPanel contentPane;
	
	
	//add panels 
	
	JPanel MainPanel;
	JPanel addcuspanel;
	JPanel editcuspanel;
	JPanel deletecuspanel;
	JPanel searchcuspanel;
	JPanel addproductpanel;
	JPanel editproductpanel;
	JPanel deleteproductpanel;
	JPanel searchproductpanel;
	JPanel addorderpanel;
	JPanel editorderpanel;
	JPanel deleteorderpanel;
	JPanel searchorderpanel;
	private JTextField fncusrtxt;
	private JTextField lncusrtxt;
	private JTextField ecusrtxt;
	private JTextField pcusrtxt;
	private JTextField ctcusrtxt;
	private JTextField sacusrtxt;
	private JTextField stcusrtxt;
	private JTextField uscusrtxt;
	private JPasswordField pscusrtxt;
	private JTable table1;
	private JTable tablecuse;
	private JTextField delcustxt;
	private JTable table3;
	private JTextField searchcustxt;
	private JTextField mnfadtxt;
	private JTextField bradtxt;
	private JTextField namadtxt;
	private JTextField wadtxt;
	private JTextField mnfedtxt;
	private JTextField bredtxt;
	private JTextField namedtxt;
	private JTextField prcedtxt;
	private JTextField srchedtxt;
	private JTextField delproxt;
	private JTextField addordcusid;
	JTable tabelshoppingcart;
	private JTextField addordpron;
	private JTextField addordproid;
	private JTextField addordprc;
	private JTextField edprc;
	private JTable eorditbl;
	private JTable eordtbl;
	private JTextField edoid;
	private JTextField delord;
	private JTextField searchord;
	private JTextField searchprotxt;
	private JTextField txtWedtxt;
	private JTable tableshoppingitem;
	private JTextField prcadtxt;
	private JTextField addordpriceunit;
	JDateChooser addorddeld;
	JDateChooser eddeld;
	private JTable table_2;
	private JTable sodt;
	private JTable soitbl;
	private JTable tablecusee;
	private JTable tablee;
	private JTable table_1;
	private JTable table_3;
	private JTextField fnetxt;
	private JTextField lnetxt;
	private JTextField emetxt;
	private JTextField pnetxt;
	private JTextField ctetxt;
	private JTextField saetxt;
	private JTextField stetxt;
	private JTextField usetxt;
	private JPasswordField psetxt;
	private JTextField gdetxt;
	private JTextField sidetxt;
	private JTextField detxt;
	private JTextField gtypedtxt;
	JComboBox quality;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminDashboard frame = new AdminDashboard();
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
	public AdminDashboard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(150, 20, 1009, 721);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		Image img = new ImageIcon(this.getClass().getResource("/final_logo.png")).getImage();
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 153, 153));
		panel.setBounds(0, 0, 216, 689);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(102, 153, 153));
		panel_1.setLayout(null);
		panel_1.setBounds(0, 87, 214, 189);
		panel.add(panel_1);
		
		
		JButton cusviewbtn = new JButton("Search and view customers");
		cusviewbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(searchcuspanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				DefaultTableModel modelc = (DefaultTableModel) table3.getModel();
				modelc.setRowCount(0);
				fnetxt.setText("");
				
				
				// file reading
				File cusfile = new File ("CustomerRegistration.txt");
				try {
					
					
				        
				    int rowc = table3.getRowCount();
					
					
					if(rowc <= 1) {
					
					
					FileReader fr = new FileReader(cusfile);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)table3.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		cusviewbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		cusviewbtn.setHorizontalAlignment(SwingConstants.LEFT);
		cusviewbtn.setForeground(Color.WHITE);
		cusviewbtn.setBackground(new Color(102, 153, 102));
		cusviewbtn.setBorderPainted(false);
		cusviewbtn.setBounds(0, 155, 214, 34);
		panel_1.add(cusviewbtn);
		
		JButton cusdeletebtn = new JButton("Delete customer");
		cusdeletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(deletecuspanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				
				DefaultTableModel modelc = (DefaultTableModel) tablecusee.getModel();
				modelc.setRowCount(0);
				fnetxt.setText("");
				
				
				// file reading
				File cusfile = new File ("CustomerRegistration.txt");
				try {
					
					
				        
				    int rowc = tablecusee.getRowCount();
					
					
					if(rowc <= 1) {
					
					
					FileReader fr = new FileReader(cusfile);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)tablecusee.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		cusdeletebtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		cusdeletebtn.setHorizontalAlignment(SwingConstants.LEFT);
		cusdeletebtn.setForeground(Color.WHITE);
		cusdeletebtn.setBackground(new Color(51, 153, 204));
		cusdeletebtn.setBorderPainted(false);
		cusdeletebtn.setBounds(0, 123, 214, 34);
		panel_1.add(cusdeletebtn);
		
		JButton cuseditbtn = new JButton("Edit customer's details");
		cuseditbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(editcuspanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				DefaultTableModel modelc = (DefaultTableModel) table1.getModel();
				modelc.setRowCount(0);
				
				fnetxt.setText("");
				lnetxt.setText("");
				detxt.setText("");
				gdetxt.setText("");
				emetxt.setText("");
				stetxt.setText("");
				ctetxt.setText("");
				saetxt.setText("");
				psetxt.setText("");
				usetxt.setText("");
				pnetxt.setText(""); 
				sidetxt.setText("");
				
				// file reading
				File cusfile = new File ("CustomerRegistration.txt");
				try {
					
					
				        
				    int rowc = table1.getRowCount();
					
					
					if(rowc <= 1) {
					
					
					FileReader fr = new FileReader(cusfile);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)table1.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
					
				
				
				
			
			}
		});
		cuseditbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		cuseditbtn.setHorizontalAlignment(SwingConstants.LEFT);
		cuseditbtn.setForeground(Color.WHITE);
		cuseditbtn.setBackground(new Color(102, 153, 153));
		cuseditbtn.setBorderPainted(false);
		cuseditbtn.setBounds(0, 91, 214, 34);
		panel_1.add(cuseditbtn);
		
		JButton cusaddbtn = new JButton("Register new customer");
		cusaddbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainPanel.removeAll();
				MainPanel.add(addcuspanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
			}
		});
		cusaddbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		cusaddbtn.setHorizontalAlignment(SwingConstants.LEFT);
		cusaddbtn.setForeground(Color.WHITE);
		cusaddbtn.setBackground(new Color(0, 153, 204));
		cusaddbtn.setBorderPainted(false);
		cusaddbtn.setBounds(0, 59, 214, 34);
		panel_1.add(cusaddbtn);
		
		JLabel lblNewLabel = new JLabel("Customers");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(10, 34, 81, 14);
		panel_1.add(lblNewLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(102, 153, 153));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, 276, 214, 189);
		panel.add(panel_1_1);
		
		JButton productviewbtn = new JButton("Search and view products");
		productviewbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(searchproductpanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				
				DefaultTableModel modelc = (DefaultTableModel) table_3.getModel();
				modelc.setRowCount(0);
				
				searchprotxt.setText("");
				
				
				// file reading
				File cusfile = new File ("Products.txt");
				try {
					
					
				        
				    int rowc = table_3.getRowCount();
					
					
					if(rowc <= 1) {
					
					
					FileReader fr = new FileReader(cusfile);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)table_3.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		productviewbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		productviewbtn.setHorizontalAlignment(SwingConstants.LEFT);
		productviewbtn.setBackground(new Color(102, 153, 102));
		productviewbtn.setForeground(Color.WHITE);
		productviewbtn.setBorderPainted(false);
		productviewbtn.setBounds(0, 155, 214, 34);
		panel_1_1.add(productviewbtn);
		
		JButton productdeletebtn = new JButton("Delete product");
		productdeletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(deleteproductpanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				DefaultTableModel modelc = (DefaultTableModel) table_1.getModel();
				modelc.setRowCount(0);
				
				delproxt.setText("");
				
				
				// file reading
				File cusfile = new File ("Products.txt");
				try {
					
					
				        
				    int rowc = table_1.getRowCount();
					
					
					if(rowc <= 1) {
					
					
					FileReader fr = new FileReader(cusfile);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)table_1.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		productdeletebtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		productdeletebtn.setHorizontalAlignment(SwingConstants.LEFT);
		productdeletebtn.setBackground(new Color(51, 153, 204));
		productdeletebtn.setForeground(Color.WHITE);
		productdeletebtn.setBorderPainted(false);
		productdeletebtn.setBounds(0, 123, 214, 34);
		panel_1_1.add(productdeletebtn);
		
		JButton producteditbtn = new JButton("Edit product's details");
		producteditbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(editproductpanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				
				
				
				DefaultTableModel modelc = (DefaultTableModel) tablee.getModel();
				modelc.setRowCount(0);
				
				srchedtxt.setText("");
				gtypedtxt.setText("");
				 mnfedtxt.setText("");
				 bredtxt.setText("");
				 namedtxt.setText("");
				 txtWedtxt.setText("");
				 quality.setSelectedItem("");
				 prcedtxt.setText("");
				
				// file reading
				File cusfile = new File ("Products.txt");
				try {
					
					
				        
				    int rowc = tablee.getRowCount();
					
					
					if(rowc <= 1) {
					
					
					FileReader fr = new FileReader(cusfile);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)tablee.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		producteditbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		producteditbtn.setHorizontalAlignment(SwingConstants.LEFT);
		producteditbtn.setBackground(new Color(102, 153, 153));
		producteditbtn.setForeground(Color.WHITE);
		producteditbtn.setBorderPainted(false);
		producteditbtn.setBounds(0, 91, 214, 34);
		panel_1_1.add(producteditbtn);
		
		JButton productaddbtn = new JButton("Add new grocery item");
		productaddbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(addproductpanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
			}
		});
		productaddbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		productaddbtn.setHorizontalAlignment(SwingConstants.LEFT);
		productaddbtn.setBackground(new Color(51, 153, 204));
		productaddbtn.setForeground(Color.WHITE);
		productaddbtn.setBorderPainted(false);
		productaddbtn.setBounds(0, 59, 214, 34);
		panel_1_1.add(productaddbtn);
		
		JLabel lblProducts = new JLabel("Products");
		lblProducts.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblProducts.setForeground(Color.WHITE);
		lblProducts.setBounds(10, 34, 81, 14);
		panel_1_1.add(lblProducts);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBackground(new Color(102, 153, 153));
		panel_1_2.setLayout(null);
		panel_1_2.setBounds(0, 465, 214, 189);
		panel.add(panel_1_2);
		
		JButton orderviewbtn = new JButton("Search and view order");
		orderviewbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(searchorderpanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				searchord.setText("");
				// file reading
				File file = new File ("Order.txt");
				try {
					
					
				    DefaultTableModel model0 = (DefaultTableModel)sodt.getModel();
				    model0.setRowCount(0);
				    
				    int rowc = sodt.getRowCount();
					
					
					if(rowc <= 0) {
					
					
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)sodt.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					}
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			}
		});
		orderviewbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		orderviewbtn.setHorizontalAlignment(SwingConstants.LEFT);
		orderviewbtn.setBackground(new Color(102, 153, 102));
		orderviewbtn.setForeground(Color.WHITE);
		orderviewbtn.setBorderPainted(false);
		orderviewbtn.setBounds(0, 155, 214, 34);
		panel_1_2.add(orderviewbtn);
		
		JButton orderdeletebtn = new JButton("Delete orders");
		orderdeletebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(deleteorderpanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				delord.setText("");
				// file reading
				File file = new File ("Order.txt");
				try {
					
					
				    DefaultTableModel model0 = (DefaultTableModel)table_2.getModel();
				    model0.setRowCount(0);
				    
				    int rowc = table_2.getRowCount();
					
					
					if(rowc <= 0) {
					
					
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)table_2.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
				
				
			}
		});
		orderdeletebtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		orderdeletebtn.setHorizontalAlignment(SwingConstants.LEFT);
		orderdeletebtn.setBackground(new Color(51, 153, 204));
		orderdeletebtn.setForeground(Color.WHITE);
		orderdeletebtn.setBorderPainted(false);
		orderdeletebtn.setBounds(0, 123, 214, 34);
		panel_1_2.add(orderdeletebtn);
		
		JButton ordereditbtn = new JButton("Edit order's details ");
		ordereditbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(editorderpanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				
				edoid.setText("");
				edprc.setText("");
				DefaultTableModel modelc = (DefaultTableModel) eorditbl.getModel();
				 modelc.setRowCount(0);
				// file reading
				File file = new File ("Order.txt");
				try {
					
					
				    DefaultTableModel model0 = (DefaultTableModel)eordtbl.getModel();
				    model0.setRowCount(0);
				    
				    int rowc = eordtbl.getRowCount();
					
					
					if(rowc <= 0) {
					
					
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)eordtbl.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		ordereditbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		ordereditbtn.setHorizontalAlignment(SwingConstants.LEFT);
		ordereditbtn.setBackground(new Color(51, 153, 102));
		ordereditbtn.setForeground(Color.WHITE);
		ordereditbtn.setBorderPainted(false);
		ordereditbtn.setBounds(0, 91, 214, 34);
		panel_1_2.add(ordereditbtn);
		
		JButton orderaddbtn = new JButton("Add an Order");
		orderaddbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(addorderpanel);
				MainPanel.repaint();
				MainPanel.revalidate();
				
				
				
				DefaultTableModel modelc = (DefaultTableModel) tabelshoppingcart.getModel();
				modelc.setRowCount(0);
				addordcusid.setText("");
				addordproid.setText("");
				addordpron.setText("");
				addordprc.setText("");
				addordpriceunit.setText("");
				
				 
				// file reading
				File file = new File ("Products.txt");
				try {
					
					
				    DefaultTableModel model0 = (DefaultTableModel)tableshoppingitem.getModel();
				    model0.setRowCount(0);
				    
				    int rowc = tableshoppingitem.getRowCount();
					
					
					if(rowc <= 0) {
					
					
					FileReader fr = new FileReader(file);
					BufferedReader br = new BufferedReader(fr);
					DefaultTableModel model = (DefaultTableModel)tableshoppingitem.getModel();
					Object [] lines = br.lines().toArray();
					
					for(int i = 0; i < lines.length; i++) {
						String[] row = lines[i].toString().split(" ");
						model.addRow(row); 
						
					} 
					
					
					try {
						fr.close();
						br.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					}
						
					
					
					
					
					
					
					
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
				
			}
		});
		orderaddbtn.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		orderaddbtn.setHorizontalAlignment(SwingConstants.LEFT);
		orderaddbtn.setBackground(new Color(51, 153, 204));
		orderaddbtn.setForeground(Color.WHITE);
		orderaddbtn.setBorderPainted(false);
		orderaddbtn.setBounds(0, 59, 214, 34);
		panel_1_2.add(orderaddbtn);
		
		JLabel lblOrders = new JLabel("Orders");
		lblOrders.setFont(new Font("Segoe UI", Font.BOLD, 14));
		lblOrders.setForeground(Color.WHITE);
		lblOrders.setBounds(10, 34, 81, 14);
		panel_1_2.add(lblOrders);
		
		JLabel lblNewLabel_1 = new JLabel("MEALDICTED's Admin system");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(10, 11, 196, 67);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		JLabel lblNewLabel_2 = new JLabel("Hello there, welcome back ");
		lblNewLabel_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 17));
		lblNewLabel_2.setBounds(221, 0, 244, 47);
		contentPane.add(lblNewLabel_2);
		
		JButton logoutbtn = new JButton("Logout ");
		logoutbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame f7 =new JFrame(); 
		          int rs = JOptionPane.showConfirmDialog(f7,"Are you sure you want to logout ? ", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
					
					if (rs==JOptionPane.YES_OPTION ) {
						AdminLogin p = new AdminLogin();
						p.setVisible(true);
						dispose();
					}
					
					
					else {
						
					}
			}
		});
		logoutbtn.setForeground(Color.WHITE);
		logoutbtn.setFont(new Font("Segoe UI", Font.BOLD, 14));
		logoutbtn.setBorderPainted(false);
		logoutbtn.setBackground(new Color(102, 153, 102));
		logoutbtn.setBounds(874, 0, 90, 23);
		contentPane.add(logoutbtn);
		
		MainPanel = new JPanel();
		MainPanel.setBounds(216, 69, 777, 620);
		contentPane.add(MainPanel);
		MainPanel.setLayout(new CardLayout(0, 0));
		
		JPanel HomePage = new JPanel();
		HomePage.setBackground(Color.WHITE);
		MainPanel.add(HomePage, "name_183028212255600");
		HomePage.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setBounds(213, 125, 339, 293);
		HomePage.add(lblNewLabel_5);
		Image img1 = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		lblNewLabel_5.setIcon(new ImageIcon(img1));
		
		JLabel lblNewLabel_2_4 = new JLabel("Dashboard ");
		lblNewLabel_2_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 26));
		lblNewLabel_2_4.setBounds(311, 429, 139, 47);
		HomePage.add(lblNewLabel_2_4);
		
		JLabel lblNewLabel_2_4_1_1 = new JLabel("Company Terms and policy");
		lblNewLabel_2_4_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 15));
		lblNewLabel_2_4_1_1.setBounds(584, 562, 193, 47);
		HomePage.add(lblNewLabel_2_4_1_1);
		
		addcuspanel = new JPanel();
		addcuspanel.setBackground(Color.WHITE);
		MainPanel.add(addcuspanel, "name_183301021006100");
		addcuspanel.setLayout(null);
		
		JLabel lblNewLabel_2_1 = new JLabel("Register Customers");
		lblNewLabel_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1.setBounds(239, 35, 469, 47);
		addcuspanel.add(lblNewLabel_2_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(153, 204, 102));
		panel_3.setBounds(10, 93, 728, 333);
		addcuspanel.add(panel_3);
		
		fncusrtxt = new JTextField();
		fncusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		fncusrtxt.setColumns(10);
		fncusrtxt.setBounds(10, 45, 178, 20);
		panel_3.add(fncusrtxt);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("First name ");
		lblNewLabel_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1.setBounds(10, 22, 166, 25);
		panel_3.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Last name");
		lblNewLabel_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1.setBounds(10, 76, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1);
		
		lncusrtxt = new JTextField();
		lncusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		lncusrtxt.setColumns(10);
		lncusrtxt.setBounds(10, 99, 178, 20);
		panel_3.add(lncusrtxt);
		
		JLabel lblNewLabel_2_1_1_1_1 = new JLabel("Email");
		lblNewLabel_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1.setBounds(10, 139, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1);
		
		ecusrtxt = new JTextField();
		ecusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		ecusrtxt.setColumns(10);
		ecusrtxt.setBounds(10, 162, 178, 20);
		panel_3.add(ecusrtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_1 = new JLabel("Phone Number ");
		lblNewLabel_2_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1.setBounds(10, 193, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_1);
		
		pcusrtxt = new JTextField();
		pcusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)  ) {
					e.consume();
					
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please input numbers only and for space user (-)");

						e.consume();
				}
			}
			
			 
				
		
		
		
		});
		pcusrtxt.setColumns(10);
		pcusrtxt.setBounds(10, 216, 178, 20);
		panel_3.add(pcusrtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_2 = new JLabel("City");
		lblNewLabel_2_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_2.setBounds(10, 258, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_2);
		
		ctcusrtxt = new JTextField();
		ctcusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		ctcusrtxt.setColumns(10);
		ctcusrtxt.setBounds(10, 281, 178, 20);
		panel_3.add(ctcusrtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_3 = new JLabel("Street address");
		lblNewLabel_2_1_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_3.setBounds(277, 130, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_3);
		
		sacusrtxt = new JTextField();
		sacusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		sacusrtxt.setColumns(10);
		sacusrtxt.setBounds(277, 153, 178, 20);
		panel_3.add(sacusrtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_4 = new JLabel("State ");
		lblNewLabel_2_1_1_1_1_4.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4.setBounds(277, 193, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_4);
		
		stcusrtxt = new JTextField();
		stcusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		stcusrtxt.setColumns(10);
		stcusrtxt.setBounds(277, 216, 178, 20);
		panel_3.add(stcusrtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_5 = new JLabel("");
		lblNewLabel_2_1_1_1_1_5.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_5.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_5.setBounds(542, 139, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_5);
		
		JLabel lblNewLabel_2_1_1_1_1_6 = new JLabel("Date of Birth");
		lblNewLabel_2_1_1_1_1_6.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_6.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_6.setBounds(277, 76, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_6);
		
		JLabel lblNewLabel_2_1_1_1_1_4_2 = new JLabel("Username ");
		lblNewLabel_2_1_1_1_1_4_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4_2.setBounds(514, 22, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_4_2);
		
		uscusrtxt = new JTextField();
		uscusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		uscusrtxt.setColumns(10);
		uscusrtxt.setBounds(514, 45, 178, 20);
		panel_3.add(uscusrtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_4_3 = new JLabel("Set a password ");
		lblNewLabel_2_1_1_1_1_4_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4_3.setBounds(515, 76, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_4_3);
		
		pscusrtxt = new JPasswordField();
		pscusrtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		pscusrtxt.setBounds(515, 99, 166, 20);
		panel_3.add(pscusrtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_4_1_2 = new JLabel("Gender");
		lblNewLabel_2_1_1_1_1_4_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4_1_2.setBounds(277, 22, 166, 25);
		panel_3.add(lblNewLabel_2_1_1_1_1_4_1_2);
		
		JComboBox gcusrtxt = new JComboBox();
		gcusrtxt.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		gcusrtxt.setBounds(277, 44, 178, 22);
		panel_3.add(gcusrtxt);
		
		Date t = new Date();
		JDateChooser cusrdatechr = new JDateChooser(t);
		cusrdatechr.setBounds(277, 99, 178, 20);
		panel_3.add(cusrdatechr);
		
		JLabel lblNewLabel_4_2 = new JLabel("*NOTE* we dont allow* space please use (-) instead of space ");
		lblNewLabel_4_2.setBounds(10, 0, 487, 14);
		panel_3.add(lblNewLabel_4_2);
		lblNewLabel_4_2.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JButton btnRegisterTheCustomer = new JButton("Register the customer ");
		btnRegisterTheCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String fname = fncusrtxt.getText();
				String lname = lncusrtxt.getText();
				String gender = gcusrtxt.getSelectedItem().toString();
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String dob = sdf.format(cusrdatechr.getDate());
				String email = ecusrtxt.getText();
				String state = stcusrtxt.getText();
				String city = ctcusrtxt.getText();
				String street = sacusrtxt.getText();
				String password = pscusrtxt.getText();
				String username = uscusrtxt.getText();
				String phone = pcusrtxt.getText();
				JFrame f7;
				
				
				
				//-----------------------------------------------------------Start of ID code-----------------------------------------------	
				
				
				
				int max = 0;
				
				Scanner y = null;
				
				//Start of scanner read 
				try{
				y = new Scanner(new File("CustomerRegistration.txt"));
				while(y.hasNext())
				{	
				int seriel = y.nextInt();	
				String ID = y.next(); 
				String Fname = y.next(); 
				String Lname = y.next();
				String Gender = y.next();
				String Dob = y.next();
			    String Email = y.next();
				String State = y.next();
				String City = y.next();
				String Street = y.next();
				String Phone = y.next();
				String Username = y.next();
				String Password = y.next();
				
				
			    
				max = seriel;
				
				
				} 
				y.close();
				}
				
				
				catch(Exception e1){
					
				e1.printStackTrace();
				
				}// end of scanner try and catch
				
		//-----------------------------------------------------------End of Code----------------------------------------------------------------------------------	
				
				
				
				
				
				
				 
	//-----------------------------------------------------------Start if finnding similar username----------------------------------------------------	-----------	       
			      
				int usernamecount=0;
				int emailcount=0;
				
				try {
					
					String[] words=null; 
					File f1=new File("CustomerRegistration.txt");
					FileReader fr = new FileReader(f1);
					BufferedReader br = new BufferedReader(fr);
					
					
					String s;     
				      String similaruser = username;   // Input word to be searched
				      String similaremail = email;    // Input word to be searched
				         
				      try {
						while((s=br.readLine())!=null)   
						  {
						     words=s.split(" ");  //Split the word using space 
						      for (String word : words) 
						      {
						             if (word.equals(similaruser))   //Search for the given word
						             {
						               usernamecount++;    //If Present increase the count by one   
						             }
						             
						             if (word.equals(similaremail))   //Search for the given word
						             {
						               emailcount++;    //If Present increase the count by one
						             }
						      }
						  }
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();}
				      
				      
				      
				         try {
							fr.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					
					
					
					
					
					
					
				} 
				
				
				
				
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();   }  
				
			      
			   //----------------------------------------End of code -------------------------------------------------------------------------------- 
				
				
				
				
				
				
				
				
				
				
				
			//---------------------------------------------------------Start of code for registration----------------------------------------------------------------------	
				
				Formatter x = null;
				try{
				
					if ( !fname.equals("") && !lname.equals("") && !phone.equals("") && !email.equals("") && !username.equals("") && !password.equals("") && !city.equals("") && !state.equals("") && !street.equals("") && usernamecount == 0 && emailcount == 0  ) {
					
					
				FileWriter file = new FileWriter("CustomerRegistration.txt", true);
				x = new Formatter(file);
				x.format("%d CUS%s %s %s %s %s %s %s %s %s %s %s %s%n",++max,max,fname,lname,gender,dob,email,state,city,street,phone,username,password); 
				
				  f7 =new JFrame(); 
				 JOptionPane.showMessageDialog(f7,"Registration successfull");
				 x.close();
				 
				 fncusrtxt.setText("");
				 lncusrtxt.setText("");
				 pcusrtxt.setText("");
				 ecusrtxt.setText("");
				 uscusrtxt.setText("");
				 pscusrtxt.setText("");
				 ctcusrtxt.setText("");
				 stcusrtxt.setText("");
				 sacusrtxt.setText("");
				 
				 
				}
				
					else {
						f7 =new JFrame(); 
						 JOptionPane.showMessageDialog(f7,"The form must be empty or user already exist please use different username and email");
						
					}
				
				 
				
				
				}
				
				
				
				catch(Exception e2)
				{
					 f7=new JFrame(); 
					 JOptionPane.showMessageDialog(f7," Sorry Registration unsuccessful !");
				}
				
				
			//-----------------------------------------------------------------------------------End of Code --------------------------------------------------	
				
				
			}
		});
		btnRegisterTheCustomer.setForeground(Color.WHITE);
		btnRegisterTheCustomer.setBorderPainted(false);
		btnRegisterTheCustomer.setBackground(new Color(47, 79, 79));
		btnRegisterTheCustomer.setBounds(126, 437, 487, 41);
		addcuspanel.add(btnRegisterTheCustomer);
		
		editcuspanel = new JPanel();
		editcuspanel.setBackground(Color.WHITE);
		MainPanel.add(editcuspanel, "name_185299009922200");
		editcuspanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("Edit Customer's details");
		lblNewLabel_2_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2.setBounds(10, 11, 315, 47);
		editcuspanel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_2_1 = new JLabel("Customer's details");
		lblNewLabel_2_1_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_2_1_2_1.setBounds(601, 38, 137, 31);
		editcuspanel.add(lblNewLabel_2_1_2_1);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBorder(new EmptyBorder(3, 3, 3, 3));
		scrollPane.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBounds(10, 69, 728, 227);
		editcuspanel.add(scrollPane);
		
		
		
		table1 = new JTable();
		table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table1.addMouseListener(new MouseAdapter() {
			// code for selecting row and showing it in the text box 
			
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel modl = (DefaultTableModel)table1.getModel();
				int sr = table1.getSelectedRow();
				
				sidetxt.setText(modl.getValueAt(sr, 1).toString());
				
				
				
			}
		});
		table1.setAlignmentY(Component.TOP_ALIGNMENT);
		table1.setAlignmentX(Component.LEFT_ALIGNMENT);
		scrollPane.setViewportView(table1);
		table1.setColumnSelectionAllowed(true);
		table1.setCellSelectionEnabled(true);
		
		table1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial", "Customer ID", "First name", "Last name", "Gender", "Date of birth", "Email", "State", "City", "Street address", "Phone No.", "Username", "Password"
			}
		)
				);
		
		JButton btnRegisterTheCustomer_1 = new JButton("Register the customer ");
		btnRegisterTheCustomer_1.setForeground(Color.WHITE);
		btnRegisterTheCustomer_1.setBorderPainted(false);
		btnRegisterTheCustomer_1.setBackground(new Color(47, 79, 79));
		btnRegisterTheCustomer_1.setBounds(126, 658, 487, 41);
		editcuspanel.add(btnRegisterTheCustomer_1);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setLayout(null);
		panel_3_1.setBackground(new Color(204, 204, 255));
		panel_3_1.setBounds(10, 313, 728, 248);
		editcuspanel.add(panel_3_1);
		
		fnetxt = new JTextField();
		fnetxt.setEditable(false);
		fnetxt.setColumns(10);
		fnetxt.setBounds(10, 45, 178, 20);
		panel_3_1.add(fnetxt);
		
		JLabel lblNewLabel_2_1_1_2 = new JLabel("First name ");
		lblNewLabel_2_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2.setBounds(10, 22, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_2);
		
		JLabel lblNewLabel_2_1_1_1_2 = new JLabel("Last name");
		lblNewLabel_2_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2.setBounds(10, 76, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_2);
		
		lnetxt = new JTextField();
		lnetxt.setEditable(false);
		lnetxt.setColumns(10);
		lnetxt.setBounds(10, 99, 178, 20);
		panel_3_1.add(lnetxt);
		
		JLabel lblNewLabel_2_1_1_1_1_7 = new JLabel("Email");
		lblNewLabel_2_1_1_1_1_7.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_7.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_7.setBounds(10, 139, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_7);
		
		emetxt = new JTextField();
		emetxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		emetxt.setColumns(10);
		emetxt.setBounds(10, 162, 178, 20);
		panel_3_1.add(emetxt);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1 = new JLabel("Phone Number ");
		lblNewLabel_2_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_1.setBounds(10, 193, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_1_1);
		
		pnetxt = new JTextField();
		pnetxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)  ) {
					e.consume();
					
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please input numbers only and for space input (-)" );

						e.consume();
			}
			}
		});
		pnetxt.setColumns(10);
		pnetxt.setBounds(10, 216, 178, 20);
		panel_3_1.add(pnetxt);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1 = new JLabel("City");
		lblNewLabel_2_1_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_2_1.setBounds(500, 22, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_2_1);
		
		ctetxt = new JTextField();
		ctetxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		ctetxt.setColumns(10);
		ctetxt.setBounds(500, 45, 178, 20);
		panel_3_1.add(ctetxt);
		
		JLabel lblNewLabel_2_1_1_1_1_3_1 = new JLabel("Street address");
		lblNewLabel_2_1_1_1_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_3_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_3_1.setBounds(500, 76, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_3_1);
		
		saetxt = new JTextField();
		saetxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		saetxt.setColumns(10);
		saetxt.setBounds(500, 99, 178, 20);
		panel_3_1.add(saetxt);
		
		JLabel lblNewLabel_2_1_1_1_1_4_1 = new JLabel("State ");
		lblNewLabel_2_1_1_1_1_4_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4_1.setBounds(263, 193, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_4_1);
		
		stetxt = new JTextField();
		stetxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		stetxt.setColumns(10);
		stetxt.setBounds(263, 216, 178, 20);
		panel_3_1.add(stetxt);
		
		JLabel lblNewLabel_2_1_1_1_1_5_2 = new JLabel("");
		lblNewLabel_2_1_1_1_1_5_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_5_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_5_2.setBounds(542, 139, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_5_2);
		
		JLabel lblNewLabel_2_1_1_1_1_6_1 = new JLabel("Date of Birth");
		lblNewLabel_2_1_1_1_1_6_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_6_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_6_1.setBounds(263, 139, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_6_1);
		
		JLabel lblNewLabel_2_1_1_1_1_4_2_1 = new JLabel("Username ");
		lblNewLabel_2_1_1_1_1_4_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4_2_1.setBounds(500, 139, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_4_2_1);
		
		usetxt = new JTextField();
		usetxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		usetxt.setColumns(10);
		usetxt.setBounds(500, 162, 178, 20);
		panel_3_1.add(usetxt);
		
		JLabel lblNewLabel_2_1_1_1_1_4_3_1 = new JLabel("Set a password ");
		lblNewLabel_2_1_1_1_1_4_3_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4_3_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4_3_1.setBounds(501, 193, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_4_3_1);
		
		psetxt = new JPasswordField();
		psetxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		psetxt.setBounds(501, 216, 166, 20);
		panel_3_1.add(psetxt);
		
		JLabel lblNewLabel_2_1_1_1_1_4_1_2_2 = new JLabel("Gender");
		lblNewLabel_2_1_1_1_1_4_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4_1_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4_1_2_2.setBounds(263, 85, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_1_1_4_1_2_2);
		
		gdetxt = new JTextField();
		gdetxt.setEditable(false);
		gdetxt.setBounds(263, 108, 178, 20);
		panel_3_1.add(gdetxt);
		gdetxt.setColumns(10);
		
		JLabel lblNewLabel_2_1_1_2_1 = new JLabel("Search ID");
		lblNewLabel_2_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1.setBounds(251, 0, 166, 25);
		panel_3_1.add(lblNewLabel_2_1_1_2_1);
		
		sidetxt = new JTextField();
		sidetxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		sidetxt.setColumns(10);
		sidetxt.setBounds(263, 25, 178, 20);
		panel_3_1.add(sidetxt);
		
		detxt = new JTextField();
		detxt.setEditable(false);
		detxt.setColumns(10);
		detxt.setBounds(263, 162, 178, 20);
		panel_3_1.add(detxt);
		
		JButton btnNewButton_2 = new JButton("Search ");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sidetxt.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Please enter the ID");
				}
				
				else {
					
				
				
				File myobj1 = new File ("CustomerRegistration.txt");
				String id = sidetxt.getText();
				
				Scanner y = null;
				
				try {
					y= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				
				
				while (y.hasNext()) {
					
					    String seriel = y.next();	
						String ID = y.next(); 
						String Fname = y.next(); 
						String Lname = y.next();
						String Gender = y.next();
						String Dob = y.next();
						String Email = y.next();
						String State = y.next();
						String City = y.next();
						String Street = y.next();
						String Phone = y.next();
						String Username = y.next();
						String Password = y.next();
						
					
					
					
					
					 if (ID.equals(id) )
						 
						{
						 
						fnetxt.setText(Fname);
						lnetxt.setText(Lname);
						gdetxt.setText(Gender);
						detxt.setText(Dob);
					    emetxt.setText(Email);
					    stetxt.setText(State);
					    ctetxt.setText(City);
					    saetxt.setText(Street);
						pnetxt.setText(Phone);
						usetxt.setText(Username);
						psetxt.setText(Password);
						
						}
					 
					 
					 
						 
						 
					 }
					 
				
				y.close();
				
				}
			}
		});
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(102, 153, 153));
		btnNewButton_2.setBounds(353, 51, 89, 23);
		panel_3_1.add(btnNewButton_2);
		
		JButton btnSaveChanges = new JButton("Save changes");
		btnSaveChanges.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (sidetxt.getText().equals("") || fnetxt.getText().equals("")) {
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"The ID might be not given or the search button is not clicked");

					}
				
				else {
					
				
			try {
				
				
				String fname = fnetxt.getText();
				String lname = lnetxt.getText();
				String gender = gdetxt.getText();
				String dob = detxt.getText();
				String email = emetxt.getText();
				String state = stetxt.getText();
				String city = ctetxt.getText();
				String street =saetxt.getText();
				String password = psetxt.getText();
				String username = usetxt.getText();
				String phone = pnetxt.getText();
				
				
				 String filepath = "CustomerRegistration.txt";
				 String UpdateID = sidetxt.getText();
			
					
					String tempFile = "Filetemp.txt";
					   File oldFile = new File (filepath);
					   File newFile = new File (tempFile);
					   Scanner y = null;
					   try { 
						   FileWriter fw = new FileWriter(tempFile , true);
						   BufferedWriter bw = new BufferedWriter(fw);
						   PrintWriter pw = new PrintWriter(bw);
						   y = new Scanner(new File(filepath));
						   
						   
					   
						   while(y.hasNext())
							   
						   {
							  
							    String seriel = y.next();	
								String ID = y.next(); 
								String Fname = y.next(); 
								String Lname = y.next();
								String Gender = y.next();
								String Dob = y.next();
								String Email = y.next();
								String State = y.next();
								String City = y.next();
								String Street = y.next();
								String Phone = y.next();
								String Username = y.next();
								String Password = y.next();
								
							
							  
							   if (ID.equals(UpdateID)) {
								   
								   pw.println(seriel+" "+ ID +" "+fname+" " +lname+" " +gender+" " + dob+ " "+email +" "+state+" "+city+" "+street+" "+phone+" "+username+" "+password);
								   
								   JFrame f;
								   f=new JFrame(); 
									 JOptionPane.showMessageDialog(f,"Updated !");
								   
								   
							   }
							   
							   else {  pw.println(seriel+" "+ID+" "+Fname+" " +Lname+" " +Gender+" " + Dob + " "+Email +" "+State+" "+City+" "+Street+" "+Phone+" "+Username+" "+Password); 
							   
							   }

						   }
						   
						   y.close();
						   pw.flush();
						   pw.close();
						   oldFile.delete();
						   Thread.sleep(1000);
						   File dump = new File (filepath);
						   newFile.renameTo(dump);
						  
						   
					}
					   
					   catch (Exception e1 ) { 
						   
						   System.out.println("error") ;
					   }
				
			}
			
			catch (Exception e1 ) { 
				JFrame f7 =new JFrame(); 
				JOptionPane.showMessageDialog(f7,"Operation failed");
			   }
		
				
				}//----------------------------end of if 	
				
			}
		});
		btnSaveChanges.setForeground(Color.WHITE);
		btnSaveChanges.setBorderPainted(false);
		btnSaveChanges.setBackground(new Color(47, 79, 79));
		btnSaveChanges.setBounds(136, 565, 487, 30);
		editcuspanel.add(btnSaveChanges);
		
		JLabel lblNewLabel_4_3 = new JLabel("*NOTE* we dont allow space please use (-) instead of space ");
		lblNewLabel_4_3.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4_3.setBounds(10, 294, 487, 14);
		editcuspanel.add(lblNewLabel_4_3);
		table1.getColumnModel().getColumn(0).setPreferredWidth(0);
		table1.getColumnModel().getColumn(0).setMinWidth(0);
		table1.getColumnModel().getColumn(0).setMaxWidth(0);
		table1.getColumnModel().getColumn(2).setMinWidth(90);
		table1.getColumnModel().getColumn(3).setMinWidth(90);
		table1.getColumnModel().getColumn(4).setMinWidth(90);
		table1.getColumnModel().getColumn(5).setMinWidth(90);
		table1.getColumnModel().getColumn(6).setMinWidth(90);
		table1.getColumnModel().getColumn(7).setMinWidth(90);
		table1.getColumnModel().getColumn(8).setMinWidth(90);
		table1.getColumnModel().getColumn(9).setMinWidth(90);
		table1.getColumnModel().getColumn(10).setMinWidth(90);
		table1.getColumnModel().getColumn(11).setMinWidth(90);
		table1.getColumnModel().getColumn(12).setMinWidth(90);
		
		deletecuspanel = new JPanel();
		deletecuspanel.setBackground(Color.WHITE);
		MainPanel.add(deletecuspanel, "name_231672537372100");
		deletecuspanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_2 = new JLabel("Delete customer");
		lblNewLabel_2_1_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2_2.setBounds(10, 24, 315, 47);
		deletecuspanel.add(lblNewLabel_2_1_2_2);
		
		
		
		//----------------------------------------------------------------
		
		tablecuse = new JTable();
		tablecuse.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tablecuse.setShowVerticalLines(false);
		tablecuse.setShowHorizontalLines(false);
		tablecuse.setShowGrid(false);
		tablecuse.setColumnSelectionAllowed(true);
		tablecuse.setCellSelectionEnabled(true);
		tablecuse.setAlignmentY(0.0f);
		tablecuse.setAlignmentX(0.0f);
		tablecuse.setBounds(0, 251, 636, 0);
		deletecuspanel.add(tablecuse);
		
		delcustxt = new JTextField();
		delcustxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		delcustxt.setColumns(10);
		delcustxt.setBounds(10, 372, 178, 20);
		deletecuspanel.add(delcustxt);
		
		JButton btnDelete = new JButton("Delete ");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
                   if (delcustxt.getText().equals("")) {
                	   JFrame f7 =new JFrame(); 
                	   JOptionPane.showMessageDialog(f7,"Enter the ID");
				}
                   
                   
                   
				else {
					
					
				
				try {
					
					
					 String filepath = "CustomerRegistration.txt";
					 String removeTerm = delcustxt.getText();	
						String tempFile = "Filetemp.txt";
						   File oldFile = new File (filepath);
						   File newFile = new File (tempFile);
						   Scanner y = null;
						   try { 
							   FileWriter fw = new FileWriter(tempFile , true);
							   BufferedWriter bw = new BufferedWriter(fw);
							   PrintWriter pw = new PrintWriter(bw);
							   y = new Scanner(new File(filepath));
							   
							   
						   
							   while(y.hasNext())
								   
							   {
								  
								    String seriel = y.next();	
									String ID = y.next(); 
									String Fname = y.next(); 
									String Lname = y.next();
									String Gender = y.next();
									String Dob = y.next();
									String Email = y.next();
									String State = y.next();
									String City = y.next();
									String Street = y.next();
									String Phone = y.next();
									String Username = y.next();
									String Password = y.next();
									
								
								  
								   if (!ID.equals(removeTerm)) {
									   
									   pw.println(seriel+" "+ID+" "+Fname+" " +Lname+" " +Gender+" " + Dob + " "+Email +" "+State+" "+City+" "+Street+" "+Phone+" "+Username+" "+Password);
									   
									   JFrame f;
									   f=new JFrame(); 
										 JOptionPane.showMessageDialog(f,"ID deleted !");
									   
									   
		                           }
								   

							   }
							   
							   delcustxt.setText("");
							   y.close();
							   pw.flush();
							   pw.close();
							   oldFile.delete();
							   Thread.sleep(1000);
							   File dump = new File (filepath);
							   newFile.renameTo(dump);
							   
							   
						}
						   
						   catch (Exception e1 ) { 
							   
							   System.out.println("error") ;
						   }
						   
				       
					
				}
				
				catch (Exception e1 ) { 
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Operation failed");
				   }
				
				
				}//--------------------end of else
				
			}
		});
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setBorderPainted(false);
		btnDelete.setBackground(new Color(47, 79, 79));
		btnDelete.setBounds(10, 395, 104, 20);
		deletecuspanel.add(btnDelete);
		
		JLabel lblNewLabel_2_1_1_2_1_1_3_1 = new JLabel("Select a row from table above or type order ID it in the  text box below  ");
		lblNewLabel_2_1_1_2_1_1_3_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_3_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_3_1.setBounds(10, 349, 417, 25);
		deletecuspanel.add(lblNewLabel_2_1_1_2_1_1_3_1);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 75, 718, 271);
		deletecuspanel.add(scrollPane_1);
		
		tablecusee = new JTable();
		tablecusee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)tablecusee.getModel();
				int sr = tablecusee.getSelectedRow();
				
				delcustxt.setText(modl.getValueAt(sr, 1).toString());
			}
		});
		tablecusee.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Seriel", "Customer ID", "First name", "Last name", "Gender", "Date of birth", "Email", "State", "City", "Street address", "Phone No.", "Username", "Password"
			}
		));
		tablecusee.getColumnModel().getColumn(0).setPreferredWidth(0);
		tablecusee.getColumnModel().getColumn(0).setMinWidth(0);
		tablecusee.getColumnModel().getColumn(0).setMaxWidth(0);
		tablecusee.getColumnModel().getColumn(1).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(2).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(3).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(5).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(6).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(7).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(8).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(9).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(11).setMinWidth(90);
		tablecusee.getColumnModel().getColumn(12).setMinWidth(90);
		tablecusee.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_1.setViewportView(tablecusee);
		
		searchcuspanel = new JPanel();
		searchcuspanel.setBackground(Color.WHITE);
		MainPanel.add(searchcuspanel, "name_234235493181100");
		searchcuspanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_2_1 = new JLabel("Search and view customers");
		lblNewLabel_2_1_2_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2_2_1.setBounds(10, 11, 315, 47);
		searchcuspanel.add(lblNewLabel_2_1_2_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1 = new JLabel("Search and view customers");
		lblNewLabel_2_1_1_2_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1.setBounds(10, 519, 417, 25);
		searchcuspanel.add(lblNewLabel_2_1_1_2_1_1_1);
		
		searchcustxt = new JTextField();
		searchcustxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		searchcustxt.setColumns(10);
		searchcustxt.setBounds(10, 542, 224, 20);
		searchcuspanel.add(searchcustxt);
		
		JButton searchbtn = new JButton("Search ");
		searchbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			if (searchcustxt.getText().equals("")) {
				JFrame f7 =new JFrame(); 
				JOptionPane.showMessageDialog(f7,"The ID is not given");
			
			}
				
				
				
			else {
				
				DefaultTableModel modelclear = (DefaultTableModel) table3.getModel();
				modelclear.setRowCount(0);
				
            File myobj1 = new File ("CustomerRegistration.txt");
            
            
				
				
				Scanner y = null;
				
				try {
					y= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				String id = searchcustxt.getText();
				
				
				while (y.hasNext()) {
					String seriel = y.next();	
					String ID = y.next(); 
					String Fname = y.next(); 
					String Lname = y.next();
					String Gender = y.next();
					String Dob = y.next();
					String Email = y.next();
					String State = y.next();
					String City = y.next();
					String Street = y.next();
					String Phone = y.next();
					String Username = y.next();
					String Password = y.next();

					    
						
					if (id.equals(ID)) {
					     
						DefaultTableModel model = (DefaultTableModel)table3.getModel();
						Object [] lines = {seriel,ID,Fname,Lname,Gender,Dob,Email,State,City,Street,Phone,Username,Password};
					
							model.addRow(lines); 
					      
						
			            }
					 
						 
						 
					 }
					 
				
				y.close();
				
				
			}//-----------------------end of if 
		
				
				
				

				
				
				
				
			}
		});
		searchbtn.setForeground(Color.WHITE);
		searchbtn.setBorderPainted(false);
		searchbtn.setBackground(new Color(47, 79, 79));
		searchbtn.setBounds(10, 565, 104, 20);
		searchcuspanel.add(searchbtn);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_2.setBounds(10, 96, 728, 412);
		searchcuspanel.add(scrollPane_2);
		
		table3 = new JTable();
		table3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				DefaultTableModel modl = (DefaultTableModel)table3.getModel();
				int sr = table3.getSelectedRow();
				
				searchcustxt.setText(modl.getValueAt(sr, 1).toString());
				
			}
		});
		table3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_2.setViewportView(table3);
		table3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Seriel", "Customer ID", "First name", "Last name", "Gender", "Date of birth", "Email", "State", "City", "Street address", "Phone No.", "Username", "Password"
			}
		));
		table3.getColumnModel().getColumn(0).setPreferredWidth(0);
		table3.getColumnModel().getColumn(0).setMinWidth(0);
		table3.getColumnModel().getColumn(0).setMaxWidth(0);
		table3.getColumnModel().getColumn(1).setMinWidth(90);
		table3.getColumnModel().getColumn(2).setPreferredWidth(90);
		table3.getColumnModel().getColumn(2).setMinWidth(90);
		table3.getColumnModel().getColumn(3).setPreferredWidth(90);
		table3.getColumnModel().getColumn(3).setMinWidth(90);
		table3.getColumnModel().getColumn(4).setPreferredWidth(90);
		table3.getColumnModel().getColumn(4).setMinWidth(90);
		table3.getColumnModel().getColumn(5).setPreferredWidth(90);
		table3.getColumnModel().getColumn(5).setMinWidth(90);
		table3.getColumnModel().getColumn(6).setPreferredWidth(90);
		table3.getColumnModel().getColumn(6).setMinWidth(90);
		table3.getColumnModel().getColumn(7).setPreferredWidth(90);
		table3.getColumnModel().getColumn(7).setMinWidth(90);
		table3.getColumnModel().getColumn(8).setPreferredWidth(90);
		table3.getColumnModel().getColumn(8).setMinWidth(90);
		table3.getColumnModel().getColumn(9).setPreferredWidth(90);
		table3.getColumnModel().getColumn(9).setMinWidth(90);
		table3.getColumnModel().getColumn(10).setPreferredWidth(90);
		table3.getColumnModel().getColumn(10).setMinWidth(90);
		table3.getColumnModel().getColumn(11).setPreferredWidth(90);
		table3.getColumnModel().getColumn(11).setMinWidth(90);
		table3.setShowVerticalLines(false);
		table3.setShowHorizontalLines(false);
		table3.setShowGrid(false);
		table3.setColumnSelectionAllowed(true);
		table3.setCellSelectionEnabled(true);
		table3.setAlignmentY(0.0f);
		table3.setAlignmentX(0.0f);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(204, 255, 153));
		panel_2.setBounds(244, 519, 504, 89);
		searchcuspanel.add(panel_2);
		panel_2.setLayout(null);
		
		addproductpanel = new JPanel();
		addproductpanel.setBackground(Color.WHITE);
		MainPanel.add(addproductpanel, "name_270614632258499");
		addproductpanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("Add new product");
		lblNewLabel_2_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_3.setBounds(239, 11, 469, 47);
		addproductpanel.add(lblNewLabel_2_1_3);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setLayout(null);
		panel_3_2.setBackground(new Color(204, 255, 51));
		panel_3_2.setBounds(10, 69, 728, 333);
		addproductpanel.add(panel_3_2);
		
		JLabel lblNewLabel_2_1_1_3 = new JLabel("Grocery type");
		lblNewLabel_2_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_3.setBounds(10, 22, 166, 25);
		panel_3_2.add(lblNewLabel_2_1_1_3);
		
		JLabel lblNewLabel_2_1_1_1_3 = new JLabel("Manufacturer");
		lblNewLabel_2_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_3.setBounds(10, 76, 166, 25);
		panel_3_2.add(lblNewLabel_2_1_1_1_3);
		
		mnfadtxt = new JTextField();
		mnfadtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE) {
					
				
					e.consume();
				}
			}
			
		});
		mnfadtxt.setColumns(10);
		mnfadtxt.setBounds(10, 99, 178, 20);
		panel_3_2.add(mnfadtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_8 = new JLabel("Brand");
		lblNewLabel_2_1_1_1_1_8.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_8.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_8.setBounds(10, 139, 166, 25);
		panel_3_2.add(lblNewLabel_2_1_1_1_1_8);
		
		bradtxt = new JTextField();
		bradtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE) {
					
				
					e.consume();
				}
			}
		});
		bradtxt.setColumns(10);
		bradtxt.setBounds(10, 162, 178, 20);
		panel_3_2.add(bradtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_1_2 = new JLabel("Name");
		lblNewLabel_2_1_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_2.setBounds(10, 214, 166, 25);
		panel_3_2.add(lblNewLabel_2_1_1_1_1_1_2);
		
		namadtxt = new JTextField();
		namadtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE) {
					
				
					e.consume();
				}
			}
		});
		namadtxt.setColumns(10);
		namadtxt.setBounds(10, 237, 178, 20);
		panel_3_2.add(namadtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_2_2 = new JLabel("Weight in (g)");
		lblNewLabel_2_1_1_1_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_2_2.setBounds(10, 258, 166, 25);
		panel_3_2.add(lblNewLabel_2_1_1_1_1_2_2);
		
		wadtxt = new JTextField();
		wadtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)  ) {
					e.consume();
					
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please input numbers only and for space input (-)" );

						e.consume();
			}
				
				
				
				
				
				
				
				
				
			}
		});
		wadtxt.setColumns(10);
		wadtxt.setBounds(10, 281, 178, 20);
		panel_3_2.add(wadtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_5_1 = new JLabel("");
		lblNewLabel_2_1_1_1_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_5_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_5_1.setBounds(542, 139, 166, 25);
		panel_3_2.add(lblNewLabel_2_1_1_1_1_5_1);
		
		JLabel lblNewLabel_2_1_1_1_1_6_2 = new JLabel("Price in (Rm)");
		lblNewLabel_2_1_1_1_1_6_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_6_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_6_2.setBounds(277, 76, 166, 25);
		panel_3_2.add(lblNewLabel_2_1_1_1_1_6_2);
		
		JLabel lblNewLabel_2_1_1_1_1_4_1_2_1 = new JLabel("Quality");
		lblNewLabel_2_1_1_1_1_4_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_4_1_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_4_1_2_1.setBounds(277, 22, 166, 25);
		panel_3_2.add(lblNewLabel_2_1_1_1_1_4_1_2_1);
		
		JComboBox gtypadtxt = new JComboBox();
		gtypadtxt.setModel(new DefaultComboBoxModel(new String[] {"Bakery", "Meat", "Seafood", "Rice", "Pasta", "Oil", "Sauces", "Condiments", "Breakfast", "Canned", "Frozen", "Dairy", "Snacks", "Drinks"}));
		gtypadtxt.setBounds(10, 43, 178, 22);
		panel_3_2.add(gtypadtxt);
		
		JComboBox qadtxt = new JComboBox();
		qadtxt.setModel(new DefaultComboBoxModel(new String[] {"High", "Medium", "Low", "Not-applicable"}));
		qadtxt.setBounds(277, 44, 178, 22);
		panel_3_2.add(qadtxt);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnfadtxt.setText("Unknown");
			}
		});
		btnNewButton.setBounds(10, 124, 23, 14);
		panel_3_2.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Click here if not applicable");
		lblNewLabel_3.setBounds(42, 124, 156, 14);
		panel_3_2.add(lblNewLabel_3);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bradtxt.setText("Unknown");
			}
		});
		btnNewButton_1.setBounds(10, 189, 23, 14);
		panel_3_2.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Click here if not applicable");
		lblNewLabel_3_1.setBounds(42, 189, 156, 14);
		panel_3_2.add(lblNewLabel_3_1);
		
		prcadtxt = new JTextField();
		prcadtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)  ) {
					e.consume();
					
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please input numbers only and for space input (-)" );

						e.consume();
			}
			}
		});
		prcadtxt.setBounds(277, 99, 178, 20);
		panel_3_2.add(prcadtxt);
		prcadtxt.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("*NOTE* we dont allow space please use (-) instead of space ");
		lblNewLabel_4.setBounds(10, 0, 487, 14);
		panel_3_2.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 11));
		
		JButton btnAddNewProduct = new JButton("Add new product");
		btnAddNewProduct.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String gtype = gtypadtxt.getSelectedItem().toString();;
				String mnftr = mnfadtxt.getText();
				String brand = bradtxt.getText();
				String pronam = namadtxt.getText();
				String wght = wadtxt.getText();
				String qalt = qadtxt.getSelectedItem().toString();;
				String prc = prcadtxt.getText();
				JFrame f7;
				
				
				
				
				
				//-----------------------------------------------------------------------------Start of Code for ID  -----------------------------------------------------------
				
				
				int max = 0;
				
				Scanner y = null;
				try{
				y = new Scanner(new File("Products.txt"));
				while(y.hasNext())
				{	
				int seriel = y.nextInt();	
				String ID = y.next(); 
				String Gtype = y.next(); 
				String Manf = y.next();
				String Brand = y.next();
				String Pron = y.next();
				String Weight = y.next();
				String Quality = y.next();
				String Price = y.next();
				
				
			
				max = seriel;
				
				}
				y.close();
				}
				
				
				catch(Exception e1)
				
				
				{
					
				e1.printStackTrace();
				
				}
				
				
				//-----------------------------------------------------------------------------End of Code -----------------------------------------------------------
				
				
				
				
				
				
				
				
				
				//-----------------------------------------------------------Start if finnding similar product----------------------------------------------------	-----------	       
			      
				int mancount=0;
				int brcount=0;
				int proncount=0;
				
				try {
					
					String[] words=null; 
					File f1=new File("Products.txt");
					FileReader fr = new FileReader(f1);
					BufferedReader br = new BufferedReader(fr);
					
					
					String s;     
				      String similarman = mnftr;   // Input word to be searched
				      String similarbr = brand; // Input word to be searched
				      String similarname = pronam; // Input word to be searched
				         
				      try {
						while((s=br.readLine())!=null)   
						  {
						     words=s.split(" ");  //Split the word using space
						      for (String word : words) 
						      {
						             if (word.equals(similarman))   //Search for the given word
						             {
						               mancount++;    //If Present increase the count by one
						             }
						             
						             if (word.equals(similarbr))   //Search for the given word
						             {
						               brcount++;    //If Present increase the count by one
						             }
						             if (word.equals(similarname))   //Search for the given word
						             {
						               proncount++;    //If Present increase the count by one
						             }
						      }
						  }
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();}
				      
				      
				      
				         try {
							fr.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					
					
					
					
					
					
					
				} 
				
				
				
				
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();   }  
				
			      
			   //----------------------------------------End of code -------------------------------------------------------------------------------- 	
				
				
				
				
				
				
				
				//-------------------------------------Start of product add code -------------------------------------------------------------------
				
				
				
				
				
				Formatter x = null;
				try{
				
					if ( !gtype.equals("") && !mnftr.equals("") && !brand.equals("") && !pronam.equals("") && !wght.equals("") && !qalt.equals("") && !prc.equals("") && proncount == 0 ) {
					
				FileWriter file = new FileWriter("Products.txt", true);
				x = new Formatter(file);
				x.format("%d PR%s %s %s %s %s %s %s %s%n",++max,max,gtype,mnftr,brand,pronam,wght,qalt,prc); 
				
				  f7 =new JFrame(); 
				 JOptionPane.showMessageDialog(f7,"New Product Added");
				 x.close();
				 
				 
				 
				 
					mnfadtxt.setText("");
					bradtxt.setText("");
					namadtxt.setText("");
					wadtxt.setText("");
					prcadtxt.setText("");
				
				 
				}
				
					else {
						f7 =new JFrame(); 
						 JOptionPane.showMessageDialog(f7,"The form must be empty or the product already exist in system since the name is similar in the product item");
						
					}
				
				 
				
				
				}
				
				
				
				catch(Exception e2)
				{
					 f7=new JFrame(); 
					 JOptionPane.showMessageDialog(f7," Sorry operation unsuccessful !");
				}
				
				
				
				//------------------------------------------------------------------------End of product add code---------------------------------------------------
				
				
			}
		});
		btnAddNewProduct.setForeground(Color.WHITE);
		btnAddNewProduct.setBorderPainted(false);
		btnAddNewProduct.setBackground(new Color(47, 79, 79));
		btnAddNewProduct.setBounds(126, 413, 487, 41);
		addproductpanel.add(btnAddNewProduct);
		
		editproductpanel = new JPanel();
		editproductpanel.setBackground(Color.WHITE);
		MainPanel.add(editproductpanel, "name_270646679376800");
		editproductpanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_3 = new JLabel("Edit Product's details");
		lblNewLabel_2_1_2_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2_3.setBounds(10, 0, 315, 47);
		editproductpanel.add(lblNewLabel_2_1_2_3);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBorder(new EmptyBorder(3, 3, 3, 3));
		scrollPane_3.setBackground(Color.WHITE);
		scrollPane_3.setAlignmentX(0.0f);
		scrollPane_3.setBounds(10, 58, 728, 247);
		editproductpanel.add(scrollPane_3);
		
		tablee = new JTable();
		tablee.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)tablee.getModel();
				int sr = tablee.getSelectedRow();
				
				srchedtxt.setText(modl.getValueAt(sr, 1).toString());
				
			}
		});
		tablee.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tablee.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tablee.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Seriel", "Product ID", "Grocery Type", "Manufacturer", "Brand ", "Name", "Weight", "Quality", "Price"
			}
		));
		tablee.getColumnModel().getColumn(0).setPreferredWidth(0);
		tablee.getColumnModel().getColumn(0).setMinWidth(0);
		tablee.getColumnModel().getColumn(0).setMaxWidth(0);
		tablee.getColumnModel().getColumn(1).setPreferredWidth(90);
		tablee.getColumnModel().getColumn(1).setMinWidth(90);
		tablee.getColumnModel().getColumn(2).setPreferredWidth(90);
		tablee.getColumnModel().getColumn(2).setMinWidth(90);
		tablee.getColumnModel().getColumn(3).setPreferredWidth(90);
		tablee.getColumnModel().getColumn(3).setMinWidth(90);
		tablee.getColumnModel().getColumn(4).setPreferredWidth(90);
		tablee.getColumnModel().getColumn(4).setMinWidth(90);
		tablee.getColumnModel().getColumn(7).setPreferredWidth(90);
		tablee.getColumnModel().getColumn(7).setMinWidth(90);
		scrollPane_3.setViewportView(tablee);
		
		JPanel panel_3_1_1 = new JPanel();
		panel_3_1_1.setLayout(null);
		panel_3_1_1.setBackground(new Color(204, 153, 153));
		panel_3_1_1.setBounds(10, 303, 728, 294);
		editproductpanel.add(panel_3_1_1);
		
		JLabel lblNewLabel_2_1_1_2_2 = new JLabel("Type of grocery");
		lblNewLabel_2_1_1_2_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_2.setBounds(22, 41, 166, 25);
		panel_3_1_1.add(lblNewLabel_2_1_1_2_2);
		
		JLabel lblNewLabel_2_1_1_1_1_7_1 = new JLabel("Manufacturer");
		lblNewLabel_2_1_1_1_1_7_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_7_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_7_1.setBounds(22, 86, 166, 25);
		panel_3_1_1.add(lblNewLabel_2_1_1_1_1_7_1);
		
		mnfedtxt = new JTextField();
		mnfedtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
				
			}
		});
		mnfedtxt.setColumns(10);
		mnfedtxt.setBounds(22, 109, 178, 20);
		panel_3_1_1.add(mnfedtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_1_1_1 = new JLabel("Brand");
		lblNewLabel_2_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_1_1_1.setBounds(22, 163, 166, 25);
		panel_3_1_1.add(lblNewLabel_2_1_1_1_1_1_1_1);
		
		bredtxt = new JTextField();
		bredtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		bredtxt.setColumns(10);
		bredtxt.setBounds(22, 186, 178, 20);
		panel_3_1_1.add(bredtxt);
		
		JLabel lblNewLabel_2_1_1_1_1_2_1_1 = new JLabel("Name");
		lblNewLabel_2_1_1_1_1_2_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_2_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_2_1_1.setBounds(22, 239, 166, 25);
		panel_3_1_1.add(lblNewLabel_2_1_1_1_1_2_1_1);
		
		namedtxt = new JTextField();
		namedtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		namedtxt.setColumns(10);
		namedtxt.setBounds(22, 263, 178, 20);
		panel_3_1_1.add(namedtxt);
		
		JLabel lblNewLabel_2_1_1_1_2_1 = new JLabel("Quality");
		lblNewLabel_2_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_2_1.setBounds(293, 41, 166, 25);
		panel_3_1_1.add(lblNewLabel_2_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_1_1_6_1_1 = new JLabel("Price in (Rm)");
		lblNewLabel_2_1_1_1_1_6_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_6_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_6_1_1.setBounds(293, 163, 166, 25);
		panel_3_1_1.add(lblNewLabel_2_1_1_1_1_6_1_1);
		
		prcedtxt = new JTextField();
		prcedtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)  ) {
					e.consume();
					
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please input numbers only and for space input (-)" );

						e.consume();
			}
			}
		});
		prcedtxt.setColumns(10);
		prcedtxt.setBounds(293, 186, 178, 20);
		panel_3_1_1.add(prcedtxt);
		
		JLabel lblNewLabel_2_1_1_2_1_2 = new JLabel("Search product ID");
		lblNewLabel_2_1_1_2_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_2.setBounds(516, 41, 166, 25);
		panel_3_1_1.add(lblNewLabel_2_1_1_2_1_2);
		
		srchedtxt = new JTextField();
		srchedtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (c == KeyEvent.VK_SPACE)
					e.consume();
			}
		});
		srchedtxt.setColumns(10);
		srchedtxt.setBounds(516, 66, 178, 20);
		panel_3_1_1.add(srchedtxt);
		
		JButton btnSearch_1 = new JButton("Search");
		btnSearch_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (srchedtxt.getText().equals("") ) {
					JOptionPane.showMessageDialog(null, "Please enter the ID");
				}
				
				else {
					
				
				File myobj1 = new File ("Products.txt");
				String id = srchedtxt.getText();
				
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
					
					
					
					
					 if (ID.equals(id) )
						 
						{
						 
						 gtypedtxt.setText(Gtype);
						 mnfedtxt.setText(Manf);
						 bredtxt.setText(Brand);
						 namedtxt.setText(Pron);
						 txtWedtxt.setText(Weight);
						 quality.setSelectedItem(Quality);
						 prcedtxt.setText(Price);
						
						}
					 
					 
					 
						 
						 
					 }
					 
				
				y.close();
				
				}
				
			}
		});
		btnSearch_1.setForeground(Color.WHITE);
		btnSearch_1.setBorderPainted(false);
		btnSearch_1.setBackground(new Color(47, 79, 79));
		btnSearch_1.setBounds(516, 95, 101, 20);
		panel_3_1_1.add(btnSearch_1);
	
		
		JButton btnNewButton_1_1 = new JButton("New button");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mnfedtxt.setText("Unknown");
			}
		});
		btnNewButton_1_1.setBounds(22, 138, 23, 14);
		panel_3_1_1.add(btnNewButton_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Click here if not applicable");
		lblNewLabel_3_1_1.setBounds(54, 138, 156, 14);
		panel_3_1_1.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1_2 = new JButton("New button");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bredtxt.setText("Unknown");
			}
		});
		btnNewButton_1_2.setBounds(22, 215, 23, 14);
		panel_3_1_1.add(btnNewButton_1_2);
		
		JLabel lblNewLabel_3_1_2 = new JLabel("Click here if not applicable");
		lblNewLabel_3_1_2.setBounds(54, 215, 156, 14);
		panel_3_1_1.add(lblNewLabel_3_1_2);
		
		JButton btnSearch_1_1 = new JButton("Make changes ");
		btnSearch_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (srchedtxt.getText().equals("") || gtypedtxt.getText().equals("")) {
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"The ID might be not given or the search button is not clicked"); }
					
					else {

						
							String gtype = gtypedtxt.getText();
							String manf = mnfedtxt.getText();
							String brand = bredtxt.getText();
							String pronam = namedtxt.getText();
							String wght = txtWedtxt.getText();
							String qalt = quality.getSelectedItem().toString();;
							String prc = prcedtxt.getText();
					
					
					
					 String filepath = "Products.txt";
					 String removeTerm = srchedtxt.getText();
				
						
						String tempFile = "Filetemp.txt";
						   File oldFile = new File (filepath);
						   File newFile = new File (tempFile);
						   
						   try { 
							   FileWriter fw = new FileWriter(tempFile , true);
							   BufferedWriter bw = new BufferedWriter(fw);
							   PrintWriter pw = new PrintWriter(bw);
							   Scanner y = new Scanner(new File(filepath));
							   
							   
						   
							   while(y.hasNext())
								   
							   {
								  
								   String seriel = y.next();	
								   String ID = y.next(); 
								   String Gtype = y.next(); 
								   String Manf = y.next();
								   String Brand = y.next();
								   String Pron = y.next();
								   String Weight = y.next();
								   String Quality = y.next();
								   String Price = y.next();
								
								  
								   if (ID.equals(removeTerm)) {
									   
									   pw.println(seriel+" "+ ID +" "+gtype+" " +manf+" " +brand+" " + pronam+" "+wght+" "+qalt+" "+prc);
									   
									   JFrame f;
									   f=new JFrame(); 
									   JOptionPane.showMessageDialog(f,"Updated !");
									   
									   
								   }
								   
								   else {  
									   
									   pw.println(seriel+" "+ID+" "+Gtype+" " +Manf+" " +Brand+" " + Pron+ " "+Weight+" "+Quality+" "+Price); 
								   
								   }

							   }
							   
							   y.close();
							   pw.flush();
							   pw.close();
							   oldFile.delete();
							   File dump = new File (filepath);
							   newFile.renameTo(dump);
							  
							   
						}
						   
						   catch (Exception e1 ) { 
							   
							   System.out.println("error") ;
						   }
						   
						   
					}//-----------------end of else 
				
			}
		});
		btnSearch_1_1.setForeground(Color.WHITE);
		btnSearch_1_1.setBorderPainted(false);
		btnSearch_1_1.setBackground(new Color(47, 79, 79));
		btnSearch_1_1.setBounds(537, 241, 181, 42);
		panel_3_1_1.add(btnSearch_1_1);
		
		JLabel lblNewLabel_2_1_1_1_1_6_1_1_1 = new JLabel("Weight in (g)");
		lblNewLabel_2_1_1_1_1_6_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_1_1_6_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_1_1_6_1_1_1.setBounds(293, 86, 166, 25);
		panel_3_1_1.add(lblNewLabel_2_1_1_1_1_6_1_1_1);
		
		txtWedtxt = new JTextField();
		txtWedtxt.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || c == KeyEvent.VK_DELETE)  ) {
					e.consume();
					
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please input numbers only and for space input (-)" );

						e.consume();
			}
			}
		});
		txtWedtxt.setColumns(10);
		txtWedtxt.setBounds(293, 109, 178, 20);
		panel_3_1_1.add(txtWedtxt);
		
		gtypedtxt = new JTextField();
		gtypedtxt.setEditable(false);
		gtypedtxt.setBounds(22, 66, 178, 20);
		panel_3_1_1.add(gtypedtxt);
		gtypedtxt.setColumns(10);
		
		quality = new JComboBox();
		quality.setModel(new DefaultComboBoxModel(new String[] {"High", "Medium", "Low"}));
		quality.setBounds(292, 65, 179, 22);
		panel_3_1_1.add(quality);
		
		JLabel lblNewLabel_4_1 = new JLabel("*NOTE* we dont allow space please use (-) instead of space ");
		lblNewLabel_4_1.setFont(new Font("Segoe UI", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(22, 11, 487, 14);
		panel_3_1_1.add(lblNewLabel_4_1);
		
		deleteproductpanel = new JPanel();
		deleteproductpanel.setBackground(Color.WHITE);
		MainPanel.add(deleteproductpanel, "name_270657242271000");
		deleteproductpanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_2_2 = new JLabel("Delete product");
		lblNewLabel_2_1_2_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2_2_2.setBounds(20, 41, 315, 47);
		deleteproductpanel.add(lblNewLabel_2_1_2_2_2);
		
		JScrollPane scrollPane_1_1 = new JScrollPane();
		scrollPane_1_1.setBorder(new EmptyBorder(3, 3, 3, 3));
		scrollPane_1_1.setBackground(Color.WHITE);
		scrollPane_1_1.setAlignmentX(0.0f);
		scrollPane_1_1.setBounds(10, 108, 748, 247);
		deleteproductpanel.add(scrollPane_1_1);
		
		table_1 = new JTable();
		table_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)table_1.getModel();
				int sr = table_1.getSelectedRow();
				
				delproxt.setText(modl.getValueAt(sr, 1).toString());
				
			}
		});
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial", "Product ID", "Grocery type", "Manufacturer", "Brand", "Name", "Weight", "Quality", "Price"
			}
		));
		table_1.getColumnModel().getColumn(0).setPreferredWidth(0);
		table_1.getColumnModel().getColumn(0).setMinWidth(0);
		table_1.getColumnModel().getColumn(0).setMaxWidth(0);
		table_1.getColumnModel().getColumn(1).setMinWidth(90);
		table_1.getColumnModel().getColumn(2).setMinWidth(90);
		table_1.getColumnModel().getColumn(3).setMinWidth(90);
		table_1.getColumnModel().getColumn(4).setMinWidth(90);
		table_1.getColumnModel().getColumn(5).setMinWidth(90);
		scrollPane_1_1.setViewportView(table_1);
		
		delproxt = new JTextField();
		delproxt.setColumns(10);
		delproxt.setBounds(20, 389, 178, 20);
		deleteproductpanel.add(delproxt);
		
		JButton btnDelete_1 = new JButton("Delete ");
		btnDelete_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		if (delproxt.getText().equals(""))
		{
			JFrame f7 =new JFrame(); 
			JOptionPane.showMessageDialog(f7,"Please enter the ID");
		}
		
		
		else {
			
		
		 String filepath = "Products.txt";
		 String removeTerm = delproxt.getText();
	
			
			String tempFile = "Filetemp.txt";
			   File oldFile = new File (filepath);
			   File newFile = new File (tempFile);
			   
			   try { 
				   FileWriter fw = new FileWriter(tempFile , true);
				   BufferedWriter bw = new BufferedWriter(fw);
				   PrintWriter pw = new PrintWriter(bw);
				   Scanner y = new Scanner(new File(filepath));
				   
				   
			   
				   while(y.hasNext())
					   
				   {
					  
					   String seriel = y.next();	
					   String ID = y.next(); 
					   String Gtype = y.next(); 
					   String Manf = y.next();
					   String Brand = y.next();
					   String Pron = y.next();
					   String Weight = y.next();
					   String Quality = y.next();
					   String Price = y.next();
					
					  
					   if (!ID.equals(removeTerm)) {
						   
						   pw.println(seriel+" "+ID+" "+Gtype+" " +Manf+" " +Brand+" " + Pron+ " "+Weight+" "+Quality+" "+Price);
						   
						   JFrame f;
						   f=new JFrame(); 
						   JOptionPane.showMessageDialog(f,"Deleted!");
						   
						   
					   }
					   

				   }
				   
				   y.close();
				   pw.flush();
				   pw.close();
				   Thread.sleep(1000);
				   oldFile.delete();
				   File dump = new File (filepath);
				   newFile.renameTo(dump);
				   
				   delproxt.setText("");
				  
				   
			}
			   
			   catch (Exception e1 ) { 
				   
				   System.out.println("error") ;
			   }
			   
			   
			   
		}
			}
		});
		btnDelete_1.setForeground(Color.WHITE);
		btnDelete_1.setBorderPainted(false);
		btnDelete_1.setBackground(new Color(47, 79, 79));
		btnDelete_1.setBounds(20, 412, 104, 20);
		deleteproductpanel.add(btnDelete_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_3_2 = new JLabel("Select a row from table above or type order ID it in the  text box below  ");
		lblNewLabel_2_1_1_2_1_1_3_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_3_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_3_2.setBounds(20, 366, 417, 25);
		deleteproductpanel.add(lblNewLabel_2_1_1_2_1_1_3_2);
		
		searchproductpanel = new JPanel();
		searchproductpanel.setBackground(Color.WHITE);
		MainPanel.add(searchproductpanel, "name_270669622305499");
		searchproductpanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_2_1_1 = new JLabel("Search and view product");
		lblNewLabel_2_1_2_2_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2_2_1_1.setBounds(10, 11, 315, 47);
		searchproductpanel.add(lblNewLabel_2_1_2_2_1_1);
		
		JScrollPane scrollPane_2_1 = new JScrollPane();
		scrollPane_2_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_2_1.setBounds(10, 96, 728, 412);
		searchproductpanel.add(scrollPane_2_1);
		
		table_3 = new JTable();
		table_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)table_3.getModel();
				int sr = table_3.getSelectedRow();
				
				searchprotxt.setText(modl.getValueAt(sr, 1).toString());
				
			}
		});
		table_3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial", "Product ID", "Grocery type", "Manufacturer", "Brand ", "Name", "Weight", "Quality", "Price"
			}
		));
		table_3.getColumnModel().getColumn(0).setPreferredWidth(0);
		table_3.getColumnModel().getColumn(0).setMinWidth(0);
		table_3.getColumnModel().getColumn(0).setMaxWidth(0);
		table_3.getColumnModel().getColumn(1).setMinWidth(90);
		table_3.getColumnModel().getColumn(2).setMinWidth(90);
		table_3.getColumnModel().getColumn(3).setMinWidth(90);
		table_3.getColumnModel().getColumn(4).setMinWidth(90);
		table_3.getColumnModel().getColumn(5).setMinWidth(90);
		table_3.getColumnModel().getColumn(7).setMinWidth(90);
		scrollPane_2_1.setViewportView(table_3);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1 = new JLabel("Search and view products");
		lblNewLabel_2_1_1_2_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1.setBounds(10, 519, 417, 25);
		searchproductpanel.add(lblNewLabel_2_1_1_2_1_1_1_1);
		
		searchprotxt = new JTextField();
		searchprotxt.setColumns(10);
		searchprotxt.setBounds(10, 542, 224, 20);
		searchproductpanel.add(searchprotxt);
		
		JButton searchbtn_1 = new JButton("Search ");
		searchbtn_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (searchprotxt.getText().equals("")) {
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"The ID is not given");
				
				}
					
					
					
				else {// for testing purpose 
					
					DefaultTableModel modelclear = (DefaultTableModel) table_3.getModel();
					modelclear.setRowCount(0);
	            File myobj1 = new File ("Products.txt");
	            
	            
					
					
					Scanner y = null;
					
					try {
						y= new Scanner(myobj1);
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						
					String id = searchprotxt.getText();
					
					
					while (y.hasNext()) {
						String seriel = y.next();
						String ID = y.next();
						String gtyp = y.next();
						String man = y.next(); 
						String brand = y.next();
						String name = y.next();
						String weight = y.next();
						String quality = y.next();
						String price = y.next();
						

						    
							
						if (id.equals(ID)) {
						     
							DefaultTableModel model = (DefaultTableModel)table_3.getModel();
							Object [] lines = {seriel,ID,gtyp,man,brand,name,weight,quality,price};
						
								model.addRow(lines); 
						      
							
				            }
						
							 
							 
						 }
						 
					
					y.close();
					
					
				}//-----------------------end of if 
			
			}
		});
		searchbtn_1.setForeground(Color.WHITE);
		searchbtn_1.setBorderPainted(false);
		searchbtn_1.setBackground(new Color(47, 79, 79));
		searchbtn_1.setBounds(10, 565, 104, 20);
		searchproductpanel.add(searchbtn_1);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setLayout(null);
		panel_2_1.setBackground(new Color(204, 255, 204));
		panel_2_1.setBounds(244, 519, 504, 89);
		searchproductpanel.add(panel_2_1);
		
		addorderpanel = new JPanel();
		addorderpanel.setBackground(Color.WHITE);
		MainPanel.add(addorderpanel, "name_270697120521200");
		addorderpanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1 = new JLabel("Select from table above and add to cart");
		lblNewLabel_2_1_1_2_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1.setBounds(10, 417, 248, 20);
		addorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1);
		
		addordcusid = new JTextField();
		addordcusid.setColumns(10);
		addordcusid.setBounds(10, 478, 115, 20);
		addorderpanel.add(addordcusid);
		
		JButton searchbtn_1_1 = new JButton("Place order ");
		searchbtn_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				 
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date today = new Date();
				String orderdate = sdf.format(today);
				String cusid = addordcusid.getText();
				String deliverydate = sdf.format(addorddeld.getDate());
				String totalprice = addordprc.getText();
				JFrame f7;
				JFrame f8 = new JFrame();
				
				int rs = JOptionPane.showConfirmDialog(f8,"Are you sure you want to place order ? ", "Confirm" , JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (rs==JOptionPane.YES_OPTION )
				
				
				{
					
					
					int cuscount=0;
					
					try {
						
						String[] words=null; 
						File f1=new File("Order.txt");
						FileReader fr = new FileReader(f1);
						BufferedReader br = new BufferedReader(fr);
						
						
						String s;     
					         
					      String similarcus = addordcusid.getText();    // Input word to be searched
					         
					      try {
							while((s=br.readLine())!=null)   
							  {
							     words=s.split(" ");  //Split the word using space
							      for (String word : words) 
							      {
							             
							             if (word.equals(similarcus))   //Search for the given word
							             {
							               cuscount++;    //If Present increase the count by one
							             }
							      }
							  }
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();}
					      
					      
					      
					         try {
								fr.close();
							} catch (IOException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
						
						
						
						
						
						
						
						
					} 
					
					
					
					
					catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();   } 
					
					
					
					
			//---------------------------------------------------------------end of code -----------------------------------------		
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
					
				
				//----------------------------------------------------------------------------------------------------------------------
				int orderid = 0;
				
				Scanner y = null;
				try{
				y = new Scanner(new File("Order.txt"));
				while(y.hasNext())
				{	
				int seriel = y.nextInt();	
				String ID = y.next();
				String CusID = y.next();
				String Orderdate = y.next(); 
				String Deliverydate = y.next(); 
				String Totalprice = y.next();
				
				
			
				orderid = seriel;
				
				}
				y.close();
				}
				
				
				catch(Exception e1)
				
				
				{
					
				e1.printStackTrace();
				
				}
				
				
				Formatter x = null;
				try{
				
					if( !cusid.equals("") && !addordproid.getText().equals("") && !addordprc.getText().equals("") && cuscount== 0 ) {
					
				FileWriter file = new FileWriter("Order.txt", true);
				x = new Formatter(file);
				x.format("%d ODR%s %s %s %s %s%n",++orderid,orderid,cusid,orderdate,deliverydate,totalprice); 
				
				  
				 x.close();
				 
				 addordcusid.setText("");
				 addordproid.setText("");
				 addordpron.setText("");
				 addordprc.setText("");
				 
				 
				 
				 
				//-------------------------------------------------------------------------------------------------------------------- 
				 
				 DefaultTableModel model =(DefaultTableModel)tabelshoppingcart.getModel();
					ArrayList<String> proname = new ArrayList<String>();
					ArrayList<String> proid = new ArrayList<String>();
					ArrayList<String> cusida = new ArrayList<String>();
					ArrayList<String> price = new ArrayList<String>();
					ArrayList<String> orderidrecord = new ArrayList<String>();
					
					
					for (int cnt = 0 ; cnt < model.getRowCount(); cnt++) {
						proname.add(model.getValueAt(cnt, 0).toString());
					}
					
					for (int cnt = 0 ; cnt < model.getRowCount(); cnt++) {
						proid.add(model.getValueAt(cnt, 2).toString());
					}
					
					
					for (int cnt = 0 ; cnt < model.getRowCount(); cnt++) {
						cusida.add(model.getValueAt(cnt, 3).toString());
					}
					
					
					
					String getordid = String.valueOf(orderid);
					
					for (int cnt = 0 ; cnt < model.getRowCount(); cnt++) {
						orderidrecord.add(cnt,getordid);
					}
					
					for (int cnt = 0 ; cnt < model.getRowCount(); cnt++) {
						price.add(model.getValueAt(cnt, 1).toString());
					}
					
					
					
					File items = new File("OrderItem.txt");
					try {
						FileWriter fw = new FileWriter(items,true);
						Formatter x1 = null;
						x1 = new Formatter(fw);
						
						
						int sz = proname.size();
						
						for (int i = 0 ; i < sz; i++) {
						x1.format("%s %s %s ODR%s %s%n",proname.get(i).toString(),proid.get(i).toString(),cusida.get(i).toString(),orderidrecord.get(i).toString(),price.get(i).toString());
						
						}	
						
						x1.close();
						
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					
					
					
					
					
				 
				 
					f7 =new JFrame(); 
					 JOptionPane.showMessageDialog(f7,"Order place successfull, PAYMENT WILL BE ACCEPTED IN CASH");
					 
					 
					 DefaultTableModel modelc = (DefaultTableModel) tabelshoppingcart.getModel();
					 modelc.setRowCount(0);
					 
					 
					 
					 
					 
					 
					 
					 
					//--------------------------------------------------------------------------------------------------------------------  
				 
				 }//-------------------------end of if 
					
				
					else {
						f7 =new JFrame(); 
						 JOptionPane.showMessageDialog(f7,"The order details are not fullfilled or This customer already has an order please delete the order for this customer and place order again ");
						
					}
				
				 
				
				
				}//-------------------end of try-----------------------
				
				
				
				catch(Exception e2)
				{
					 f7=new JFrame(); 
					 JOptionPane.showMessageDialog(f7," Sorry order place failed something went wrong !");
				}
				
				
				}//----------------------end of alert id 
				
				
				
				else {
					
				}
				
				
				
				
				
				
				
			}
		});
		searchbtn_1_1.setForeground(Color.WHITE);
		searchbtn_1_1.setBorderPainted(false);
		searchbtn_1_1.setBackground(new Color(47, 79, 79));
		searchbtn_1_1.setBounds(446, 568, 283, 29);
		addorderpanel.add(searchbtn_1_1);
		
		JScrollPane scrollPane_4_1 = new JScrollPane();
		scrollPane_4_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_4_1.setBounds(446, 38, 292, 368);
		addorderpanel.add(scrollPane_4_1);
		
		tabelshoppingcart = new JTable();
		tabelshoppingcart.setShowVerticalLines(false);
		tabelshoppingcart.setShowHorizontalLines(false);
		tabelshoppingcart.setShowGrid(false);
		tabelshoppingcart.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tabelshoppingcart.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product name ", "Price", "Product ID", "Cus ID"
			}
		));
		tabelshoppingcart.getColumnModel().getColumn(0).setPreferredWidth(90);
		tabelshoppingcart.getColumnModel().getColumn(0).setMinWidth(90);
		tabelshoppingcart.getColumnModel().getColumn(1).setPreferredWidth(90);
		tabelshoppingcart.getColumnModel().getColumn(1).setMinWidth(90);
		tabelshoppingcart.getColumnModel().getColumn(2).setPreferredWidth(90);
		tabelshoppingcart.getColumnModel().getColumn(2).setMinWidth(90);
		scrollPane_4_1.setViewportView(tabelshoppingcart);
		
		JLabel lblNewLabel_2_2 = new JLabel("Shopping Items");
		lblNewLabel_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_2_2.setBounds(10, 0, 229, 33);
		addorderpanel.add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Shopping cart");
		lblNewLabel_2_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_2_2_1.setBounds(464, 8, 229, 25);
		addorderpanel.add(lblNewLabel_2_2_1);
		
		JButton searchbtn_1_1_1 = new JButton("Add to cart ");
		searchbtn_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//-------------------------------------------------------------------Start of code for finding customers----------------------------------------------------
				
				
				
				int custcount=0;
				
				try {
					
					String[] words=null; 
					File f1=new File("CustomerRegistration.txt");
					FileReader fr = new FileReader(f1);
					BufferedReader br = new BufferedReader(fr);
					
					String cusIDD = addordcusid.getText();
					
					String s;     
				      String similarcustomerID = cusIDD ;   // Input word to be searched
				         
				      try {
						while((s=br.readLine())!=null)   
						  {
						     words=s.split(" ");  //Split the word using space
						      for (String word : words) 
						      {
						             if (word.equals(similarcustomerID))   //Search for the given word
						             {
						               custcount++;    //If Present increase the count by one
						             }
						             
						             
						      }
						  }
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();}
				      
				      
				      
				         try {
							fr.close();
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
					} 
				
				
				
				
				catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();   }  
				
				
				
				
				
				
				
				
				//------------------------------------------------------------------------End of code -------------------------------------------------------------
				
				
				
				
				if (!addordcusid.getText().equals("") && !addordproid.getText().equals("") && !addordpron.getText().equals("") && custcount != 0) {
					
					DefaultTableModel model = (DefaultTableModel)tabelshoppingcart.getModel();
					model.addRow(new Object[] { addordpron.getText(), addordpriceunit.getText() , addordproid.getText(), addordcusid.getText() } );
					
					
					int totalprice = 0;
					for (int i =0 ; i < tabelshoppingcart.getRowCount() ; i++) {
						totalprice = totalprice + Integer.parseInt(tabelshoppingcart.getValueAt(i, 1).toString());
						addordprc.setText(Integer.toString(totalprice));
						
						
					}
					
				}
				
				
				else {
					
					JFrame f7 =new JFrame(); 
					 JOptionPane.showMessageDialog(f7,"ERROR : The customer ID must be empty or Customer ID not found or you haven'e selected an item from shopping list");
					
				}
				
				
			}
		});
		searchbtn_1_1_1.setForeground(Color.WHITE);
		searchbtn_1_1_1.setBorderPainted(false);
		searchbtn_1_1_1.setBackground(new Color(47, 79, 79));
		searchbtn_1_1_1.setBounds(238, 417, 104, 20);
		addorderpanel.add(searchbtn_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1 = new JLabel("Type customer ID");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1.setBounds(10, 460, 248, 20);
		addorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1_1 = new JLabel("Product name");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1.setBounds(10, 509, 136, 20);
		addorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1_1);
		
		addordpron = new JTextField();
		addordpron.setBackground(Color.WHITE);
		addordpron.setEditable(false);
		addordpron.setColumns(10);
		addordpron.setBounds(10, 527, 115, 20);
		addorderpanel.add(addordpron);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_1 = new JLabel("Product ID");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_1.setBounds(10, 559, 145, 20);
		addorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_1);
		
		addordproid = new JTextField();
		addordproid.setBackground(Color.WHITE);
		addordproid.setEditable(false);
		addordproid.setColumns(10);
		addordproid.setBounds(10, 577, 115, 20);
		addorderpanel.add(addordproid);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2 = new JLabel("Total price ");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2.setBounds(445, 459, 248, 20);
		addorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2);
		
		addordprc = new JTextField();
		addordprc.setEditable(false);
		addordprc.setColumns(10);
		addordprc.setBounds(445, 477, 115, 20);
		addorderpanel.add(addordprc);
		
		
		
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3 = new JLabel("Select a delivery date");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3.setBounds(445, 509, 248, 20);
		addorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3);
		
	    Date today = new Date();
		addorddeld = new JDateChooser(today);
		addorddeld.setBounds(445, 527, 178, 20);
		addorderpanel.add(addorddeld);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_4.setAutoscrolls(true);
		scrollPane_4.setBounds(10, 38, 426, 368);
		addorderpanel.add(scrollPane_4);
		
		
		tableshoppingitem = new JTable();
		tableshoppingitem.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)tableshoppingitem.getModel();
				int sr = tableshoppingitem.getSelectedRow();
				
				addordproid.setText(modl.getValueAt(sr, 1).toString());
				addordpron.setText(modl.getValueAt(sr, 5).toString());
				addordpriceunit.setText(modl.getValueAt(sr, 8).toString());
				
			}
		});
		tableshoppingitem.setShowVerticalLines(false);
		tableshoppingitem.setShowHorizontalLines(false);
		tableshoppingitem.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		tableshoppingitem.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Seriel", "Product ID", "Grocery type", "Manufacturer", "Brand", "Name", "Weight in (g)", "Quality", "Price in (Rm)"
			}
		));
		tableshoppingitem.getColumnModel().getColumn(0).setPreferredWidth(0);
		tableshoppingitem.getColumnModel().getColumn(0).setMinWidth(0);
		tableshoppingitem.getColumnModel().getColumn(0).setMaxWidth(0);
		tableshoppingitem.getColumnModel().getColumn(1).setPreferredWidth(0);
		tableshoppingitem.getColumnModel().getColumn(1).setMinWidth(0);
		tableshoppingitem.getColumnModel().getColumn(1).setMaxWidth(0);
		tableshoppingitem.getColumnModel().getColumn(2).setPreferredWidth(100);
		tableshoppingitem.getColumnModel().getColumn(2).setMinWidth(100);
		tableshoppingitem.getColumnModel().getColumn(3).setPreferredWidth(100);
		tableshoppingitem.getColumnModel().getColumn(3).setMinWidth(100);
		tableshoppingitem.getColumnModel().getColumn(4).setPreferredWidth(100);
		tableshoppingitem.getColumnModel().getColumn(4).setMinWidth(100);
		tableshoppingitem.getColumnModel().getColumn(5).setPreferredWidth(100);
		tableshoppingitem.getColumnModel().getColumn(5).setMinWidth(100);
		tableshoppingitem.getColumnModel().getColumn(6).setPreferredWidth(100);
		tableshoppingitem.getColumnModel().getColumn(6).setMinWidth(100);
		tableshoppingitem.getColumnModel().getColumn(7).setPreferredWidth(100);
		tableshoppingitem.getColumnModel().getColumn(7).setMinWidth(100);
		tableshoppingitem.getColumnModel().getColumn(8).setPreferredWidth(100);
		tableshoppingitem.getColumnModel().getColumn(8).setMinWidth(100);
		scrollPane_4.setViewportView(tableshoppingitem);
		
		JButton searchbtn_1_1_1_2_1 = new JButton("Delete an item");
		searchbtn_1_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				DefaultTableModel model = (DefaultTableModel) tabelshoppingcart.getModel();
				
				
				
				if( tabelshoppingcart.getSelectedRowCount()== 1) {
					addordprc.setText(" ");
					model.removeRow(tabelshoppingcart.getSelectedRow());
					int totalprice = 0;
					for (int i =0 ; i < tabelshoppingcart.getRowCount() ; i++) {
						totalprice = totalprice + Integer.parseInt(tabelshoppingcart.getValueAt(i, 1).toString());
						addordprc.setText(Integer.toString(totalprice)); }
				}
				
				
				
				else {
					
					if( tabelshoppingcart.getSelectedRowCount()== 0) {
						
						JFrame j7 = new JFrame();
						JOptionPane.showMessageDialog(j7, "Item is not selected");
					}
					
					
					else {
						JFrame j8= new JFrame();
						JOptionPane.showMessageDialog(j8, "Empty shopping cart");
						
					}
					
					
				}
				
				
				
				}
		});
		searchbtn_1_1_1_2_1.setForeground(Color.WHITE);
		searchbtn_1_1_1_2_1.setBorderPainted(false);
		searchbtn_1_1_1_2_1.setBackground(new Color(47, 79, 79));
		searchbtn_1_1_1_2_1.setBounds(446, 432, 198, 20);
		addorderpanel.add(searchbtn_1_1_1_2_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_2 = new JLabel("You can selct from the cart to Delete items");
		lblNewLabel_2_1_1_2_1_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_2.setBounds(446, 405, 248, 20);
		addorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_2);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1_3 = new JLabel("Price per unit ");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_3.setBounds(175, 559, 248, 20);
		addorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1_3);
		
		addordpriceunit = new JTextField();
		addordpriceunit.setBackground(Color.WHITE);
		addordpriceunit.setEditable(false);
		addordpriceunit.setColumns(10);
		addordpriceunit.setBounds(175, 577, 115, 20);
		addorderpanel.add(addordpriceunit);
		
		editorderpanel = new JPanel();
		editorderpanel.setBackground(Color.WHITE);
		MainPanel.add(editorderpanel, "name_270705940460800");
		editorderpanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1_2 = new JLabel("Type order ID");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_2.setBounds(10, 451, 248, 20);
		editorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1_2);
		
		JButton searchbtn_1_1_1_1 = new JButton("Search ");
		searchbtn_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					
				
		if( edoid.getText().equals("") ) {
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please enter order ID");
				}
				
				
		   else {
			   edprc.setText("");
				DefaultTableModel modelclear = (DefaultTableModel) eordtbl.getModel();
				modelclear.setRowCount(0);
				
            File myobj1 = new File ("Order.txt");
            
            
				
				
				Scanner y = null;
				
				try {
					y= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				String id = edoid.getText();
				
				
				while (y.hasNext()) {
					
					    String seriel = y.next();
						String OrderID = y.next();
						String CusID = y.next();
						String OrderDate = y.next();
						String DeliveryDate = y.next();
						String OrderPrice = y.next();
						
					
					if (id.equals(OrderID) && !id.equals("")) {
					     
						DefaultTableModel model = (DefaultTableModel)eordtbl.getModel();
						Object [] lines = {seriel , OrderID , CusID , OrderDate , DeliveryDate , OrderPrice };
					
							model.addRow(lines); 	
							
							edprc.setText(OrderPrice);
							
						try {
							Date deldate =new SimpleDateFormat("dd/MM/yyyy").parse(DeliveryDate);
							eddeld.setDate(deldate);
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
							
					      
						
			            }
					 
						 
						 
					 }
					 
				
				y.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			//--------------------------------------------------------------------------End of Code ---------------------------------------------------------------------
				
				
				
			
				
				
				DefaultTableModel modelclear1 = (DefaultTableModel) eorditbl.getModel();
				modelclear1.setRowCount(0);
				
            File OrderI = new File ("OrderItem.txt");
            
            
				
				
				Scanner y1 = null;
				
				try {
					y1= new Scanner(OrderI);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				String oid = edoid.getText();
				
				
				while (y1.hasNext()) {
					
					    String Productname = y1.next();
						String ProductID = y1.next();
						String CusId = y1.next();
						String OrderID = y1.next();
						String Price = y1.next();
						
						
					
					if (oid.equals(OrderID) && !oid.equals("")) {
					     
						DefaultTableModel model1 = (DefaultTableModel)eorditbl.getModel();
						Object [] liness = {Productname,Price, ProductID , CusId , OrderID };
					
							model1.addRow(liness); 	
							
							
							
					      
						
			            }
					 
						 
						 
					 }
					 
				
				y1.close();
				
				
				
		   
		   
		   
		   
		   
		   
		   }
		
		
		
					
			
				
		
		
				
			}
		});
		searchbtn_1_1_1_1.setForeground(Color.WHITE);
		searchbtn_1_1_1_1.setBorderPainted(false);
		searchbtn_1_1_1_1.setBackground(new Color(47, 79, 79));
		searchbtn_1_1_1_1.setBounds(154, 472, 104, 20);
		editorderpanel.add(searchbtn_1_1_1_1);
		
		JScrollPane scrollPane_4_2 = new JScrollPane();
		scrollPane_4_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_4_2.setBounds(435, 55, 301, 345);
		editorderpanel.add(scrollPane_4_2);
		
		eorditbl = new JTable();
		eorditbl.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product name ", "Price ", "Prodcut ID", "Customer ID ", "Order ID", "Order ID"
			}
		));
		eorditbl.getColumnModel().getColumn(0).setPreferredWidth(100);
		eorditbl.getColumnModel().getColumn(0).setMinWidth(100);
		eorditbl.getColumnModel().getColumn(1).setPreferredWidth(100);
		eorditbl.getColumnModel().getColumn(1).setMinWidth(100);
		eorditbl.getColumnModel().getColumn(2).setPreferredWidth(100);
		eorditbl.getColumnModel().getColumn(2).setMinWidth(100);
		eorditbl.getColumnModel().getColumn(3).setPreferredWidth(0);
		eorditbl.getColumnModel().getColumn(3).setMinWidth(0);
		eorditbl.getColumnModel().getColumn(3).setMaxWidth(0);
		eorditbl.getColumnModel().getColumn(4).setPreferredWidth(0);
		eorditbl.getColumnModel().getColumn(4).setMinWidth(0);
		eorditbl.getColumnModel().getColumn(4).setMaxWidth(0);
		eorditbl.getColumnModel().getColumn(5).setPreferredWidth(0);
		eorditbl.getColumnModel().getColumn(5).setMinWidth(0);
		eorditbl.getColumnModel().getColumn(5).setMaxWidth(0);
		eorditbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_4_2.setViewportView(eorditbl);
		
		JLabel lblNewLabel_2_2_2 = new JLabel("Order Items");
		lblNewLabel_2_2_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_2_2_2.setBounds(435, 11, 229, 33);
		editorderpanel.add(lblNewLabel_2_2_2);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2_1 = new JLabel("Total price ");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2_1.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2_1.setBounds(435, 411, 248, 20);
		editorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_2_1);
		
		edprc = new JTextField();
		edprc.setEditable(false);
		edprc.setColumns(10);
		edprc.setBounds(435, 429, 115, 20);
		editorderpanel.add(edprc);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3_2 = new JLabel("Change delivery date");
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3_2.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3_2.setBounds(435, 467, 248, 20);
		editorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_1_1_3_2);
		
		
		
		
		JScrollPane scrollPane_4_2_1 = new JScrollPane();
		scrollPane_4_2_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane_4_2_1.setBounds(20, 55, 392, 345);
		editorderpanel.add(scrollPane_4_2_1);
		
		eordtbl = new JTable();
		eordtbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)eordtbl.getModel();
				int sr = eordtbl.getSelectedRow();
				
				edoid.setText(modl.getValueAt(sr, 1).toString());
				
			}
		});
		eordtbl.setShowVerticalLines(false);
		eordtbl.setShowHorizontalLines(false);
		eordtbl.setShowGrid(false);
		eordtbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		eordtbl.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Seriel", "Order ID", "Customer ID", "Order date", "Delivery date ", "Total Price"
			}
		));
		eordtbl.getColumnModel().getColumn(0).setPreferredWidth(0);
		eordtbl.getColumnModel().getColumn(0).setMinWidth(0);
		eordtbl.getColumnModel().getColumn(0).setMaxWidth(0);
		eordtbl.getColumnModel().getColumn(1).setPreferredWidth(100);
		eordtbl.getColumnModel().getColumn(1).setMinWidth(100);
		eordtbl.getColumnModel().getColumn(3).setPreferredWidth(100);
		eordtbl.getColumnModel().getColumn(3).setMinWidth(100);
		eordtbl.getColumnModel().getColumn(4).setPreferredWidth(100);
		eordtbl.getColumnModel().getColumn(4).setMinWidth(100);
		eordtbl.getColumnModel().getColumn(5).setPreferredWidth(100);
		eordtbl.getColumnModel().getColumn(5).setMinWidth(100);
		scrollPane_4_2_1.setViewportView(eordtbl);
		
		JLabel lblNewLabel_2_2_2_1 = new JLabel("Order ");
		lblNewLabel_2_2_2_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_2_2_2_1.setBounds(11, 11, 229, 33);
		editorderpanel.add(lblNewLabel_2_2_2_1);
		
		edoid = new JTextField();
		edoid.setColumns(10);
		edoid.setBounds(10, 472, 115, 20);
		editorderpanel.add(edoid);
		
		eddeld = new JDateChooser();
		eddeld.setBounds(435, 498, 178, 20);
		editorderpanel.add(eddeld);
		
		JLabel lblNewLabel_2_1_1_2_1_1_1_1_1_3 = new JLabel("Select from table above to search order ID ");
		lblNewLabel_2_1_1_2_1_1_1_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_1_1_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_1_1_1_3.setBounds(30, 400, 248, 20);
		editorderpanel.add(lblNewLabel_2_1_1_2_1_1_1_1_1_3);
		
		JButton ordsavechange = new JButton("Save change");
		ordsavechange.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				String dl = sdf.format(eddeld.getDate());
				
				
				String filepath = "Order.txt";
				String removeTerm = edoid.getText();
		
				
				String tempFile = "temp9.txt";
				   File oldFile = new File (filepath);
				   File newFile = new File (tempFile);
				   Scanner y = null;
				   try { 
					   FileWriter fw = new FileWriter(tempFile , true);
					   BufferedWriter bw = new BufferedWriter(fw);
					   PrintWriter pw = new PrintWriter(bw);
					   y = new Scanner(new File(filepath));
					   
					   while(y.hasNext())
					   {
						    String seriel = y.next();	
							String OID = y.next(); 
							String CID = y.next(); 
							String ODT = y.next();
							String DT = y.next();
							String PRC = y.next();
							
		                       if (OID.equals(removeTerm)) 
		                       {
							   pw.println(seriel+" "+ OID +" "+CID+" " +ODT+" " +dl+" " +PRC);
							   
							   JFrame f;
							   f=new JFrame(); 
							   JOptionPane.showMessageDialog(f,"Delivery date updated !");
							   }
						   
						       else {
						    	   pw.println(seriel+" "+ OID +" "+CID+" " +ODT+" " +DT+" " +PRC); 
						       }
		                       
                      }
					   
					   
					   y.close();
					   pw.flush();
					   pw.close();
					   oldFile.delete();
					   File dump = new File ("Order.txt");
	                   newFile.renameTo(dump);
						   
						   
					   

					   
					  }//-----------end of try
				   
				   catch (Exception e1 ) { 
					   
					   System.out.println("error") ;
				   }
				   
				   
				}//----------------------end of first try 
				
				
				 catch (Exception e1 ) { 
					   
					 JFrame f7 =new JFrame(); 
					 JOptionPane.showMessageDialog(f7,"Operation failed");

				   }
				   
				   
				   
				   
			}
		});
		ordsavechange.setForeground(Color.WHITE);
		ordsavechange.setBackground(new Color(102, 153, 102));
		ordsavechange.setBounds(187, 553, 392, 33);
		editorderpanel.add(ordsavechange);
		
		deleteorderpanel = new JPanel();
		deleteorderpanel.setBackground(Color.WHITE);
		MainPanel.add(deleteorderpanel, "name_270717111454800");
		deleteorderpanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_2_3 = new JLabel("Delete orders");
		lblNewLabel_2_1_2_2_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2_2_3.setBounds(10, 27, 315, 47);
		deleteorderpanel.add(lblNewLabel_2_1_2_2_3);
		
		
		
		
		JLabel lblNewLabel_2_1_1_2_1_1_3 = new JLabel("Select a row from table above or type order ID it in the  text box below  ");
		lblNewLabel_2_1_1_2_1_1_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_3.setBounds(10, 352, 417, 25);
		deleteorderpanel.add(lblNewLabel_2_1_1_2_1_1_3);
		
		delord = new JTextField();
		delord.setColumns(10);
		delord.setBounds(10, 375, 178, 20);
		deleteorderpanel.add(delord);
		
		JButton btnDelete_2 = new JButton("Delete");
		btnDelete_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (delord.getText().equals("")) {
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please enter the order ID");

					}
					
					
				else {
					String filepath = "Order.txt";
					String removeTerm = delord.getText();
					
					   String tempFile = "temp1.txt";
					   File oldFile = new File (filepath);
					   File newFile = new File (tempFile);
					   Scanner y = null ;
					   
					   
					   try { 
						   FileWriter fw = new FileWriter(tempFile , true);
						   BufferedWriter bw = new BufferedWriter(fw);
						   PrintWriter pw = new PrintWriter(bw);
						   y = new Scanner(new File(filepath));
						   
						   
					   
						   while(y.hasNext())
						   {
							   
							   String seriel = y.next();	
							   String OID = y.next(); 
							   String CID = y.next(); 
							   String ODT = y.next();
							   String DT = y.next();
							   String PRC = y.next();
							    
								
								 if (!OID.equals(removeTerm)) {
									   
									   pw.println(seriel+" "+ OID +" "+CID+" " +ODT+" " +DT+" " +PRC);
								   }
						   }
						   
						   y.close();
						   pw.flush();
						   pw.close();
						   oldFile.delete();
						   File dump = new File (filepath);
						   newFile.renameTo(dump);
						   
						   //JFrame f;
						   //f=new JFrame(); 
							 //JOptionPane.showMessageDialog(f,"Deleted the order");
                            
						   
					   }
					   
	                   catch (Exception e1 ) { 
						   
						   System.out.println("error") ;
					   }
					   
	//------------------------------------------------------------End of code -------------------------------------------------------------------------------------------
					   
					   
					   
					   
					   
					   
					   String filepath1 = "OrderItem.txt";
						String removeTerm1 = delord.getText();
						
						   String tempFile1 = "temp11.txt";
						   File oldFile1 = new File (filepath1);
						   File newFile1 = new File (tempFile1);
						   Scanner y1 = null ;
						   
						   
						   try { 
							   FileWriter fw = new FileWriter(tempFile1 , true);
							   BufferedWriter bw1 = new BufferedWriter(fw);
							   PrintWriter pw1 = new PrintWriter(bw1);
							   y1 = new Scanner(new File(filepath1));
							   
							   
						   
							   while(y1.hasNext())
							   {
								   
								   String pn = y1.next();	
								   String pid = y1.next(); 
								   String CID = y1.next(); 
								   String orid = y1.next();
								   String prc = y1.next();
								   
								    
									
									 if (!orid.equals(removeTerm1)) {
										   
										   pw1.println(pn+" "+ pid +" "+CID+" " +orid+" " +prc );
									   }
							   }
							   
							   y1.close();
							   pw1.flush();
							   pw1.close();
							   oldFile1.delete();
							   File dump1 = new File (filepath1);
							   newFile1.renameTo(dump1);
							   
							   JFrame f;
							   f=new JFrame(); 
								 JOptionPane.showMessageDialog(f,"Deleted the order");
                              
								 delord.setText("");
							   
						   }
						   
		                   catch (Exception e1 ) { 
							   
							   System.out.println("error") ;
						   }				   
					   	
					
					
					
				}
				
				
				
			}
		});
		btnDelete_2.setForeground(Color.WHITE);
		btnDelete_2.setBorderPainted(false);
		btnDelete_2.setBackground(new Color(47, 79, 79));
		btnDelete_2.setBounds(10, 398, 104, 20);
		deleteorderpanel.add(btnDelete_2);
		
		JScrollPane scrollPane_5 = new JScrollPane();
		scrollPane_5.setBounds(10, 109, 475, 243);
		deleteorderpanel.add(scrollPane_5);
		
		table_2 = new JTable();
		table_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)table_2.getModel();
				int sr = table_2.getSelectedRow();
				
				delord.setText(modl.getValueAt(sr, 1).toString());
				
			}
		});
		table_2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial", "Order ID ", "Customer ID", "Order date", "Delivery date ", "Price "
			}
		));
		table_2.getColumnModel().getColumn(0).setPreferredWidth(0);
		table_2.getColumnModel().getColumn(0).setMinWidth(0);
		table_2.getColumnModel().getColumn(0).setMaxWidth(0);
		table_2.getColumnModel().getColumn(1).setPreferredWidth(100);
		table_2.getColumnModel().getColumn(1).setMinWidth(100);
		table_2.getColumnModel().getColumn(2).setPreferredWidth(100);
		table_2.getColumnModel().getColumn(2).setMinWidth(100);
		table_2.getColumnModel().getColumn(3).setPreferredWidth(100);
		table_2.getColumnModel().getColumn(3).setMinWidth(100);
		table_2.getColumnModel().getColumn(4).setPreferredWidth(100);
		table_2.getColumnModel().getColumn(4).setMinWidth(100);
		scrollPane_5.setViewportView(table_2);
		
		searchorderpanel = new JPanel();
		searchorderpanel.setBackground(Color.WHITE);
		MainPanel.add(searchorderpanel, "name_270755798408499");
		searchorderpanel.setLayout(null);
		
		JLabel lblNewLabel_2_1_2_2_3_1 = new JLabel("Order details");
		lblNewLabel_2_1_2_2_3_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2_2_3_1.setBounds(10, 29, 315, 47);
		searchorderpanel.add(lblNewLabel_2_1_2_2_3_1);
		
		JLabel lblNewLabel_2_1_1_2_1_1_3_3 = new JLabel("Type order order ID to view the Items and order details based on Order ID ");
		lblNewLabel_2_1_1_2_1_1_3_3.setForeground(Color.BLACK);
		lblNewLabel_2_1_1_2_1_1_3_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 11));
		lblNewLabel_2_1_1_2_1_1_3_3.setBounds(20, 502, 417, 25);
		searchorderpanel.add(lblNewLabel_2_1_1_2_1_1_3_3);
		
		searchord = new JTextField();
		searchord.setColumns(10);
		searchord.setBounds(20, 525, 178, 20);
		searchorderpanel.add(searchord);
		
		JButton searchbutton = new JButton("Search and view ");
		searchbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if( searchord.getText().equals("") ) {
					JFrame f7 =new JFrame(); 
					JOptionPane.showMessageDialog(f7,"Please enter order ID");
				}
				
				
		   else {
				
				DefaultTableModel modelclear = (DefaultTableModel) sodt.getModel();
				modelclear.setRowCount(0);
				
            File myobj1 = new File ("Order.txt");
            
            
				
				
				Scanner y = null;
				
				try {
					y= new Scanner(myobj1);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				String id = searchord.getText();
				
				
				while (y.hasNext()) {
					
					    String seriel = y.next();
						String OrderID = y.next();
						String CusID = y.next();
						String OrderDate = y.next();
						String DeliveryDate = y.next();
						String OrderPrice = y.next();
						
					
					if (id.equals(OrderID) && !id.equals("")) {
					     
						DefaultTableModel model = (DefaultTableModel)sodt.getModel();
						Object [] lines = {seriel , OrderID , CusID , OrderDate , DeliveryDate , OrderPrice };
					
							model.addRow(lines); 	
							
							edprc.setText(OrderPrice);
							
					      
						
			            }
					 
						 
						 
					 }
					 
				
				y.close();
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	//----------------------------------------------------------------------------------------------------------------------------------------------			
				
				
				DefaultTableModel modelclear1 = (DefaultTableModel) soitbl.getModel();
				modelclear1.setRowCount(0);
				
            File OrderI = new File ("OrderItem.txt");
            
            
				
				
				Scanner y1 = null;
				
				try {
					y1= new Scanner(OrderI);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
					
				String oid = searchord.getText();
				
				
				while (y1.hasNext()) {
					
					    String Productname = y1.next();
						String ProductID = y1.next();
						String CusId = y1.next();
						String OrderID = y1.next();
						String Price = y1.next();
						
						
					
					if (oid.equals(OrderID) && !oid.equals("")) {
					     
						DefaultTableModel model1 = (DefaultTableModel)soitbl.getModel();
						Object [] liness = {Productname, ProductID,Price , CusId , OrderID };
					
							model1.addRow(liness); 	
							
							
							
					      
						
			            }
					
						 
					 }
					 
				
				y1.close();
				
				
		   }
				
			}
		});
		searchbutton.setForeground(Color.WHITE);
		searchbutton.setBorderPainted(false);
		searchbutton.setBackground(new Color(47, 79, 79));
		searchbutton.setBounds(20, 548, 178, 20);
		searchorderpanel.add(searchbutton);
		
		JLabel lblNewLabel_2_1_2_2_3_1_1 = new JLabel("Order Items");
		lblNewLabel_2_1_2_2_3_1_1.setFont(new Font("Segoe UI Light", Font.PLAIN, 22));
		lblNewLabel_2_1_2_2_3_1_1.setBounds(380, 29, 315, 47);
		searchorderpanel.add(lblNewLabel_2_1_2_2_3_1_1);
		
		JScrollPane jpane = new JScrollPane();
		jpane.setBounds(10, 76, 342, 385);
		searchorderpanel.add(jpane);
		
		sodt = new JTable();
		sodt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				DefaultTableModel modl = (DefaultTableModel)sodt.getModel();
				int sr = sodt.getSelectedRow();
				
				searchord.setText(modl.getValueAt(sr, 1).toString());
				
			}
		});
		sodt.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		sodt.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Serial", "Order ID", "Customer ID", "Order date", "Delivery date", "Total price"
			}
		));
		sodt.getColumnModel().getColumn(0).setPreferredWidth(0);
		sodt.getColumnModel().getColumn(0).setMinWidth(0);
		sodt.getColumnModel().getColumn(0).setMaxWidth(0);
		sodt.getColumnModel().getColumn(1).setMinWidth(100);
		sodt.getColumnModel().getColumn(2).setMinWidth(100);
		sodt.getColumnModel().getColumn(3).setMinWidth(100);
		sodt.getColumnModel().getColumn(4).setMinWidth(100);
		sodt.getColumnModel().getColumn(5).setMinWidth(100);
		jpane.setViewportView(sodt);
		
		JScrollPane scrollPane_6 = new JScrollPane();
		scrollPane_6.setBounds(390, 76, 305, 385);
		searchorderpanel.add(scrollPane_6);
		
		soitbl = new JTable();
		soitbl.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Product name ", "Product ID", "Customer ID", "Order ID", "Product Price "
			}
		));
		soitbl.getColumnModel().getColumn(0).setMinWidth(100);
		soitbl.getColumnModel().getColumn(1).setMinWidth(100);
		soitbl.getColumnModel().getColumn(2).setPreferredWidth(0);
		soitbl.getColumnModel().getColumn(2).setMinWidth(0);
		soitbl.getColumnModel().getColumn(2).setMaxWidth(0);
		soitbl.getColumnModel().getColumn(3).setMinWidth(0);
		soitbl.getColumnModel().getColumn(3).setMaxWidth(0);
		soitbl.getColumnModel().getColumn(4).setMinWidth(100);
		soitbl.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		scrollPane_6.setViewportView(soitbl);
		
		JLabel lblNewLabel_2_3 = new JLabel("* To refresh the page just click on the menu buttons to their respective pages");
		lblNewLabel_2_3.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_2_3.setBounds(475, 24, 425, 23);
		contentPane.add(lblNewLabel_2_3);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("*NOTE*");
		lblNewLabel_2_3_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_2_3_1.setBounds(475, 6, 101, 23);
		contentPane.add(lblNewLabel_2_3_1);
		
		JLabel lblNewLabel_2_3_2 = new JLabel("* If the table is empty that means no data found to reset data on the table again just refesh");
		lblNewLabel_2_3_2.setFont(new Font("Segoe UI Light", Font.PLAIN, 12));
		lblNewLabel_2_3_2.setBounds(475, 40, 508, 23);
		contentPane.add(lblNewLabel_2_3_2);
		
		JButton btnBackToDashboard = new JButton("Back to Dashboard");
		btnBackToDashboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MainPanel.removeAll();
				MainPanel.add(HomePage);
				MainPanel.repaint();
				MainPanel.revalidate();
			}
		});
		btnBackToDashboard.setForeground(Color.WHITE);
		btnBackToDashboard.setFont(new Font("Segoe UI", Font.BOLD, 14));
		btnBackToDashboard.setBorderPainted(false);
		btnBackToDashboard.setBackground(new Color(102, 153, 102));
		btnBackToDashboard.setBounds(630, 0, 234, 23);
		contentPane.add(btnBackToDashboard);
		//Image img1 = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		
		
		
		
	}
}
