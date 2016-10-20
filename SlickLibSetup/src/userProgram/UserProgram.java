package userProgram;

import layout.IOLayout;
import programming.Program;
import userCommands.MoveForwardCommand;
import userCommands.TurnRightCommand;
import commands.Command;
import commands.CommandUtils;
import commands.MoveRightCommand;
import commands.TurnLeftCommand;
import commands.WaitTimeCommand;

public class UserProgram extends Program{
	public UserProgram(IOLayout io) 
	{
		super(io);
	}
public static int name = 0;
	@Override
	public Command provideCommand() {
//		Command C=CommandUtils.combineSequential(new MoveForwardCommand(io.robot), new TurnRightCommand(io.robot));
//				return CommandUtils.combineSequential(C,C,C,C);
		
			Command M=CommandUtils.combineSequential(new MoveForwardCommand (io.robot),
			new WaitTimeCommand (1000),
			new TurnRightCommand (io.robot),
			new WaitTimeCommand (1000),
			new MoveForwardCommand (io.robot),
			new WaitTimeCommand (1000),
			new TurnRightCommand (io.robot),
			new WaitTimeCommand (1000),
			new MoveForwardCommand (io.robot),
			new WaitTimeCommand (1000),
			new TurnLeftCommand (io.robot),
			new MoveForwardCommand (io.robot),
			new WaitTimeCommand (1000),
			new TurnRightCommand (io.robot));
			
			return CommandUtils.combineSequential (M,M,M,M);
	
			

		
//		if ((isNearWall=true)&&(isFacingWall=true)
//				new WaitTimeCommand(1000);
//				new TurnLeftCommand (io.robot);
//		if ((isNearWall=true)&&(isFacingWall=false)
//				new WaitTimeCommand(1000);
//				new MoveFowardCommand (io.robot);
				
				
	}

}
