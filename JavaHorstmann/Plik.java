package JavaHorstmann;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Plik implements Comparable{
private String name; 
private int salary;
private int n =0;
private Plik[] tab;
public Plik(String name, int salary){
	this.name=name;
	this.salary=salary;
}
public Plik() {
	// TODO Auto-generated constructor stub
}
public String getName() {
	return name;
}

public int getSalary() {
	return salary;
}
public void setBonus(int procent){
	double bonus = salary*procent/100;
	salary+=bonus;
}
public void setName(String srcF, String licz){
	try (Scanner b = new Scanner(new File(srcF))){
		
		
		
		while(b.hasNextLine()){
			String a = b.nextLine();
			
			n++;
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}try(Scanner b = new Scanner(new File(srcF)); Scanner c = new Scanner(new File(licz))){
		tab = new Plik[n];
		for(int i=0; i<tab.length; i++){
			tab[i] = new Plik(b.nextLine(),c.nextInt());
		}
		Arrays.sort(tab);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public Plik[] getTab(){
	return tab;
}
@Override
public int compareTo(Object t) {
	
	Plik d = (Plik)t;
	
	return Integer.compare(salary, d.salary);
}

}
