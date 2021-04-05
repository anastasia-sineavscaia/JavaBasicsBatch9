package Tasks;

public class Static {

	static void printInfo(String name) {
		System.out.println(name);
	}

	static void printInfo(String name,String address) {
		System.out.println(name+address);
	}

	static void printInfo(String name, String address,String phoneNumber) {
		System.out.println(name+address+phoneNumber);
	}

	public static void main(String[] args) {

		
		printInfo("Anastasia");
		printInfo("Anastasia"," 8 Hope Drive");
		printInfo("Anastasia"," 8 Hope Drive"," 12345678");
	}

}
