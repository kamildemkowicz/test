package JavaHorstmann;
/**
 * Obiekt<code>Card</code>reprezentuje kartê do gry, np.
 * "dama kier". Karta ma kolor (karo, kier, trefl lub pik)
 * i wartoœci (1=as, 2...10,11 = walet),
 * 12 = dama, 13= król)
 */
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

/**
 * 
 * @author strazacky
 *@throws IOException 
 */

public class Employee implements Cloneable{
private String name;
private double salary;
private LocalDate date;
private int id;
private static int nextId = 1;
public Employee (String n, double s, int y, int m, int d){
	name = n;
	salary = s;
	date = date.of(y, m, d);
	id = 0;
}
public Employee(double s){
	this("Employee#"+nextId, s, 1999, 12, 12);
	nextId++;
}
public static int getNextId(){
	return nextId;
}
public void setId(){
	id = nextId;
	nextId ++;
}
public int getID(){
	return id;
}

public String getName() {
	return name;
}


public double getSalary() {
	return salary;
}



public LocalDate getDate() {
	return date;
}
/**
 * Podnosi pensje pracownika.
 * @param procent wartoœæ o ile podnosi pensje.
 * @return kwota podwy¿ki
 */
public void replaceSalary(int procent){
	double increase = salary*procent/100;
	salary+=increase;
}
public boolean equals(Object objectOthers){
	if(this==objectOthers)return true;
	
	if(objectOthers==null)return false;
	if(getClass()!=objectOthers.getClass())return false;
	Employee other = (Employee)objectOthers;
	return name.equals(other.name)&&
			salary==other.salary &&
			date.equals(other.date);
}
public int hashCode(){
	return Objects.hash(name, salary, date);
}
public String toString(){
	return getClass().getName()+"[name= "+name+" salary= "+salary+" date= "+date+"]";
	}
public Employee clone()throws CloneNotSupportedException{
	 Employee cloned = (Employee)super.clone();
	return cloned;
}
}
