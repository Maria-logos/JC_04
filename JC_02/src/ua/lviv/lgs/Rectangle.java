package ua.lviv.lgs;

public class Rectangle {
	private double length;
	private double width;
	
	
	
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	Rectangle()
	{
		this.length = 10;
		this.width = 20;
	}
	Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	
	public double Perimeter()
	{
		return (length + width)*2;
	}
	
	public double Square()
	{
		return length * width;
	}
}
