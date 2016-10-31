package commands;

import sprite.Sprite;

public class MonitorDirectionCommand extends Command{
	Sprite sprite;
	@Override
	public boolean execute() {
		System.out.println("direction: "+sprite.getDirection());
		return false;
	}
	public MonitorDirectionCommand(Sprite sprite){
		this.sprite=sprite;
	}
}
