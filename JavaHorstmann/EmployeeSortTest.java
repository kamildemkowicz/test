package JavaHorstmann;

import java.util.Arrays;

public class EmployeeSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employeee[] staff = new Employeee[3];
staff[0] = new Employeee(1, "Mietek", 2500);
staff[1] = new Employeee(2, "Andrzej", 3200);
staff[2] = new Employeee(3, "èdzisiek", 2100);
Arrays.sort(staff);
for(Employeee e : staff){
	System.out.println("Numer id : "+e.getID()+" Name : "+e.getName()+" Wyp≥ata : "+e.getSalary());
}

	}

}
