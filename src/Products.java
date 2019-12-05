
public abstract class Products implements Cloneable, Comparable<Products>{

	private String name;
	private int quantity;
	private double price;
	
	public Products(String name, int quantity, double price) {
		
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Products() {
		
		this.name = "";
		this.quantity = 0;
		this.price = 0.0;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
	}
	
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
	}
	
	public int getQuantity() {
		
		return this.quantity;
	}
	
	public void setPrice(double price) {
		
		this.price = price;
	}
	
	public double getPrice() {
		
		return this.price;
	}
	
	@Override
	public int compareTo(Products p) {
		
		if(this.price < p.price) {
			
			return -1;
		}
		else if(this.price > p.price) {
			
			return 1;
		}
		return 0; 
	}

	@Override
	public Products clone() throws CloneNotSupportedException {
		
		return (Products)super.clone();
	}
	
	public abstract String toString();
}
