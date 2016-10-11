package commands;

public interface Command {
	/**
	 * This will be run at a repeated interval by the controller until it returns true
	 * @return whether the command is finished
	 */
	public boolean execute();
}
