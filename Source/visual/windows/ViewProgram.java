package visual.windows;
import processing.core.PApplet;


public class ViewProgram extends PApplet {
	
	//CONSTANTS
	final int XSIZE = 400;
	final int YSIZE = 400;
	final String WINDOWNAME = "Program View";
	
	
	
	
	public ViewProgram() {
		this.runSketch();
	}
	
	public void setup() {
		frame.setTitle(WINDOWNAME);
		size(XSIZE, YSIZE);
		background(120, 120, 120);
	}
	
	public void draw() {
		noStroke();
		for(int a = 0; a <= XSIZE; a+=20) {
			for(int b = 0; b <= YSIZE; b+=20) {
				fill(0);
				ellipse(a, b, 2, 2);
			}
		}
	}
	
}
