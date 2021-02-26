package ua.lviv.lgs;

public class Appliaction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec1 = new Rectangle();
		Rectangle rec2 = new Rectangle(12, 3.5);
		
		rec1.setLength(100);
		
		System.out.println("Rectangle1 Perimeter = " + rec1.Perimeter());
		System.out.println("Rectangle1 Squere = " + rec1.Square());
		System.out.println("Rectangle2 Perimeter = " + rec2.Perimeter());
		System.out.println("Rectangle2 Squere = " + rec2.Square());
		
		Circle circle1 = new Circle();
		
		System.out.println("Circle1 Length = " + circle1.Length());
		System.out.println("Circle1 Squere = " + circle1.Squere());

		
	}

}
