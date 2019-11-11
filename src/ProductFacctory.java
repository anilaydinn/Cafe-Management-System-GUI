
public class ProductFacctory {

	public IProducts getProduct(String productType) {
		
		if(productType == null) {
			
			return null;
		}
		else if(productType.equalsIgnoreCase("FOOD")) {
			
			return new Food();
		}
		else if(productType.equalsIgnoreCase("BEVERAGES")) {
			
			return new Beverages();
		}
		else {
			
			return null;
		}
	}
}
