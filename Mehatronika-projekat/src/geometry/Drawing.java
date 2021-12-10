package geometry;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
		//l1.moveBy(50, 50);
		//l1.draw(g);
		Rectangle r1 = new Rectangle(p2, 53, 84);
		//r1.draw(g);
		Circle c1 = new Circle(new Point(300,300), 30);
		c1.moveTo(200, 200);
		//c1.draw(g);
		//p1.draw(g);
		//p2.draw(g);
		Donut d1 = new Donut(p1, 50, 20);
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(p1);
		shapes.add(l1);
		shapes.add(c1);
		shapes.add(d1);
		shapes.add(r1);
		
		//Iterator koji pomera elemenete lista za 10 piksela po x osi
		Iterator<Shape> it = shapes.iterator();
		while(it.hasNext()) {
			it.next().moveBy(10, 0);
		}
		
		//Ispis informacija o elementima liste
		
		
		//shapes.get(2).draw(g);
		//shapes.get(shapes.size() - 1).draw(g);
		shapes.remove(1);
		//shapes.get(1).draw(g);
		for(Shape s : shapes) {
		System.out.println(s.toString());
		}
		shapes.add(2, l1);
		/*for(Shape s : shapes) {
			System.out.println("Nakon dodavanja elementa"  + s.toString());
			}*/
		
		/*for(Shape s: shapes) {
			if(s instanceof Point) {
				s.setSelected(true);
				s.draw(g);
			}
		}*/
		
		HashMap<String, Shape> hmShapes = new HashMap<String, Shape>();
		hmShapes.put("Point", p1);
		hmShapes.put("Line", l1);
		hmShapes.put("Circle", c1);
		hmShapes.put("Donut", d1);
		hmShapes.put("Rectangle",r1);
		
		/*
		for(String s: hmShapes.keySet()) {
			System.out.println(s);
		}*/
		
		for(Map.Entry<String, Shape> me : hmShapes.entrySet()) {
			me.getValue().setSelected(true);
			me.getValue().draw(g);
		}
		
	}
	
	
	
}
