
public class Beverages extends Products implements ProductMethods {

	private int milliliter;
	
	
	public Beverages(int milliliter,String name, double price, int id) {
		
		super(id,name,price);
		this.milliliter = milliliter;
	}

	public int getMilliliter() {
		
		return this.milliliter;
	}

	public void setMilliliter(int milliliter) {
		
		this.milliliter = milliliter;
	}

	@Override
	public String toString() {
		
		return getID() + " " + getName() + " " + getPrice();
	}

	@Override
	public double addToBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double removeFromBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean stockCheck() {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}
