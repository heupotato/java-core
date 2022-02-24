package chapter14Synchronization;

class Table{    
	void printTable(int n){  
		synchronized (this) {
			for(int i = 1; i <= 10; i++){  
				System.out.println(n * i);  
				try {  
					Thread.sleep(400);  
				} catch(InterruptedException e){
					e.printStackTrace();
				}  
			}  
		}
	}  
}  

class MyThread extends Thread{
	int number;
	Table table; 
	MyThread(Table t, int n){
		number = n;
		table = t; 
	}
	public void run() {
		table.printTable(number);
	}
}
	  
public class SyncBlockTableTest {  
	
	public static void main(String[] args) {  
	    Table table = new Table(); 
	    
	    MyThread t1 = new MyThread(table, 1); 
	    MyThread t2 = new MyThread(table, 10);
	    MyThread t3 = new MyThread(table, 100);
	    MyThread t4 = new MyThread(table, 1000);
	    
	    
	    t1.start();  
	    t2.start();  
	    t3.start();  
	    t4.start();  
	      
	}  
}  
