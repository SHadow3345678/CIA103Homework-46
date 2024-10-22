package hw6;

public class Calculator {
	
	
	public static int powerXY(int x , int y) throws CalException{
		
		if (x == 0 && y == 0) {
			
			 throw new CalException("x或y不能為0");
		}
		if (x < 0 || y < 0) {
			
			 throw new CalException("x或y不能為負數");
		}

		
		return (int) Math.pow(x, y) ;
	}

}
