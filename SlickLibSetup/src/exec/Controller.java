package exec;
import org.newdawn.slick.GameContainer;

import commands.Command;
import layout.IOHardware;
import programming.UserProgram;

public class Controller {
	Command program;
	Boolean isFinished;
	public Controller() {
		IOHardware robot=new IOHardware();
		program = new UserProgram(robot).provideCommand();
		isFinished=false;
		if(program==null){
			program=new commands.DoNothingCommand();
		}
	}

	public void update(GameContainer gc, int delta) {
		if(!isFinished){
			isFinished=program.execute();
		}
	}

}
