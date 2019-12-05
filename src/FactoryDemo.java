
public class FactoryDemo {

	public static void main(String[] args) {
		
		ProductFacctory productFacctory = new ProductFacctory();
		Check check = new Check();
		
		IProducts food1 = productFacctory.getProduct("Food");
		IProducts food2 = productFacctory.getProduct("Food");
		IProducts food3 = productFacctory.getProduct("Food");
		IProducts drink1 = productFacctory.getProduct("beverages");
		IProducts drink2 = productFacctory.getProduct("beverages");
		IProducts drink3 = productFacctory.getProduct("beverages");
		
		food1.setName("Burger");
		food1.setGram(250);
		food1.setQuantity(3);
		food1.setPrice(15.0);
		
		food2.setName("Burger2");
		food2.setGram(250);
		food2.setQuantity(3);
		food2.setPrice(15.0);
		
		food3.setName("Burger3");
		food3.setGram(250);
		food3.setQuantity(3);
		food3.setPrice(15.0);
		
		
		
		
		drink1.setName("Beer");
		drink1.setMililiter(500);
		drink1.setIsAlcohol(true);
		drink1.setQuantity(1);
		drink1.setPrice(10.0);
		
		drink2.setName("Beer2");
		drink2.setMililiter(500);
		drink2.setIsAlcohol(true);
		drink2.setQuantity(2);
		drink2.setPrice(10.0);
		
		drink3.setName("Beer3");
		drink3.setMililiter(500);
		drink3.setIsAlcohol(false);
		drink3.setQuantity(1);
		drink3.setPrice(10.0);
		
	
		check.addCheck(food1);
		check.addCheck(food2);
		check.addCheck(food3);
		
		check.addCheck(drink1);
		check.addCheck(drink2);
		check.addCheck(drink3);
		
		check.showProducts();
		
		System.out.println(check.getTotalPrice());
		
	}
}
