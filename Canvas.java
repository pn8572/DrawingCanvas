package com.graphics.canvas;

/**
 * 
 * @author prasanth
 *
 * Drawing initial canvas
 */

public class Canvas {
	char[][] canvasArray;
	int width, height;
	public Canvas(int w, int h) {
		h+=2;
		w+=2;
		this.width = w;
		this.height = h;
		canvasArray = new char[h][w];		
		drawLine(0, 0, this.width-1, 0, '-');
		drawLine(0, this.height-1, this.width-1, this.height-1, '-');
		drawLine(0, 1, 0, this.height-2, '|');
		drawLine(this.width-1, 1, this.width-1, this.height-2, '|');		
	}
	
	/*
	 * create the shape by displaying the character in the respective 
	 * coordinates.
	 */
			
	public void create() {		
		for(int i=0;i<this.height;i++) {
			for(int j=0;j<this.width;j++) {				 
				System.out.print(canvasArray[i][j]);
			}
			System.out.println();
		}
	}
	
	/*
	 * fill in the character array with respective character at specified coordinates
	 */
	public void drawLine(int x1, int y1, int x2, int y2, char mchar) {
		for(int i=y1; i<=y2; i++) {
			for(int j=x1; j<=x2; j++) {
				canvasArray[i][j] = mchar;				
			}
		}		 
  	} 
}


