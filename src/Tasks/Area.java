package Tasks;

public class Area {

	double rectangle(double length, double width) {
		return (length * width);
	}

	double square(double side) {
		return (side * side);

	}

	double box(double h, double l, double w) {
		return (l*h*w);
	}

	public static void main(String[] args) {
		
		Area math=new Area();
		System.out.println("The area of a Rectangle is "+math.rectangle(15.4,10));
		System.out.println("The area of a Square is "+math.square(9.7));
		System.out.println("The area of a Box is "+math.box(6, 7.1, 5.2));

	}
}
