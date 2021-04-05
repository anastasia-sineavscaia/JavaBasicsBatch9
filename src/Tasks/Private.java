package Tasks;

public class Private {

	private void add(double a, int b, int c) {
		System.out.println(a + b + c);
	}

	private void sub(int a, int b, int c) {
		System.out.println(a - b - c);
	}

	private void mult(double a, double b, double c) {
		System.out.println(a * b * c);
	}

	public static void main(String[] args) {

		Private obj = new Private();
		obj.add(5, 5, 5);
		obj.sub(7, 6, 5);
		obj.mult(3.2, 4.1, 2.5);

	}
}
