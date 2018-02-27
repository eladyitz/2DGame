package com.eladyitz.dayinhell.entity;

import java.util.Random;

import com.eladyitz.dayinhell.graphics.Screen;
import com.eladyitz.dayinhell.level.Level;

public class Entity {
	
	public int x, y;
	private boolean removed = false;
	protected Level level;
	protected final Random random = new Random();
	
	public void update() {
		
	}
	
	public void render(Screen screen) {	
	}
	
	public void remove() {
		// Remove from Level
		removed = true;
	}
	
	public boolean isRemoved() {
		return removed;
	}
}
