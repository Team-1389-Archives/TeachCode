package commands;
import sprite.Sprite;
public class TurnRight {
	Sprite sprite;
	public TurnRight(Sprite controlledSprite){
		this.sprite = controlledSprite;
	}
	protected boolean execute(){
		sprite.turnRight();
		return true;
	}
	

}
