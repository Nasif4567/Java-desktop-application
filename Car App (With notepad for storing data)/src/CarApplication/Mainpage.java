package CarApplication;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Window.Type;

public class Mainpage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mainpage frame = new Mainpage();
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
	public Mainpage() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 150, 622, 431);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(205, 92, 92));
		contentPane.setBorder(new EmptyBorder(10, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ADMIN");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminLogin page=new AdminLogin();
	            page.setVisible(true);
	            dispose();
				
				
			}
		});
		btnNewButton.setForeground(Color.GRAY);
		btnNewButton.setBackground(Color.ORANGE);
		btnNewButton.setBounds(372, 133, 125, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("CUSTOMER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ResidentLogin page=new ResidentLogin();
	            page.setVisible(true);
	            dispose();
				
			}
			
		});
		btnNewButton_1.setForeground(Color.GRAY);
		btnNewButton_1.setBackground(Color.ORANGE);
		btnNewButton_1.setBounds(372, 197, 137, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Welcome to Drive AWAY !");
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setForeground(Color.ORANGE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(302, 11, 294, 79);
		contentPane.add(lblNewLabel);
		
		JLabel labelimage = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/CarLogo.jpg.jpg")).getImage();
		labelimage.setIcon(new ImageIcon(img));
		labelimage.setBounds(0, -19, 267, 298);
		contentPane.add(labelimage);
		
	}

}
