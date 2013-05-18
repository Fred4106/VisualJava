package visual.icons;

import processing.core.PApplet;
import processing.core.PConstants;

public class IconIfElse extends IconAbstract {
	public void draw(int xLoc, int yLoc, int xSize, int ySize, PApplet p) {
		p.pushMatrix();
		p.translate(xLoc, yLoc);
		p.rectMode(PConstants.CENTER);
		p.rotate(PApplet.radians(45));
		p.fill(250, 200, 30);
		p.stroke(0);
		p.strokeWeight(1);
		p.rect(0, 0, xSize, ySize);
		p.popMatrix();
	}
}
