package InheritanceAndInterfaces;

public class personSimulator {


	public static void main(String[] args) {
		IPerson x = new Officer("Jenkins", 50000.00, 2132312, 343545232, "118 Grand Valley Blvd");
		
		//I TOLD YOU 2 CLASSES AN IMPLEMENT 1 INTERFACE ay
		//THIS IS CLASS NUMBER 1: PERSON2
		IPerson y = new Person2("Harks", 50000.00, 5424524, 435703146, "119 Grand Valley Blvd", "232-434-654");
		//THIS IS CLASS NUMBER 2: PERSON
		IPerson z = new Person("Lemma", 51000.00, 6954532, 302968342, "120 Grand Valley Blvd");
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		x.raise(4343);
		y.raise(425);
		z.raise(21462);
		
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	} 

}
