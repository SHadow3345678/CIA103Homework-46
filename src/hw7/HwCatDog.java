package hw7;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class HwCatDog {
 
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Cat a = new Cat("Mimi");
		Cat b = new Cat("Milk");
		Dog c = new Dog("Stinky");
		Dog d = new Dog("CAT");
		
		
		
		File dir = new File("c:\\date"); 
	    dir.mkdir();        
        File file = new File("c:\\date\\Object.ser");
		file.createNewFile();
		
		try {
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.writeObject(b);
			oos.writeObject(c);
			oos.writeObject(d);

			oos.close();
			fos.close();
		} catch (IOException e) {
			System.err.println(e);
		}
		

	}
		
		
		
		
		
	

}



