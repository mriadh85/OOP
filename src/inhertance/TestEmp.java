package inhertance;

public class TestEmp {

	public static void main(String[] args) {
		Manager m1 = new Manager("Carl Hacker", 74000);
		m1.setBonus(1000);
		//System.out.println(m1.getSal());
		
		Employee[] e = new Employee[3];
		e[0] = m1;
		
		e[1]= new Employee("Carl cracer", 50000);
		Exce x1 = new Exce("Carl tester", 90000);
		x1.setHI(700);
		x1.setBonus(2000);
		e[2] = x1;
		
		System.out.println(e[0].getSal()+ " "+ e[0].getName());
		System.out.println(e[1].getSal()+ " "+ e[1].getName());
		System.out.println(e[2].getSal()+ " "+ e[2].getName());
		

	}

}
