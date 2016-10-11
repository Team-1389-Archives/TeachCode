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
	int x;
	int y;
	int direction;
	Image icon;
	//CONSTRUCTORS
	public Sprite(String iconPath,int x,int y,int direction,int width,int height){
		if(display!=null){
			display.attach(this);
		}
		this.x=x+1;
		this.y=y+1;
		this.direction=direction;
		this.width=width;
		this.height=height;
		try {
			this.icon=new Image(iconPath);
			icon.setCenterOfRotation(width/2,height/2);
		} catch (SlickException e) {
			e.printStackTrace();
		}

	}
	public Sprite(String icon,int x,int y,int direction){
		this(icon,x,y,direction,25,25);
	}
	public Sprite(String icon,int x,int y){
		this(icon,x,y,0);
	}
	public Sprite(String icon){
		this(icon,0,0);
	}

	
	//---------
	public void turnLeft(){
		direction++;
		direction%=4;
		icon.setCenterOfRotation(width/2,height/2);
		icon.setRotation(-90*direction);
		System.out.println(direction);
	}
	public int getDirection(){
		return direction;
	}
	public void setX(int x){
		if(x<DisplayManager.gridWidth-1){
			this.x=x;
		}else{
			System.err.println("x input is off the screen");
		}
	}
	public void setY(int y){
		if(y<DisplayManager.gridHeight-1){
			this.y=y;
		}else{
			System.err.println("y input is off the screen");
		}
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public void moveForward(){
		switch(direction){
		case 0:if(x<DisplayManager.gridWidth-1)x++;
		break;
		case 3:if(y<DisplayManager.gridHeight-1)y++;
		break;
		case 2:if(x>0)x--;
		break;
		case 1:if(y>0)y--;
		break;
		}
	}
	public void update(GameContainer gc, int delta){
	}
	public static void setDisplayManager(DisplayManager display){
		Sprite.display=display;
	}
	public void render(Graphics g){
		icon.draw(x*DisplayManager.gridSpacing-width/2,y*DisplayManager.gridSpacing-height/2,width,height);
	}
}
