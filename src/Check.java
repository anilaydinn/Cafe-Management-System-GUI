import java.util.ArrayList;

public class Check {

	 private ArrayList<IProducts> products = new ArrayList<IProducts>();
	 private double totalPrice;
	 
	 public void addCheck(IProducts product) {
		 
		 this.products.add(product);
	 }
	 
	 public double getTotalPrice() {
		 
		 for(IProducts product : products) {
			 
			 this.totalPrice += product.getQuantity() * product.getPrice(); 
		 }
		 
		 return this.totalPrice;
	 }
	 
	 public void showProducts() {
		 
		 for(IProducts product : products) {
			 
			 System.out.println(product);
		 }
	 }
	
}
