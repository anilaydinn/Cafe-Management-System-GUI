
public class Foods extends Products implements ProductMethods{
	
	private int gram;
	
	public Foods(int id,String name,double price,int gram) {
		
		super(id,name,price);
		this.gram = gram;
	}
	
	public int getGram() {
		return this.gram;
	}

	public void setGram(int gram) {
		this.gram = gram;
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

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		
		return getID() + " " + getName() + " " + getPrice();
	}

	
}
