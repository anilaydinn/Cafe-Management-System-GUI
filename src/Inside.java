import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Inside extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inside frame = new Inside();
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
	public Inside() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 530);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		
		Image img = new ImageIcon(this.getClass().getResource("/Inside.png")).getImage();
		
		JButton btnNewButton = new JButton("I-1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(245, 245, 245));
		btnNewButton.setBackground(new Color(85, 107, 47));
		btnNewButton.setBounds(23, 61, 130, 74);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("I-2");
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button.setForeground(new Color(245, 245, 245));
		button.setBackground(new Color(85, 107, 47));
		button.setBounds(193, 136, 130, 74);
		contentPane.add(button);
		
		JButton button_1 = new JButton("I-3");
		button_1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_1.setForeground(new Color(245, 245, 245));
		button_1.setBackground(new Color(85, 107, 47));
		button_1.setBounds(193, 213, 130, 74);
		contentPane.add(button_1);
		
		JButton button_2 = new JButton("I-4");
		button_2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_2.setForeground(new Color(245, 245, 245));
		button_2.setBackground(new Color(85, 107, 47));
		button_2.setBounds(23, 300, 130, 74);
		contentPane.add(button_2);
		
		JButton button_3 = new JButton("I-5");
		button_3.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_3.setForeground(new Color(245, 245, 245));
		button_3.setBackground(new Color(85, 107, 47));
		button_3.setBounds(23, 381, 130, 74);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("I-6");
		button_4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_4.setForeground(new Color(245, 245, 245));
		button_4.setBackground(new Color(85, 107, 47));
		button_4.setBounds(193, 300, 130, 74);
		contentPane.add(button_4);
		
		JButton button_5 = new JButton("I-7");
		button_5.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_5.setForeground(new Color(245, 245, 245));
		button_5.setBackground(new Color(85, 107, 47));
		button_5.setBounds(193, 381, 130, 74);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("I-8");
		button_6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_6.setForeground(new Color(245, 245, 245));
		button_6.setBackground(new Color(85, 107, 47));
		button_6.setBounds(454, 136, 130, 74);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("I-9");
		button_7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_7.setForeground(new Color(245, 245, 245));
		button_7.setBackground(new Color(85, 107, 47));
		button_7.setBounds(454, 213, 130, 74);
		contentPane.add(button_7);
		
		JButton button_8 = new JButton("I-10");
		button_8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_8.setForeground(new Color(245, 245, 245));
		button_8.setBackground(new Color(85, 107, 47));
		button_8.setBounds(454, 300, 130, 74);
		contentPane.add(button_8);
		
		JButton button_9 = new JButton("I-11");
		button_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_9.setForeground(new Color(245, 245, 245));
		button_9.setBackground(new Color(85, 107, 47));
		button_9.setBounds(622, 61, 130, 74);
		contentPane.add(button_9);
		
		JButton button_10 = new JButton("I-12");
		button_10.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_10.setForeground(new Color(245, 245, 245));
		button_10.setBackground(new Color(85, 107, 47));
		button_10.setBounds(622, 136, 130, 74);
		contentPane.add(button_10);
		
		JButton button_11 = new JButton("I-13");
		button_11.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				menu menu = new menu();
				menu.setVisible(true);
			}
		});
		button_11.setForeground(new Color(245, 245, 245));
		button_11.setBackground(new Color(85, 107, 47));
		button_11.setBounds(622, 213, 130, 74);
		contentPane.add(button_11);
		
		JButton btnNewButton_1 = new JButton("Door To Garden");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Garden gar = new Garden();
				   setVisible(false);
					gar.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(102, 51, 0));
		btnNewButton_1.setBounds(310, 13, 123, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnTerrace = new JButton("Terrace");
		btnTerrace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Terrace ter = new Terrace();
				   setVisible(false);
					ter.setVisible(true);
				
			}
		});
		btnTerrace.setHorizontalAlignment(SwingConstants.TRAILING);
		btnTerrace.setForeground(Color.WHITE);
		btnTerrace.setBackground(new Color(102, 51, 0));
		btnTerrace.setBounds(733, 359, 49, 103);
		contentPane.add(btnTerrace);
		
		JLabel lblTerrace = new JLabel("Terrace ->");
		lblTerrace.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblTerrace.setBounds(641, 410, 100, 16);
		contentPane.add(lblTerrace);
		
		JButton btnNewButton_2 = new JButton("Cashier");
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setBackground(new Color(138, 43, 226));
		btnNewButton_2.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnNewButton_2.setBounds(490, 13, 111, 30);
		contentPane.add(btnNewButton_2);
		
		JLabel lblbck = new JLabel("");
		lblbck.setFont(new Font("Rockwell", Font.BOLD, 13));
		lblbck.setForeground(new Color(240, 255, 255));
		lblbck.setIcon(new ImageIcon(img)); 
		lblbck.setBounds(0, 13, 782, 479);
		contentPane.add(lblbck);

	}
}
