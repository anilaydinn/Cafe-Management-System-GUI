import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPasswordField;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
public class LoginPage extends JFrame {

	private JPanel contentPane;
	private JTextField txtNj;
	private JPasswordField passwordField;
	private ProductOperationsDB productOperationsDB;
	private JTextField tfrobot;
	private Random random;
	private int a;
	private int b;

	/**
	 * Launch the application.
	 */
	
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
		setLocationRelativeTo(null);
		productOperationsDB = ProductOperationsDB.getProductOperationsDB();

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		random = new Random();
		a = random.nextInt(10);
		b = random.nextInt(10);
		
		JButton btnLogin = new JButton("SignIn");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String username = txtNj.getText();
				String password = new String(passwordField.getPassword());
				boolean loginSuccess = productOperationsDB.login(username, password);
				
				
				if(loginSuccess && a + b == Integer.parseInt(tfrobot.getText())) {
					
					Inside inside = new Inside();
					inside.setVisible(true);
					setVisible(false);
				}
				else if(loginSuccess && a + b != Integer.parseInt(tfrobot.getText())) {
					
					JOptionPane.showMessageDialog(null, "Please prove you are human!");
				}
				else{
				
					JOptionPane.showMessageDialog(null, "Username or Password incorrect.");
				}
							
			}
		});
		btnLogin.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnLogin.setBackground(new Color(255, 255, 255));
		btnLogin.setBounds(201, 429, 110, 47);
		contentPane.add(btnLogin);
		
		txtNj = new JTextField();
		txtNj.setFont(new Font("Rockwell", Font.PLAIN, 18));
		txtNj.setBounds(201, 271, 116, 22);
		contentPane.add(txtNj);
		txtNj.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Username: ");
		lblNewLabel.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(75, 274, 128, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblPassword = new JLabel("Password: ");
		lblPassword.setFont(new Font("Rockwell", Font.BOLD, 18));
		lblPassword.setBounds(74, 322, 116, 16);
		contentPane.add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(201, 320, 116, 22);
		contentPane.add(passwordField);
		
		JLabel lblSunIcon = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/Cafe.png")).getImage();
		lblSunIcon.setIcon(new ImageIcon(img)); 
		lblSunIcon.setBounds(491, -31, 300, 373);
		contentPane.add(lblSunIcon);
		Image img1 = new ImageIcon(this.getClass().getResource("/tikk.png")).getImage();
		
		JButton btnSignup = new JButton("SignUp");
		btnSignup.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SignUp su = new SignUp();
				su.setVisible(true);
				setVisible(false);
				su.setTitle("Sign Up");
				
			}
		});
		btnSignup.setFont(new Font("Rockwell", Font.BOLD, 18));
		btnSignup.setBackground(Color.WHITE);
		btnSignup.setBounds(336, 429, 110, 47);
		contentPane.add(btnSignup);
		
		JLabel lblrobot = new JLabel("");
		lblrobot.setFont(new Font("Dialog", Font.BOLD, 18));
		lblrobot.setBounds(79, 384, 111, 15);
		contentPane.add(lblrobot);
		lblrobot.setText(Integer.toString(a) + " + " + Integer.toString(b) + " =");
		
		
		tfrobot = new JTextField();
		tfrobot.setText("0");
		tfrobot.setBounds(201, 383, 44, 19);
		contentPane.add(tfrobot);
		tfrobot.setColumns(10);
		
		JButton btnRefresh = new JButton("Refresh");
		btnRefresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				a = random.nextInt(10);
				b = random.nextInt(10);
				lblrobot.setText(Integer.toString(a) + " + " + Integer.toString(b) + " =");
			}
		});
		btnRefresh.setFont(new Font("Dialog", Font.BOLD, 18));
		btnRefresh.setBackground(Color.WHITE);
		btnRefresh.setBounds(327, 380, 119, 23);
		contentPane.add(btnRefresh);
		
	}
}
