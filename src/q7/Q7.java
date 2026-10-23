package q7;
class Hobbies{
	String h1;
	String h2;
	public Hobbies(String h1, String h2) {
		super();
		this.h1 = h1;
		this.h2 = h2;
	}
	@Override
	public String toString() {
		return "Hobbies [h1=" + h1 + ", h2=" + h2 + "]";
	}
	
}
class Address{
	String cityname;
	String areaname;
	public Address(String cityname, String areaname) {
		super();
		this.cityname = cityname;
		this.areaname = areaname;
	}
	@Override
	public String toString() {
		return "Address [cityname=" + cityname + ", areaname=" + areaname + "]";
	}
	
}
class Emp{
	String name;
	int id ;
	Hobbies hobbies;
	Address address;
	public Emp(String name, int id, Hobbies hobbies, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.hobbies = hobbies;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", hobbies=" + hobbies + ", address=" + address + "]";
	}
	
}
public class Q7 {
	public static void main(String[] args) {
		Hobbies hobbies = new Hobbies("basketball", null);
		Address address  =new Address("mumbai", "dahisar");
		Emp emp = new Emp("vinayak", 10, hobbies, address);
		System.out.println(emp);
	}

}
