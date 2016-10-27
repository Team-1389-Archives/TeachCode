package userCommands;

import commands.Command;

import sprite.Sprite;

/** make the sprite move forward, one unit in the direction it is facing
 *
 */
public class MoveForwardCommand extends Command{
	Sprite sprite;
	public MoveForwardCommand(Sprite sprite){
		this.sprite=sprite;
	}
	@Override
	protected boolean execute() {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
				int getDirection = sprite.getDirection();
				if(sprite.getDirection() == 0){
					sprite.setX(sprite.getX()+1);
				}
				if(sprite.getDirection() == 2){
					sprite.setX(sprite.getX()-1);
				}
				if(sprite.getDirection() == 1){
					sprite.setY(sprite.getY()+1);
				}
				if(sprite.getDirection() == 3){
					sprite.setY(sprite.getY()-1);
				}
				
				return sprite.isFacingWall();

		}

}
