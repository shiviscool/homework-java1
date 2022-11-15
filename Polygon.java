public class Polygon {
	int sides;
	String type;
	String color;

	public void display() {
		this.getSides();
		System.out.println(type + "\n" + color + "\n");
	}

	public void getSides() {
		System.out.println(sides);
	}

	public void changeColor(String color) {
		switch(color) {
			case "Red":
				this.color = color;
				break;
			case "Yellow":
				this.color = color;
				break;
			case "White":
				this.color = color;
				break;
			case "Blue": 
				this.color = color;
				break;
			case "Black": 
				this.color = color;
				break;
			case "Grey":
				this.color = color;
				break;
			default:
				System.out.println("Color not found!");
				break;
		}
	}

	public Polygon() {}
	public Polygon(int side, String type) {
		this.sides = side;
		this.type = type;
	}
	public Polygon(String type) {
		this(4, type);
	}

	public static void main(String[] args) {
		Polygon rectangle = new Polygon(4, "Rectangle");
		rectangle.changeColor("Red");
		rectangle.display();

		Polygon square = new Polygon("Square");
		square.changeColor("Yellow");
		square.display();

		square.changeColor("Blue");
		square.display();
	}
}