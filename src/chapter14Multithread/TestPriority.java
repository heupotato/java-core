package chapter14Multithread;

public class TestPriority extends Thread {
	public void run() {
		System.out.println("name: " + Thread.currentThread().getName()); 
		System.out.println("priority: " + Thread.currentThread().getPriority()); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestPriority t1 = new TestPriority(); 
		TestPriority t2 = new TestPriority(); 
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
	}

}
