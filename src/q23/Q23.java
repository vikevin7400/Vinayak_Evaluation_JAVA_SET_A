package q23;
class Outer {
	private int data = 10;

	class Inner {
		void innerMeth() {
			System.out.println(data);
		}
	}
}

public class Q23 {
		public static void main(String[] args) {
			Outer outer = new Outer();
			Outer.Inner inner = outer.new Inner();
			inner.innerMeth();
		}
}

