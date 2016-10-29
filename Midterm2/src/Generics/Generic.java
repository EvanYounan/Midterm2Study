package Generics;

import java.util.HashMap;
import java.util.Map;

public class Generic<T> {
	private T favPastTime;
	private Map<String, T> map;
	
	Generic() {
		map = new HashMap<String, T>();
	}

	public void addFavouritePastTime(String name, T favPastTime) {
		map.put(name, favPastTime);
	}
	
	public String toString() {
		String retString = "";
		for (String favPastTime : map.keySet()) {
			retString += favPastTime + ": " + map.get(favPastTime).toString() + "\n";
		}
		return retString;
	}
	
	public static void main(String[] args) {
		Generic x = new Generic();
		Toy y = new Toy("Red", 5, 10);
		x.addFavouritePastTime("Evan", new Toy("Red", 5, 10));
		x.addFavouritePastTime("Jacky", new Sport(3, "Soccer", "Soccerball"));
		System.out.println(x);
	}

}
