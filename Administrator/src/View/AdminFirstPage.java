package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTable;

public class AdminFirstPage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminFirstPage frame = new AdminFirstPage();
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
	public AdminFirstPage() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 729, 637);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(219, 13, 492, 576);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 241, 492, 335);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(12, 13, 195, 576);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JButton clerksBtn = new JButton("Clerks");
		clerksBtn.setBounds(0, 0, 195, 158);
		panel_1.add(clerksBtn);
		
		JButton customersBtn = new JButton("Customers");
		customersBtn.setBounds(0, 160, 195, 158);
		panel_1.add(customersBtn);
		
		JButton logoutBtn = new JButton("Log out");
		logoutBtn.setBounds(0, 323, 195, 253);
		panel_1.add(logoutBtn);
	}
}
