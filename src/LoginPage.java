import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPasswordField;

import java.awt.Image;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtNj;
	private JTextField textField_2;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	
	
	public static class robot{
		private int a;
		private int b;
		public robot () {
			this.a=a;
			this.b=b;
		}
		public robot(int a,int b) {
			this.a=a;
			this.b=b;
		}
		public void setA(int a) {
			this.a=a;
			
		}
		public int getA() {
			return this.a;
		}
		public void setB(int b) {
			this.b=b;
			
		}
		public int getB() {
			return this.b;
		}
		
		
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginPage frame = new LoginPage();
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
	public LoginPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(175, 238, 238));
		contentPane.setForeground(UIManager.getColor("Table.selectionBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
							
							}
		});
		btnLogin.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnLogin.setBackground(UIManager.getColor("TextField.selectionBackground"));
		btnLogin.setBounds(283, 428, 110, 47);
		contentPane.add(btnLogin);
		
		txtNj = new JTextField();
		txtNj.setFont(new Font("Rockwell", Font.PLAIN, 18));
		txtNj.setBounds(201, 271, 116, 22);
		contentPane.add(txtNj);
		txtNj.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(271, 369, 46, 22);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel = new JLabel("Username: ");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(75, 274, 157, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblPassword.setBounds(74, 322, 116, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 320, 116, 22);
		contentPane.add(passwordField);
		
		JLabel lblBruteforceControl = new JLabel("Brute-Force Control: ");
		lblBruteforceControl.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblBruteforceControl.setBounds(74, 356, 262, 47);
		contentPane.add(lblBruteforceControl);
		
		JLabel lblSunIcon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/cafe.png")).getImage();
		lblSunIcon.setIcon(new ImageIcon(img)); 
		lblSunIcon.setBounds(491, -31, 300, 373);
		contentPane.add(lblSunIcon);
		
		JLabel labelCheck = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/tikk.png")).getImage();
		labelCheck.setIcon(new ImageIcon(img1)); 
		labelCheck.setBounds(329, 356, 61, 47);
		contentPane.add(labelCheck);
		
	}
}
