package ua.lviv.lgs;

public class Circle {
	private double radius;
	private double diameter;
	
	Circle()
	{
		this.radius = 10;
		this.diameter = this.radius*2;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getDiameter() {
		return diameter;
	}
	
	public double Squere()
	{
		return (Math.PI*diameter*diameter)/4;
	}

	public double Length()
	{
		return 2*Math.PI*radius;
	}
}
