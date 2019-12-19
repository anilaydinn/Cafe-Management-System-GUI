import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class SignUp extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblUsername;
	private JLabel lblPassword;
	private JLabel lblRepassword;
	private JLabel lblEmail;
	private ProductOperationsDB productOperationsDB;

	/**
	 * Create the frame.
	 */
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(135, 206, 235));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		productOperationsDB = ProductOperationsDB.getProductOperationsDB();
		
		Image img = new ImageIcon(this.getClass().getResource("/newest.png")).getImage();
		
		textField = new JTextField();
		textField.setBounds(212, 97, 151, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(212, 128, 151, 22);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(212, 159, 151, 22);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(212, 194, 151, 22);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("Sign Up");
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = textField.getText();
				String password = textField_1.getText();
				String rePassword = textField_2.getText();
				String email = textField_3.getText();
				
				if(password.equals(rePassword) && !textField.getText().equals("") && !textField_1.getText().equals("") && !textField_2.getText().equals("") && !textField_3.getText().equals("")){
					
					productOperationsDB.addAdmin(username, password, email);
					LoginPage login = new LoginPage();
					login.setVisible(true);
					setVisible(false);
				}
				else {
					
					JOptionPane.showMessageDialog(null, "You must fill all the field correct!");
				}
				
			}
		});
		btnNewButton.setBounds(141, 274, 222, 48);
		contentPane.add(btnNewButton);
		
		lblUsername = new JLabel("Username: ");
		lblUsername.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblUsername.setBounds(61, 99, 139, 16);
		contentPane.add(lblUsername);
		
		lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblPassword.setBounds(61, 130, 139, 16);
		contentPane.add(lblPassword);
		
		lblRepassword = new JLabel("Re-Password: ");
		lblRepassword.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblRepassword.setBounds(61, 161, 139, 16);
		contentPane.add(lblRepassword);
		
		lblEmail = new JLabel("E-Mail: ");
		lblEmail.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblEmail.setBounds(61, 196, 139, 16);
		contentPane.add(lblEmail);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LoginPage login = new LoginPage();
				login.setTitle("Login");
				login.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Dialog", Font.BOLD, 18));
		btnBack.setBackground(Color.WHITE);
		btnBack.setBounds(449, 274, 222, 48);
		contentPane.add(btnBack);
		
	}
}
