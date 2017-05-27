package JavaHorstmann;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class JFrameAction {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EventQueue.invokeLater(new Runnable(){
	public void run(){
		//uruchamiam nowa ramke
		JFrame ramka = new Jframee();
		ramka.setTitle("Próba czcionki");
		ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ramka.setVisible(true);
			
		
	}
});
	}

}
