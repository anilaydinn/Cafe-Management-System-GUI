import java.util.ArrayList;

public class Check {

	 private ArrayList<Products> products = new ArrayList<Products>();
	 private double totalPrice;
	 
	 public Check() {
		 
		 removeAll();
	 }
	 
	 public void addCheck(Products product) {
		 
		 this.products.add(product);
	 }
	 
	 public void calcTotalPrice() {
		 
		 for(Products product : products) {
			 
			 this.totalPrice += product.getPrice(); 
		 }
		 
	 }
	 
	 public double getTotalPrice() {
		 
		 return this.totalPrice;
	 }
	 
	 public void setTotalPrice(double totalPrice) {
		 
		 this.totalPrice = totalPrice;
	 }
	 
	 public void showProducts() {
		 
		 for(Products product : products) {
			 
			 System.out.println(product.toString());
		 }
	 }
	 
	 public void removeAll() {
		 
		 for(int i = 0; i < products.size(); i++) {
			 
			 products.remove(i);
		 }
	 }
	 
	 public ArrayList<Products> getProducts(){
		 
		 return products;
	 }
}
