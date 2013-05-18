import processing.core.PApplet;
import processing.core.PFont;
import visual.windows.ViewProgram;
import visual.windows.ViewToolkit;


public class VisualJava{
	
	public ViewToolkit toolkit;
	public ViewProgram programView;
	public PFont font;
	
	public VisualJava() {
		toolkit = new ViewToolkit(); //Toolkit view for the sketch
		//programView = new ViewProgram(); //Main view for the sketch
		
		font = toolkit.createFont("Arial", 12);
	}
	
	public static void main(String[] args) throws InterruptedException {
		new VisualJava();
	}
}
