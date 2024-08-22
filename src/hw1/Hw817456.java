package hw1;

public class Hw817456 {

	
	public static void main(String[]arg) {
		
//		4請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		double a = 3.1415; 
		System.out.println(5 * 5 * a); // 半徑*半徑*3.14=圓面積
//		System.out.println(5 * 2 * a); // 直徑(半徑*2)*3.14=圓周長
		
//		5某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//		金加利息共有多少錢 (用複利計算,公式請自行google)
		double M = 1_500_000;
		System.out.println(M * Math.pow(1+0.02 , 10) );
		
		
		
//		6請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
		
//		System.out.println(5 + 5);
//		// 5+5=10
//		System.out.println(5 + '5');
//		// 5+字元=5+53
//		System.out.println(5 + "5");
//		// 5+字串=5(int)5(String)
		
		
		
		
	}
}
