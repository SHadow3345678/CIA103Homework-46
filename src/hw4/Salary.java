package hw4;

import java.util.Scanner;

public class Salary {
	
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		System.out.println("你想借多少?");
		int a = r.nextInt();
		
		int [][] money = {
				          {25 , 32 , 8 , 19 ,27},
				          {2500 , 800 ,500 , 1000 ,1200}
		                                                 }  ;
		
		
			for (int j = 0 ; j < money[0].length ; j++) {
				if (money[1][j] >= a) {

				
				System.out.println("可借員工" + money[0][j]);
				System.out.println("薪水" + money[1][j]); 
				}
				
				

				
					
		}
		
		
		
		
		r.close();
		
		
	}	

}
