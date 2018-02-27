package com.eladyitz.dayinhell.level;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpawnLevel extends Level {
	
	public SpawnLevel(String path) {
		super(path);
	}
	
	protected void loadLevel(String path) {
		try {
			BufferedImage image = ImageIO.read(SpawnLevel.class.getResource(path)); 
			this.width = image.getWidth();
			this.height = image.getHeight();
			tiles = new int[width * height];
			image.getRGB(0, 0, width, height, tiles, 0, width);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Exception! Xould not load level File!");
		}
	}
	
	// Grass = 0xff00FF00, Flower = 0xffFFFF00, Rock = 0xff7F7F00
	protected void generateLevel() {
	}
	
	
}
