
public abstract class Products {
	
	private int id;
	private String name;
	private double price;
	
	public Products(int id, String name, double price) {
		
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public Products() {
		
		this.id = 0;
		this.name = "";
		this.price = 0.0;
	}
	
	public void setID(int id) {
		
		this.id = id;
	}
	
	public int getID() {
		
		return this.id;
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

	public abstract String toString();
	
	
}
