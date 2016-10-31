package commands;

import sprite.GridSprite;
import sprite.Sprite;

public class FindWallCommand extends Command{
	GridSprite sprite;
	public FindWallCommand(GridSprite sprite){
		this.sprite=sprite;
	}
	@Override
	protected boolean execute() {
		CommandUtils.executeCommand(new MoveForwardCommand(sprite));
		System.out.println(sprite.isFacingWall());
		return sprite.isFacingWall();
	}

}
