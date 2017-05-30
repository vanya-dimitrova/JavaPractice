package factoryPattern;

import java.util.Scanner;

public class FactoryPattern {
	
	static interface Food {
		public String getType();
	}

	static class Pizza implements Food {
		public String getType() {
			return "Someone ordered a Fast Food!";
		}
	}

	static class Cake implements Food {

		public String getType() {
			return "Someone ordered a Dessert!";
		}
	}

	static class FoodFactory {
		public Food getFood(String order) {
			if(order.equalsIgnoreCase("pizza")){
				return new Pizza();
			}
			if(order.equalsIgnoreCase("cake")){
				return new Cake();
			}
			return null;

		}

	}

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		FoodFactory foodFactory = new FoodFactory();
		Food food = foodFactory.getFood(sc.nextLine());

		System.out.println("The factory returned " + food.getClass());
		System.out.println(food.getType());
		sc.close();

	}

}

