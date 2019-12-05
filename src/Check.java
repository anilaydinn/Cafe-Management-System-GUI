import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class Check {

	 private LinkedList<Products> products = new LinkedList<Products>();
	 private double totalPrice;
	 private String paymentMethod;
	 private String responsible;
	 
	 
	 public void addCheck(Products product) {
		 
		 this.products.add(product);
	 }
	 /*
	 public double getTotalPrice() {
		 
		 for(Products product : products) {
			 
			 this.totalPrice += product.quantity * product.getPrice(); 
		 }
		 
		 return this.totalPrice;
	 }
	 */
	 
	 
	 public void showProducts() {
		 
		 for(Products product : products) {
			 
			 System.out.println(product.toString());
		 }
	 }
	 
	 public void setResponsible(String responsible) {
		 
		 this.responsible = responsible;
	 }
	 
	 public String getResponsible() {
		 
		 return this.responsible;
	 }
	 
	 public void setPaymentMethod(String paymentMethod) {
		 
		 this.paymentMethod = paymentMethod;
	 }
	 
	 public String getPaymentMethod() {
		 
		 return this.paymentMethod;
	 }
	 
	 public LinkedList<Products> getProducts(){
		 
		 return products;
	 }
}
