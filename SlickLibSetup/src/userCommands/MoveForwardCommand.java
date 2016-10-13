package userCommands;

import commands.Command;
import sprite.Sprite;

/** make the sprite move forward, one unit in the direction it is facing
 *
 */
public class MoveForwardCommand extends Command{
	Sprite sprite;
	int spriteDirection;
	public MoveForwardCommand(Sprite controlledSprite){
		this.sprite = controlledSprite;
	}
	

	@Override
	protected boolean execute() {
	spriteDirection =sprite.getDirection();
	if (spriteDirection == 0){//if facing up, move up
		sprite.setY(sprite.getY()+1);
	}
	else if (spriteDirection == 1){//if facing left, move left
		sprite.setX(sprite.getX()-1);
	}
	else if (spriteDirection == 2){//
		
	
		
		return false;
	}

}
