package q22;

import java.util.InputMismatchException;

public class Q22 {
	 public static void main(String[] args) {
		try {
			int n1 = 10;
			int n2 = 0;
			System.out.println(n1/n2);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (InputMismatchException e) {
			System.out.println(e);
		}
	}
}
