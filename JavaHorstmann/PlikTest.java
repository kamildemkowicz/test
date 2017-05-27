package JavaHorstmann;

public class PlikTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Plik obiekt = new Plik();
obiekt.setName("imie.txt", "pensja.txt");
for(Plik c : obiekt.getTab()){
	System.out.println("Name : "+c.getName()+" wyp³ata : "+c.getSalary());
}
	}

}
