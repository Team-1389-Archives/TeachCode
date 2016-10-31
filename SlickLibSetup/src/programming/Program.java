package programming;

import commands.Command;
import layout.IOLayout;

public abstract class Program {
	public Command getCommand(){
		initHardware();
		return provideCommand();
	}
	protected abstract Command provideCommand();
	protected abstract void initHardware();

	public static IOLayout io;
	public static Program program;
	public static Program getProgram(){
		return program;
	}
	public static void setProgram(Program program){
		Program.program=program;
	}
}
