package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RandomExceptions {

	public void checkNum(int num) throws NumberException {
		if (num > 100) {
			throw new NumberException("This number is greater than 100! File closing.");
		}
		System.out.println("It worked!");
	}
	

	public static void main(String[] args) throws Exception {
		
		try {
			BufferedReader x = new BufferedReader(new FileReader("amy.txt"));
			System.out.println("Hi Jacky");
		} catch (FileNotFoundException e) {
			throw new Exception(e);
		} finally {
			System.out.println("OMG WE ARE DONE");
			System.out.println("jk we can still continue doing stuff");
			//dostuff();
		}
		System.out.println("I wanna try to do this");
		
	}
}
