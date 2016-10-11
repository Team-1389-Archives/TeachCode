package userProgram;

import commands.Command;
import commands.CommandUtils;
import commands.MonitorPositionCommand;
import commands.MoveRightCommand;
import commands.TurnLeftCommand;
import commands.WaitTimeCommand;
import layout.IOLayout;
import programming.Program;
import commands.MoveLeftCommand;

public class UserProgram extends Program{
	public UserProgram(IOLayout io) {
		super(io);
	}

	@Override
	public Command provideCommand() {
		return CommandUtils.combineSimultaneous(CommandUtils.combineSequential(
				new WaitTimeCommand(10),
				new TurnLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new TurnLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new TurnLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new TurnLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new TurnLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new TurnLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new TurnLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new MoveLeftCommand(io.robot),
				new MoveLeftCommand(io.robot),
				new WaitTimeCommand(10),
				new WaitTimeCommand(10),
				new WaitTimeCommand(10),new WaitTimeCommand(10),new WaitTimeCommand(10),new WaitTimeCommand(10),
				new MoveLeftCommand(io.robot),
				new MoveLeftCommand(io.robot),
				new MoveRightCommand(io.robot),
				new WaitTimeCommand(1000)),new MonitorPositionCommand(io.robot));
	}

}
