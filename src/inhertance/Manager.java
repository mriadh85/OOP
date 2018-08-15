package inhertance;

public class Manager extends Employee {

	public Manager(String n, double s) {
		super(n, s);
		
	}
	
	public void setBonus(double b) {
		bonus = b;
	}
	
	public double getSal() {
	return super.getSal() + bonus;
	
	}
	
	private double bonus;
	

}
