package userCommands;

import commands.Command;
import sprite.Sprite;

public class TurnRightCommand extends Command {

	Sprite sprite;

	public TurnRightCommand(Sprite sprite) {
		this.sprite = sprite;
	}

	@Override
	protected boolean execute() {

		for (int i = 0; i <= 3; i++) {
			sprite.turnLeft();
		}
		return true;
	}

}
