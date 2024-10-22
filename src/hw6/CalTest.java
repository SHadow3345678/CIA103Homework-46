package hw6;

import java.util.Scanner;

public class CalTest {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("請輸入X的值");
			int x = sc.nextInt();
			System.out.println("請輸入Y的值");
			int y = sc.nextInt();
			
		 int result = Calculator.powerXY(x, y);
		 
		 System.out.println("X的Y次結果為" + result);
		} catch (CalException e){
			
			System.out.println("計算錯誤: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("格式輸入錯誤 ");
		} finally {
			sc.close();
		}
		
		
		
		
		
	}

}
