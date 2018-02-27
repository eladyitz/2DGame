package com.eladyitz.dayinhell.level.tile;

import com.eladyitz.dayinhell.graphics.Screen;
import com.eladyitz.dayinhell.graphics.Sprite;

public class VoidTile extends Tile {

	public VoidTile(Sprite sprite) {
		super(sprite);
	}

	public void render(int x, int y, Screen screen) {
		screen.renderTile(x << 4, y << 4, this);
	}
	
}
