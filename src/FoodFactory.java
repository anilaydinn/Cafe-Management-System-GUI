
public class FoodFactory extends ProductFacctory {

	@Override
	public Products getProducts() {
		
		return new Food();
	}
}
