import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Garden extends JFrame {

	private JPanel contentPane;
	private ProductOperationsDB productOperationsDB;

	/**
	 * Create the frame.
	 */
	public Garden() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 650);
		Image img = new ImageIcon(this.getClass().getResource("/garden.png")).getImage();
		Image img1 = new ImageIcon(this.getClass().getResource("/ms.png")).getImage();
		productOperationsDB = ProductOperationsDB.getProductOperationsDB();
		
		JButton btnNewButton = new JButton("G-2");
		btnNewButton.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBounds(59, 157, 123, 61);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("G-2");
				menu.setVisible(true);
				menu.setTitle("G-2");
				setVisible(false);
			}
		});
		contentPane.add(btnNewButton);
		
		JButton btnTable = new JButton("G-1");
		btnTable.setForeground(Color.BLACK);
		btnTable.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnTable.setBackground(Color.MAGENTA);
		btnTable.setBounds(59, 74, 123, 61);
		btnTable.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("G-1");
				menu.setVisible(true);
				menu.setTitle("G-1");
				setVisible(false);
			}
		});
		contentPane.add(btnTable);
		
		if(productOperationsDB.isFull("G-1")) {
			
			btnTable.setBackground(Color.RED);
		}
		
		JButton btnG = new JButton("G-3");
		btnG.setForeground(Color.BLACK);
		btnG.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnG.setBackground(Color.MAGENTA);
		btnG.setBounds(59, 239, 123, 61);
		btnG.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("G-3");
				menu.setVisible(true);
				menu.setTitle("G-3");
				setVisible(false);
			}
		});
		contentPane.add(btnG);
		
		if(productOperationsDB.isFull("G-3")) {
			
			btnG.setBackground(Color.RED);
		}
		
		JButton btnG_1 = new JButton("G-4");
		btnG_1.setForeground(Color.BLACK);
		btnG_1.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnG_1.setBackground(Color.MAGENTA);
		btnG_1.setBounds(59, 318, 123, 61);
		btnG_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("G-4");
				menu.setVisible(true);
				menu.setTitle("G-4");
				setVisible(false);
			}
		});
		contentPane.add(btnG_1);
		
		if(productOperationsDB.isFull("G-4")) {
			
			btnG_1.setBackground(Color.RED);
		}
		
		JButton btnG_2 = new JButton("G-5");
		btnG_2.setForeground(Color.BLACK);
		btnG_2.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnG_2.setBackground(Color.MAGENTA);
		btnG_2.setBounds(59, 395, 123, 61);
		btnG_2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("G-5");
				menu.setVisible(true);
				menu.setTitle("G-5");
				setVisible(false);
			}
		});
		contentPane.add(btnG_2);
		
		if(productOperationsDB.isFull("G-5")) {
			
			btnG_2.setBackground(Color.RED);
		}
		
		JButton btnG_3 = new JButton("G-6");
		btnG_3.setForeground(Color.BLACK);
		btnG_3.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnG_3.setBackground(Color.MAGENTA);
		btnG_3.setBounds(371, 295, 123, 61);
		btnG_3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("G-6");
				menu.setVisible(true);
				menu.setTitle("G-6");
				setVisible(false);
			}
		});
		contentPane.add(btnG_3);
		
		if(productOperationsDB.isFull("G-6")) {
			
			btnG_3.setBackground(Color.RED);
		}
		
		JButton btnG_4 = new JButton("G-7");
		btnG_4.setForeground(Color.BLACK);
		btnG_4.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnG_4.setBackground(Color.MAGENTA);
		btnG_4.setBounds(371, 379, 123, 61);
		btnG_4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("G-7");
				menu.setVisible(true);
				menu.setTitle("G-7");
				setVisible(false);
			}
		});
		contentPane.add(btnG_4);
		
		if(productOperationsDB.isFull("G-7")) {
			
			btnG_4.setBackground(Color.RED);
		}
		
		JButton btnVp = new JButton("VIP-2");
		btnVp.setForeground(Color.BLACK);
		btnVp.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnVp.setBackground(new Color(204, 255, 0));
		btnVp.setBounds(428, 167, 123, 61);
		btnVp.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("VIP-2");
				menu.setVisible(true);
				menu.setTitle("VIP-2");
				setVisible(false);
			}
		});
		contentPane.add(btnVp);
		
		if(productOperationsDB.isFull("VIP-2")) {
			
			btnVp.setBackground(Color.RED);
		}
		
		JButton btnGspeacial = new JButton("VIP-1");
		btnGspeacial.setForeground(Color.BLACK);
		btnGspeacial.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnGspeacial.setBackground(new Color(204, 255, 0));
		btnGspeacial.setBounds(428, 87, 123, 61);
		btnGspeacial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				MenuPage menu = new MenuPage("VIP-1");
				menu.setVisible(true);
				menu.setTitle("VIP-1");
				setVisible(false);
			}
		});
		contentPane.add(btnGspeacial);
		
		if(productOperationsDB.isFull("VIP-1")) {
			
			btnGspeacial.setBackground(Color.RED);
		}
		
		JButton btnNewButton_1 = new JButton("Door");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				Inside ins = new Inside();
				ins.setVisible(true);
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Rockwell", Font.BOLD, 13));
		btnNewButton_1.setBackground(new Color(102, 0, 0));
		btnNewButton_1.setBounds(242, 448, 123, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblSunIcon = new JLabel("");
		lblSunIcon.setIcon(new ImageIcon(img)); 
		lblSunIcon.setBounds(0, 13, 782, 479);
		contentPane.add(lblSunIcon);
		
	
		setVisible(true);
	}
}
