package userProgram;

import commands.Command;
import commands.CommandUtils;
import commands.DoNothingCommand;
import commands.FindWallCommand;
import commands.TurnRightCommand;
import commands.WaitTimeCommand;
import exec.DisplayManager;
import layout.IOHardware;
import programming.Program;

public class UserProgram extends Program {

	@Override
	public Command provideCommand() {
		return new DoNothingCommand();
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
