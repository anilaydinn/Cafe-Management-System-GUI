
public abstract class Products implements Cloneable, Comparable<Products>{

	private String name;
	private double price;
	
	public Products(String name, double price) {
		
		this.name = name;
		this.price = price;
	}
	
	public Products() {
		
		this.name = "";
		this.price = 0.0;
	}
	
	public void setName(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		
		return this.name;
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
