package RestaurantCRC;

import javax.xml.ws.Response;

public class Owner extends User {
	Restaurant ownedRestaurant;
	
	public Owner(String username, String email, Restaurant x) {
		super(username, email);
		this.ownedRestaurant = x;
	}
	
	public void respondToReview() {
		
		addReply(ownedRestaurant, reponse);
	}
	
	
	
	

}
