package visual.icons;

import processing.core.PApplet;

public class StringToDisplayEngine {
	public static void drawXmlData(PApplet p, String[][] s) {
		p.pushMatrix();
		for(int a = 0; a < s.length; a++ ) {
			
		}
		p.popMatrix();
	}
	
	private static void executeCommand(PApplet p, String s[]) {
		if(s[0].equals("Fill")) {
			Integer c1 = new Integer(s[1]);
			Integer c2 = new Integer(s[2]);
			Integer c3 = new Integer(s[3]);
			p.fill(c1, c2, c3);
		} else if(s[0].equals("Translate")) {
			Integer c1 = new Integer(s[1]);
			Integer c2 = new Integer(s[2]);
			p.translate(c1, c2);
		} else if(s[0].equals("Rect")) {
			Integer c1 = new Integer(s[1]);
			Integer c2 = new Integer(s[2]);
			Integer c3 = new Integer(s[3]);
			Integer c4 = new Integer(s[4]);
			p.rect(c1, c2, c3, c4);
		} else if(s[0].equals("Ellipse")) {
			p.ellipse(0, 0, new Integer(s[1]), new Integer(s[2]));
			
		} else if(s[0].equals("RectMode")) {
			if(s[1].equals("Center")) {
				p.rectMode(PApplet.CENTER);
			} else {
				p.rectMode(PApplet.CORNER);
			}
		} else if(s[0].equals("Rotate")) {
			p.rotate(PApplet.radians(new Integer(s[1])));
		} else if(s[0].equals("Stroke")) {
			Integer c1 = new Integer(s[1]);
			Integer c2 = new Integer(s[2]);
			Integer c3 = new Integer(s[3]);
			p.stroke(c1, c2, c3);
		} else if(s[0].equals("StrokeWeight")) {
			p.strokeWeight(new Integer(s[1]));
		}
	}
}
