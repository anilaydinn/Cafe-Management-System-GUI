
import java.awt.Color;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.UIManager;
import javax.swing.JTextField;

public class MenuPage extends JFrame {

	private JPanel contentPane;
	private Check check;
	private static ProductFactory foodFactory;
	private static ProductFactory beveragesFactory;
	private ProductOperationsDB productOperationsDB;
	private String table_name;
	private JTextField txtFieldWater;
	private JTextField txtFieldCoke;
	private JTextField txtFieldTea;
	private JTextField txtFieldBeer;
	private JTextField txtFieldCoffee;
	private JTextField txtFieldBurger;
	private JTextField txtFieldMeatBall;
	private JTextField txtFieldWrap;
	private JTextField txtFieldSoup;
	private JTextField txtFieldDonner;
	private JTextField txtFieldSalad;

	/**
	 * Create the frame.
	 */
	public MenuPage(String table_name) {
		setBounds(100, 100, 790, 573);
		DefaultListModel<Object> listModel;
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(UIManager.getColor("RadioButtonMenuItem.acceleratorForeground"));
		setLocationRelativeTo(null);
		check = new Check();
		foodFactory = (FoodFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.food);
		beveragesFactory = (BeveragesFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.beverages);
		listModel = new DefaultListModel<Object>();
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		productOperationsDB = ProductOperationsDB.getProductOperationsDB();
		
		
		JList<Object> checkJList = new JList<Object>();
		checkJList.setBounds(366, 13, 412, 460);
		contentPane.add(checkJList);
		this.table_name = table_name;
		
		
		checkJList.setModel(productOperationsDB.updateJList(this.table_name));
		
		JLabel lblTotal = new JLabel("Total:");
		lblTotal.setForeground(Color.YELLOW);
		lblTotal.setFont(new Font("Dialog", Font.BOLD, 22));
		lblTotal.setBounds(12, 485, 207, 46);
		contentPane.add(lblTotal);
		
		lblTotal.setText("Total: " + productOperationsDB.getTotalPrice(table_name) + " TL");
		
		JButton btnWaterml = new JButton("Water(500ml)(2$)");
		btnWaterml.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				BeveragesFactory beveragesFactory = (BeveragesFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.beverages);
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Water");
				beverages.setMililiter(500);
				beverages.setQuantity(Integer.parseInt(txtFieldWater.getText()));
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
				txtFieldWater.setText("1");
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
				
				BeveragesFactory beveragesFactory = (BeveragesFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.beverages);
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Coke");
				beverages.setMililiter(330);
				beverages.setQuantity(Integer.parseInt(txtFieldCoke.getText()));
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
				txtFieldCoke.setText("1");
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
				
				BeveragesFactory beveragesFactory = (BeveragesFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.beverages);
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Tea");
				beverages.setMililiter(100);
				beverages.setQuantity(Integer.parseInt(txtFieldTea.getText()));
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
				txtFieldTea.setText("1");
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
				
				BeveragesFactory beveragesFactory = (BeveragesFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.beverages);
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Beer");			
				beverages.setMililiter(500);
				beverages.setQuantity(Integer.parseInt(txtFieldBeer.getText()));
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
				txtFieldBeer.setText("1");
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
				
				BeveragesFactory beveragesFactory = (BeveragesFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.beverages); 
				Beverages beverages = (Beverages)beveragesFactory.getProducts();
				beverages.setName("Coffee");
				beverages.setMililiter(270);
				beverages.setQuantity(Integer.parseInt(txtFieldCoffee.getText()));
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
				txtFieldCoffee.setText("1");
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
				
				FoodFactory foodFactory = (FoodFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.food);
				Food food = (Food)foodFactory.getProducts();
				food.setName("Donner");
				food.setGram(120);
				food.setQuantity(Integer.parseInt(txtFieldDonner.getText()));
				food.setPrice(22.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
				txtFieldDonner.setText("1");
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
				
				FoodFactory foodFactory = (FoodFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.food);
				Food food = (Food)foodFactory.getProducts();
				food.setName("Soup");
				food.setGram(150);
				food.setQuantity(Integer.parseInt(txtFieldSoup.getText()));
				food.setPrice(7.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
				txtFieldSoup.setText("1");
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
				
				FoodFactory foodFactory = (FoodFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.food);
				Food food = (Food)foodFactory.getProducts();
				food.setName("Wrap");
				food.setGram(220);
				food.setQuantity(Integer.parseInt(txtFieldWrap.getText()));
				food.setPrice(14.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
				txtFieldWrap.setText("1");
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
				
				FoodFactory foodFactory = (FoodFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.food);
				Food food = (Food)foodFactory.getProducts();
				food.setName("MeatBall");
				food.setGram(300);
				food.setQuantity(Integer.parseInt(txtFieldMeatBall.getText()));
				food.setPrice(35.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
				txtFieldMeatBall.setText("1");
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
				
				FoodFactory foodFactory = (FoodFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.food);
				Food food = (Food)foodFactory.getProducts();
				food.setName("Burger");
				food.setGram(350);
				food.setQuantity(Integer.parseInt(txtFieldBurger.getText()));
				food.setPrice(20.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
				txtFieldBurger.setText("1");
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
				
				FoodFactory foodFactory = (FoodFactory)FactoryFlyWeight.createFactory(FactoryFlyWeight.food);
				Food food = (Food)foodFactory.getProducts();
				food.setName("Salad");
				food.setGram(180);
				food.setQuantity(Integer.parseInt(txtFieldSalad.getText()));
				food.setPrice(12.0);
				
				check.addCheck(food);
				
				for(int i = 0; i < check.getProducts().size(); i++) {
					
					listModel.addElement(check.getProducts().get(i));
				}
				
				checkJList.setModel(listModel);
				check.calcTotalPrice();
				lblTotal.setText("Total: " + check.getTotalPrice() + " TL");
				check.removeAll();
				txtFieldSalad.setText("1");
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
		btnSaveChecks.setBounds(686, 488, 92, 47);
		contentPane.add(btnSaveChecks);								
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				productOperationsDB.deleteCheck(getTitle());
				checkJList.setModel(productOperationsDB.updateJList(table_name));
				lblTotal.setText("Total: 0.00 TL");
			}
		});
		btnPay.setBounds(533, 488, 92, 46);
		contentPane.add(btnPay);
		
		JButton btnWaterPlus = new JButton("+");
		btnWaterPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int water = Integer.parseInt(txtFieldWater.getText());
				water++;
				txtFieldWater.setText(Integer.toString(water));
			}
		});
		btnWaterPlus.setBounds(310, 18, 44, 25);
		contentPane.add(btnWaterPlus);
		
		JButton btnWaterMinus = new JButton("-");
		btnWaterMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldWater.getText().equals("1")){
			
					return;
				}
				
				int water = Integer.parseInt(txtFieldWater.getText());
				water--;
				txtFieldWater.setText(Integer.toString(water));
			}
		});
		btnWaterMinus.setBounds(218, 18, 44, 25);
		contentPane.add(btnWaterMinus);
		
		JButton btnCokeMinus = new JButton("-");
		btnCokeMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldCoke.getText().equals("1")) {
					
					return;
				}
				
				int coke = Integer.parseInt(txtFieldCoke.getText());
				coke--;
				txtFieldCoke.setText(Integer.toString(coke));
			}
		});
		btnCokeMinus.setBounds(218, 56, 44, 25);
		contentPane.add(btnCokeMinus);
		
		JButton btnCokePlus = new JButton("+");
		btnCokePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int coke = Integer.parseInt(txtFieldCoke.getText());
				coke++;
				txtFieldCoke.setText(Integer.toString(coke));
			}
		});
		btnCokePlus.setBounds(310, 56, 44, 25);
		contentPane.add(btnCokePlus);
		
		JButton btnTeaMinus = new JButton("-");
		btnTeaMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldTea.getText().equals("1")) {
					
					return;
				}
				
				int tea = Integer.parseInt(txtFieldTea.getText());
				tea--;
				txtFieldTea.setText(Integer.toString(tea));
			}
		});
		btnTeaMinus.setBounds(218, 99, 44, 25);
		contentPane.add(btnTeaMinus);
		
		JButton btnTeaPlus = new JButton("+");
		btnTeaPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int tea = Integer.parseInt(txtFieldTea.getText());
				tea++;
				txtFieldTea.setText(Integer.toString(tea));
			}
		});
		btnTeaPlus.setBounds(310, 99, 44, 25);
		contentPane.add(btnTeaPlus);
		
		JButton btnBeerMinus = new JButton("-");
		btnBeerMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldBeer.getText().equals("1")) {
					
					return;
				}
				
				int beer = Integer.parseInt(txtFieldBeer.getText());
				beer--;
				txtFieldBeer.setText(Integer.toString(beer));
			}
		});
		btnBeerMinus.setBounds(218, 142, 44, 25);
		contentPane.add(btnBeerMinus);
		
		JButton btnBeerPlus = new JButton("+");
		btnBeerPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int beer = Integer.parseInt(txtFieldBeer.getText());
				beer++;
				txtFieldBeer.setText(Integer.toString(beer));
			}
		});
		btnBeerPlus.setBounds(310, 142, 44, 25);
		contentPane.add(btnBeerPlus);
		
		JButton btnCoffeeMinus = new JButton("-");
		btnCoffeeMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldCoffee.getText().equals("1")) {
					
					return;
				}
				
				int coffee = Integer.parseInt(txtFieldCoffee.getText());
				coffee--;
				txtFieldCoffee.setText(Integer.toString(coffee));
				
			}
		});
		btnCoffeeMinus.setBounds(218, 185, 44, 25);
		contentPane.add(btnCoffeeMinus);
		
		JButton btnCoffeePlus = new JButton("+");
		btnCoffeePlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int coffee = Integer.parseInt(txtFieldCoffee.getText());
				coffee++;
				txtFieldCoffee.setText(Integer.toString(coffee));
			}
		});
		btnCoffeePlus.setBounds(310, 185, 44, 25);
		contentPane.add(btnCoffeePlus);
		
		JButton btnBurgerMinus = new JButton("-");
		btnBurgerMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldBurger.getText().equals("1")) {
					
					return;
				}
				
				int burger = Integer.parseInt(txtFieldBurger.getText());
				burger--;
				txtFieldBurger.setText(Integer.toString(burger));
			}
		});
		btnBurgerMinus.setBounds(218, 228, 44, 25);
		contentPane.add(btnBurgerMinus);
		
		JButton btnBurgerPlus = new JButton("+");
		btnBurgerPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int burger = Integer.parseInt(txtFieldBurger.getText());
				burger++;
				txtFieldBurger.setText(Integer.toString(burger));
			}
		});
		btnBurgerPlus.setBounds(310, 228, 44, 25);
		contentPane.add(btnBurgerPlus);
		
		JButton btnMeatBallMinus = new JButton("-");
		btnMeatBallMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldMeatBall.getText().equals("1")) {
					
					return;
				}
				
				int meatBall = Integer.parseInt(txtFieldMeatBall.getText());
				meatBall--;
				txtFieldMeatBall.setText(Integer.toString(meatBall));
			}
		});
		btnMeatBallMinus.setBounds(218, 271, 44, 25);
		contentPane.add(btnMeatBallMinus);
		
		JButton btnMeatBallPlus = new JButton("+");
		btnMeatBallPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int meatBall = Integer.parseInt(txtFieldMeatBall.getText());
				meatBall++;
				txtFieldMeatBall.setText(Integer.toString(meatBall));
			}
		});
		btnMeatBallPlus.setBounds(310, 271, 44, 25);
		contentPane.add(btnMeatBallPlus);
		
		JButton btnWrapMinus = new JButton("-");
		btnWrapMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldWrap.getText().equals("1")) {
					
					return;
				}
				
				int wrap = Integer.parseInt(txtFieldWrap.getText());
				wrap--;
				txtFieldWrap.setText(Integer.toString(wrap));
			}
		});
		btnWrapMinus.setBounds(218, 314, 44, 25);
		contentPane.add(btnWrapMinus);
		
		JButton btnWrapPlus = new JButton("+");
		btnWrapPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int wrap = Integer.parseInt(txtFieldWrap.getText());
				wrap++;
				txtFieldWrap.setText(Integer.toString(wrap));
			}
		});
		btnWrapPlus.setBounds(310, 314, 44, 25);
		contentPane.add(btnWrapPlus);
		
		JButton btnSoupMinus = new JButton("-");
		btnSoupMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldSoup.getText().equals("1")) {
					
					return;
				}
				
				int soup = Integer.parseInt(txtFieldSoup.getText());
				soup--;
				txtFieldSoup.setText(Integer.toString(soup));
			}
		});
		btnSoupMinus.setBounds(218, 359, 44, 25);
		contentPane.add(btnSoupMinus);
		
		JButton btnSoupPlus = new JButton("+");
		btnSoupPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int soup = Integer.parseInt(txtFieldSoup.getText());
				soup++;
				txtFieldSoup.setText(Integer.toString(soup));
			}
		});
		btnSoupPlus.setBounds(310, 359, 44, 25);
		contentPane.add(btnSoupPlus);
		
		JButton btnDonnerMinus = new JButton("-");
		btnDonnerMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldDonner.getText().equals("1")) {
					
					return;
				}
				
				int donner = Integer.parseInt(txtFieldDonner.getText());
				donner--;
				txtFieldDonner.setText(Integer.toString(donner));
			}
		});
		btnDonnerMinus.setBounds(218, 402, 44, 25);
		contentPane.add(btnDonnerMinus);
		
		JButton btnDonnerPlus = new JButton("+");
		btnDonnerPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int donner = Integer.parseInt(txtFieldDonner.getText());
				donner++;
				txtFieldDonner.setText(Integer.toString(donner));
			}
		});
		btnDonnerPlus.setBounds(310, 402, 44, 25);
		contentPane.add(btnDonnerPlus);
		
		JButton btnSaladMinus = new JButton("-");
		btnSaladMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtFieldSalad.getText().equals("1")) {
					
					return;
				}
				
				int salad = Integer.parseInt(txtFieldSalad.getText());
				salad--;
				txtFieldSalad.setText(Integer.toString(salad));
			}
		});
		btnSaladMinus.setBounds(218, 445, 44, 25);
		contentPane.add(btnSaladMinus);
		
		JButton btnSaladPlus = new JButton("+");
		btnSaladPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int salad = Integer.parseInt(txtFieldSalad.getText());
				salad++;
				txtFieldSalad.setText(Integer.toString(salad));
			}
		});
		btnSaladPlus.setBounds(310, 445, 44, 25);
		contentPane.add(btnSaladPlus);
		
		txtFieldWater = new JTextField();
		txtFieldWater.setBounds(271, 18, 27, 25);
		contentPane.add(txtFieldWater);
		txtFieldWater.setColumns(10);
		txtFieldWater.setText("1");
		
		txtFieldCoke = new JTextField();
		txtFieldCoke.setText("1");
		txtFieldCoke.setColumns(10);
		txtFieldCoke.setBounds(271, 58, 27, 25);
		contentPane.add(txtFieldCoke);
		
		txtFieldTea = new JTextField();
		txtFieldTea.setText("1");
		txtFieldTea.setColumns(10);
		txtFieldTea.setBounds(271, 101, 27, 25);
		contentPane.add(txtFieldTea);
		
		txtFieldBeer = new JTextField();
		txtFieldBeer.setText("1");
		txtFieldBeer.setColumns(10);
		txtFieldBeer.setBounds(271, 142, 27, 25);
		contentPane.add(txtFieldBeer);
		
		txtFieldCoffee = new JTextField();
		txtFieldCoffee.setText("1");
		txtFieldCoffee.setColumns(10);
		txtFieldCoffee.setBounds(271, 185, 27, 25);
		contentPane.add(txtFieldCoffee);
		
		txtFieldBurger = new JTextField();
		txtFieldBurger.setText("1");
		txtFieldBurger.setColumns(10);
		txtFieldBurger.setBounds(271, 228, 27, 25);
		contentPane.add(txtFieldBurger);
		
		txtFieldMeatBall = new JTextField();
		txtFieldMeatBall.setText("1");
		txtFieldMeatBall.setColumns(10);
		txtFieldMeatBall.setBounds(271, 272, 27, 25);
		contentPane.add(txtFieldMeatBall);
		
		txtFieldWrap = new JTextField();
		txtFieldWrap.setText("1");
		txtFieldWrap.setColumns(10);
		txtFieldWrap.setBounds(271, 315, 27, 25);
		contentPane.add(txtFieldWrap);
		
		txtFieldSoup = new JTextField();
		txtFieldSoup.setText("1");
		txtFieldSoup.setColumns(10);
		txtFieldSoup.setBounds(271, 360, 27, 25);
		contentPane.add(txtFieldSoup);
		
		txtFieldDonner = new JTextField();
		txtFieldDonner.setText("1");
		txtFieldDonner.setColumns(10);
		txtFieldDonner.setBounds(271, 402, 27, 25);
		contentPane.add(txtFieldDonner);
		
		txtFieldSalad = new JTextField();
		txtFieldSalad.setText("1");
		txtFieldSalad.setColumns(10);
		txtFieldSalad.setBounds(271, 443, 27, 25);
		contentPane.add(txtFieldSalad);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Inside inside = new Inside();
				inside.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setBounds(376, 488, 92, 46);
		contentPane.add(btnBack);
			
	}
}
