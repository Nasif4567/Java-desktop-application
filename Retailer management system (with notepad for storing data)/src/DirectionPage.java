import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DirectionPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DirectionPage frame = new DirectionPage();
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
	public DirectionPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 651, 487);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Logo.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(img));
		lblNewLabel.setBounds(167, 11, 339, 293);
		contentPane.add(lblNewLabel);
		
		JButton btnAdmin = new JButton("Admin ");
		btnAdmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AdminLogin p = new AdminLogin();
				p.setVisible(true);
			}
		});
		btnAdmin.setForeground(Color.WHITE);
		btnAdmin.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnAdmin.setBorderPainted(false);
		btnAdmin.setBackground(new Color(102, 153, 102));
		btnAdmin.setBounds(220, 332, 217, 40);
		contentPane.add(btnAdmin);
		
		JButton btnCustomer = new JButton("Customer");
		btnCustomer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginCustomer p = new LoginCustomer();
				p.setVisible(true);
			}
		});
		btnCustomer.setForeground(Color.WHITE);
		btnCustomer.setFont(new Font("Segoe UI", Font.PLAIN, 11));
		btnCustomer.setBorderPainted(false);
		btnCustomer.setBackground(new Color(102, 153, 102));
		btnCustomer.setBounds(220, 388, 217, 40);
		contentPane.add(btnCustomer);
	}
}
