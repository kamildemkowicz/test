package JavaHorstmann;

import java.awt.event.ActionEvent;
import java.util.Date;
import java.awt.*;

public class TimerStopper implements  java.awt.event.ActionListener{

	@Override
	public void actionPerformed(ActionEvent event) {
		// TODO Auto-generated method stub
		
		System.out.println("Za 10 sekund w³¹czy siê dŸwiêk i godzina jest taka :"+ new Date());
		Toolkit.getDefaultToolkit().beep();
	}

}
