package programming;

import commands.Command;

public class SerialProgram extends Program{

	@Override
	public void run() {
		String commandString=SerialManager.getCommandString("COM4");
		parseString(commandString);
	}

	private void parseString(String commandString) {
		for(int x=0;x<commandString.length()/2;x+=2){
			program.add(new Command(commandString.charAt(x),Integer.parseInt(commandString.substring(x+1,x+2))));
		}
	}
}
