package com.eladyitz.dayinhell.graphics;

import java.util.Random;

import com.eladyitz.dayinhell.level.tile.Tile;

public class Screen {
	public int width, height;
	public int pixels[];
	public final int MAP_SIZE = 8;
	public final int MAP_SIZE_MASK = MAP_SIZE - 1;
	public int tiles[] = new int[MAP_SIZE * MAP_SIZE];
	
	private Random randome = new Random();
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
		
		for (int i = 0; i < MAP_SIZE * MAP_SIZE; i++) {
			tiles[i] = randome.nextInt(0xffffff);
			tiles[0] = 0;
		}
	}
	
	public void clear() {
		for (int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render (int xoffset, int yoffset) {
		for (int y = 0; y < height; y++) {
			int yp = y + yoffset;
			if (yp < 0 || yp >= height) continue;
			for (int x = 0; x < width; x++) {
				int xp = x + xoffset;
				if (xp < 0 || xp >= width) continue;
				pixels[xp + yp * width] = Sprite.grass.pixels[(x & 15) + (y & 15) * Sprite.grass.SIZE];
			}
		}
	}
	
	public void renderTile(int xp, int yp, Tile tile) {
		for (int y = 0; y < tile.sprite.SIZE; y++) {
			int ya = yp + y;
			for (int x = 0; x < tile.sprite.SIZE; x++) {
				int xa = xp + x;
				if (xa < 0 || xa >= width || ya < 0 || ya >= height) break;
				pixels[xa + ya * width] = tile.sprite.pixels[x + y * tile.sprite.SIZE];
			}
		}
	}
	
	
}
