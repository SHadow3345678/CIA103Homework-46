package hw2;

public class Hw25_7 {
	
	public static void main(String[]arg) {
//		4 阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//		輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
		 int count = 0;
		for (int la = 1;la <= 49; la++) {
			String laStr = String.valueOf(la); 
			if (!laStr.contains("4" )) {
				System.out.print(la + " ");
			    count++;
			}    
		}
		System.out.println();
		System.out.println(count);
		
		
		 System.out.println("==========================================================");
		
		
		
		
//		5 請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
		int i, j , s;
		s = 10;
		
		for (i = 0; i < s; i++) {
			
			for (j = 1 ; j <= (s - i); j++) {
				System.out.print(j + " ");
			}
			System.out.println();
	 }
		
		 System.out.println("==========================================================");
		
//		7 請設計一隻Java程式,輸出結果為以下:
//			A
//			BB
//			CCC
//			DDDD
//			EEEEE
//			FFFFFF
		 int a , b ;
		 char c= 'A';
         for (a = 1; a < 7; a++) {
			
			for (b = 1 ; b <= a; b++) {
				
				
				System.out.print(c);
			}
			System.out.println();
			c++;
			//換行時把A字元++到B
	    }
	
	
	
	}

}
