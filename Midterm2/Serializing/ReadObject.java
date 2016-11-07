package Serializing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

	public static void main(String[] args) {
		System.out.println("Reading Objects...");
		
		try (FileInputStream fis = new FileInputStream("info/person.ser")) {
			
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			Person p1 = (Person)ois.readObject();
			System.out.println(p1);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
}
