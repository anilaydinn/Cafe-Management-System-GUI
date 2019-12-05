
public class BeveragesFactory extends ProductFactory {

	@Override
	public Products getProducts() {
		
		return new Beverages();
	}
}
