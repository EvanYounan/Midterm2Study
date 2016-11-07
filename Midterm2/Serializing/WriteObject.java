package Serializing;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class WriteObject {
	
	public static void main(String[] args) {
		
		Person p1 = new Person("Jacky", 18);
		String fileName = "info/person.ser";
		
		try(FileOutputStream fos = new FileOutputStream(fileName)) {
			
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(p1);
			
			os.close();
			fos.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Writing Objects...");
		
		
	}
}