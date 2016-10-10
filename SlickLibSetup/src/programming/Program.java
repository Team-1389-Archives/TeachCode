package programming;
import java.util.ArrayList;

import commands.Command;

public abstract class Program {
	protected ArrayList<Command> program;
	public abstract void run();
	public ArrayList<Command> getProgram(){
		run();
		return program;
	}
	public Program(){
		program=new ArrayList<Command>();
	}

}
