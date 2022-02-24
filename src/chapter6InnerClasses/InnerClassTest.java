package chapter6InnerClasses;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class InnerClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TalkingClock clock = new TalkingClock(2000, true); 
		clock.start();

		JOptionPane.showMessageDialog(null, "Quit program?");
		System.exit(0);
	}

}

class TalkingClock{
	private int interval; 
	private boolean beep;
	
	public TalkingClock(int aInterval, boolean aBeep) {
		interval = aInterval; 
		beep = aBeep; 
	}
	
	public void start() {
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
		
	}
	
	/**
	 * {@code}
	 * Local inner class TimePrinter inside Start method
	 * ***
	public void start()
	{
		class TimePrinter implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep) Toolkit.getDefaultToolkit().beep();
			}
		}
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	*/
	
	/**
	 * Accessing final Variables from Outer Methods
	 * 
	public void start(int interval, final boolean beep){
		class TimePrinter implements ActionListener
		{
			public void actionPerformed(ActionEvent event)
			{
				Date now = new Date();
				System.out.println("At the tone, the time is " + now);
				if (beep) Toolkit.getDefaultToolkit().beep();
			}
		}
		ActionListener listener = new TimePrinter();
		Timer t = new Timer(interval, listener);
		t.start();
	}
	 */
	
	
	public class TimePrinter implements ActionListener{
		public void actionPerformed(ActionEvent event)
		{
			Date now = new Date();
			System.out.println("At the tone, the time is " + now);
			if (beep) Toolkit.getDefaultToolkit().beep();
		}
	}
}

