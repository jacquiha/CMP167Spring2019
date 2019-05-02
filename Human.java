public class Human {
	//We have achieved encapsulation by having our instance variable private
	// We then will provide setters and getters to provide access
	private int age;
	private String name;
	private double wealth;
	private boolean hasVehicle;
	private double hunger;
	private int food;
	private Vehicle[] vehicles;
	
	public Human() {
		this.age = 0;
		this.name = "";
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new Vehicle[100];   
	}
	public Human(String name, int age) {
		this.age = age;
		this.name = name;
		this.wealth = 0.0;
		this.hasVehicle = false;
		this.hunger = 5.0;
		this.food = 5;
		this.vehicles = new Vehicle[100];  
	}
	
	//getter method: Returns value of instance variable
	public int getAge() {
		return age;
	}
	public String getName() {
	return this.name;
}
	//setter: Changes the value of instance variable
	public void setAge(int age) {
		this.age = age;
	}
	public void setName (String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Human:[ name: " + getName() + ", age: " + getAge() + ", wealth: " + this.wealth + "$]";
	}
	public int numVehicles() {
		int total = 0;
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] != null) total++;
			else break;
		}
		return total;
	}
	public void eat() {
		if (food >= 4.5) {
			hunger -= 1.0;
			food -= 1;
			System.out.println("I ate it all.");
		}
		else System.out.println("Not enough food, please buy more.");
		}
	
	public void eat(double food) { //overloaded method
		hunger -= food/4.5;
	}
	public void grow() {
		age++;
	}
	public void work() {
		if (hunger < 5.0) {
			wealth += 10.5;
			hunger += 0.5;
			System.out.println("I ate so much food!");
		}
		else System.out.println("Too hungry to eat.");
	}
	public void buyFood() {
		if (wealth > 5) {
			wealth -=4.5;
			food++;
			System.out.println("Yay! i bought some food!");;
		}
		else System.out.println("Not enough money, please work.");
	}
	
}  
