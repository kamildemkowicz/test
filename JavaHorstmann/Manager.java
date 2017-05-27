package JavaHorstmann;

public class Manager extends Employee {
private double bonus;
public Manager(String name, double salary, int year, int month, int days){
	super(name, salary, year, month, days);
	bonus =0 ;
}
public double getSalary(){
	double salar = super.getSalary();
	return salar+bonus;
}
public void setBonus(double b){
	bonus = b;
}
public boolean equals(Object objectOther){
	if(!super.equals(objectOther))return false;
	
	Manager other = (Manager) objectOther;
	return bonus == other.bonus;
}
public String toString(){
	return super.toString()+"[bonus=" + bonus+"]";
}
}
