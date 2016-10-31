package sprite;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import exec.DisplayManager;

public class Sprite {
	private static DisplayManager display;
	int width;
	int height;
	float x;
	float y;
	int direction;
	Image icon;

	// CONSTRUCTORS
	public Sprite(String iconPath, int x, int y, int direction, int width, int height) {
		if (display != null) {
			display.attach(this);
		}
		this.x = x;
		this.y = y;
		this.direction = direction;
		this.width = width;
		this.height = height;
		try {
			this.icon = new Image(iconPath);
			icon.setCenterOfRotation(width / 2, height / 2);
		} catch (SlickException e) {
			e.printStackTrace();
		}

	}

	public Sprite(String icon, int x, int y, int direction) {
		this(icon, x, y, direction, 25, 25);
	}

	public Sprite(String icon, int x, int y) {
		this(icon, x, y, 0);
	}

	public Sprite(String icon) {
		this(icon, 0, 0);
	}

	// ---------
	public void turnLeft() {
		direction++;
		direction %= 4;
		icon.setCenterOfRotation(width / 2, height / 2);
		icon.setRotation(-90 * direction);
	}

	public void turnRight() {
		turnLeft();
		turnLeft();
		turnLeft();
	}

	public float getX() {
		return x;
	}

	public float getY() {
		return y;
	}

	public int getDirection() {
		return direction;
	}



	public void update(GameContainer gc, int delta) {
	}

	public static void setDisplayManager(DisplayManager display) {
		Sprite.display = display;
	}

	public void render(Graphics g) {
		System.out.println("x:"+x+" y:"+y);
		icon.draw(x  - width / 2, y - height / 2, width,
				height);
	}
}
