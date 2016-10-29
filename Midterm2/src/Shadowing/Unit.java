package Shadowing;

public class Unit extends Building {
	private static int width;
	
	public Unit(int height, int width) {
		super(height, width);
		this.setHeight(43);
		this.width = 500;
	}
	
	public static int getWidth() {
		return + 5;
	}
	
	public static int getHeight() {
		return 100;
	}
	
	@Override
	public void setHeight(int height) {
		this.height = height+10;
	}
	
	
	public static void main(String[] args) {
		Building x = new Unit(10, 10);
		Building y = new Unit(21, 21);
		Building z = new Unit(240, 431);
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		//This will use the super class getHeight method because it is a static method
		//Static methods do not override other static methods.
		System.out.println(x.getHeight());
		System.out.println(x.getWidth());
		
		x.setHeight(width);
		//x.setHeight(height);
		System.out.println(x);
		
	}

}
