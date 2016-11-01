package layout;

import sprite.GridSprite;
import sprite.PhysicsSprite;

public class IOHardware extends IOLayout{
	public IOHardware(){
		robot=new GridSprite("res/Robot.png");
		physicsBot=new PhysicsSprite("res/Robot.png");
	}
}
