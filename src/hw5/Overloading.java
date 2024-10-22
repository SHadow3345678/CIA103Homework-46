package hw5;

public class Overloading {
	
	public  static int maxElement (int [][] x) {
		 
		int max = 0 ; 
		
		for (int[] row : x) {
			for (int value : row) {
				if (value > max) {
					max = value;
				}
			}
		}
		return max;

	}
	
	
	public  static double maxElement (double [][] x) {
		 
		double max = 0; 
		
		for (double[] row : x) {
			for (double value : row) {
				if (value > max) {
					max = value;
				}
			}
		}
		return max;

	}
	
	public static void main (String[] args) {
		
		int[][] c = { {89 , 32 , 45},
				     {100 , 25 , 67}
		                              };
		
		double[][] d = { {3.4 , 3.6 , 3.88},
				         {3.728 , 3.52 , 3.8}
				                              } ;
		
		System.out.println("整數最大值" + maxElement (c));
		System.out.println("浮點最大值" + maxElement (d));

		
		
		
		

				
    }	

			
}
