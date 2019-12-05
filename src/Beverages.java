
public class Beverages implements IProducts {

	private String name;
	private int mililiter;
	private int quantity;
	private boolean isAlcohol;
	private double price;
	
	public Beverages(String name, int mililiter, boolean isAlcohol, double price) {
		
		this.name = name;
		this.mililiter = mililiter;
		this.isAlcohol = isAlcohol;
		this.price = price;
	}
	
	public Beverages() {
		
		this.name = "";
		this.mililiter = 0;
		this.isAlcohol = false;
		this.price = 0.0;
	}
	
	public double getPrice() {
		
		return this.price;
	}

	@Override
	public void setName(String name) {
		
		this.name = name;
	}

	@Override
	public void setGram(int gram) {
		
		//Empty
	}

	@Override
	public String toString() {
		return "Beverages Name: " + this.name + " Mililiter: " + this.mililiter + " Quantity: " + this.quantity + " Alcohol: " + getIsAlcohol(isAlcohol) + " Price: " + this.price;
	}

	@Override
	public void setQuantity(int quantity) {
		
		this.quantity = quantity;
	}

	@Override
	public void setPrice(double price) {
		
		this.price = price;
	}

	@Override
	public void setMililiter(int mililiter) {
		
		this.mililiter = mililiter;
	}

	@Override
	public void setIsAlcohol(boolean isAlcohol) {
		
		this.isAlcohol = isAlcohol;
	}

	@Override
	public int getQuantity() {
		
		return this.quantity;
	}

	@Override
	public String getIsAlcohol(boolean isAlcohol) {
		
		isAlcohol = this.isAlcohol;
		
		if(isAlcohol == true) {
			
			return "✓";
		}
		else {
			
			return "x";
		}
	}
}
