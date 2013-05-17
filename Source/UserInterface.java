import processing.core.PApplet;


public class UserInterface extends PApplet {
	
	int xSize = 400;
	int ySize = 400;
	String windowName = "Sketch";
	
	public UserInterface() {
		this.runSketch();
	}
	
	public UserInterface(int xS, int yS, String wN) {
		this.xSize = xS;
		this.ySize = yS;
		this.windowName = wN;
		this.runSketch();
	}
	
	public void setup() {
		frame.setTitle(windowName);
		size(xSize, ySize);
	}
	
	public void draw() {
		
	}
	
}
