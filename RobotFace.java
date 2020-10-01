/* File:RobotFace.java
 * This program draws a robot face */


import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class RobotFace extends GraphicsProgram {	
	
	/* The dimension of the Robot Face are as followed.
	 * Private static final int HEAD_WIDTH = 100;
	 * private static final int HEAD_HEIGHT = 150;
	 * private static final int EYE_RADIUS= 10;
	 * private static final int MOUTH_WIDTH = 60;
	 * private static final int MOUTH_HEIGHT = 20;
	 * Robot to be centered in the middle of graphics window */
	
	
	public void run() {
		addFace (getWidth() /2, getHeight() / 2) ;
			
		}
	
	/* adds the entire face centered at (cx, cy) */
	private void addFace (double cx, double cy) {
		addHead (cx, cy);
		addEye (cx - 100 / 4, cy - 150 / 4);
		addEye(cx + 100 / 4, cy- 150 / 4);
		addMouth (cx, cy + 150 / 4);
	}
	
	/*Adds the Head centered at (cx, cy) */
	private void addHead (double cx, double cy) {
		double x = cx - 100 / 2;
		double y = cy - 150 / 2;
		GRect head = new GRect (x, y, 100, 150);
		head.setFilled(true);
		head.setFillColor(Color.GRAY);
		add(head);
	}
	/* Adds the Eyes centered at (cx, cy) */
	private void addEye (double cx, double cy) {
		double x = cx - 10;
		double y = cy - 10;
		GOval eye = new GOval (x,y, 2 * 10, 2 * 10 );
		eye.setFilled(true);
		eye.setColor(Color.YELLOW);
		add (eye);
	}
	/*Adds the Mouth centered at (cx, cy)*/
	private void addMouth (double cx,double cy) {
		double x = cx - 60 / 2;
		double y = cy - 20 / 2;
		GRect mouth = new GRect (x,y, 60, 20 );
		mouth.setFilled(true);
		mouth.setColor(Color.WHITE);
		add (mouth);
	}

	
}
