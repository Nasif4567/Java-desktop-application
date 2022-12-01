package CarApplication;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Window.Type;

public class CarManageDirectory extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarManageDirectory frame = new CarManageDirectory();
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
	public CarManageDirectory() {
		setType(Type.UTILITY);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 250, 452, 282);
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
		btnNewButton.setBounds(340, 11, 75, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD NEW CARS");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddCar page=new AddCar();
	            page.setVisible(true);
	            dispose();
				
				
			}
		});
		btnNewButton_1.setBounds(84, 64, 297, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("UPDATE CAR DETAILS");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UpdateCarDetails page=new UpdateCarDetails();
	            page.setVisible(true);
	            dispose();
				
			}
		});
		btnNewButton_1_1.setBounds(84, 117, 297, 23);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("DELETE CARS");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DeleteCar page=new DeleteCar();
	            page.setVisible(true);
	            dispose();
			}
		});
		btnNewButton_1_2.setBounds(84, 185, 297, 23);
		contentPane.add(btnNewButton_1_2);
	}
}
