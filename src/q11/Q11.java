package q11;
class Emp {
	final String name = "vinayak";
	final int id = 12;
	public void displayInfo() {
		System.out.println(name);
		System.out.println(id);
	}
}
public class Q11 {
public static void main(String[] args) {
	Emp emp = new Emp();
	emp.displayInfo();
}
}
