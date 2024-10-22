package hw4;

public class StudentTest {
	
	public static void main(String[] args) {
		
		
		
		int[][] test = { 
				{10 , 35 , 40 , 100 , 90 , 85 , 75 , 70},
		         {37 , 75 , 77 , 89 , 64 , 75 , 70 , 95},
		         {100 , 70 , 79 , 90 , 75 , 70 , 79 , 90},
		         {77 , 95 , 70 , 89 , 60 , 75 , 85 , 89},
		         {98 , 70 , 89 , 90 , 75 , 90 , 89 , 90},
		         {90 , 80 , 100 , 75 , 50 , 20 , 99 , 75}, 
				             };
		
		int stu = test[0].length; //學生數量
		int exam = test.length; //考試次數
		
		int[] maxscore = new int[stu]; //紀錄次數
		
		
		for (int i = 0; i < exam; i++) { 
				//找出當前最高分
			int ms = Integer.MIN_VALUE;
			for (int s=0 ; s < stu; s++) {
				if(test[i][s] > ms) {
					ms = test[i][s];
				}
			}
			// 統計每位考最高分的
			for (int s=0 ; s < stu; s++){
				if(test[i][s] == ms) {
					maxscore[s]++; 
				}
			}
		}
        for (int s = 0; s < stu; s++) {
            System.out.println("同學" + (s + 1) + "考取最高分的次數: " + maxscore[s]);
        }
		
		
	}

	
	

}
