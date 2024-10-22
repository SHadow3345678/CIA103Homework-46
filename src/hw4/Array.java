package hw4;

import java.util.Scanner;

public class Array {
	
	Scanner r = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		 int[] a = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		 
		 int sum = 0;
		 
		 for (int i =0 ; i < a.length;i++) {
			 
			 sum+=a[i] ;
			 
			 
		 }
		 
		 System.out.println("平均為" + sum/a.length);
		 
		 for (int i =0 ; i < a.length;i++) {
			 
		        if (a[i] > sum/a.length) {
			 
		             System.out.println("大於平均" + a[i]);
		        }
		 }
		 
		 String s = "MyGo";
		 
		 int len = s.length();
		 
		 int c = 0;
		 
		 for(c = (len - 1); c >= 0 ; c--) {
			 
			 char ch = s.charAt(c);
			 
			 System.out.print(ch);
			 
			 
		 }
		 System.out.println();
		 
		 String[] pl ={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		 
		 int t;
		 
		 int count = 0;
		 
		 
		 for (String planet : pl) {
			// 遍歷每個字串中的字符
		     for(t =0 ; t < planet.length();t++) {
		    	 char cc = planet.charAt(t);
		    	 
					switch (cc) {
					case 'a':
					case 'e':
					case 'i':
					case 'o':
					case 'u':
						count++;
						break;
		    	  
		            }

		    }	 
	     }		 
					
		
		 
		 System.out.println("有"+ count + "個母音"  );	

		 
	}

}
