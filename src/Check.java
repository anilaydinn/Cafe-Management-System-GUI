import java.util.ArrayList;

public class Check {

	 private ArrayList<Products> products = new ArrayList<Products>();
	 private double totalPrice;
	 
	 public void addCheck(Products product) {
		 
		 this.products.add(product);
	 }
	 
	 public double getTotalPrice() {
		 
		 for(Products product : products) {
			 
			 this.totalPrice += product.getQuantity() * product.getPrice(); 
		 }
		 
		 return this.totalPrice;
	 }
	 
	 public void showProducts() {
		 
		 for(Products product : products) {
			 
			 System.out.println(product);
		 }
	 }
	
}
