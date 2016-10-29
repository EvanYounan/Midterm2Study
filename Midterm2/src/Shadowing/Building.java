package Shadowing;

public class Building {
	public static int height;
	public static int width;
	
	public Building(int height, int width) {
		this.height = height;
		this.width = width;
	}

	public static int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public static int getWidth() {
//		//this works
//		getHeight();
		
//		//this doesn't work because setHeight is a non-static variable
//		setHeight(5);
		
		return width;
	}

	public void setWidth(int width) {
//      Both work because it is a non-static method.. so both non-static and static methods 
//		work.
//		getWidth();
//		setHeight(5);
		
		this.width = width;
	}

	public String toString() {
		return this.height + ", " + this.width;
	}
	

}
