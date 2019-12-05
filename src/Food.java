
public class Food extends Products {

	private int gram;
	
	public Food(String name, int quantity, int gram, double price) {
		
		super(name,quantity,price);
		this.gram = gram;
	}
	
	public Food() {
		
		this.gram = 0;
	}

	public void setGram(int gram) {
		
		this.gram = gram;
	}
	
	public int getGram() {
		
		return this.gram;
	}

	@Override
	public Products clone() throws CloneNotSupportedException {
		
		return (Food)super.clone();
	}

	@Override
	public String toString() {
		
		return "Name: " + getName() + " Quantity: " + getQuantity() + " Gram: " + getGram() + " Price: " + getPrice();
	}
}
