package hw2;

public class Hw21_4 {
	
	public static void main(String[] args) {
		
//		1 請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
		int b = 0;
		
		for (int s = 0 ; s <= 1000 ; s++) {
			if(s % 2 == 0)
		    b +=s;
		}		
		
	    System.out.println(b );

		
//		2 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
	     int f = 1;	
		 for (int p = 1 ; p <= 10 ; p++) {
	    		    f *=p;
	    }	
	    		  System.out.println(f);
		
//		3 請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
	    		  int t = 1 , z = 1	;
	    		  while (z <= 9) {
	  				z++;
	  				t *= z;
	  			} 
	    		    		 
	    		    System.out.println(t);
	    		  
	    		  
		
//		4 請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
	    		    int u = 1 ,	k = 0;
	    			 for (u = 1 ; u <= 10 ; u++) {
	    		    		    k = u;
	    		    		    k *=k;
	    		    	System.out.print(k + "\t");
	    			 }	
		
		
	}

}
