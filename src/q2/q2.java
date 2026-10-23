package q2;
class Emp{
	public String name = "vinayak";
	private double sal= 131231;
	protected String add="borivali";
	String dept = "IT";
}

class B extends Emp{
	public void displayInfo() {
		System.out.println(name);
//		System.out.println(sal);
		System.out.println(add);
		System.out.println(dept);
	}
}
class C extends B{
	public void displayInfo() {
		System.out.println(name);
//		System.out.println(sal);
		System.out.println(add);
		System.out.println(dept);
	}
}



public class q2 {
	

}
