package com.eladyitz.dayinhell.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int[] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(16, 0 ,0, SpriteSheet.tiles);
	public static Sprite flower = new Sprite(16, 1 ,0, SpriteSheet.tiles);
	public static Sprite rock = new Sprite(16, 2 ,0, SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 0x1B87E0);
		
	public static Sprite playerDown = new Sprite(32, 0, 4, SpriteSheet.tiles);
	public static Sprite playerLeft = new Sprite(32, 0, 5, SpriteSheet.tiles);
	public static Sprite playerRight = new Sprite(32, 0, 6, SpriteSheet.tiles);
	public static Sprite playerUp = new Sprite(32, 0, 7, SpriteSheet.tiles);
	
	public static Sprite playerDown_1 = new Sprite(32, 1, 4, SpriteSheet.tiles);
	public static Sprite playerLeft_1 = new Sprite(32, 1, 5, SpriteSheet.tiles);
	public static Sprite playerRight_1 = new Sprite(32, 1, 6, SpriteSheet.tiles);
	public static Sprite playerUp_1 = new Sprite(32, 1, 7, SpriteSheet.tiles);
	
	public static Sprite playerDown_2 = new Sprite(32, 2, 4, SpriteSheet.tiles);
	public static Sprite playerLeft_2 = new Sprite(32, 2, 5, SpriteSheet.tiles);
	public static Sprite playerRight_2 = new Sprite(32, 2, 6, SpriteSheet.tiles);
	public static Sprite playerUp_2 = new Sprite(32, 2, 7, SpriteSheet.tiles);
	
	public Sprite(int size, int x, int y, SpriteSheet sheet) {
		this.SIZE = size;
		this.x = x * SIZE;
		this.y = y * SIZE;
		this.sheet = sheet;
		pixels = new int [SIZE * SIZE];
		load();
	}
	
	public Sprite(int size, int colour) {
		this.SIZE = size;
		pixels = new int [SIZE * SIZE];
		setColour(colour);
	}
	
	private void setColour(int colour) {
		for (int i = 0; i < SIZE*SIZE; i++) {
			pixels[i] = colour;
		}
		
	}

	public void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels[x + y * SIZE] = sheet.pixels[(x + this.x) + (y + this.y) * sheet.SIZE];
			}
		}
	}
}
