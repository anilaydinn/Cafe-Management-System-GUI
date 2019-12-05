
public class Beverages extends Products {

	private int mililiter;
	private boolean isAlcohol;
	
	public Beverages(String name, int mililiter, boolean isAlcohol, double price) {
		
		super();
		this.mililiter = mililiter;
		this.isAlcohol = isAlcohol;
	}
	
	public Beverages() {
		
		this.mililiter = 0;
		this.isAlcohol = false;
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
	
	public Products clone() throws CloneNotSupportedException{
		
		return (Beverages)super.clone();
	}
}
