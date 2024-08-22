package hw2;

public class Hw9x9 {
	public static void main(String[] args) {
		
//		9*9 FOR迴圈+WHILE迴圈
		int i, j;
		for (i = 1; i <= 9; i++) {
			System.out.println();
			j = 1;
			while (j <= 9) {
				System.out.print(i + "*" + j + "=" + i * j + "\t");
				j++;
				
			}
		}
		
//	    9*9 FOR迴圈+DO WHILE迴圈
		System.out.println();
		System.out.println("==============================");
		int s, g;
		for (s = 1; s <= 9; s++) {
			System.out.println();
			g = 1;
			do {
				System.out.print(s + "*" + g + "=" + s * g + "\t");
				g++;
			}while (g <= 9); 
			   
		}
//	    9*9 while迴圈+DO WHILE迴圈
		System.out.println();
		System.out.println("==============================");
		int y, t;
		y = 0; 
		while (y <= 8) {
			y++;
			t = 1;
			System.out.println();
			do {
				System.out.print(y + "*" + t + "=" + y * t + "\t");
				t++;
			}while (t <= 9); 
		}
		
			
	
	
	}
          
	
	   

}
