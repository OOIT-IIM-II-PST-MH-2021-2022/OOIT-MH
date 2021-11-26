package geometry;

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawing extends JPanel {

	public static void main(String [] args) {
		JFrame frame = new JFrame();
		frame.setSize(1066, 768);
		Drawing drawing = new Drawing();
		frame.add(drawing);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		
	}
	
	public void paint(Graphics g) {
		Point p1 = new Point(533,384);
		p1.draw(g);
		Point p2 = new Point(480,300);
		p2.draw(g);
		Line l1 = new Line(p1,p2);
		l1.draw(g);
		Rectangle r1 = new Rectangle(p2, 53, 84);
		r1.draw(g);
		Circle c1 = new Circle(p1, 30);
		c1.draw(g);
		
	}
	
	
	
}
