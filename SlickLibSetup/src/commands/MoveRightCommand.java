package commands;

import sprite.GridSprite;

public class MoveRightCommand extends Command{
	private GridSprite controlledSprite;
	public MoveRightCommand(GridSprite controlledSprite){
		this.controlledSprite=controlledSprite;
	}
	@Override
	public boolean execute() {
		controlledSprite.setX(controlledSprite.getGridX()+1);
		return true;
	}
	
}
