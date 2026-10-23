package q10;
class Outer {
	static private int id = 12;

	static class Inner {
		void innerMeth() {
			System.out.println("this is non static data" + id);
		}

		static void innerMeth2() {
			System.out.println("this is static data" + id);
		}
	}

}
public class Q10 {
	public static void main(String[] args) {
		Outer.Inner inner = new Outer.Inner();
		inner.innerMeth();
		Outer.Inner.innerMeth2();
	}
		
}



	