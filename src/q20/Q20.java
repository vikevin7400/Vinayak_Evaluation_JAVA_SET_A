package q20;

class Policy {
	public void calSal(double salary) {
		System.out.println(salary);
	}
}

class Accountant extends Policy {
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}
}

class Emp extends Accountant {
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}
}

class Manager extends Accountant {
	@Override
	public void calSal(double salary) {
		System.out.println(salary);
	}
}

public class Q20 {
	public static void main(String[] args) {
		Policy policy = new Policy();
		policy.calSal(3282);
		Accountant accountant = new Accountant();
		accountant.calSal(4234);
		Emp emp = new Emp();
		emp.calSal(23454);
		Manager manager = new Manager();
		manager.calSal(65656);
	}

}



