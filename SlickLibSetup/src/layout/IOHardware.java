package layout;

import org.newdawn.slick.Input;

import sprite.Sprite;

public class IOHardware extends IOLayout{
	public IOHardware(){
		robot=new Sprite("res/Robot.png");
		input=new Input(0);
	}
}
