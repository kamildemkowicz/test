package JavaHorstmann;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class SimpleFrame extends JFrame{

		public SimpleFrame(){
			add(new Kompozycja());
			pack();
	}
	

}
