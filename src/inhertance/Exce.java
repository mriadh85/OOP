package inhertance;

public class Exce extends Manager{

	public Exce(String n, double s) {
		super(n, s);
		
	}
	

	public void setHI(double insuracnce) {
		ins = insuracnce;
	}
	
	public double getSal() {
		
		double baseSal=super.getSal()+ins;
		return baseSal;
		
	}
	
	private double ins;

}
