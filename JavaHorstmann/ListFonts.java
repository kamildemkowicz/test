package JavaHorstmann;

import java.awt.GraphicsEnvironment;

public class ListFonts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] font = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
for(String fonts : font){
	System.out.println(fonts);
}
	}

}
