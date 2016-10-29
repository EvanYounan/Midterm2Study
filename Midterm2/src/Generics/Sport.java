package Generics;

public class Sport {
	private int numberOfTeamMates;
	private String name;
	private String equipment;

	public Sport(int numberOfTeamMates, String name, String equipment) {
		this.numberOfTeamMates = numberOfTeamMates;
		this.name = name;
		this.equipment = equipment;
	}
	
	public void playSport() {
		//doWhatever();
	}

	@Override
	public String toString() {
		return "Sport [numberOfTeamMates=" + numberOfTeamMates + ", name=" + name + ", equipment=" + equipment + "]";
	}
	


}
