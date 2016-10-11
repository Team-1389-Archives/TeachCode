package commands;

import sprite.Sprite;

public class MoveLeftCommand extends Command{
	private Sprite controlledSprite;
	public MoveLeftCommand(Sprite controlledSprite){
		this.controlledSprite=controlledSprite;
	}
	@Override
	public boolean execute() {
		controlledSprite.setX(controlledSprite.getX()-1);
		return true;
	}
	
}
