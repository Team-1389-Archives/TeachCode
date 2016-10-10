package sprite;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

import commands.CommandMap;
import exec.Main;

public class Sprite {
	int width;
	int height;
	int x;
	int y;
	int direction;
	Image icon;
	//CONSTRUCTORS
	public Sprite(String iconPath,int x,int y,int direction,int width,int height){
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
	public void turnRight(){
		//icon.rotate(90);
		direction--;
		direction%=4;
	}
	public void moveForward(){
		switch(direction){
		case 0:if(x<Main.gridWidth-1)x++;
		break;
		case 3:if(y<Main.gridHeight-1)y++;
		break;
		case 2:if(x>0)x--;
		break;
		case 1:if(y>0)y--;
		break;
		}
	}
	public void moveBackward(){
		switch(direction){
		case 2:if(x<Main.gridWidth-1)x++;
		break;
		case 1:if(y<Main.gridHeight-1)y++;
		break;
		case 0:if(x>0)x--;
		break;
		case 3:if(y>0)y--;
		break;
		}
	}
	public void runCommand(int command){
		switch(command){
		case CommandMap.MOVEFORWARD:moveForward();
		break;
		case CommandMap.MOVEBACKWARD:moveBackward();
		break;
		case CommandMap.TURNLEFT:turnLeft();
		break;
		case CommandMap.TURNRIGHT:turnRight();
		break;
		default:System.out.println("cannot execute command at this level");
		}
	}
	public void render(Graphics g){
		icon.draw(x*Main.gridSpacing-width/2,y*Main.gridSpacing-height/2,width,height);
	}
}
