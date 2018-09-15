package View;


import javax.swing.JFrame;

import java.awt.GridBagLayout;

import javax.swing.JLabel;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import javax.swing.BoxLayout;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AdminAPP {

	public JFrame frame;
	private JTextField userNameTextField;
	private JTextField passwordTextField;

	/**
	 * Create the application.
	 */
	public AdminAPP() {
		initialize();
	}
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setName("Admin app");
		frame.setBounds(100, 100, 450, 300);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Login:");
		frame.getContentPane().add(lblLogin);
		lblLogin.setSize(80, 30);
		lblLogin.setLocation(870, 250);
		
		JLabel lblUsername = new JLabel("Username:");
		frame.getContentPane().add(lblUsername);
		lblUsername.setSize(80,30);
		lblUsername.setLocation(790, 280);
		
		userNameTextField = new JTextField();
		frame.getContentPane().add(userNameTextField);
		userNameTextField.setColumns(10);
		userNameTextField.setSize(150, 25);
		userNameTextField.setLocation(870, 280);
		
		JLabel lblPassword = new JLabel("Password:");
		frame.getContentPane().add(lblPassword);
		lblPassword.setLocation(790,310);
		lblPassword.setSize(80,30);

		passwordTextField = new JPasswordField();
		passwordTextField.setToolTipText("password");
		frame.getContentPane().add(passwordTextField);
		passwordTextField.setColumns(10);
		passwordTextField.setSize(150, 25);
		passwordTextField.setLocation(870, 310);
		
		JButton btnLogin = new JButton("Login");
		frame.getContentPane().add(btnLogin);
		btnLogin.setSize(150, 25);
		btnLogin.setLocation(870, 340);
	}
	
}
