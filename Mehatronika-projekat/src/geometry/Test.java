package geometry;

public class Test  {

	public static void main(String[] args) {
		Point p1 = new Point();
		//System.out.println(p1.getX());
		Point p2 = new Point();
		//System.out.println("x je: "+p1.getX()+", y je: "+p1.getY() + ", selected je: "+p1.isSelected());
		//System.out.println("x je: "+p2.getX()+", y je: "+p2.getY() + ", selected je: "+p2.isSelected());
		//System.out.println(p1);
		/*p1.setY(15);
		p1.setX(0);
		p2.setX(33);
		p2.setY(20);
		//System.out.println("x je: "+p1.getX()+", y je: "+p1.getY() + ", selected je: "+p1.isSelected());
		//System.out.println("x je: "+p2.getX()+", y je: "+p2.getY() + ", selected je: "+p2.isSelected());
		//System.out.println(p1 == p2);
		Point p3 =  new Point();
		Point p4 =  new Point();
		p3.setY(50);
		p3.setX(25);
		p4.setX(40);
		p4.setY(28);

		//System.out.println("Udaljenost tacke p1 od tacke p2 je: " + p1.distance(p2));
		
		Line l1 = new Line();
		//System.out.println(l1);
		Line l2 = new Line();
		l1.setStartPoint(p1);
		l1.setEndPoint(p2);
		l2.setStartPoint(p3);
		l2.setEndPoint(p4);
		//System.out.println("Duzina linije l1 je: " + l1.length());
		 //System.out.println("Duzina linije l2 je: " + l2.length());
		
		Rectangle r1 = new Rectangle();
		r1.setUpperLeft(p3);
		r1.setHeight(20);
		r1.setWidth(35);
		//System.out.println("Povrsina pravougaonika r1 je: " + r1.area());
		//System.out.println("Obim pravougaonika r1 je: " + r1.circumference());
		
		Circle c1 = new Circle();
		c1.setCenter(p2);
		c1.setRadius(35);
		//System.out.println("Povrsina kruga c1 je: " + c1.area());
		//System.out.println("Obim kruga c1 je: " + c1.circumference());
		
		l1.getEndPoint().setY((int)((c1.getCenter().getX() - c1.getCenter().getY()) - (r1.getUpperLeft().getX() + c1.area())));
		//System.out.println(l1.getEndPoint().getY());
		
		double proba = 10.566666;
		int proba2 = (int)proba;
		//System.out.println(proba2);
		
		//Vezba 4
		
		/*System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2);
		System.out.println(p2.getX());
		p1 = p2;
		System.out.println(p1.getX());
		p1.setX(150);
		System.out.println("X je: " + p1.getX());
		System.out.println("X je: " + p2.getX());
		System.out.println(p1 == p2);
		System.out.println(p1);*/
		
		//Circle c2 = new Circle(p1, 30, true);
		//System.out.println(c2.getCenter() + ", " + c2.getRadius() + ", " + c2.isSelected());
		//System.out.println(c2.toString());
		//System.out.println(p1.toString());
		//System.out.println(l1.toString());
		//System.out.println(r1.toString());
		/*System.out.println(p1.equals(c2));
		System.out.println(l1.equals(l2));*/
		/*Line l5 = new Line(new Point(30,25),new Point(15,10));
		Line l6 = new Line(new Point(30,25),new Point(15,10));
		System.out.println(l5.equals(l6));
		System.out.println(l5 == l6);*/
		
		
		//Vezba 5
		/*System.out.println(p1.contains(0, 18));
		System.out.println(l1.contains(0,15));
		System.out.println(r1.contains(60,50));
		c1.getCenter().setY(20);
		System.out.println(c1.getCenter().getX() + ", " + c1.getCenter().getY());
		System.out.println(c1.contains(0, 0));
		Donut d1 = new Donut(c1.getCenter(), c1.getRadius(), 33);
		Donut d2 = new Donut(c1.getCenter(), c1.getRadius(), 33);
		System.out.println(d1.equals(d2));*/
		
		//Vezba 6
		//System.out.println(c2.toString());
		Donut d1 = new Donut(p1,30,15);
		System.out.println(d1.toString());
	
		//Vezbe 7
		Circle c1 = new Donut(p1,40,20);
		Circle c2 = new Circle(p1, 60);
		System.out.println(c1.compareTo(c2));
		
		
	}

}
