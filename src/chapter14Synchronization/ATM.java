package chapter14Synchronization;

public class ATM extends Thread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM a1 = new ATM(); 
		ATM a2 = new ATM(); 
		a1.start(); 
		a2.start();
	}
	public void run()
	{
		for (int i = 0; i<1000; i++) {
			Account.ruttien(1); 
			System.out.println(i+","+Account.money);
		}
			
	}
}
class Account{
	static int money = 5000; //CSDL
	
//	static void ruttien (int a)
	static synchronized void ruttien(int a)
	{
		int t = money; 
		t-=a; 
		try {
			Thread.sleep(1);
		}
		catch (InterruptedException e) {
			// TODO: handle exception
		}
		money = t; 
	}
}