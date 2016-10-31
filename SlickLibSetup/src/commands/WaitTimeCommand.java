package commands;

public class WaitTimeCommand extends Command{
	long startTime;
	long waitTime;
	public WaitTimeCommand(int waitTime){
		this.waitTime=waitTime;
	}
	@Override
	public void init(){
		super.init();
		startTime=System.currentTimeMillis();
	}
	@Override
	public boolean execute() {
		return System.currentTimeMillis()-startTime>=waitTime;
	}
	public void reset(){
		super.reset();
		startTime=0;
	}
}
