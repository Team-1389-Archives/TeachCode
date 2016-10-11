package commands;

public class WaitTimeCommand extends Command{
	long startTime;
	long waitTime;
	boolean started;
	public WaitTimeCommand(int waitTime){
		this.waitTime=waitTime;
	}
	@Override
	public boolean execute() {
		if(!started){
			startTime=System.currentTimeMillis();
			started=true;
		}
		return System.currentTimeMillis()-startTime>=waitTime;
	}
	
}
