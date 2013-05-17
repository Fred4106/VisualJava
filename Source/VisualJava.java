import processing.core.PApplet;
import visual.windows.ViewProgram;
import visual.windows.ViewToolkit;


public class VisualJava{
	
	ViewToolkit toolkit;
	ViewProgram programView;
	
	public VisualJava() {
		toolkit = new ViewToolkit(); //Toolkit view for the sketch
		//programView = new ViewProgram(); //Main view for the sketch
	}
	
	public static void main(String[] args) throws InterruptedException {
		new VisualJava();
	}
}
