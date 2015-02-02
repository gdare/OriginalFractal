import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

public void setup(){
	size(500,500);
}
public void draw(){
	background(0);
    fractal(mouseX,mouseY,100, 10);
}
public void fractal(int x, int y, int radius, int rings){
	ellipse(x,y,radius,radius);
	if (rings > 1){
		//fractal(x,y,radius - 10, rings - 1);
		fractal(x + 10,y,radius - 10, rings - 1);	
	    fractal(x - 10,y,radius - 10, rings - 1);		
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
