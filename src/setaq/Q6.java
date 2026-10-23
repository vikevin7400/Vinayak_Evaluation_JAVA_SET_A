package setaq;

abstract class Company{
	static String cname = "wipro";
public void overTime(int time) {

	}
public void showComp() {
	System.out.println(cname);
}

abstract void inTime(int time);

abstract void outTime(int time);

abstract void getTask(String task);

abstract void displayInfo();
			
}
class Managers extends Company{
	String name ="vinayak";
	int id = 12;

	@Override
	void inTime(int time) {
		System.out.println("in time"+time);
	}

	@Override
	void outTime(int time) {
		System.out.println("out time"+time);
	}

	@Override
	void getTask(String task) {
		System.out.println("yourtask"+"check files");
	}

	@Override
	void displayInfo() {
		System.out.println("manager name"+name);
		System.out.println("manager id"+id);
		
	}
	@Override
	public void showComp() {
		// TODO Auto-generated method stub
		super.showComp();
	}
	public void managerSal(double salary) {
			System.out.println("manager salary"+salary);
	}
	
	@Override
	public void overTime(int time) {
		System.out.println("over time"+time);
	}
	
}
public class Q6 {
	public static void main(String[] args) {
		Managers  manager= new Managers();
		manager.showComp();
		manager.displayInfo();
		manager.inTime(9);
		manager.outTime(6);
		manager.overTime(7);
		manager.managerSal(212122);
	}
	
	

}
