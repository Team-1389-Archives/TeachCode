package userProgram;

import commands.Command;
import commands.CommandUtils;
import commands.DoNothingCommand;
import commands.MonitorPositionCommand;
import commands.MoveRightCommand;
import commands.WaitTimeCommand;
import layout.IOLayout;
import programming.Program;
import userCommands.MoveLeftCommand;
import userCommands.MoveUpCommand;

public class UserProgram extends Program{
	public UserProgram(IOLayout io) {
		super(io);
	}

	@Override
	public Command provideCommand() {
		return CommandUtils.combineSimultaneous(CommandUtils.combineSequential(
		
				new WaitTimeCommand(900),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(100),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(900),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(900),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(900),
				new WaitTimeCommand(900),
				new WaitTimeCommand(900),
				new WaitTimeCommand(900),
				new MoveUpCommand(io.robot),
				new MoveLeftCommand(io.robot, 3),
				new WaitTimeCommand(41)),new MonitorPositionCommand(io.robot));
		
	}
	
}
