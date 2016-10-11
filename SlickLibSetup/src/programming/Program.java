package programming;

import commands.Command;
import layout.IOLayout;

public abstract class Program {
	IOLayout io;
	public abstract Command provideCommand();
	public Program(IOLayout io){
		this.io=io;
	}

}
