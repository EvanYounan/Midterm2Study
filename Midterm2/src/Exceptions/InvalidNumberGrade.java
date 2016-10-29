package Exceptions;

public class InvalidNumberGrade extends Exception {

	// IF you look at the documentation for Exception class online at:
	//https://docs.oracle.com/javase/7/docs/api/java/lang/Exception.html?is-external=true
	//you will find the different types of constructors you can use
	
	public InvalidNumberGrade() {
	}
	
	public InvalidNumberGrade(String message) {
		super(message);
	}
	
	public InvalidNumberGrade(Throwable cause) {
		super(cause);
	}
	
	public InvalidNumberGrade(String message, Throwable cause) {
		super(message, cause);
	}
	
	//for the rest of the constructors available, Justin Girard said that we don't really 
	//have to focus on them.

}
