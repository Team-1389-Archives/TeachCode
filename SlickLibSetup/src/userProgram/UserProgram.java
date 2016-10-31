package userProgram;

import commands.Command;
import commands.CommandUtils;
import commands.FindWallCommand;
import commands.TurnRightCommand;
import commands.WaitTimeCommand;
import exec.DisplayManager;
import layout.IOHardware;
import programming.Program;

public class UserProgram extends Program {

	@Override
	public Command provideCommand() {
		Command a = CommandUtils.combineSequential(new FindWallCommand(io.robot), new WaitTimeCommand(1000),
				new TurnRightCommand(io.robot), new WaitTimeCommand(1000));
		return CommandUtils.combineSequential(
				new FindWallCommand(io.robot), new WaitTimeCommand(1000),new TurnRightCommand(io.robot), new WaitTimeCommand(1000), 
				new FindWallCommand(io.robot), new WaitTimeCommand(1000),new TurnRightCommand(io.robot), new WaitTimeCommand(1000), 
				new FindWallCommand(io.robot), new WaitTimeCommand(1000),new TurnRightCommand(io.robot), new WaitTimeCommand(1000), 
				new FindWallCommand(io.robot), new WaitTimeCommand(1000),new TurnRightCommand(io.robot), new WaitTimeCommand(1000));
	}

	// DONT TOUCH THIS
	public void initHardware() {
		Program.io = new IOHardware();
	}

	public static void main(String[] args) {
		Program.setProgram(new UserProgram());
		DisplayManager.openDisplay();
	}

}
