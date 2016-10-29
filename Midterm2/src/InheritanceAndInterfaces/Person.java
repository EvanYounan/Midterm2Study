package InheritanceAndInterfaces;

public class Person implements IPerson {

	private String name;
	private double annual_income;
	private int heath_card;
	private int sin;
	private String address;
	
	
	public Person(String name, double annual_income, int heath_card, int sin, String address) {
		this.name = name;
		this.annual_income = annual_income;
		this.heath_card = heath_card;
		this.sin = sin;
		this.address = address;
	}

	public String toString() {
		return "name=" + name + ", annual_income=" + annual_income + ", heath_card=" + heath_card + ", sin="
				+ sin + ", address=" + address;
	}
	
	public void raise(double raise) {
		this.annual_income += raise;
	}
	
}
