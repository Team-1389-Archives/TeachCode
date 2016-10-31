package commands;

public abstract class Command {
	boolean initialized;
	public Command(){
		reset();
	}
	/**
	 * This will be run at a repeated interval by the controller until it returns true
	 * @return whether the command is finished
	 */
	public void init(){
		initialized=true;
	}
	protected abstract boolean execute();
	public boolean exec(){
		if(!initialized){
			init();
		}
		boolean isFinished=execute();
		if(isFinished){
			reset();
		}
		return isFinished;
	}
	public void reset(){
		initialized=false;
	}
}
