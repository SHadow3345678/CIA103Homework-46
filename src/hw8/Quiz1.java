package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Quiz1 {
	
	private static final Object Object = null;

	public static void main(String[] args) {
//		請建立一個Collection物件並將以下資料加入:
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
//
//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//		• 移除不是java.lang.Number相關的物件
//		• 再次印出這個集合物件的所有元素,觀察是否已將非Number相關的物件移除成功
		
		
		List<Object> list = new ArrayList<Object>();
		list.add(new Integer(100));
		list.add(new Double(3.14));
		list.add(new Long(21L));
		list.add(new Short("100"));
		list.add(new Double(5.1));
		list.add("Kitty");
		list.add(new Integer(100));
		list.add(Object);
		list.add("Snoopy");
		list.add(new BigInteger("1000"));
		
		//傳統FOR
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//Iterator
		System.out.println("====================================");
		for(Iterator date = list.iterator();date.hasNext();) {
			System.out.println(date.next());
		}
		//for each
		System.out.println("====================================");
		for(Object each : list) {
			System.out.println(each);
			
		}
		
		//
		Iterator num = list.iterator();
		while(num.hasNext()) {
			Object a = num.next();
			if(!(a instanceof Number)) {
				num.remove();
			}
		}
		System.out.println(list);
		
		
		
	}

	private static Object Integer(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
