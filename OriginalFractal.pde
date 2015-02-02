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
		fractal(x + 10,y,radius - 10, rings - 1);	
	    fractal(x - 10,y,radius - 10, rings - 1);		
	}
}