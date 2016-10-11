package programming;

import commands.Command;
import commands.CommandUtils;
import commands.MonitorDirectionCommand;
import commands.MoveForwardCommand;
import commands.WaitTimeCommand;
import layout.IOLayout;

public class UserProgram extends Program{
	public UserProgram(IOLayout io) {
		super(io);
	}

	@Override
	public Command provideCommand() {
		return CommandUtils.combineSimultaneous(CommandUtils.combineSequential(
				new MoveForwardCommand(io.robot),
				new WaitTimeCommand(1000),
				new MoveForwardCommand(io.robot),
				new WaitTimeCommand(1000),
				new MoveForwardCommand(io.robot),
				new WaitTimeCommand(1000),
				new MoveForwardCommand(io.robot),
				new WaitTimeCommand(1000)),new MonitorDirectionCommand(io.robot));
	}

}
