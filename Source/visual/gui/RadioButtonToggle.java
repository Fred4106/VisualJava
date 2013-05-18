package visual.gui;

import processing.core.PApplet;
import visual.icons.IconAbstract;
import visual.icons.IconError;

public class RadioButtonToggle {
	private boolean isDepressed = false;
	private IconAbstract icon = new IconError();
	private int xLoc = 0;
	private int yLoc = 0;
	private int xSize = 0;
	private int ySize = 0;
	
	private String buttonName = "ERROR";
	private String buttonDisplay = "ERROR";
	
	private int[] colors = new int[]{125, 125, 255};
	
	public RadioButtonToggle(int x, int y, int xS, int yS, String bn, String bd, IconAbstract i) {
		this.xLoc = x;
		this.yLoc = y;
		this.xSize = xS;
		this.ySize = yS;
		this.buttonName = bn;
		this.buttonDisplay = bd;
		this.icon = i;
	}
	
	public void draw(PApplet p) {
		p.pushMatrix();
		p.rectMode(PApplet.CORNER);
		p.noStroke();
		p.fill(colors[0], colors[1], colors[2]);
		p.rect(xLoc, yLoc, xSize, ySize);
		p.translate(xLoc+(xSize/2), yLoc+(ySize/2));
		p.textAlign(PApplet.CENTER, PApplet.CENTER);
		p.fill(0);
		p.text(buttonDisplay, 0, 0);  // STEP 6 Display Text
		p.popMatrix();
		icon.draw(xLoc+(xSize/2), yLoc+(xSize/2), xSize/3, xSize/3, p);
	}
	
	public boolean isOverBtn(int x, int y) {
		if(x > xLoc && x < xLoc + xSize) {
			if(y > yLoc && y < yLoc + ySize) {
				return true;
			}
		}
		return false;
	}
	
	//getters and setters
	public void toggleButton() {
		if(isDepressed) {
			isDepressed = false;
			return;
		} else {
			isDepressed = true;
		}
	}
	
	public boolean isDepressed() {
		return this.isDepressed;
	}
	
	public int getXLoc() {
		return this.xLoc;
	}
	
	public int getYLoc() {
		return this.yLoc;
	}
	
	public int getXSize() {
		return this.xSize;
	}
	
	public int getYSize() {
		return this.ySize;
	}
	
	public void setXLoc(int x) {
		this.xLoc = x;
	}
	
	public void setYLoc(int y) {
		this.yLoc = y;
	}
	
	public void setXSize(int x) {
		this.xSize = x;
	}
	
	public void setYSize(int y) {
		this.ySize = y;
	}
}
