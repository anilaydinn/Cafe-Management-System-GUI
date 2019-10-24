
public class AlcoholDrinks extends Beverages {

	private double alcoholPercentage;
	
	public AlcoholDrinks(int milliliter, String name, double price, int id,double alcoholPercentage) {
		
		super(milliliter, name, price, id);
		this.alcoholPercentage = alcoholPercentage;
	}

	public double getAlcoholPercentage() {
		
		return alcoholPercentage;
	}

	public void setAlcoholPercentage(double alcoholPercentage) {
		
		this.alcoholPercentage = alcoholPercentage;
	}
	
	

}
