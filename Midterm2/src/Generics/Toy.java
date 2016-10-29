package Generics;

public class Toy {
	private String colour;
	private int size;
	private int funLevel;
	
	public Toy(String colour, int size, int funLevel) {	
		this.colour = colour;
		this.size = size;
		this.funLevel = funLevel;
	}
	
	public void playWithToy() {
		//doSomething();
	}
	

	@Override
	public String toString() {
		return "Toy [colour=" + colour + ", size=" + size + ", funLevel=" + funLevel + "]";
	}



}
