package commands;

import sprite.GridSprite;

public class MoveForwardCommand extends Command{
	GridSprite sprite;
	public MoveForwardCommand(GridSprite sprite){
		this.sprite=sprite;
	}
	@Override
	protected boolean execute() {
		switch (sprite.getDirection()) {
		case 0:
			sprite.setX(sprite.getGridX()+1);
			break;
		case 3:
			sprite.setY(sprite.getGridY()+1);
			break;
		case 2:
			sprite.setX(sprite.getGridX()-1);
			break;
		case 1:
			sprite.setY(sprite.getGridY()-1);
			break;
		}		
		return true;
	}

}
