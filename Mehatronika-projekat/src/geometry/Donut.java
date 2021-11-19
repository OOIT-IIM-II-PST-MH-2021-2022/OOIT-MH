package geometry;

public class Donut extends Circle {

	private int innerRadius;
	private boolean selected;
	
	@Override
	public double area() {
		return super.area() - innerRadius*innerRadius*Math.PI;
	}
	
	@Override 
	public boolean contains(int x, int y) {
		return super.contains(x, y) && super.center.getX() + innerRadius >= x &&
				super.center.getY()+innerRadius >= y;
	}
	
	@Override
	public boolean contains(Point p) {
		return super.contains(p) && super.center.getX() + innerRadius >= p.getX() &&
				super.center.getY()+innerRadius >= p.getY();
	}
	
	@Override
	public String toString() {
		return super.toString() + "inner radius = " + this.innerRadius;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Donut) {
			Donut temp = (Donut) obj;
			if(super.center.equals(temp.center) && super.radius == temp.radius && this.innerRadius == temp.innerRadius) {
				return true;
			}
		}return false;
	}
	
	//Konstruktori
	public Donut() {
		
	}
	
	public Donut(Point center, int radius, int innerRadius) {
		super(center, radius);
		this.innerRadius =  innerRadius;
	}
	
	public Donut(Point center, int radius, int innerRadius, boolean selected) {
		this(center,radius,innerRadius);
		this.selected = selected;
	}

	//Get i set metode
	public int getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(int innerRadius) {
		this.innerRadius = innerRadius;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}
	
	
}
