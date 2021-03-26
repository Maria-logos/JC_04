package ua.lviv.lgs;

public class Constructors {
	int f1;
	int f2;
	public Constructors(int f1) {
		super();
		this.f1 = f1;
	}
	public Constructors(int f1, int f2) {
		this(f1);
		this.f2 = f2;
	}
	@Override
	public String toString() {
		return "Constructors [f1=" + f1 + ", f2=" + f2 + "]";
	}
	

}
