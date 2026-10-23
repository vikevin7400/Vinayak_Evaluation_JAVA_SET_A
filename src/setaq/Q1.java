package setaq;


class Emp{
	String name = "vinayak";
	double sal= 131231;
	String add="borivali";
	String dept = "IT";
	
public void displayInfo() {
	System.out.println(name);
	System.out.println(sal);
	System.out.println(add);
	System.out.println(dept);
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", sal=" + sal + ", add=" + add + ", dept=" + dept + "]";
	}
	
}
public class Q1 {
	public static void main(String[] args) {
		Emp  emp = new Emp();
		emp.displayInfo();
	}
	

}
