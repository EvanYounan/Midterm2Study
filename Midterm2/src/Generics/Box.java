package Generics;

import java.util.ArrayList;

public class Box<T> {
	T randomVar;
	
	public Box(T var) {
		this.randomVar = var;
		// TODO Auto-generated constructor stub
	}

	public T getT() {
		return this.randomVar;
	}
	
	public static void main(String[] args ) {
		Box x = new Box(4.0);
		System.out.println(x.getT());
		
		ArrayList<String> a = new ArrayList<>();
		a.add("Jacky");
		Box z = new Box(a);
		System.out.println(z.getT());
	}
}
