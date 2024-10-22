package hw5;

import java.util.Scanner;

public class Square {
	
	
		private int l;
		private int w;
		
		
		public void setsquarel(int l) {
			this.l = l;
			
		}
		
		public int getsquarel() {
			return l;
		}
		public void  setsquarew(int w) {
			this.w = w;
			
		}
		public int getsquarew() {
			return w;
		}
		public void starSquare() {
			int i, j;
			for (i = 1; i <= w ; i++) {
				for (j = 1; j <= l; j++)
					System.out.print("*" );
				System.out.println();

			}

		}
		public static void main (String[]args) {
			Scanner sc = new Scanner(System.in);
			 Square s = new Square();
			 System.out.println("輸入寬");
			 s.setsquarel(sc.nextInt());
			 System.out.println("輸入高");
			 s.setsquarew(sc.nextInt());
			 
			 
			 s.starSquare();
			
			
		}
		

}
