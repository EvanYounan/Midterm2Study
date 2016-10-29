package InheritanceAndInterfaces;

public class Officer extends Person {


	public Officer(String name, double annual_income, int heath_card, int sin, String address) {
		super(name, annual_income, heath_card, sin, address);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Officer " + super.toString();
	}

}
