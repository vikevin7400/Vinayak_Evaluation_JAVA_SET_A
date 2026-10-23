package q16;
class Emp {
	int id;
	String name;
	double salary;
	String address;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
public class Q16 {
	public static void main(String[] args) {
		Emp emp = new Emp();
		emp.setAddress("borival");
		System.out.println(emp.getAddress());
		emp.setId(10);
		System.out.println(emp.getId());
		emp.setName("vinayak");
		System.out.println(emp.getName());
		emp.setSalary(34000);
		System.out.println(emp.getSalary());
	}

}








