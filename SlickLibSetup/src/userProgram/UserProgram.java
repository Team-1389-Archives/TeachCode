package userProgram;

import commands.Command;
import commands.CommandUtils;
import commands.MonitorPositionCommand;
import commands.MoveDownCommand;
import commands.WaitTimeCommand;
import layout.IOLayout;
import programming.Program;

public class UserProgram extends Program{
	public UserProgram(IOLayout io) {
		super(io);
	}

	@Override
	public Command provideCommand() {
		return CommandUtils.combineSimultaneous(CommandUtils.combineSequential(//not amount, 
			new WaitTimeCommand(1000),
			new 
			
				new WaitTimeCommand(1000)),new MonitorPositionCommand(io.robot));
	}

}
