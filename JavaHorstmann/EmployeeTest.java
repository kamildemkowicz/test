package JavaHorstmann;



public class EmployeeTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee a = new Employee("Marian Kowalski", 80000, 1994, 12, 12);
	Employee b = new Employee ("Marian Kowalski", 80000, 1994, 12, 12);
	System.out.println(a.equals(b));
	System.out.println(a.equals(b));
	Manager c = new Manager("Marian Kowalski", 80000, 1994, 12, 12);
	Manager d = new Manager("Marian Kowalski", 80000, 1994, 12, 12);
	System.out.println(c.equals(b));
	
	System.out.println(a.equals(c));
	System.out.println(b.hashCode());
	System.out.println(a.hashCode());
	System.out.println(a.toString());
	System.out.println(c.toString());
	System.out.println(""+a);
	System.out.println(a);
	
	double x = 3;
	
}
	}


