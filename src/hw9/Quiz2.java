package hw9;



class Money {
	private int bank = 0; 

	synchronized public void enter(int go) {
		while (bank > 3000) {
			System.out.println("銀行超過3000元，暫時不匯錢");
			try {
				System.out.println("媽媽已經匯過去");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		 bank += go;
		System.out.println("媽媽存了" + go + "，銀行共有" + bank);
		notify();
	}

	synchronized public void leave(int out) {
		while (bank < out) {
			System.out.println("我窮了，暫停提款");	
			try {
				System.out.println("提醒媽媽匯錢");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		 bank -=  out;
		System.out.println("熊大領了" +  out + "，銀行共有" +  bank);
		if (bank < 2000) {
			System.out.println("銀行要沒錢了，要求匯款");
			notify();
		}
	}
}

class Mom extends Thread {
	Money money;

	public Mom(Money money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			money.enter(2000); // 每次存2000元
	}
}

class Bear extends Thread {
	Money money;

	public Bear(Money money) {
		this.money = money;
	}

	public void run() {
		for (int i = 1; i <= 10; i++)
			money.leave(1000); // 每次領1000
	}
}

public class Quiz2 {
	public static void main(String[] args) {
		Money money = new Money();
		Mom Mom = new Mom(money);
		Bear Bear = new Bear(money);
		Mom.start();
		Bear.start();
	}
}