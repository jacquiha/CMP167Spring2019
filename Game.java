import java.util.Random;

public class Game {
	public static void main(String [] args) {
		Human person1 = new Human();
		Human person2 = new Human();
		Human person3 = new Human();
		person2.setAge(5);
		person2.setName("Lila");
		person1.setAge(14);
		person1.eat();
		person1.work();
		
		
		System.out.println("age person1 " + person1.getAge());
		System.out.println("age person2 " + person2.getAge());
		System.out.println("age person3 " + person3.getAge());
		System.out.println(person1);
		System.out.println(person2);
		
		int rand = (int)(Math.random() *5) + 1;
		System.out.println(rand);
		
		Random rn = new Random();
		int n =rn.nextInt(44);
		
		//System.out.println("Hunger: " + person1.hunger);
		//System.out.println("Food: " + person1.food);
		
/*		
		System.out.println("Eating Command");
		person1.eat();
		System.out.println("Eating Command");
		person1.eat();
		System.out.println("Eating Command");
		person1.eat();
		
		System.out.println("Hunger: " + person1.hunger);
		System.out.println("Food: " + person1.food);
		
		System.out.println("Buying food command");
		person1.buyFood();
		
		System.out.println("Working command");
		person1.work();
		
		System.out.println("Buying food command");
		person1.buyFood();
		
		System.out.println("Working command");
		person1.work();
		System.out.println("Working command");
		person1.work();
		System.out.println("Eating Command");
		person1.eat();
		System.out.println("Working command");
		person1.work();
*/		
	
	}

}
