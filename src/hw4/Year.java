package hw4;

import java.util.Scanner;

public class Year {
	
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入年");
		int a = sc.nextInt();
		System.out.println("輸入月");
		int b = sc.nextInt();
		System.out.println("輸入日");
		int c = sc.nextInt();
		
		int [][]day = {
				       {31,28,31,30,31,30,31,31,30,31,30,31},
				       {31,29,31,30,31,30,31,31,30,31,30,31}
				                                             };
		
		
		int i = 0 , h = 0 ,sum =0 ;
		
		
		
		
		
		if (a % 4 == 0) {
			h = 1;
			}
		
		if (day[h][b-1] < c ) {
			System.out.println("輸入的月或日不對");
		}else {
		for (i=0 ;i < b-1 ; i++) {
			
			sum += day[h][i];
			
		}
		System.out.println("輸入的日期為該年第"+ (sum+c) + "天");
		}

		
		
	}

}
