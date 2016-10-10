package programming;

import commands.*;

public abstract class UserProgramHandler extends Program{
	public void moveForward(char sprite){
		program.add(new Command(sprite,CommandMap.MOVEFORWARD));
	}
	public void moveBackward(char sprite){
		program.add(new Command(sprite,CommandMap.MOVEBACKWARD));
	}
	public void turnLeft(char sprite){
		program.add(new Command(sprite,CommandMap.TURNLEFT));
	}
	public void turnRight(char sprite){
		program.add(new Command(sprite,CommandMap.TURNRIGHT));
	}
}
