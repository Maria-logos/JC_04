package ua.lviv.lgs;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow cow = new Cow();
		cow.voice();		
		Dog dog = new Dog();
		dog.voice();
		Cat cat = new Cat();
		cat.voice();
		
		Constructors constr = new Constructors(10, 20);
		System.out.println(constr.toString());
		
		Frog frog = new Frog();
		frog.eat();
		frog.sleep();
		frog.walk();
		frog.sweam();
	}

}
