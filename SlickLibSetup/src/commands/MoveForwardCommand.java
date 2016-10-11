package commands;

import sprite.Sprite;

public class MoveForwardCommand extends Command{
	private Sprite controlledSprite;
	public MoveForwardCommand(Sprite controlledSprite){
		this.controlledSprite=controlledSprite;
	}
	@Override
	public boolean execute() {
		controlledSprite.moveForward();
		return true;
	}
	
}
