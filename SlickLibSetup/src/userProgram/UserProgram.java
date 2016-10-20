package userProgram;

import java.util.ArrayList;
import java.util.List;
import sprite.Sprite;
import userCommands.Command1;
import commands.*;
import layout.IOLayout;
import programming.Program;

public class UserProgram extends Program {
	public UserProgram(IOLayout io) {
		super(io);
	}

	
	@Override
	public Command provideCommand() {
		List<Command> listCommands = new ArrayList<Command>(); //compiling a mutiple commands into one thing aka, array
		
		
		
		for (int i = 0; i < 7; i++) { // a for command, first is your intial value, your limit, then your interval
			Command pauseCommand = new WaitTimeCommand(1000);
			Command rightmoveCommand = new MoveRightCommand(io.robot); // setting the command as a varibale to package into arrary
			listCommands.add(rightmoveCommand); // add "right moveCommand" to the list
			listCommands.add(pauseCommand);//see above

		
			
		}
		 for (int i = 0; i < 8; i++) { // a for command, first is your intial value, your limit, then your interval
			Command pauseCommand1 = new WaitTimeCommand(1000);
			Command downmoveCommand = new MoveDownCommand(io.robot);
		listCommands.add(downmoveCommand);
		listCommands.add(pauseCommand1);
		}
		for (int i = 0; i < 4; i++) { 
			Command leftmoveCommand = new MoveLeftCommand(io.robot);
			listCommands.add(leftmoveCommand);
			Command pauseCommand2 = new WaitTimeCommand(1000);
			listCommands.add(pauseCommand2);
			 }
			 for (int i = 0; i < 4; i++) { 
			Command upmoveCommand = new MoveUpCommand(io.robot);
			listCommands.add(upmoveCommand);
			Command pauseCommand3 = new WaitTimeCommand(1000);
			listCommands.add(pauseCommand3); 
		}
			 
				
		
		
		
		Command[] arrayCommands = (Command[]) listCommands.toArray(new Command[listCommands.size()]);
		return CommandUtils.combineSimultaneous(CommandUtils.combineSequential(arrayCommands));

	}
	
	
}
