import java.util.HashMap;

public class FactoryFlyWeight {
	
	public static int beverages = 1;
	public static int food = 2;
	
	private static HashMap<Integer, ProductFactory> map = new HashMap<>();
	
	public static ProductFactory createFactory(int number) {
		
		ProductFactory factory=null;
		
		switch(number) {
			
			case 1:
				
				factory= map.get(number);
				
				if(factory==null) {
					
					factory = new BeveragesFactory();
					map.put(number, factory);
				}
				break;
					
			case 2:
				
				factory= map.get(number);
				
				if(factory==null) {
					
					factory = new FoodFactory();
					map.put(number, factory);
				}
				break;
			
			default:
				
				System.out.println("Please insert a correct input!");		
		}
		
		return factory;
				
				
	}
}