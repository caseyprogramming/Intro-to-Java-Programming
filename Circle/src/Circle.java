
public class Circle {

	private double radius; // declare the private double instance radius
	private double x; // declare the private double instance x
	private double y; // declare the private double instance y

	// ----------------------------------------------

	// ----------------------------------------------
	public Circle(double x, double y, double radius) {
		if (radius >= 0) {
			this.radius = radius;
		} else {
			radius = 1.0;
		}
		this.y = y;
		this.x = x;

	}

	// ----------------------------------------------
	// getX - returns the value of x
	// ----------------------------------------------
	public double getX() {

		return x;
	}

	// ----------------------------------------------
	// getY - returns the value of y
	// ----------------------------------------------
	public double getY() {

		return y;
	}

	// ----------------------------------------------
	// getRadius - returns the value of radius
	// ----------------------------------------------
	public double getRadius() {
		if (this.radius >= 0) {
			return radius;
		} else {
			return radius = 1.0;
		}

	}

	// ----------------------------------------------
	// setX - assigns a new value to x
	// ----------------------------------------------
	public void setX(double x) {
		this.x = x;
	}

	// ----------------------------------------------
	// setY - assigns a new value to y
	// ----------------------------------------------
	public void setY(double y) {
		this.y = y;
	}

	// ----------------------------------------------
	// setRadius - assigns a new value to radius
	// ----------------------------------------------
	public void setRadius(double radius) {

		if (radius >= 0) {
			this.radius = radius;
		} else {

		}
	}

	// --------------------------------------------------------
	// diameter - calculates the diameter of the circle
	// --------------------------------------------------------
	public double diameter() {

		return (radius + radius);
	}

	// --------------------------------------------------------
	// area - returns the area of the circle
	// --------------------------------------------------------
	public double area() {

		return (Math.PI * (radius * radius));
	}

	// --------------------------------------------------------
	// perimeter - returns the perimeter of the circle
	// --------------------------------------------------------
	public double perimeter() {

		return (2 * Math.PI * radius);
	}

	// --------------------------------------------------------
	// isUnitCircle - return true if the radius of this circle
	// is 1 and its center is (0,0) and false
	// otherwise.
	// --------------------------------------------------------
	public boolean isUnitCircle() {

		if (x == 0 && y == 0 && radius == 1) {
			return true;
		} else {
			return false;
		}

	}

	// --------------------------------------------------------
	// toString - return a String representation of
	// this circle in the following format:
	// center:(x,y)
	// radius: r
	// --------------------------------------------------------
	public String toString() {

		return "center: (" + Double.toString(x) + "," + Double.toString(y) + ")" + "\nradius: "
				+ Double.toString(radius);

	}

	public boolean equals(Circle anotherCircle) {
		if (this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius == anotherCircle.radius) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isConcentric(Circle anotherCircle) {
		if (this.x == anotherCircle.x && this.y == anotherCircle.y && this.radius != anotherCircle.radius) {
			return true;
		} else {
			return false;
		}
	}

	public double distance(Circle anotherCircle) {

		double Xs = (this.x - anotherCircle.x);
		double Ys = (this.y - anotherCircle.y);

		return Math.sqrt(Math.pow(Xs, 2) + Math.pow(Ys, 2));

	}

	public boolean intersects(Circle anotherCircle) {
		if ((this.radius + anotherCircle.radius) > (Math
				.sqrt(Math.pow(this.x - anotherCircle.x, 2) + Math.pow(this.y - anotherCircle.y, 2)))) {
			return true;
		} else {
			return false;
		}
	}

}
