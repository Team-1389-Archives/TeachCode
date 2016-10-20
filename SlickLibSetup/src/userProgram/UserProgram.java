package userProgram;

import layout.IOLayout;
import programming.Program;
import userCommands.MoveForwardCommand;
import userCommands.TurnRightCommand;

import commands.Command;
import commands.CommandUtils;

public class UserProgram extends Program{
	public UserProgram(IOLayout io) 
	{
		super(io);
	}
public static int name = 0;
	@Override
	public Command provideCommand() {
		Command C=CommandUtils.combineSequential(new MoveForwardCommand(io.robot), new TurnRightCommand(io.robot));
				
				
				return CommandUtils.combineSequential(C,C,C,C);
				
	
			

		
//		if ((isNearWall=true)&&(isFacingWall=true)
//				new WaitTimeCommand(1000);
//				new TurnLeftCommand (io.robot);
//		if ((isNearWall=true)&&(isFacingWall=false)
//				new WaitTimeCommand(1000);
//				new MoveFowardCommand (io.robot);
				
				
	}

}
