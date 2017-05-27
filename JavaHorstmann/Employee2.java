package JavaHorstmann;

import java.time.LocalDate;
import java.util.Date;

public class Employee2 extends Person {
private double salary;
private LocalDate hireDat;
public Employee2(String n, double s, int y, int m, int d){
	super(n);
	salary=s;
	hireDat = LocalDate.of(y, m, d);
}
public double getSalary() {
	return salary;
}

public LocalDate getHireDat() {
	return hireDat;
}
public void raiseSalary(double procent){
	double podwyzszka = salary*procent/100;
	salary+=podwyzszka;
}
public String getDescription(){
	return String.format("Pracownik zarbiaj¹cy %.2f z³", salary);
}

}
