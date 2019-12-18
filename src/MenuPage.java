
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.UIManager;

public class MenuPage extends JFrame {

	private JPanel contentPane;
	private Check check;
	private ProductFactory foodFactory;
	private ProductFactory beveragesFactory;
	private ProductOperationsDB productOperationsDB = new ProductOperationsDB();

	/**
	 * Create the frame.
	 */
	public MenuPage() {
		setBounds(100, 100, 674, 573);
		DefaultListModel<Object> listModel;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(UIManager.getColor("RadioButtonMenuItem.acceleratorForeground"));
		setLocationRelativeTo(null);
		check = new Check();
		foodFactory = new FoodFactory();
		beveragesFactory = new BeveragesFactory();
		listModel = new DefaultListModel<Object>();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		JList<Object> checkJList = new JList<Object>();
		checkJList.setBounds(213, 13, 435, 460);
		contentPane.add(checkJList);
		
		
		
		Image img = new ImageIcon(this.getClass().getResource("/menu2.png")).getImage();
		
		
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setForeground(Color.YELLOW);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 22));
		lblTotal.setBounds(12, 485, 207, 46);
		contentPane.add(lblTotal);
		
		JButton btnWaterml = new JButton("Water(500ml)(2$)");
		btnWaterml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				
				beverages.setName("Water");
				beverages.setMililiter(500);
				beverages.setPrice(2.0);
				beverages.setIsAlcohol(false);
				
				check.addCheck(beverages);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnWaterml.setBackground(new Color(255, 255, 0));
		btnWaterml.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnWaterml.setBounds(12, 13, 189, 30);
		contentPane.add(btnWaterml);
				
		JButton btnCokeml = new JButton("Coke(330ml)(5$)");
		btnCokeml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Coke");
				beverages.setMililiter(330);
				beverages.setPrice(5.00);
				beverages.setIsAlcohol(false);
				
				check.addCheck(beverages);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnCokeml.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnCokeml.setBackground(new Color(255, 255, 0));
		btnCokeml.setBounds(12, 56, 189, 30);
		contentPane.add(btnCokeml);
				
		JButton btnTeaml = new JButton("Tea(100ml)(3$)");
		btnTeaml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Tea");
				beverages.setMililiter(100);
				beverages.setPrice(3);
				beverages.setIsAlcohol(false);
			    
				check.addCheck(beverages);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnTeaml.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnTeaml.setBackground(new Color(255, 255, 0));
		btnTeaml.setBounds(12, 99, 189, 30);
		contentPane.add(btnTeaml);
				
		JButton btnml = new JButton("Beer(500ml)(15$)");
		btnml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Beer");
				beverages.setMililiter(500);
				beverages.setPrice(15.0);
				beverages.setIsAlcohol(true);
				
				check.addCheck(beverages);

				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnml.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnml.setBackground(new Color(255, 255, 0));
		btnml.setBounds(12, 142, 189, 30);
		contentPane.add(btnml);
				
		JButton btnCoffeeml = new JButton("Coffee(270ml)(7$)");
		btnCoffeeml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Coffee");
				beverages.setMililiter(270);
				beverages.setPrice(7.0);
				beverages.setIsAlcohol(false);
				
				check.addCheck(beverages);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnCoffeeml.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnCoffeeml.setBackground(new Color(255, 255, 0));
		btnCoffeeml.setBounds(12, 185, 189, 30);
		contentPane.add(btnCoffeeml);
						
		JButton btnDonner = new JButton("Donner(120gr)(22$)");
		btnDonner.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Food food = (Food)foodFactory.getProducts();
				food.setName("Donner");
				food.setGram(120);
				food.setPrice(22.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnDonner.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnDonner.setBackground(new Color(255, 228, 225));
		btnDonner.setBounds(12, 400, 189, 30);
		contentPane.add(btnDonner);
						
		JButton btnSoupgr = new JButton("Soup(150gr)(7$)");
		btnSoupgr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Food food = (Food)foodFactory.getProducts();
				food.setName("Soup");
				food.setGram(150);
				food.setPrice(7.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnSoupgr.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnSoupgr.setBackground(new Color(255, 228, 225));
		btnSoupgr.setBounds(12, 357, 189, 30);
		contentPane.add(btnSoupgr);
						
		JButton btnWaterml_1 = new JButton("Wrap(220gr)(14$)");
		btnWaterml_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Food food = (Food)foodFactory.getProducts();
				food.setName("Wrap");
				food.setGram(220);
				food.setPrice(14.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnWaterml_1.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnWaterml_1.setBackground(new Color(255, 228, 225));
		btnWaterml_1.setBounds(12, 314, 189, 30);
		contentPane.add(btnWaterml_1);
						
		JButton btnWater = new JButton("MeatBall(300gr)(35$)");
		btnWater.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Food food = (Food)foodFactory.getProducts();
				food.setName("MeatBall");
				food.setGram(300);
				food.setPrice(35.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnWater.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnWater.setBackground(new Color(255, 228, 225));
		btnWater.setBounds(12, 271, 189, 30);
		contentPane.add(btnWater);
						
		JButton btnHamburgergr = new JButton("Burger(350gr)(20$)");
		btnHamburgergr.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Food food = (Food)foodFactory.getProducts();
				food.setName("Burger");
				food.setGram(350);
				food.setPrice(20.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnHamburgergr.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnHamburgergr.setBackground(new Color(255, 228, 225));
		btnHamburgergr.setBounds(12, 228, 189, 30);
		contentPane.add(btnHamburgergr);
								
		JButton btnDonner_1 = new JButton("Salad(180gr)(12$)");
		btnDonner_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Food food = (Food)foodFactory.getProducts();
				food.setName("Salad");
				food.setGram(180);
				food.setPrice(12.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
			}
		});
		btnDonner_1.setFont(new Font("Rockwell", Font.BOLD, 11));
		btnDonner_1.setBackground(new Color(255, 228, 225));
		btnDonner_1.setBounds(12, 443, 189, 30);
		contentPane.add(btnDonner_1);
		
		JButton btnSaveChecks = new JButton("Save");
		btnSaveChecks.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				for(int i = 0; i < checkJList.getModel().getSize(); i++) {
					
					if(checkJList.getModel().getElementAt(i) instanceof Food) {
						
						Food food;
						food = (Food)checkJList.getModel().getElementAt(i);
						
						productOperationsDB.addChecks(getTitle(), food.toString(), food.getPrice());
					}
					else if(checkJList.getModel().getElementAt(i) instanceof Beverages) {
						
						Beverages beverages;
						beverages = (Beverages)checkJList.getModel().getElementAt(i);
						
						productOperationsDB.addChecks(getTitle(), beverages.toString(), beverages.getPrice());
					}
				}
			}
		});
		btnSaveChecks.setBounds(556, 485, 92, 47);
		contentPane.add(btnSaveChecks);								
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ArrayList<String> contains = productOperationsDB.getContains(getTitle());
				
				for(int i = 0; i < contains.size() ; i++) {
					
					listModel.addElement(contains.get(i));
				}
				checkJList.setModel(listModel);
				
				lblTotal.setText("Total: " + productOperationsDB.getTotalPrice(getTitle().toString()));
				
				productOperationsDB.deleteCheck(getTitle());
				
			}
		});
		btnPay.setBounds(213, 485, 92, 46);
		contentPane.add(btnPay);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				listModel.removeAllElements();
				lblTotal.setText("Total: 0.00");
			}
		});
		btnClear.setBounds(377, 485, 98, 46);
		contentPane.add(btnClear);
		
		
		
	}
}
