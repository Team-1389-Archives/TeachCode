package commands;
import commands.Command;
import sprite.Sprite;
public class MoveUpCommand {
	private Sprite sprite;
	public MoveUpCommand(Sprite controlledSprite){
		this.sprite= controlledSprite;
	}
	protected boolean execute(){
		this.sprite.setY(this.sprite.getY()+1);
		return true;
	}
		
}
