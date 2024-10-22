package hw3;

import java.util.Scanner;

public class Triangle {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("輸入三個數字");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		
		
		if (isTriangle(a,b,c)) {
			
			if(a == b && b == c){
				System.out.println("正三角形");
			}
			
			else if(a*a + b*b == c*c || b*b + c*c == a*a || a*a + c*c == b*b) {
			System.out.println("直角三角形");
		    }

			else if (a == b || b == c || c ==a ) {
				System.out.println("等腰三角形");
			}
			else {
				System.out.println("其他三角形");
			}
		}
			else {
			System.out.println("不是三角形");
		
		
		}
		sc.close();
		
	}
		
	
	
	
	public static boolean isTriangle(double a ,double b ,double c) {
			return (a + b > c && a + c >b && b + c >a );
		}
			
		
		
	
}
	
	
	
	

