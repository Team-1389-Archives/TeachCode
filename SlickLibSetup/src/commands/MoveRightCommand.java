package commands;

import sprite.Sprite;

public class MoveRightCommand extends Command{
	private Sprite controlledSprite;
	public MoveRightCommand(Sprite controlledSprite){
		this.controlledSprite=controlledSprite;
	}
	@Override
	public boolean execute() {
		controlledSprite.setX(controlledSprite.getX()+1);
		return true;
	}
	
}
