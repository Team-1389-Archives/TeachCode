package commands;

import sprite.Sprite;

public class MonitorPositionCommand extends Command{
	Sprite sprite;
	@Override
	public boolean execute() {
		System.out.println("x pos: "+sprite.getX());
		return false;
	}
	public MonitorPositionCommand(Sprite sprite){
		this.sprite=sprite;
	}
}
