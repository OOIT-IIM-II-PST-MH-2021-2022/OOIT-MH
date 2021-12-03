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
		Point p2 = new Point(480,300);
		Line l1 = new Line(p1,p2);
		l1.moveBy(50, 50);
		l1.draw(g);
		Rectangle r1 = new Rectangle(p2, 53, 84);
		r1.draw(g);
		Circle c1 = new Circle(new Point(300,300), 30);
		c1.moveTo(200, 200);
		c1.draw(g);
		p1.draw(g);
		p2.draw(g);
		
	}
	
	
	
}
