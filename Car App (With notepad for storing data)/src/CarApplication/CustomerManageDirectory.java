package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Window.Type;

public class CustomerManageDirectory extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CustomerManageDirectory frame = new CustomerManageDirectory();
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
	public CustomerManageDirectory() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 150, 381, 332);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DirectoryPage page=new DirectoryPage();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton.setBounds(266, 21, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD NEW CUSTOMERS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CustomerRegistration page=new CustomerRegistration();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_1.setBounds(39, 102, 232, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("UPDATE CUSTOMER DETAILS");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateCustomer page=new UpdateCustomer();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_1_1.setBounds(39, 166, 227, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("DELETE CUSTOMERS");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteCustomer page=new DeleteCustomer();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_1_2.setBounds(39, 234, 232, 23);
		contentPane.add(btnNewButton_1_2);
	}

}
