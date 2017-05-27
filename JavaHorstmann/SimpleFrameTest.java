package JavaHorstmann;
import javax.swing.*;
import java.awt.*;
public class SimpleFrameTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable(){
			

			@Override
			public void run() {
				// TODO Auto-generated method stub
				JFrame simple = new SimpleFrame();
simple.setTitle("Hello World");


				simple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				simple.setVisible(true);
			}
		
		

		});
	}

}
