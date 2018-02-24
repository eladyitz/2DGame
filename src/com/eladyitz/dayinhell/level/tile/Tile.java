package com.eladyitz.dayinhell.level.tile;

import com.eladyitz.dayinhell.graphics.Screen;
import com.eladyitz.dayinhell.graphics.Sprite;

public class Tile {
	
	public int x, y;
	public Sprite sprite;
	
	public static Tile grass = new GrassTile(Sprite.grass);
	
	public Tile(Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
	}
	
	public boolean solid() {
		return false;
	}
	
}
