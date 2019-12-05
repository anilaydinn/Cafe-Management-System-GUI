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
import javax.swing.JButton;
import javax.swing.JList;

public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 563);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Image img = new ImageIcon(this.getClass().getResource("/menu2.png")).getImage();
		
		JButton btnWaterml = new JButton("Water(500ml)(2$)");
		btnWaterml.setBackground(new Color(255, 255, 0));
		btnWaterml.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnWaterml.setBounds(12, 13, 151, 30);
		contentPane.add(btnWaterml);
				
				JButton btnCokeml = new JButton("Coke(330ml)(5$)");
				btnCokeml.setFont(new Font("Rockwell", Font.BOLD, 11));
				btnCokeml.setBackground(new Color(255, 255, 0));
				btnCokeml.setBounds(12, 56, 151, 30);
				contentPane.add(btnCokeml);
				
				JButton btnTeaml = new JButton("Tea(100ml)(3$)");
				btnTeaml.setFont(new Font("Rockwell", Font.BOLD, 11));
				btnTeaml.setBackground(new Color(255, 255, 0));
				btnTeaml.setBounds(12, 99, 151, 30);
				contentPane.add(btnTeaml);
				
				JButton btnml = new JButton("Beer(500ml)(15$)");
				btnml.setFont(new Font("Rockwell", Font.BOLD, 11));
				btnml.setBackground(new Color(255, 255, 0));
				btnml.setBounds(12, 142, 151, 30);
				contentPane.add(btnml);
				
				JButton btnCoffeeml = new JButton("Coffee(270ml)(7$)");
				btnCoffeeml.setFont(new Font("Rockwell", Font.BOLD, 11));
				btnCoffeeml.setBackground(new Color(255, 255, 0));
				btnCoffeeml.setBounds(12, 185, 151, 30);
				contentPane.add(btnCoffeeml);
						
						JButton btnDonner = new JButton("Donner(120gr)(22$)");
						btnDonner.setFont(new Font("Rockwell", Font.BOLD, 11));
						btnDonner.setBackground(new Color(255, 228, 225));
						btnDonner.setBounds(12, 400, 151, 30);
						contentPane.add(btnDonner);
						
						JButton btnSoupgr = new JButton("Soup(150gr)(7$)");
						btnSoupgr.setFont(new Font("Rockwell", Font.BOLD, 11));
						btnSoupgr.setBackground(new Color(255, 228, 225));
						btnSoupgr.setBounds(12, 357, 151, 30);
						contentPane.add(btnSoupgr);
						
						JButton btnWaterml_1 = new JButton("Wrap(220gr)(14$)");
						btnWaterml_1.setFont(new Font("Rockwell", Font.BOLD, 11));
						btnWaterml_1.setBackground(new Color(255, 228, 225));
						btnWaterml_1.setBounds(12, 314, 151, 30);
						contentPane.add(btnWaterml_1);
						
						JButton btnWater = new JButton("MeatBall(300gr)(35$)");
						btnWater.setFont(new Font("Rockwell", Font.BOLD, 11));
						btnWater.setBackground(new Color(255, 228, 225));
						btnWater.setBounds(12, 271, 151, 30);
						contentPane.add(btnWater);
						
						JButton btnHamburgergr = new JButton("Burger(350gr)(20$)");
						btnHamburgergr.setFont(new Font("Rockwell", Font.BOLD, 11));
						btnHamburgergr.setBackground(new Color(255, 228, 225));
						btnHamburgergr.setBounds(12, 228, 151, 30);
						contentPane.add(btnHamburgergr);
								
								JButton btnDonner_1 = new JButton("Salad(180gr)(12$)");
								btnDonner_1.setFont(new Font("Rockwell", Font.BOLD, 11));
								btnDonner_1.setBackground(new Color(255, 228, 225));
								btnDonner_1.setBounds(12, 443, 151, 30);
								contentPane.add(btnDonner_1);
								
										JLabel lblbck = new JLabel("");
										lblbck.setFont(new Font("Rockwell", Font.BOLD, 13));
										lblbck.setForeground(new Color(240, 255, 255));
										lblbck.setIcon(new ImageIcon(img)); 
										lblbck.setBounds(-36, -26, 629, 567);
										contentPane.add(lblbck);
										
										JList list = new JList();
										list.setBounds(204, 471, 208, -456);
										contentPane.add(list);
	}
}