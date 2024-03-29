package task3;

public class Rectangle extends Square {
	private double width;

	public Rectangle() {
		super();
		this.width = 0;
	}

	public Rectangle(double length, double width, String color) {
		super(length, color);
		this.width = width;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", length="+ this.getLength() +", color=" + color + "]";
	}

	@Override
	public void draw() {
		System.out.print(this);
	}

	@Override
	public double calculateArea() {
		return this.getLength() * this.getWidth();
	}

	@Override
	public double calculatePerimeter() {
		return this.getLength() * this.getWidth() * 3;
	}
}
