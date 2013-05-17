package visual.icons;

import processing.core.PApplet;
import processing.core.PConstants;

public class IconError extends IconAbstract {
	
	public void draw(int xLoc, int yLoc, int xSize, int ySize, PApplet p) {
		p.translate(xLoc, yLoc);
		p.fill(250, 0, 100);
		p.smooth();
		p.stroke(0);
		p.strokeWeight(1);
		p.ellipse(0, 0, xSize, ySize);
	}
	
}
