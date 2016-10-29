package Generics;

public class VideoGame {
	private String title;
	private double cost;
	private double ratings;
	
	public VideoGame(String title, double cost, double ratings) {
		this.title = title;
		this.cost = cost;
		this.ratings = ratings;
	}
	
	public void playVideoGame() {
		//doSomething();
	}

	@Override
	public String toString() {
		return "VideoGame [title=" + title + ", cost=" + cost + ", ratings=" + ratings + "]";
	}
	
	
}
