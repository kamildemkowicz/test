package JavaHorstmann;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.SystemColor;
import java.awt.font.FontRenderContext;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JComponent;

public class Kompozycja extends JComponent{
	public static final int TEXT_X = 75;
	public static final int TEXT_Y = 100;
	private static final int HEIGHT = 200;
	private static final int WIDHT = 300;
	
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D)g;
		Point2D a1 = new Point2D.Double(100, 100);
		Point2D a2 = new Point2D.Double(300, 250);
		Point2D a3 = new Point2D.Double(200, (a1.getY()+a2.getY())/2);
		
		
		Rectangle2D rect = new Rectangle2D.Double();
		rect.setFrameFromDiagonal(a1, a2);
		Line2D line = new Line2D.Double(rect.getMinX(), rect.getMaxY(), rect.getMaxX(), rect.getMinY());
		Line2D line2 = new Line2D.Double(rect.getMaxX(), rect.getMaxY(), rect.getMaxX()-rect.getWidth(), rect.getMaxY()-rect.getHeight());
		Ellipse2D circle = new Ellipse2D.Double();
		circle.setFrame(rect);
		Ellipse2D circle2 = new Ellipse2D.Double();
		circle2.setFrameFromCenter(rect.getCenterX(), rect.getCenterY(), rect.getCenterX()+300, rect.getCenterY()+300);
		Kompozycja p = new Kompozycja();
		p.setBackground(Color.RED);
		g2.draw(rect);
		g2.draw(line);
		g2.draw(line2);
	    g2.draw(circle);
		g2.draw(circle2);

		

	}
public Dimension getPrefferedSize(){
	return new Dimension(HEIGHT, WIDHT);
	
}
}
