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
		System.out.println("Panet executed ...");
	}
}