package hw3;

import java.util.Scanner;

public class Random09 {
	
	public static void main(String[] args) {
		
		Scanner r = new Scanner(System.in);
		

		
//		int b = (int)(Math.random()* 9) ;
//		
//		
//		
//        // 宣告變數來保存使用者的猜測
//        int a = -1;
//        
//        System.out.println("輸入0~9一個數字");
//		
//		
//		while (a != b) {
//			 a = r.nextInt();
//		
//		
//		
//		if (a == b) {
//			System.out.println("猜對了，答案是" + a);
//		}
//		else {
//			System.out.println("猜錯了");
//			
//		}
//		}
//		r.close();
		
		
		
		

		//猜100
		int b = (int)(Math.random()* 100) ;
		
		
		
        // 宣告變數來保存使用者的猜測
        int a = -1;
        
        System.out.println("輸入0~100一個數字");
		
		
		while (a != b) {
			 a = r.nextInt();
		
		
		
		if (a == b) {
			System.out.println("猜對了，答案是" + a);
		}
		else if (a > b) {
			System.out.println("猜錯了，再猜小一點");
		}
		else if (a < b){
			System.out.println("猜錯了，再猜大一點");
			
		}
		}
		r.close();
		
		
	}

}
