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
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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

	/**
	 * Launch the application.
	 */
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SignUp frame = new SignUp();
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
	public SignUp() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
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
				LoginPage li = new LoginPage();
				   setVisible(false);
					li.setVisible(true);
			}
		});
		btnNewButton.setBounds(349, 240, 103, 48);
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
		JLabel lblbck = new JLabel("");
		lblbck.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblbck.setForeground(new Color(240, 255, 255));
		lblbck.setIcon(new ImageIcon(img)); 
		lblbck.setBounds(0, 0, 782, 390);
		contentPane.add(lblbck);
		
	}
}
