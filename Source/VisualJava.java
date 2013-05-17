import processing.core.PApplet;


public class VisualJava{
	final String[] args = new String[] {"Hello world"};
	
	UserInterface p;
	UserInterface p1;
	
	public VisualJava() {
		p = new UserInterface(400, 400, "Sketch View"); //Main view for the sketch
		p.background(0, 0, 155);
		p1 = new UserInterface(200, 700, "ToolKit"); //Main view for the sketch
		p1.background(255, 0, 155);
	}
	
	public static void main(String[] args) throws InterruptedException {
		new VisualJava();
	}
}
