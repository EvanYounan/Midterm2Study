package InheritanceAndInterfaces;

public class Person2 implements IPerson {

	private String name;
	private double annual_income;
	private int heath_card;
	private int sin;
	private String address;
	private String ID;
	
	public Person2(String name, double annual_income, int heath_card, int sin, String address, String ID) {
		this.name = name;
		this.annual_income = annual_income;
		this.heath_card = heath_card;
		this.sin = sin;
		this.address = address;
		this.ID = ID;
	}

	@Override
	public String toString() {
		return "name=" + name + ", annual_income=" + annual_income + ", heath_card=" + heath_card + ", sin="
				+ sin + ", address=" + address + ", ID=" + ID;
	}
	
	public void raise(double raise) {
		this.annual_income += raise;
	}
	
}
