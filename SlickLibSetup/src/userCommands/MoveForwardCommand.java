package userCommands;

import sprite.Sprite;
import commands.Command;
import commands.CommandUtils;
import exec.DisplayManager;


/** make the sprite move forward, one unit in the direction it is facing
 *
 */
public class MoveForwardCommand extends Command{
	private Sprite robot;
	public MoveForwardCommand (Sprite input){
		robot=input;
	}		
	@Override
	protected boolean execute() {
	
	int direction=robot.getDirection();
			
		switch (direction) {
		case 0:
			robot.setX(robot.getX()+1);;
			break;
		case 3:
			robot.setY(robot.getY()-1);;
			break;
		case 2:
			robot.setX(robot.getX()-1);;
			break;
		case 1:
			robot.setY(robot.getY()+1);
			break;
		}
		
//		if (robot.isFacingWall()==false)
//			new MoveForwardCommand (robot).exec();
//		else if (robot.isFacingWall()==true)
//			new TurnRightCommand (robot).exec();
	
		
		
		// TODO Auto-generated method stub
		return !robot.isFacingWall();
	
	}

}
