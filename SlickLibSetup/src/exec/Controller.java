package exec;
import org.newdawn.slick.GameContainer;

import commands.Command;
import programming.Program;

public class Controller {
	Command program;
	Boolean isFinished;
	public Controller() {
		program = Program.getProgram().getCommand();
		isFinished=false;
		if(program==null){
			program=new commands.DoNothingCommand();
		}
	}

	public void update(GameContainer gc, int delta) {
		if(!isFinished){
			isFinished=program.exec();
		}
	}

}
