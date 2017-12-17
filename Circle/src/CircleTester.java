
public class CircleTester {
	public static void main(String[] args) {

		Circle circle1 = new Circle(0.0, 0.0, 2);
		Circle circle2 = new Circle(2.0, 1.0, 1);
		Circle circle3 = new Circle(2.0, 1.0, 3);
		Circle circle4 = new Circle(0.0, 1, -1.0);
		Circle circle5 = new Circle(0.0, 0.0, 0);
		System.out.println("circle1: " + circle1);
		System.out.println("circle2: " + circle2);

		circle1.setRadius(-2.0);

		circle1.setX(-3.0);
		circle1.setY(4.0);

		System.out.println("circle1: " + circle1);

		circle2.setRadius(5.3);

		System.out.println("circle2: " + circle2);
		System.out.println("");
		System.out.println("circle1: " + circle1);
		System.out.println("circle2: " + circle2);
		System.out.println("circle3: " + circle3);
		System.out.println("circle4: " + circle4);
		System.out.println("circle5: " + circle5);

		System.out.println("circle1= " + "diameter: " + circle1.diameter() + ", area: " + circle1.area()
				+ ", perimeter: " + circle1.perimeter());
		System.out.println("circle2= " + "diameter: " + circle2.diameter() + ", area: " + circle2.area()
				+ ", perimeter: " + circle2.perimeter());
		System.out.println("circle3= " + "diameter: " + circle3.diameter() + ", area: " + circle3.area()
				+ ", perimeter: " + circle3.perimeter());
		System.out.println("circle4= " + "diameter: " + circle4.diameter() + ", area: " + circle4.area()
				+ ", perimeter: " + circle4.perimeter());
		System.out.println("circle5= " + "diameter: " + circle5.diameter() + ", area: " + circle5.area()
				+ ", perimeter: " + circle5.perimeter());

		System.out.println("circle1 is unit circle: " + circle1.isUnitCircle());
		System.out.println("circle2 is unit circle: " + circle2.isUnitCircle());
		System.out.println("circle3 is unit circle: " + circle3.isUnitCircle());
		System.out.println("circle4 is unit circle: " + circle4.isUnitCircle());
		System.out.println("circle5 is unit circle: " + circle5.isUnitCircle());

		// your additional tests should be placed below here
		System.out.println("circle1 equals circle2: " + circle1.equals(circle2));
		System.out.println("circle2 equals circle3: " + circle2.equals(circle3));
		System.out.println("circle4 equals circle5: " + circle4.equals(circle5));
		System.out.println("circle2 equals circle4: " + circle2.equals(circle4));

		System.out.println("Circle1 and circle2 are concentric: " + circle1.isConcentric(circle2));
		System.out.println("Circle3 and circle4 are concentric: " + circle3.isConcentric(circle4));
		System.out.println("Circle4 and circle5 are concentric: " + circle4.isConcentric(circle5));
		System.out.println("Circle2 and circle4 are concentric: " + circle2.isConcentric(circle4));

		System.out.println("Distance between circle1 and circle2: " + circle1.distance(circle2));
		System.out.println("Distance between circle3 and circle4: " + circle3.distance(circle4));
		System.out.println("Distance between circle4 and circle5: " + circle4.distance(circle5));
		System.out.println("Distance between circle2 and circle4: " + circle2.distance(circle4));

		System.out.println("Circle1 and circle2 intersect: " + circle1.intersects(circle2));
		System.out.println("Circle3 and circle4 intersect: " + circle3.intersects(circle4));
		System.out.println("Circle4 and circle5 intersect: " + circle4.intersects(circle5));
		System.out.println("Circle2 and circle4 intersect: " + circle2.intersects(circle4));

	}

}
