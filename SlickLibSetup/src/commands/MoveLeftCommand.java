package commands;

import commands.Command;
import sprite.Sprite;
/** make the sprite move to the left from where it is
 *
 */
public class MoveLeftCommand extends Command{
	private Sprite controlledSprite;
	public MoveLeftCommand(Sprite controlledSprite){
		this.controlledSprite=controlledSprite;
	}

	@Override
	protected boolean execute() {
		this.controlledSprite.setX(this.controlledSprite.getX()-1);
		return true;
	}

}
