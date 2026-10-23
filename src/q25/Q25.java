package q25;

public class Q25 {
	public static void divide(int n1, int n2) throws ArithmeticException {
		System.out.println(n1 / n2);

	}

	public static void calculator(int n1, int n2, String operations) throws ArithmeticException {
		if (operations.equals("/")) {
			divide(n1, n2);

		}

	}

	public static void main(String[] args) {
		try {
			calculator(10, 0, "/");
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
}
