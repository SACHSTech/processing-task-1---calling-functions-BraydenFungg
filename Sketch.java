import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 500);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(50, 50, 200);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    //Drawing grass (rectangle)
    fill(100,225,100);
    stroke(0);
    rect(0, 300, 1000, 1000);

    //Drawing first house (base - rectangle) (roof - triangle)
    fill(129, 128, 128);
    stroke(4);
    rect(100, 200, 200, 200);
    
    fill(110, 110, 110);
    stroke(0);
    triangle(100, 200, 200, 100, 300, 200);
    
    fill(255, 100, 100);
    stroke(200);
    rect(125, 300, 50, 100);

    //Drawing second house (base - rectangle) (roof - triangle)
    fill(110, 110, 110);
    stroke(0);
    triangle(325, 290, 350, 270, 375, 290);
    
    fill(128, 128, 128);
    stroke(0);
    rect(325, 290, 50, 75);
    
    fill(255, 100, 100);
    stroke(200);
    rect(332, 315, 20, 48);

    //Drawing sun (circle)
    fill(255, 255, 0);
    stroke(4);
    ellipse(400, 0, 100, 100);

    //Drawing sign (pole - line) (sign body - rectangle)
    stroke(0);
    line(50, 460, 50, 350);
    
    fill(100, 200, 200);
    stroke(0);
    rect(25, 365, 50, 25);

    //Drawing clouds (circles)
    fill(220, 220, 220);
    stroke(255);
    ellipse(67, 60, 50, 50);

    fill(225, 225, 225);
    stroke(255);
    ellipse(100, 75, 50, 50);

    fill(225, 225, 225);
    stroke(255);
    ellipse(75, 85, 50, 50);

    fill(222, 222, 222);
    stroke(255);
    ellipse(50, 80, 50, 50);

    //Drawing window (rectangle)
    fill(225, 225, 225);
    rect(190, 245, 100, 50);
  }
  
  // define other methods down here.
}