/*
 * File: Pyramid.java
 * Name: 
 * Section Leader: 
 * ------------------
 * This file is the starter file for the Pyramid problem.
 * It includes definitions of the constants that match the
 * sample run in the assignment, but you should make sure
 * that changing these values causes the generated display
 * to change accordingly.
 */
 
import acm.program.*;
import acm.graphics.*;
 
 
public class Pyramid extends GraphicsProgram {
 
    private static final int BRICK_WIDTH = 30; //The width of each brick (30 pixels)
    private static final int BRICK_HEIGHT = 12; //The height of each brick (12 pixels)
    private static final int BRICKS_IN_BASE = 12;  //The number of bricks in the base (14)
      
     
    public void run() {
         
        drawPyramid(BRICKS_IN_BASE);
         
    }
     
    public void drawBrick(double x, double y) {
         
        GRect brick = new GRect (x, y, BRICK_WIDTH, BRICK_HEIGHT);
         
        add(brick);
         
    }
 
    public void drawRowOfBricks(double x, double y, int numBricks) {
         
        for (int i = 0; i < numBricks; i++) {
         
        drawBrick(x, y);
         
        x += BRICK_WIDTH;
         
        }
             
    }
     
    public void drawCenteredRowOfBricks(double y, int numBricks) {
         
        int x = (getWidth() / 2) - (numBricks * BRICK_WIDTH) / 2;
         
        drawRowOfBricks(x, y, numBricks);
         
    }
     
    public void drawPyramid(int baseBricks) {
         
        int y = getHeight();
             
        for (int i = baseBricks; i > 0; i--) {
         
        	y -= BRICK_HEIGHT;
        	baseBricks -= 1;
        	drawCenteredRowOfBricks(y, i);   
        }    
    }
         
}