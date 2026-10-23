package q12;

import java.util.Objects;

class Emp implements Cloneable{
	String name = "vinayak";
	int id = 12;
	double sal = 12312;
	public Emp(String name, int id, double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + "]";
	}
	 @Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	 
	
	 
	
}
public class Q12 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Emp emp = new Emp("vinayak", 12, 221120);
		System.out.println(emp);
		Emp emp2 = (Emp) emp.clone();
		System.out.println("clone"+emp);
	}

	
}





