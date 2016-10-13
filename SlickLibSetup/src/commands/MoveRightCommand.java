package commands;

import commands.Command;
import sprite.Sprite;
/** make the sprite move to the left from where it is
 *
 */
public class MoveRightCommand extends Command{
	private Sprite Sprite;
	public MoveRightCommand(Sprite controlledSprite){
		this.Sprite=controlledSprite;
	}

	@Override
	protected boolean execute() {
		this.Sprite.setX(this.Sprite.getX()+1);
		return true;
	}

}
