package hw9;



public class Quiz1 implements Runnable {
	int counter = 1;
	private String name;
	private static volatile boolean raceOver = false; // 共享變數, 用來標記比賽是否已結束

	public Quiz1() {
	} // 建構者函數
	
	public Quiz1(String name) {
        this.name = name; // 設定參賽者名稱
    }
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void run() { // 執行緒執行的地方
		 
		 while (counter <= 10) {
			System.out.println(name + "吃第"+ counter + "碗");
			counter++;
			int sleepTime = (int) (500 + (Math.random()* 3000)); //500~3000

			try {
				Thread.sleep(sleepTime); 
			} catch (Exception e) {
			}
		}
		 if (!raceOver) {
	            raceOver = true; // 更新比賽結束狀態
	            System.out.println(name + " 吃完！");
	        } else {
	            System.out.println("比賽結束。");
	        }
	    }
	

	public static void main(String arg[]) {
		Quiz1 r1 = new Quiz1("詹姆士");// 產生Runnable物件
		Thread t1 = new Thread(r1); // 再由Runnable物件, 產生執行緒Thread物件
		Quiz1 r2 = new Quiz1("饅頭人");
		Thread t2 = new Thread(r2);
		t1.start(); // 呼叫執行緒物件的start()方法(即啟動執行緒) , 隨即執行物件中的run方法
		t2.start();
	
}

}


