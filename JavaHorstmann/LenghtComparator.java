package JavaHorstmann;

public class LenghtComparator implements Comparator<String>{

	@Override
	public int compare(String first, String second) {
		// TODO Auto-generated method stub
		return first.length()-second.length();
	}

	

}
