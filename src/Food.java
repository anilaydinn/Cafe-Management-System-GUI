
public class Food implements IProducts {

	private String name;
	private int gram;
	private int quantity;
	private double price;
	
	public Food(String name, int quantity, int gram, double price) {
		
		this.name = name;
		this.gram = gram;
		this.quantity = quantity;
		this.price = price;
	}
	
	public Food() {
		
		this.name = "";
		this.quantity = 0;
		this.price = 0.0;
	}
	
	@Override
	public String toString() {
		
		return "Food Name: " + this.name + " Quantity: " + this.quantity + " Gram: " + this.gram + " Price: " + this.price;
	}

	@Override
	public void setName(String name) {
		
		this.name = name;
	}

	@Override
	public void setGram(int gram) {
		
		this.gram = gram;
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
		//Empty
	}

	@Override
	public void setIsAlcohol(boolean isAlcohol) {
		//Empty
	}

	@Override
	public double getPrice() {
		
		return this.price;
	}

	@Override
	public int getQuantity() {
		
		return this.quantity;
	}

	@Override
	public String getIsAlcohol(boolean isAlcohol) {
		
		return null;
	}
	
}
