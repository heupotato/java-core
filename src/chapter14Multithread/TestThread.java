package chapter14Multithread;

public class TestThread implements Runnable{
	private String name; 
	
	TestThread(String n){
		name = n; 
	}
	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println(name + " " + i); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new TestThread("thread1");
		Thread thread1 = new Thread(r1); 
		
		Runnable r2 = new TestThread("thread2"); 
		Thread thread2 = new Thread(r2); 
		
		Runnable r3 = new TestThread("thread3"); 
		Thread thread3 = new Thread(r3); 
		
		thread1.start(); 
		
		try {
			thread1.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		thread2.start(); 
		thread3.start(); 
		
	}

}
