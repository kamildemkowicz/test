package JavaHorstmann;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.awt.font.LineMetrics;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class Kompozytor extends JComponent{
	private static final int HEIGHT = 300;
	private static final int WEIDTH = 200;
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		String message = "Witaj Œwiecie";
		//tworzê obiekt font i ustawiam styl i rozmiar czcionki
		Font f = new Font("Serif", Font.BOLD, 36);
		
		g2.setFont(f);
		//Sprawdzenie rozmiaru tekstu
		FontRenderContext context = g2.getFontRenderContext();
		Rectangle2D bounds = f.getStringBounds(message, context);
		LineMetrics gf = f.getLineMetrics(message, context);
		//zdobywam lewy górny róg tekstu (x,y)
		double x = (getWidth()-bounds.getWidth())/2;
		double y = (getHeight()-bounds.getHeight())/2;
		//dodanie do wysokoœci y rozmiaru w celu osi¹gniecia wysokosci linii bazowej
		double accent = -bounds.getY();
		double baseY = y + accent;
		//rysowanie tego wszystkiego wiadomo juz jak
		g2.setPaint(Color.RED);
		g2.drawString(message, (int)x, (int)baseY);
		g2.setPaint(Color.LIGHT_GRAY);
		//Teraz narysujemy linie bazow¹ (to jest ta na dole)
		g2.draw(new Line2D.Double(x, baseY, x+bounds.getWidth(), baseY));
		//rysowanie otaczaj¹cy tekst prostok¹t 
		Rectangle2D rect = new Rectangle2D.Double(x, y, bounds.getWidth(), bounds.getHeight());
		g2.draw(rect);
		
	}
	public Dimension getPrefferedSize(){
		return new Dimension(WEIDTH, HEIGHT);
	}

}
