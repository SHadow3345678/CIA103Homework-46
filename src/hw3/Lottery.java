package hw3;

import java.util.Scanner;

public class Lottery {
	
     public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		
		System.out.println("輸入0~9一個數字");
		
		int a = r.nextInt();
		String not = String.valueOf(a);
		
		int count = 0;
		
		
		for (int la = 1;la <= 49; la++) {
			String laStr = String.valueOf(la); 
			if (!laStr.contains(not)) {  //!laStr.contains(輸入) 
				System.out.print(la + " ");
				count++; 
			}    
	
		}
		System.out.println();
		System.out.println("總共有"+ count + "數字能選");
		
		r.close();
		
		
		//進階
		
     }
}
