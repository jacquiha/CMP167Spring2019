
public class Game {
	public static void main(String [] args) {
	Human person1 = new Human();
	
	System.out.println("Hunger: " + person1.hunger);
	System.out.println("Food: " + person1.food);
	
	System.out.println("Eating command:");
	person1.eat();
	System.out.println("Eating command:");
	person1.eat();
	System.out.println("Eating command:");
	person1.eat();
	
	System.out.println("Hunger: " + person1.hunger);;
	System.out.println("Food: " + person1.food);
	
	System.out.println("Buying Food Command: ");
	person1.buyFood();
	
	System.out.println("Working command");
	person1.work();
	
	System.out.println("Buying Food Command: ");
	person1.buyFood();
	System.out.println("Working command");
	person1.work();
	System.out.println("Working command");
	person1.work();
	}
}