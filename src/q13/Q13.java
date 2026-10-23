package q13;

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
	public int hashCode() {
		return Objects.hash(id, name, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Emp other = (Emp) obj;
		return id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(sal) == Double.doubleToLongBits(other.sal);
	}
}
public class Q13 {
	
public static void main(String[] args) {
	
	Emp emp = new Emp("vinayak", 12, 1200);
	Emp emp1 = new Emp("vinayak", 12, 1200);
	System.out.println(emp.equals(emp1));
}
}

