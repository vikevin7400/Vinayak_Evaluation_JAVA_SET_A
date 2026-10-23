package q9;
class Manager{
	String task1 ="collect files";
	String task2 = "check files";
	
}
class Emp extends Manager{
	String name;
	int id;
	public Emp(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + "]";
	}
	public  void displayInfo() {
		System.out.println("employee name"+name);
		System.out.println("employee id"+id);
				System.out.println(super.task1);
				System.out.println(super.task2);
	}
}
public class Q9 {
	public static void main(String[] args) {
		Emp emp =new Emp("vinayak", 12);
		emp.displayInfo();
	}

}
