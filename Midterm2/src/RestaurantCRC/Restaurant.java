package RestaurantCRC;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Restaurant {
	public static ArrayList<Restaurant> restaurants;
	public Map<User, Review> reviews = new HashMap<User, Review>();
	private String name;
	private String location;
	private int priceRange;
	
	public Restaurant(String name, String location, int priceRange) {
		this.name = name;
		this.location = location;
		this.priceRange = priceRange;
	}

	public void addReview(Review r) {
		
	}
	
}
