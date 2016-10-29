package Exceptions;

import java.util.Scanner;

public class NumberGrade {
	
	private int grade;
	
	public NumberGrade(int grade) throws InvalidNumberGrade {
		if (grade > 100 || grade < 0) {
			throw new InvalidNumberGrade("Invalid grade of: " + grade);
		}
		this.grade = grade;
	}
	
	//http://www.artsci.utoronto.ca/newstudents/transition/academic/grading
	public double calculateGPA() {
			if (this.grade < 50) return 0.0;
			else if (this.grade < 53) return 0.7;
			else if (this.grade < 57) return 1.0;
			else if (this.grade < 60) return 1.3;
			else if (this.grade < 63) return 1.7;
			else if (this.grade < 67) return 2.0;
			else if (this.grade < 70) return 2.3;
			else if (this.grade < 73) return 2.7;
			else if (this.grade < 77) return 3.0;
			else if (this.grade < 80) return 3.3;
			else if (this.grade < 85) return 3.7;
			else if (this.grade < 90) return 4.0;
			else return 4.0;
	}
	
	public String toString() {
		return "Number grade: " + this.grade;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean created = false;
		
		//if line with NumberGrade x = new NumberGrade(gr); does not throw an 
		//InvalidNumberGrade exception, then (created = true) and the loop breaks
		//if line with NumberGrade x = new NumberGrade(gr); throws an InvalidNumberGrade
		//exception, then (created = true) will not run and the loop will proceed to keep
		//running until a valid NumberGrade object is created
		while (!created) 
		{
			System.out.print("Please enter a grade: ");
			int gr = scan.nextInt();
			try {
				NumberGrade x = new NumberGrade(gr);
				//REMEMBER THAT THE LINE BELOW WILL ONLY RUN IF THE LINE ABOVE DOESN'T THROW
				//AN InvalidNumberGrade exception.
				
				System.out.println();
				System.out.println("This grade translates into a gpa of: " + x.calculateGPA());
				created = true;
				
			} catch (InvalidNumberGrade e) {
				System.out.println(e.getMessage());
			}
		}
	}

}

