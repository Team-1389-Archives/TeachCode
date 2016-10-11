package commands;

import sprite.Sprite;

public class TurnLeftCommand extends Command{
	Sprite sprite;
	public TurnLeftCommand(Sprite sprite){
		this.sprite=sprite;
	}
	@Override
	protected boolean execute() {
		sprite.turnLeft();
		return true;
	}
	
}
