package com.eladyitz.dayinhell.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(16, 0 ,0, SpriteSheet.tiles);
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		this.SIZE = size;
		this.x = x;
		this.y = y;
		this.sheet = sheet;
		pixels = new int [SIZE * SIZE];
		load();
	}
	
	public void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}
}