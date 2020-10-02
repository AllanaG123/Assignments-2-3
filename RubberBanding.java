/*
 * File: RubberBanding.java
 * -----------------------------
 * This file is the starter file for the DrawingLines problem
 * that allows users to draw lines.*/

import acm.graphics.*;
import acm.program.*;
import java.awt.event.*;

/* This class allows users to drag lines on the canvas */
public class RubberBanding extends GraphicsProgram {

	public void run() {
		addMouseListeners();	
	}
	
/** Called on mouse press to create a new line */
	public void mousePressed(MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line = new GLine (x, y, x, y);
		add(line);
	}
		
/** Called on mouse drag to reset the endpoint */
	public void mouseDragged (MouseEvent e) {
		double x = e.getX();
		double y = e.getY();
		line.setEndPoint(x,y);
		
	}
	
	/* private instance variables */
	private GLine line;
}