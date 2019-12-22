import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.Menu;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Terrace extends JFrame {

	private JPanel contentPane;
	private ProductOperationsDB productOperationsDB;
	
	/**
	 * Create the frame.
	 */
	public Terrace() {
		setBounds(100, 100, 800, 632);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Image img = new ImageIcon(this.getClass().getResource("/Terrace.png")).getImage();
		productOperationsDB = ProductOperationsDB.getProductOperationsDB();
		
		JButton btnNewButton = new JButton("T-1");
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setBounds(35, 250, 138, 68);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("T-1");
				menu.setVisible(true);
				menu.setTitle("T-1");
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton);
		
		if(productOperationsDB.isFull("T-1")) {
			
			btnNewButton.setBackground(Color.RED);
		}
		
		JButton button = new JButton("T-2");
		button.setFont(new Font("Rockwell", Font.BOLD, 13));
		button.setBackground(Color.WHITE);
		button.setBounds(185, 250, 138, 68);
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("T-2");
				menu.setVisible(true);
				menu.setTitle("T-2");
				setVisible(false);
			}
		});
		contentPane.add(button);
		
		if(productOperationsDB.isFull("T-2")) {
			
			button.setBackground(Color.RED);
		}
		
		JButton button_1 = new JButton("T-3");
		button_1.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_1.setBackground(Color.WHITE);
		button_1.setBounds(35, 353, 138, 68);
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("T-3");
				menu.setVisible(true);
				menu.setTitle("T-3");
				setVisible(false);
			}
		});
		contentPane.add(button_1);
		
		if(productOperationsDB.isFull("T-3")) {
			
			button_1.setBackground(Color.RED);
		}
		
		JButton button_2 = new JButton("T-4");
		button_2.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_2.setBackground(Color.WHITE);
		button_2.setBounds(185, 353, 138, 68);
		button_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("T-4");
				menu.setVisible(true);
				menu.setTitle("T-4");
				setVisible(false);
			}
		});
		contentPane.add(button_2);
		
		if(productOperationsDB.isFull("T-4")) {
			
			button_2.setBackground(Color.RED);
		}
		
		JButton button_3 = new JButton("T-5");
		button_3.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_3.setBackground(Color.WHITE);
		button_3.setBounds(459, 250, 138, 68);
		button_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("T-5");
				menu.setVisible(true);
				menu.setTitle("T-5");
				setVisible(false);
			}
		});
		contentPane.add(button_3);
		
		if(productOperationsDB.isFull("T-5")) {
			
			button_3.setBackground(Color.RED);
		}
		
		JButton button_4 = new JButton("T-6");
		button_4.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_4.setBackground(Color.WHITE);
		button_4.setBounds(459, 353, 138, 68);
		button_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("T-6");
				menu.setVisible(true);
				menu.setTitle("T-6");
				setVisible(false);
			}
		});
		contentPane.add(button_4);
		
		if(productOperationsDB.isFull("T-6")) {
			
			button_4.setBackground(Color.RED);
		}
		
		JButton button_5 = new JButton("T-7");
		button_5.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_5.setBackground(Color.WHITE);
		button_5.setBounds(605, 250, 138, 68);
		button_5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("T-7");
				menu.setVisible(true);
				menu.setTitle("T-7");
				setVisible(false);
			}
		});
		contentPane.add(button_5);
		
		if(productOperationsDB.isFull("T-7")) {
			
			button_5.setBackground(Color.RED);
		}
		
		JButton button_6 = new JButton("T-8");
		button_6.setFont(new Font("Rockwell", Font.BOLD, 13));
		button_6.setBackground(Color.WHITE);
		button_6.setBounds(605, 353, 138, 68);
		button_6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("T-8");
				menu.setVisible(true);
				menu.setTitle("T-8");
				setVisible(false);
			}
		});
		contentPane.add(button_6);
		
		if(productOperationsDB.isFull("T-8")) {
			
			button_6.setBackground(Color.RED);
		}
		
		JButton btnNewButton_1 = new JButton("Door");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Inside ins = new Inside();
				ins.setVisible(true);
			
			}
		});
		btnNewButton_1.setBackground(new Color(139, 69, 19));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBounds(323, 455, 138, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblbck = new JLabel("");
		lblbck.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblbck.setForeground(new Color(240, 255, 255));
		lblbck.setIcon(new ImageIcon(img)); 
		lblbck.setBounds(0, 13, 782, 479);
		contentPane.add(lblbck);
	}

}
