import java.util.HashMap;

public class FactoryFlyWeight {
	
	public static int beverages = 1;
	public static int food = 2;
	
	private static HashMap<Integer, ProductFactory> map = new HashMap<>();
	
	public static ProductFactory createFactory(int n) {
		
		ProductFactory factory=null;
		
		switch(n) {
			
			case 1:
				factory= map.get(n);
				if(factory==null) {
					factory = new BeveragesFactory();
					map.put(n, factory);
				}
				break;
					
			case 2:
				factory= map.get(n);
				if(factory==null) {
					factory = new FoodFactory();
					map.put(n, factory);
				}
				break;
			
			default:
				System.out.println("You dont have like a this factory");		
		}
		
		return factory;
				
				
	}
}