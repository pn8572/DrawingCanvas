package com.graphics.canvas;

import java.util.Scanner;

public class CanvasApp {	
	static Shape shapeObject;
	public static void main(String[] args) throws NumberFormatException, InterruptedException {		
		Scanner scan = new Scanner(System.in);
		String command = new String();
		while(!command.equals("Q")) {
			System.out.print("Enter Command: ");
			command = scan.nextLine();
			draw(command);
		}
		System.out.println(" Exit Program!");
		scan.close();
	}
	
	private static void draw(String command) throws NumberFormatException, InterruptedException {
		char ch = command.charAt(0);
		String[] cmd;
		try {
			switch(ch) {
				case 'C' :
					cmd = command.split(" ");
					shapeObject = new Shape(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]));
					shapeObject.create();
				break;
				case 'L' :
					cmd = command.split(" ");
					if(shapeObject == null){
						System.err.println("Draw a canvas first");
						return;
					}
					shapeObject.drawLine(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
					shapeObject.create();
				break;
				case 'R' :
					cmd = command.split(" ");
					if(shapeObject == null){
						System.err.println("Draw a canvas first");
						return;
					}
					shapeObject.drawRectangle(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),Integer.parseInt(cmd[3]),Integer.parseInt(cmd[4]),'X');
					shapeObject.create();
				break;
				case 'B' :
					cmd = command.split(" ");
					if(shapeObject == null){
						System.err.println("Draw a canvas first");
						return;
					}
					shapeObject.fillBucket(Integer.parseInt(cmd[1]),Integer.parseInt(cmd[2]),cmd[3].charAt(0));
					shapeObject.create();
				break;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid command. Try again!!\n");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("Error Occured\n");
			e.printStackTrace();
			System.exit(1);
		}
	}
}
