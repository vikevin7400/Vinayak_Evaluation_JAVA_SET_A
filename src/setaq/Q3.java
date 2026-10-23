package setaq;


class SalPolicy{
	
	public void calSal(double sal) {
			System.out.println(sal);
	}
	public void calSal(double sal,double bonus) {
		System.out.println(sal+bonus);
}
	public void calSal(double sal ,double bonus, double tax) {
		System.out.println(sal+bonus-tax);
}
}

class Manager extends SalPolicy{
	@Override
	public void calSal(double sal) {
		// TODO Auto-generated method stub
		super.calSal(sal);
	}
	@Override
	public void calSal(double sal, double bonus) {
		// TODO Auto-generated method stub
		super.calSal(sal, bonus);
	}
	@Override
	public void calSal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		super.calSal(sal, bonus, tax);
	}
}
public class Q3 {
	public static void main(String[] args) {
		SalPolicy policy = new SalPolicy();
		policy.calSal(121231);
		policy.calSal(11312, 2110);
		policy.calSal(12312, 210, 4220);
		
		Manager manager = new Manager() ;
		manager.calSal(12312);
		manager.calSal(3324, 23230);
		manager.calSal(212312, 23120, 2110);
	}
	
}
