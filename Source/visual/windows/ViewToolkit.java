package visual.windows;

import processing.core.PApplet;

public class ViewToolkit extends PApplet{
	
	//CONSTANTS
	final int XSIZE = 200;
	final int YSIZE = 700;
	final String WINDOWNAME = "Toolkit View";
	
	public ViewToolkit() {
		this.runSketch();
	}
	
	public void setup() {
		frame.setTitle(WINDOWNAME);
		size(XSIZE, YSIZE);
		background(200, 200, 0);
	}
	
	public void draw() {
		
	}
	
}
