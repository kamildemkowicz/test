package JavaHorstmann;

import java.util.Arrays;

public class ProbaComparatora {

public static void main(String[] args) throws CloneNotSupportedException{
	Employee original = new Employee("Kamil", 1200, 1994, 12, 12);
	Employee copy = original.clone();
	copy.replaceSalary(5);
	System.out.println(original.toString()+"  \n"+copy.toString());
}


}
