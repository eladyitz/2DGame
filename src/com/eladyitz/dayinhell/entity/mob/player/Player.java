package com.eladyitz.dayinhell.entity.mob.player;

import com.eladyitz.dayinhell.entity.mob.Mob;
import com.eladyitz.dayinhell.graphics.Screen;
import com.eladyitz.dayinhell.graphics.Sprite;
import com.eladyitz.dayinhell.input.KeyBoard;

public class Player extends Mob {

	private KeyBoard input;
	private Sprite sprite;
	private int anim = 0;
	private boolean walking = false;
	
	public Player(KeyBoard input) {	
		this.input = input;
		this.sprite = Sprite.playerUp;
	}
	
	public Player(int x, int y, KeyBoard input) {
		this.x = x;
		this.y = y;
		this.input = input;
		this.sprite = Sprite.playerUp;
	}
	
	public void update() {
		int xa = 0, ya = 0;
		if(anim < 7500) anim++;
		else anim = 0;
		if (input.up) ya--;
		if (input.down) ya++;
		if (input.left) xa--;
		if (input.right) xa++;
		
		if (xa != 0 || ya != 0) {
			move(xa, ya);
			walking = true;
		} else {
			walking = false;
		}
		
	}
	
	public void render(Screen screen) {
		if (dir == 0) {
			this.sprite = Sprite.playerUp;
			if (walking) {
				if (anim % 20 > 10) {
					this.sprite = Sprite.playerUp_1;
				} else {
					this.sprite = Sprite.playerUp_2;
				}
			}
		}
		
		if (dir == 1) {
			this.sprite = Sprite.playerRight;
			if (walking) {
				if (anim % 20 > 10) {
					this.sprite = Sprite.playerRight_1;
				} else {
					this.sprite = Sprite.playerRight_2;
				}
			}
		}
		
		if (dir == 2) {
			this.sprite = Sprite.playerDown;
			if (walking) {
				if (anim % 20 > 10) {
					this.sprite = Sprite.playerDown_1;
				} else {
					this.sprite = Sprite.playerDown_2;
				}
			}
		}
		
		if (dir == 3) {
			this.sprite = Sprite.playerLeft;
			if (walking) {
				if (anim % 20 > 10) {
					this.sprite = Sprite.playerLeft_1;
				} else {
					this.sprite = Sprite.playerLeft_2;
				}
			}
		}
		
		screen.renderPlayer(x - 16, y - 16, sprite);
	}
}
