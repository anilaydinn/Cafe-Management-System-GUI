
public class Beverages extends Products {

	private int mililiter;
	private boolean isAlcohol;
	
	public Beverages(String name, int quantity, int mililiter, boolean isAlcohol, double price) {
		
		super(name,quantity,price);
		this.mililiter = mililiter;
		this.isAlcohol = isAlcohol;
	}
	
	public Beverages() {
		
		this.isAlcohol = false;
		this.mililiter = 0; 
	}

	public void setMililiter(int mililiter) {
		
		this.mililiter = mililiter;
	}
	
	public int getMililiter() {
		
		return this.mililiter;
	}

	public void setIsAlcohol(boolean isAlcohol) {
		
		this.isAlcohol = isAlcohol;
	}

	public String getIsAlcohol() {
		
		if(this.isAlcohol == true) {
			
			return "✓";
		}
		else {
			
			return "x";
		}
	}

	@Override
	public Products clone() throws CloneNotSupportedException {
		
		return (Beverages)super.clone();
	}

	@Override
	public String toString() {
		
		return "Name: " + getName() + " Quantity: " + Products.quantity + " Mililiter: " + getMililiter() + " Alcohol: " + getIsAlcohol() + " Price: " + getPrice(); 
	}
}
