package userCommands;

import sprite.Sprite;
import commands.Command;

/** make the sprite move to the left from where it is
 *
 */
public class MoveLeftCommand extends Command{
private Sprite robot;
public MoveLeftCommand (Sprite input){
	robot=input;
}
	@Override
	protected boolean execute() {
		robot.setX(robot.getX()-1);
		// TODO Auto-generated method stub
		return true;
	}

}
