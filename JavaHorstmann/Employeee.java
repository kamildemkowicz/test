package JavaHorstmann;

public class Employeee implements Comparable<Employeee>{
private String name;
private double salary;
private int id;
public Employeee(int id, String name, double salary){
	this.id=id;
	this.name=name;
	this.salary=salary;
}
public String getName(){
	return name;
}
public double getSalary(){
	return salary;
}
public void setSalary(int procent){
	double s = salary*procent/100;
	salary+=s;
}
public int getID(){
	return id;
}
	@Override
	public int compareTo(Employeee other) {
		// TODO Auto-generated method stub
		return Double.compare(salary, other.salary);
	}
String b = "Kamil";
Object l ;

}
