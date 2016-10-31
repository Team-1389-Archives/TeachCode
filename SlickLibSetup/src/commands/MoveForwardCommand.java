package commands;

import sprite.Sprite;

public class MoveForwardCommand extends Command{
	Sprite sprite;
	public MoveForwardCommand(Sprite sprite){
		this.sprite=sprite;
	}
	@Override
	protected boolean execute() {
		switch (sprite.getDirection()) {
		case 0:
			sprite.setX(sprite.getX()+1);
			break;
		case 3:
			sprite.setY(sprite.getY()+1);
			break;
		case 2:
			sprite.setX(sprite.getX()-1);
			break;
		case 1:
			sprite.setY(sprite.getY()-1);
			break;
		}		
		return true;
	}

}
