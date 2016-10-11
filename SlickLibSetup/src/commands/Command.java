package commands;

public abstract class Command {
	boolean initialized;
	public Command(){
		initialized=false;
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
		return execute();
	}
}
