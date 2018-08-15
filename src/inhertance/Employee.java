package inhertance;

public class Employee {
	
	public Employee(String n, double s) {
		name = n;
		salary = s;
		
	}
	
	public String getName() {
		return name;
	}
	
	public double getSal() {
		return salary;
	}
	
	public void raise(double perc) {
		salary= salary+(salary*perc/100);
		
	}
	private String name;
	private double salary;
	

}
