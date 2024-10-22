package hw7;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Speak {

	public static void main(String[] args) throws IOException, ClassNotFoundException  {
		FileInputStream fis = new FileInputStream("c:\\date\\Object.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		try {
			while (true) {
				// 建立共同父類別Pets讓Cat、Dog繼承，強轉後呼叫speak()
				((Pet) ois.readObject()).speak();
			}
		} catch (EOFException e) {
			System.out.println("資料讀取完畢！");
		}
		
        ois.close();
        fis.close();

	}
}