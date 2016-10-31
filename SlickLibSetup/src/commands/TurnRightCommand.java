package commands;

import sprite.Sprite;

public class TurnRightCommand extends Command{
	Sprite sprite;
	public TurnRightCommand(Sprite sprite){
		this.sprite=sprite;
	}
	@Override
	protected boolean execute() {
		sprite.turnRight();
		return true;
	}
	
}
