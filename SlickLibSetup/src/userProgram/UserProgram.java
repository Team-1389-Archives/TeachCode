package userProgram;

import commands.Command;
import commands.CommandUtils;
import commands.MonitorPositionCommand;
import commands.MoveRightCommand;
import commands.WaitTimeCommand;
import exec.DisplayManager;
import layout.IOHardware;
import programming.Program;

public class UserProgram extends Program{

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
				new WaitTimeCommand(1000)),new MonitorPositionCommand(io.robot));
	}
	
	
	
	//DONT TOUCH THIS
	public void initHardware(){
		Program.io=new IOHardware();
	}
	public static void main(String[] args){
		Program.setProgram(new UserProgram());
		DisplayManager.openDisplay();
	}

}
