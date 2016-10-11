package userProgram;

import commands.Command;
import commands.CommandUtils;
import commands.MoveRightCommand;
import commands.WaitTimeCommand;
import layout.IOLayout;
import programming.Program;
import userCommands.ControlSpriteCommand;

public class UserProgram extends Program{
	public UserProgram(IOLayout io) {
		super(io);
	}

	@Override
	public Command provideCommand() {
		return CommandUtils.combineSimultaneous(CommandUtils.combineSequential(
				new WaitTimeCommand(1000),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(1000),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(1000),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(1000),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(1000)),new ControlSpriteCommand(io.input,io.robot));
	}

}
