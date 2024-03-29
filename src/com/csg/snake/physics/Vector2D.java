package com.csg.snake.physics;

/**
 * The two-dimensional representation of a point in space or a direction
 * @author Nick
 */
public class Vector2D {

	private float x, y;

	public Vector2D(float x, float y) {
		this.x = x;
		this.y = y;
	}

	public Vector2D(Direction direction) {
		switch(direction) {
		case UP:
			x = 0;
			y = -1;
			break;
		case DOWN:
			x = 0;
			y = 1;
			break;
		case LEFT:
			x = -1;
			y = 0;
			break;
		case RIGHT:
			x = 1;
			y = 0;
			break;
		}
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int setX(int x) {
		this.x = x;
		return x;
	}

	public int setY(int y) {
		this.y = y;
		return y;
	}
	
	public boolean equals(Vector2D other) {
		return this.x == other.x && this.y == other.y;
	}

}