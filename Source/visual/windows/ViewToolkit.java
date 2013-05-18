package visual.windows;

import processing.core.PApplet;
import visual.gui.RadioButtonToggle;
import visual.icons.IconAbstract;
import visual.icons.IconIfElse;

public class ViewToolkit extends PApplet{
	
	//CONSTANTS
	final int XSIZE = 200;
	final int YSIZE = 700;
	final String WINDOWNAME = "Toolkit View";
	
	final int[] BGCOLOR = new int[] {120, 120, 120};
	final int[] LINECOLOR = new int[] {0, 0, 0};

	RadioButtonToggle b = new RadioButtonToggle(0, 0, 48, 98, "IFELSE", "If/Else", new IconIfElse());
	
	
	
	public ViewToolkit() {
		this.runSketch();
	}
	
	public void setup() {
		frame.setTitle(WINDOWNAME);
		size(XSIZE, YSIZE);
		background(BGCOLOR[0], BGCOLOR[1], BGCOLOR[2]);
		
	}
	
	public void draw() {
		noStroke();
		rectMode(PApplet.CORNER);
		pushMatrix();
		background(BGCOLOR[0], BGCOLOR[1], BGCOLOR[2]);
		fill(LINECOLOR[0], LINECOLOR[1], LINECOLOR[2]);
		for(int a = 50; a < XSIZE; a+=50) {
			rect(a-2, 0, 4, YSIZE);
		}
		for(int b = 100; b < YSIZE; b+=100) {
			rect(0, b-2, XSIZE, 4);
		}
		popMatrix();
		b.draw(this);
	}
	
}
