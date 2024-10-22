package hw7;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class Sample {
	static void p(String s) {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		
		File f1 = new File("C:\\javawork\\Sample.txt");
		p("檔案位元 " + f1.length() + " Bytes");
		
		try {
			 int str;
             FileReader fr = new FileReader("c:\\javawork\\Sample.txt");
             BufferedReader br = new BufferedReader(fr) ;
			 int wCount = 0; //計算自數
			 while ((str = fr.read())!= -1) {  //獨字 
					wCount++;
			 }	
			 
			 String str2;
             FileReader fr2 = new FileReader("c:\\javawork\\Sample.txt");
             BufferedReader br2 = new BufferedReader(fr2) ;
			 int lCount =0 ; //計算行數
			 while (br2.readLine() != null) {  //讀行 
				 lCount++;
				}

			
			 p("檔案字數" + wCount);
			 p("檔案行列" + lCount);
		} catch(IOException e){}

		
		
		
	}

}
