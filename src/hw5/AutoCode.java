package hw5;

public class AutoCode {
	
	public static void getAutoCode(){
		
		String all ="ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		StringBuilder set = new StringBuilder(8);
				
		
		
		for (int i = 0 ; i < 8 ; i++) {
			
		int r = (int)(Math.random()*all.length());
		
		set.append(all.charAt(r)) ;
			
			
		}
		 System.out.println("生成的驗證碼: " + set.toString());
		
				
	}
	
	public static void main (String[] args) {
		
		getAutoCode();
	}
	

}
