package hw5;

public class MyRectangle {
	
	public MyRectangle(){
		
	}
	
	
	public MyRectangle(double width ,double depth) {
		this.width = width;
		this.depth = depth;
	}
	
	
	private double width;
	private double depth;
	

	public void setWidth(double width) {
		this.width = width;
		
	}
	
	public double getWidth() {
		return width;
	}
	public void  setDepth(double depth) {
		this.depth = depth;
		
	}
	public double getDepth() {
		return depth;
	}
	public void getArea() {
		System.out.println(width * depth);
		
	}
}
