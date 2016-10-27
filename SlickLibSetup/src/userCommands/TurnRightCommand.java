package userCommands;

import commands.Command;

import sprite.Sprite;

/** make the sprite turn right
 *
 */
public class TurnRightCommand extends Command{
	Sprite sprite;
	public TurnRightCommand(Sprite sprite){
		this.sprite=sprite;
	}
	@Override
	protected boolean execute() {
		// TODO Auto-generated method stub
		sprite.turnRight();
		return false;
	}

}
