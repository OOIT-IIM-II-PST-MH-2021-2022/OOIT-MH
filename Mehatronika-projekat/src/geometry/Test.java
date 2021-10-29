package geometry;

public class Test {

	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println(p1.getX());
		Point p2 = new Point();
		System.out.println("x je: "+p1.getX()+", y je: "+p1.getY() + ", selected je: "+p1.isSelected());
		System.out.println("x je: "+p2.getX()+", y je: "+p2.getY() + ", selected je: "+p2.isSelected());
		p1.setY(15);
		p1.setX(0);
		p2 = p1;
		System.out.println("x je: "+p1.getX()+", y je: "+p1.getY() + ", selected je: "+p1.isSelected());
		System.out.println("x je: "+p2.getX()+", y je: "+p2.getY() + ", selected je: "+p2.isSelected());
		System.out.println(p1 == p2);

	}

}
