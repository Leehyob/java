package test;

public class Reotangle extends Shape{
	
	double width;
	double height;
	
	public Reotangle() {
	}
	Reotangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean isSquare() {
//		if(width == height) {
//			return true;
//		}else
//			return false;
		return(width == height)? true:false;
	}
	
}
