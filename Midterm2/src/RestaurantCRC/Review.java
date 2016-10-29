package RestaurantCRC;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;

public class Review {
	private User x;
	private String comment;
	private boolean thumbsUp;
	private ArrayList<Review> replies;
	
	//reviewer, 
	
	public Review(User x, String comment, boolean thumbsUp) {
		this.x = x;
		this.comment = comment;
		this.thumbsUp = thumbsUp;
	}

	public void addReply(Restaurant r, Review reply) {
		r.reviews.get(reply.x).replies.add(reply);
	}
	
	
}
