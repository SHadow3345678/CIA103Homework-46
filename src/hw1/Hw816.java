package hw1;


public class Hw816 {
	
	public static void main(String[]arg) {
//		1請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a = 12,b = 6 ;
		System.out.println(a+b); //和
		System.out.println(a*b); //積
		
//		2請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		int egg = 200; 
		System.out.println(egg / 12);  
//		System.out.println(egg % 12);  //餘下多少蛋
		
//		3請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		double s = 256559; //秒
		System.out.println(s / 86400 + "天");
		System.out.println(s / 3600 + "小時" );
		System.out.println(s / 60 + "分");
		System.out.println(s + "秒");
	}
	

}
