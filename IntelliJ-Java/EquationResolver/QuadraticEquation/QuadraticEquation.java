
public class QuadraticEquation {
	private double a, b, c;
	private double delta;
	private double r1, r2;
	
	public QuadraticEquation() {
	}
	
	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public double getDiscriminant() {
		return  this.delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
	}
	
	public double getRoot1() {
		return this.r1 = ((-this.b + Math.pow(this.delta, 0.5))/(2 * this.a));
	}
	
	public double getRoot2() {
		return this.r2 = ((-this.b - Math.pow(this.delta, 0.5))/(2 * this.a));
	}
}
