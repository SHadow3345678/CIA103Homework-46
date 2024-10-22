package hw7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RandomIN10 {
	static void p(String s) {
		System.out.println(s);
	}
	public static void main (String[] args) {
		
		try {
			FileWriter fw = new FileWriter("c:\\javawork\\Date.txt",true);//加入TRUE就不會進行覆蓋可以附加新資訊

			BufferedWriter bw = new BufferedWriter(fw);

			PrintWriter pw = new PrintWriter(bw);
			
			for(int i =0 ; i <= 9 ; i++) {
				int [] ten = new int[10];
				int r = (int)(Math.random()*1001);
				ten [i] = r ;
				pw.println(ten[i]);
				p("寫入成功");
				
				
			}
			
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}

		
		
		
		
	

}
