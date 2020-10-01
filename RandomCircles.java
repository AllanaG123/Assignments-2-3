
/*
 * File: RandomCircles.java
 * -----------------------------
 * This file is the starter file for the RandomCircles problem.
 */

import acm.program.*;
import acm.util.RandomGenerator;
import acm.graphics.*;
import java.awt.*;

public class RandomCircles extends GraphicsProgram {
	
	/** NUmber of circles */
	private static final int NCIRCLES = 10;
	
	/** minimum radius */
	private static final double MIN_RADIUS  = 5;
	
	/** Maximun radius */
	private static final double MAX_RADIUS = 50;
	
	public void run() {
		for (int i = 0; i < NCIRCLES; i++) {
			double r = rgen.nextDouble (5, 50);
			double x = rgen.nextDouble (0, getWidth () - 2 * r);
			double y = rgen.nextDouble (0, getHeight() -2 * r);
			GOval circle = new GOval (x, y, 2 * r, 2 * r);
			circle.setFilled (true);
			circle.setColor(rgen.nextColor());
			add (circle);
		}
	}
	
	/*Private instance variable */
	private RandomGenerator rgen = RandomGenerator.getInstance();
	
}
		
		
	


