package commands;

import sprite.GridSprite;
import sprite.Sprite;

public class MonitorPositionCommand extends Command{
	GridSprite sprite;
	@Override
	public boolean execute() {
		System.out.println("x pos: "+sprite.getGridX());
		return false;
	}
	public MonitorPositionCommand(GridSprite sprite){
		this.sprite=sprite;
	}
}
