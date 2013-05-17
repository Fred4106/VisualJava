package visual.windows;
import processing.core.PApplet;


public class ViewProgram extends PApplet {
	
	//CONSTANTS
	final int XSIZE = 400;
	final int YSIZE = 400;
	final String WINDOWNAME = "Program View";
	
	final int[] BGCOLOR = new int[] {120, 120, 120};
	final int[] GRIDCOLOR = new int[] {0, 0, 0};
	
	public ViewProgram() {
		this.runSketch();
	}
	
	public void setup() {
		frame.setTitle(WINDOWNAME);
		size(XSIZE, YSIZE);
		background(BGCOLOR[0], BGCOLOR[1], BGCOLOR[2]);
	}
	
	public void draw() {
		noStroke();
		for(int a = 0; a <= XSIZE; a+=20) {
			for(int b = 0; b <= YSIZE; b+=20) {
				fill(GRIDCOLOR[0], GRIDCOLOR[1], GRIDCOLOR[2]);
				ellipse(a, b, 2, 2);
			}
		}
	}
	
}
