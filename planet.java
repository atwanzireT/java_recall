/**
 * GETTERS AND SETTERS
 * the setter method takes a parameter and assigns it to an attribute
 * the getter method returns the value of the attribute
 * */
class Vehicle{
	private String color;
	
//	constructor
	public Vehicle() {
		// TODO Auto-generated constructor stub
		color = "Red";
	}
	
//	getter
	public String getColor() {
		return color;
	}
	
//	setter
	public void setColor(String c) {
		this.color = c;
	}
}
class Person{
	String name; int age; String gender;
	
	void walk() {
		System.out.println(name + " walking ...");
	}
}

class Planet{
	// public static void main(String[] args){
	// 	System.out.printIn("Panet loading ...");
	// }
	public static void main(String[] args) {
		Person john = new Person();
		john.name = "Johnny";
		john.walk();
		Vehicle v1 = new Vehicle();
		v1.setColor("Black");
//		System.out.println(v1.getColor());
		System.out.println("Panet executed ... " + v1.getColor());
	}
}