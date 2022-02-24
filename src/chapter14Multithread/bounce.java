package chapter14Multithread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.swing.JFrame;

public class bounce extends JFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new bounce(); 
	}
	static int w = 500; 
	static int h = 350; 
	static int m = 50; 
	Ball bs[] = new Ball[100];
	Random rand = new Random(); 
	BufferedImage img; 
	Graphics g; 
	
	public bounce() {
		this.setTitle("Bounce Bounce Bounce");
		this.setDefaultCloseOperation(3);
		this.setSize(w+2*m,h+2*m);
		
		img = new BufferedImage(w+2*m, h+2*m, BufferedImage.TYPE_3BYTE_BGR);
		g = img.getGraphics(); 
		
		for (int i = 0; i<bs.length; i++ )
		{
			double r = rand.nextDouble()*15+5; 
			double x = rand.nextDouble()*(w-2*r)+r; 
			double y = rand.nextDouble()*(h-2*r)+r; 
			double vx = rand.nextDouble()-0.5; 
			double vy = rand.nextDouble()-0.5; 
			bs[i] = new Ball(x, y, r, vx, vy); 
			bs[i].start();
		}
		this.setVisible(true);
	}
	public void paint(Graphics g1) {
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, this.getWidth(), this.getHeight());
		
		g.setColor(Color.LIGHT_GRAY); 
		g.fillRect(m, m, w, h);
		
		g.setColor(Color.RED);
		g.drawRect(m, m, w, h);
		
		for (int i = 0; i<bs.length; i++)
		{
			int x = (int) (bs[i].x+m+0.5); 
			int y = (int) (bs[i].y+m + 0.5); 
			int r = (int) (bs[i].r + 0.5);
			g.setColor(Color.CYAN);
			g.fillOval(x-r, y-r, r*2, r*2);
			g.setColor(Color.BLUE);
			g.drawOval(x-r, y-r, r*2, r*2);
		}
		g1.drawImage(img,0,0,null); 
		repaint();
	}
	
}

class Ball extends Thread{
	double x, y; 
	double r; 
	double vx, vy; 
	
	public Ball(double x, double y, double r, double vx, double vy)
	{
		this.x = x; 
		this.y = y; 
		this.r = r; 
		this.vx = vx; 
		this.vy = vy; 
	}
	
	public void run()
	{
		while (true) {
			x+= vx; 
			y+= vy; 
			if ((x-r<=0 && vx<0)||(x+r>=bounce.w)&&(vx>0)) {
				 vx = -vx; 
			}
			if ((y - r<=0 && vy<0)||(y+r>=bounce.h)&&(vy>0)) {
				 vy = -vy; 
			}
			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
