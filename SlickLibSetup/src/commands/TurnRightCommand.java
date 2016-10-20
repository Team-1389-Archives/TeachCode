package commands;
import sprite.Sprite;
public class TurnRightCommand {
	Sprite sprite;
	public TurnRightCommand(Sprite controlledSprite){
		this.sprite = controlledSprite;
	}
	protected boolean execute(){
		sprite.turnRight();
		return true;
	
	}
	

}
