package userProgram;

import commands.Command;
import layout.IOLayout;
import programming.Program;
import userCommands.MoveForwardCommand;

public class UserProgram extends Program{
	public UserProgram(IOLayout io) {
		super(io);
	}

	@Override
	public Command provideCommand() {
		return new MoveForwardCommand(io.robot);
	}
	
}
