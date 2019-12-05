
public class BeveragesFactory extends ProductFacctory {

	@Override
	public Products getProducts() {
		
		return new Beverages();
	}
}
