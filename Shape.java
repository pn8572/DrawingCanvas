package com.graphics.canvas;

/**
 * Class which extends the parent Canvas and does the functionlity 
 * to create different shapes. This can be extended further to create 
 * more shapes.
 * 
 * @author prasanth
 *
 */
public class Shape extends Canvas {

	public Shape(int w, int h) {
		super(w, h);
	}
	
	/*
	 * Creates rectangle shape with specified coordinates and character
	 */
	public void drawRectangle(int x1, int y1, int x2, int y2, char mchar) {
		drawLine(x1,y1, x2, y1, mchar);
		drawLine(x1,y1, x1, y2, mchar);
		drawLine(x2,y1, x2, y2, mchar);
		drawLine(x1,y2, x2, y2, mchar);
	}
	
	/*
	 * Fills in bucket with specified coordinates and character
	 */
	public void fillBucket(int x, int y, char mchar) throws InterruptedException {
		if((int)canvasArray[y][x] != 0) {
			return;
		}
		
		if(x > 0 || x < this.height || y > 0 || y  < this.width) {
			if((int)canvasArray[y][x] == 0)
				canvasArray[y][x] = mchar;
			fillBucket(x+1,y, mchar);
			fillBucket(x-1,y, mchar);
			fillBucket(x,y-1, mchar);
			fillBucket(x,y+1, mchar);			
		}
	}
}
