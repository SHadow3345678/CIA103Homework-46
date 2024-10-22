package hw8;

import java.util.*;





public class Quiz2 {
	
	public static void main(String[] args) {
		
//		請設計一個Train類別,並包含以下屬性:
//			- 班次 number,型別為int - 車種 type,型別為String - 出發地 start,型別為String
//			- 目的地 dest,型別為String - 票價 price,型別為double
//			• 設計對應的getter/setter方法,並在main方法裡透過建構子產生以下7個Train的物件,放到每小題
//			需使用的集合裡
//			- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//			- (1254, “區間”, “屏東”, “基隆”, 700)
//			- (118, “自強”, “高雄”, “台北”, 500)
//			- (1288, “區間”, “新竹”, “基隆”, 400)
//			- (122, “自強”, “台中”, “花蓮”, 600)
//			- (1222, “區間”, “樹林”, 七堵, 300)
//			- (1254, “區間”, “屏東”, “基隆”, 700)
		
		
		Train e1 = new Train(202,"普悠瑪" ,"樹林", "花蓮" , 400);
		Train e2 = new Train(1254, "區間", "屏東", "基隆", 700);
		Train e3 = new Train(118, "自強", "高雄", "台北", 500);
		Train e4 = new Train(1288, "區間", "新竹", "基隆", 400);
		Train e5 = new Train(122, "自強", "台中", "花蓮", 600);
		Train e6 = new Train(1222, "區間", "樹林", "七堵", 300);
		Train e7 = new Train(1254, "區間", "屏東", "基隆", 700);
		
//		1請寫一隻程式,能印出不重複的Train物件
		 Set<Train> trainSet = new HashSet<>();
	        trainSet.add(e1);
	        trainSet.add(e2);
	        trainSet.add(e3);
	        trainSet.add(e4);
	        trainSet.add(e5);
	        trainSet.add(e6);
	        trainSet.add(e7);  
	        
	        // 印出不重複的 Train 物件
	        for (Train train : trainSet) {
	            train.display();
	        }
	        System.out.println("========================");
		
//		2請寫一隻程式,讓Train物件印出時,能以班次編號由大到小印出
		Train trains[] = new Train[7];
		trains[0] = e1;
		trains[1] = e2;
		trains[2] = e3;
		trains[3] = e4;
		trains[4] = e5;
		trains[5] = e6;
		trains[6] = e7;
		
        Arrays.sort(trains);
        
        // 印出所有 Train 物件
        for (Train train : trains) {
            train.display();
        }
        System.out.println("========================");
//        3承上,不僅能讓班次編號由大排到小印出, 還可以不重複印出Train物件
        Set<Train> trainSet2 = new TreeSet<Train>();
        trainSet2.add(e1);
        trainSet2.add(e2);
        trainSet2.add(e3);
        trainSet2.add(e4);
        trainSet2.add(e5);
        trainSet2.add(e6);
        trainSet2.add(e7);  
        
       
        
       
        for (Train train : trainSet2) {
            train.display();
        }
        System.out.println("========================");
		
	}

}
