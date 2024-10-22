package hw5;

public class Random100 {
	 

		public static void randAvg() {	
			int sum = 0;
			
			 for (int i =0 ; i <= 10 ; i++) {
				 int r = 0;
				 r = (int)(Math.random()*101);
				 System.out.print(r + " ");
				 sum += r;
				 
			 }
			 System.out.println();
			 System.out.println("十個亂數的平均" + sum/10);
		}

		
		 public static void main (String[] args) {
			 
			
			  randAvg();
		 
		}
	

}
