package test;

public class Circle extends Shape{
	
	double r;
	
	public Circle(){
		
	}
	Circle(Point p,double r){
		super(p);
		this.r = r;
	}
	Circle(double r){
		this.r =r;
	}
	
	@Override
	 double calcArea() {
		return Math.PI*r*r;
	}
	
	

}
