
public class FoodFactory extends ProductFactory {

	@Override
	public Products getProducts() {
		
		return new Food();
	}
}
